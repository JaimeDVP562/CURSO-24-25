// API para obtener los datos
const API = "https://jsonplaceholder.typicode.com/posts";

// Seleccionamos los elementos del DOM necesarios
const button = document.getElementById("load-data");
const dataContainer = document.getElementById("data-container");

// Función para manejar la carga exitosa de los datos
function onLoad() {
  // Verificamos que el estado sea 200 (OK)
  if (this.status === 200) {
    // Parseamos la respuesta JSON
    const data = JSON.parse(this.responseText);

    // Limpiamos el contenedor antes de mostrar nuevos datos
    dataContainer.innerHTML = "";

    // Iteramos por cada elemento de los datos y creamos tarjetas
    data.forEach(item => {
      // Creamos un contenedor div para cada tarjeta
      const card = document.createElement("div");
      card.classList.add("card");

      // Creamos un título h2 con el título del elemento
      const title = document.createElement("h2");
      title.textContent = item.title;

      // Creamos un párrafo p con el cuerpo del elemento
      const body = document.createElement("p");
      body.textContent = item.body;

      // Añadimos el título y el cuerpo a la tarjeta
      card.appendChild(title);
      card.appendChild(body);

      // Añadimos la tarjeta al contenedor principal
      dataContainer.appendChild(card);
    });
  } else {
    // Si el estado no es 200, mostramos un mensaje de error
    dataContainer.innerHTML = `<p class="error">Error: ${this.status}</p>`;
  }
}

// Función para manejar errores en la solicitud
function onError() {
  dataContainer.innerHTML = `<p class="error">Error al realizar la solicitud.</p>`;
}

// Función para manejar cuando la solicitud se aborta
function onAbort() {
  dataContainer.innerHTML = `<p class="error">La solicitud fue abortada.</p>`;
}

// Función que realiza la solicitud a la API
function obtenerDatos() {
  // Creamos una nueva instancia de XMLHttpRequest
  const peticionJSON = new XMLHttpRequest();

  // Configuramos la solicitud: GET a una API pública
  peticionJSON.open("GET", API);
  peticionJSON.responseType = 'JSON';

  // Asignamos los manejadores de eventos
  peticionJSON.onload = onLoad;    // Cuando la solicitud se complete correctamente
  peticionJSON.onerror = onError;  // Cuando ocurra un error
  peticionJSON.onabort = onAbort;  // Cuando la solicitud sea abortada

  // Enviamos la solicitud
  peticionJSON.send();
}

// Asignamos el evento click al botón para iniciar la solicitud
button.addEventListener("click", obtenerDatos);






document.addEventListener("DOMContentLoaded", () => {
  const categoriaSelect = document.getElementById("categoria");
  const chisteBox = document.getElementById("chiste");
  const botonChiste = document.getElementById("obtenerChiste");

  async function obtenerCategorias() {
      try {
          let response = await fetch("https://api.chucknorris.io/jokes/categories");
          let categorias = await response.json();
          categoriaSelect.innerHTML = '<option value="">Selecciona una categoría</option>';
          categorias.forEach(categoria => {
              let option = document.createElement("option");
              option.value = categoria;
              option.textContent = categoria;
              categoriaSelect.appendChild(option);
          });
      } catch (error) {
          console.error("Error al obtener categorías", error);
          chisteBox.textContent = "Error al cargar categorías.";
      }
  }

  async function obtenerChiste() {
      const categoria = categoriaSelect.value;
      if (!categoria) {
          chisteBox.textContent = "Por favor selecciona una categoría";
          return;
      }

      botonChiste.disabled = true;
      botonChiste.textContent = "Cargando…";

      try {
          let response = await fetch(`https://api.chucknorris.io/jokes/random?category=${categoria}`);
          let data = await response.json();
          chisteBox.textContent = data.value;
      } catch (error) {
          console.error("Error al obtener chiste", error);
          chisteBox.textContent = "Error al obtener chiste.";
      } finally {
          botonChiste.disabled = false;
          botonChiste.textContent = "Mostrar chiste";
      }
  }

  botonChiste.addEventListener("click", obtenerChiste);
  obtenerCategorias();
});
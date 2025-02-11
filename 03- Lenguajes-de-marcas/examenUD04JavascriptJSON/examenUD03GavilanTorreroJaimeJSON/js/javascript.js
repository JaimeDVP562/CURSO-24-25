// API para obtener los datos
const API = "https://api.chucknorris.io/jokes/random";

// Seleccionamos los elementos del DOM necesarios
const button = document.getElementById("mostrarChiste");
const dataContainer = document.getElementById("data-container");

// Función para manejar la carga exitosa de los datos
function onLoad() {
  // Verificamos que el estado sea 200 (OK)
  if (this.status === 200) {
    // Parseamos la respuesta JSON
    const data = JSON.parse(this.responseText);

    // Limpiamos el contenedor antes de mostrar nuevos datos
    dataContainer.innerHTML = "";

    // Creamos un contenedor div para la tarjeta
    const card = document.createElement("div");
    card.classList.add("card");

    // Creamos un párrafo con el chiste
    const jokeText = document.createElement("p");
    jokeText.textContent = data.value; // Usamos `value`, que es donde está el chiste

    // Añadimos el chiste a la tarjeta
    card.appendChild(jokeText);

    // Añadimos la tarjeta al contenedor principal
    dataContainer.appendChild(card);
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

  // Asignamos los manejadores de eventos
  peticionJSON.onload = onLoad;    // Cuando la solicitud se complete correctamente
  peticionJSON.onerror = onError;  // Cuando ocurra un error
  peticionJSON.onabort = onAbort;  // Cuando la solicitud sea abortada

  // Enviamos la solicitud
  peticionJSON.send();
}

// Asignamos el evento click al botón para iniciar la solicitud
button.addEventListener("click", obtenerDatos);

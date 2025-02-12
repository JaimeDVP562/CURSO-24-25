// API para obtener los datos
const API = "https://api.chucknorris.io/jokes/random";
const API2 = "https://api.chucknorris.io/jokes/categories";

// Seleccionamos los elementos del DOM necesarios
const button = document.getElementById("mostrarChiste");
const dataContainer = document.getElementById("dataContainer");
const categoria = document.getElementById("categoria");

// Función para obtener las categorías desde la API de las categorias
function obtenerCategorias() {
    const peticionJSON = new XMLHttpRequest();
    peticionJSON.open("GET", API2);
    peticionJSON.onload = function () {
        if (this.status === 200) {
            const categorias = JSON.parse(this.responseText);
            categoria.innerHTML = '<option value="">Selecciona una categoría</option>';
            categorias.forEach(cat => {
                let option = document.createElement("option");
                option.value = cat;
                option.textContent = cat;
                categoria.appendChild(option);
            });
        } else {
            console.error("Error al obtener categorías", this.status);
            dataContainer.textContent = "Error al cargar categorías.";
        }
    };
    peticionJSON.onerror = function () {
        console.error("Error al realizar la solicitud de categorías.");
        dataContainer.textContent = "Error al cargar categorías.";
    };
    peticionJSON.send();
}

// Función que realiza la solicitud a la API de los chistes
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

    // Al enviar la solicitud desactivamos el botón y mostramos el cargando
    botonChiste.disabled = true;
    botonChiste.textContent = "Cargando…";
}


// Asignamos el evento click al botón para iniciar la solicitud
button.addEventListener("click", obtenerDatos);



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
        const chiste = document.createElement("p");
        chiste.textContent = data.value; // Usamos `value`, que es donde está el chiste

        // Añadimos el chiste a la tarjeta
        card.appendChild(chiste);

        // Añadimos la tarjeta al contenedor principal
        dataContainer.appendChild(card);
    } else {
        // Si el estado no es 200, mostramos un mensaje de error
        dataContainer.innerHTML = `<p class="error">Error: ${this.status}</p>`;
    }

    // Cuando mostremos procesemos los datos volvemos a activar el boton
    botonChiste.enabled = true;
    botonChiste.textContent = "MostrarChiste";
}

// Función para manejar errores en la solicitud
function onError() {
    dataContainer.innerHTML = `<p class="error">Error al realizar la solicitud.</p>`;
}

// Función para manejar cuando la solicitud se aborta
function onAbort() {
    dataContainer.innerHTML = `<p class="error">La solicitud fue abortada.</p>`;
}

// Llamar a la función para obtener categorías al cargar la página
document.addEventListener("DOMContentLoaded", obtenerCategorias);
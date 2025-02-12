// API para obtener los datos
const API = "https://api.chucknorris.io/jokes/random?category=";
const API2 = "https://api.chucknorris.io/jokes/categories";

// Seleccionamos los elementos del DOM necesarios
const button = document.getElementById("mostrarChiste");
const dataContainer = document.getElementById("dataContainer");
const categoria = document.getElementById("categoria");

// Función para obtener las categorías desde la API de categorías
function rellenarCategorias() {

    // Creamos una nueva instancia de XMLHttpRequest
    const peticionJSON = new XMLHttpRequest();

    // Configuramos la solicitud 
    peticionJSON.open("GET", API2);

    // Asiganmos los manejadores de eventos
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

    // Controlamos el error 
    peticionJSON.onerror = function () {
        console.error("Error al realizar la solicitud de categorías.");
        dataContainer.textContent = "Error al cargar categorías.";
    };

    // Enviamos la petición
    peticionJSON.send();
}

// Función que realiza la solicitud a la API de los chistes
function obtenerChiste() {
    const categoriaSeleccionada = categoria.value;

    // Verificamos si el usuario ha seleccionado una categoría
    if (categoriaSeleccionada === "") {
        dataContainer.innerHTML = `<p class="error">Por favor selecciona una categoría”.</p>`;
        return;
    }

    // Creamos una nueva instancia de XMLHttpRequest
    const peticionJSON = new XMLHttpRequest();

    // Configuramos la solicitud con la categoría seleccionada
    peticionJSON.open("GET", API + categoriaSeleccionada);

    // Asignamos los manejadores de eventos
    peticionJSON.onload = onLoad;
    peticionJSON.onerror = onError;
    peticionJSON.onabort = onAbort;

    // Enviamos la solicitud
    peticionJSON.send();

    // Desactivamos el botón mientras se carga el chiste
    button.disabled = true;
    button.textContent = "Cargando...";

    // Añadimos la clase del botón deshabilitado
    button.classList.add("botonDeshabilitado");
}

// Asignamos el evento click al botón para iniciar la solicitud
button.addEventListener("click", obtenerChiste);

// Función para manejar la carga exitosa de los datos
function onLoad() {
    if (this.status === 200) {
        const data = JSON.parse(this.responseText);
        dataContainer.innerHTML = "";

        const card = document.createElement("div");
        card.classList.add("card");

        const chiste = document.createElement("p");
        chiste.textContent = data.value;

        card.appendChild(chiste);
        dataContainer.appendChild(card);
    } else {
        dataContainer.innerHTML = `<p class="error">Error: ${this.status}</p>`;
    }

    // Reactivar el botón
    button.disabled = false;
    button.textContent = "Mostrar Chiste";
}

// Función para manejar errores en la solicitud
function onError() {
    dataContainer.innerHTML = `<p class="error">Error al realizar la solicitud.</p>`;
    button.disabled = false;
    button.textContent = "Mostrar Chiste";
}

// Función para manejar cuando la solicitud se aborta
function onAbort() {
    dataContainer.innerHTML = `<p class="error">La solicitud fue abortada.</p>`;
    button.disabled = false;
    button.textContent = "Mostrar Chiste";
}

// Llamar a la función para obtener categorías al cargar la página
document.addEventListener("DOMContentLoaded", rellenarCategorias);

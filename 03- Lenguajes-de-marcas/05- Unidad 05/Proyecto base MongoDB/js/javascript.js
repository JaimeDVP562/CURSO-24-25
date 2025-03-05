// Definimos constantes necesarias
const PORT = 3000; // Puerto donde correrá nuestro servidor
const nombre_coleccion = "usuario"; // Nombre de la colección que queremos recuperar

// Espera a que el DOM esté completamente cargado antes de ejecutar el código
document.addEventListener("DOMContentLoaded", () => {
    // Captura de elementos del HTML por su ID
    const nameSearch = document.getElementById("nameSearch"); // Input de búsqueda por nombre
    const emailSearch = document.getElementById("emailSearch"); // Input de búsqueda por email
    const searchByNameButton = document.getElementById("searchByNameButton"); // Botón para buscar por nombre
    const searchByEmailButton = document.getElementById("searchByEmailButton"); // Botón para buscar por email
    const showAllButton = document.getElementById("showAllButton"); // Botón para mostrar todos los usuarios
    const output = document.getElementById("output"); // Contenedor donde se mostrarán los resultados

    /**
    * Función para consultar usuarios en el servidor. Si no se pasa ningún filtro devuelve todos los usuarios.
    * @param {string} filtro - Filtro que queremos aplicar a la búsqueda
    * @param {string} valor - Valor del filtro
    */
    async function consultarUsuarios(filtro = "todos", valor = "") {
        try {
            let url = `http://localhost:${PORT}/${nombre_coleccion}`; // URL base de la API

            // Si se ha indicado un filtro, lo agregamos a la URL con parámetros de consulta
            if (filtro === "nombre") {
                url += `?nombre=${encodeURIComponent(valor)}`; // Búsqueda por nombre
            } else if (filtro === "email") {
                url += `?email=${encodeURIComponent(valor)}`; // Búsqueda por email
            }

            // Realizamos la petición al servidor con Fetch
            const response = await fetch(url);
            const usuarios = await response.json(); // Convertimos la respuesta a JSON

            // Mostramos los usuarios en la página
            mostrarUsuarios(usuarios);
        } catch (error) {
            console.error("Error consultando usuarios:", error); // Mostramos el error en la consola
            output.innerHTML = `<p>Error consultando usuarios: ${error}</p>`; // Mostramos mensaje de error en la interfaz
        }
    }

    /**
    * Muestra los usuarios obtenidos en la página web
    * @param {Array<usuario>} usuarios - Lista de usuarios a mostrar
    * @returns
    */
    function mostrarUsuarios(usuarios) {
        output.innerHTML = ""; // Limpiamos el contenedor de resultados

        // Si no hay usuarios encontrados, mostramos un mensaje
        if (usuarios.length === 0) {
            output.innerHTML = "<p>No se encontraron usuarios.</p>";
            return;
        }

        // Recorremos la lista de usuarios y creamos un div para cada uno
        usuarios.forEach(user => {
            let div = document.createElement("div");
            div.classList.add("grid-item"); // Clase CSS para estilos
            div.innerHTML = `<p><strong><u>Nombre:</u></strong> <span>${user.nombre}</span></p>
 <p><strong><u>Email:</u></strong> <span>${user.email}</span></p>
 <p><strong><u>Edad:</u></strong> <span>${user.edad}</span></p>
 <p><strong><u>Ciudad:</u></strong> <span>${user.ciudad}</span></p>`;
            output.appendChild(div); // Agregamos el div al contenedor de salida
        });
    }

    // Eventos de búsqueda
    searchByNameButton.addEventListener("click", () => consultarUsuarios("nombre", nameSearch.value.trim()));
    // Buscar por nombre
    searchByEmailButton.addEventListener("click", () => consultarUsuarios("email", emailSearch.value.trim())); // Buscar por email
    showAllButton.addEventListener("click", () => consultarUsuarios()); // Mostrar todos los usuarios
});
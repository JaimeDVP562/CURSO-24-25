<<<<<<< HEAD
// Declaramos las variales
let turnoJugador = document.getElementById('turnoJugador').value; // Turno del jugador  
let turnoMaquina = null; // Turno de la maquina

// Variables para las acciones de cada elemento
const piedra = ' aplasta ';
const papel1 = ' envuelve ';
const papel2 = ' desautoriza ';
const tijera = ' corta ';
const tijera2 = ' decapita ';
const lagarto = ' devora ';
const lagarto2 = ' envenena ';
const spock = ' rompe ';
const spock2 = ' vaporiza ';

// Variables para determinar quien gana 
const ganaMaquina = ' ¡Gana la máquina!';
const ganaJugador = ' ¡Ganas tú!';


// Array que guarda las opciones posibles de la máquina
let opciones = ["Piedra", "Papel", "Tijera", "Lagarto", "Spock"];

// Función para jugar
function jugar() {
    // Obtiene el valor del select que ha introducido el jugador
    document.getElementById('turnoJugador').addEventListener('change', function () {
        turnoJugador = this.value;
    });

    // Elije la máquina de manera aleatoria
    turnoMaquina = opciones[Math.floor(Math.random() * opciones.length)];

    // Actualiza las imágenes
    document.getElementById('imagenJugador').src = `imagenes/${turnoJugador}.png`;
    document.getElementById('VS').innerText = 'VS';
    document.getElementById('imagenMaquina').src = `imagenes/${turnoMaquina}.png`;

    // Creamos el texto alternativo para la imagen
    document.getElementById('imagenJugador').alt = `imagenes/${turnoJugador}.png`;
    document.getElementById('imagenMaquina').alt = `imagenes/${turnoMaquina}.png`;

    // Llamamos a la funcion comprobarResultado
    comprobarResultado();
}


// Función para comprobar el resultado 
function comprobarResultado() {

    // Comprobamos sacando la piedra
    if (
        (turnoJugador === "Piedra" && turnoMaquina === "Papel")) {
        document.getElementById('resultado2').innerText = turnoMaquina + papel1 + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    } else if (
        (turnoJugador === "Piedra" && turnoMaquina === "Tijera")) {
        document.getElementById('resultado2').innerText = turnoJugador + piedra + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    else if (
        (turnoJugador === "Piedra" && turnoMaquina === "Lagarto")) {
        document.getElementById('resultado2').innerText = turnoJugador + piedra + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    else if (
        (turnoJugador === "Piedra" && turnoMaquina === "Spock")) {
        document.getElementById('resultado2').innerText = turnoMaquina + spock2 + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }
    // Comprobamos sacando la Papel
    if (
        (turnoJugador === "Papel" && turnoMaquina === "Piedra")) {
        document.getElementById('resultado2').innerText = turnoJugador + papel1 + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    } else if (
        (turnoJugador === "Papel" && turnoMaquina === "Tijera")) {
        document.getElementById('resultado2').innerText = turnoMaquina + tijera + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }
    else if (
        (turnoJugador === "Papel" && turnoMaquina === "Lagarto")) {
        document.getElementById('resultado2').innerText = turnoMaquina + lagarto + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }
    else if (
        (turnoJugador === "Papel" && turnoMaquina === "Spock")) {
        document.getElementById('resultado2').innerText = turnoJugador + papel2 + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    // Comprobamos sacando la Tijera
    if (
        (turnoJugador === "Tijera" && turnoMaquina === "Piedra")) {
        document.getElementById('resultado2').innerText = turnoMaquina + piedra + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    } else if (
        (turnoJugador === "Tijera" && turnoMaquina === "Papel")) {
        document.getElementById('resultado2').innerText = turnoJugador + tijera + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    else if (
        (turnoJugador === "Tijera" && turnoMaquina === "Lagarto")) {
        document.getElementById('resultado2').innerText = turnoJugador + tijera2 + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    else if (
        (turnoJugador === "Tijera" && turnoMaquina === "Spock")) {
        document.getElementById('resultado2').innerText = turnoMaquina + spock + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }
    // Comprobamos sacando la Lagarto
    if (
        (turnoJugador === "Lagarto" && turnoMaquina === "Piedra")) {
        document.getElementById('resultado2').innerText = turnoMaquina + piedra + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    } else if (
        (turnoJugador === "Lagarto" && turnoMaquina === "Papel")) {
        document.getElementById('resultado2').innerText = turnoJugador + lagarto + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    else if (
        (turnoJugador === "Lagarto" && turnoMaquina === "Tijera")) {
        document.getElementById('resultado2').innerText = turnoMaquina + tijera2 + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }
    else if (
        (turnoJugador === "Lagarto" && turnoMaquina === "Spock")) {
        document.getElementById('resultado2').innerText = turnoJugador + lagarto2 + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }

    // Comprobamos sacando  Spock
    if (
        (turnoJugador === "Spock" && turnoMaquina === "Piedra")) {
        document.getElementById('resultado2').innerText = turnoJugador + spock2 + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    else if (
        (turnoJugador === "Spock" && turnoMaquina === "Papel")) {
        document.getElementById('resultado2').innerText = turnoMaquina + papel2 + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }
    else if (
        (turnoJugador === "Spock" && turnoMaquina === "Tijera")) {
        document.getElementById('resultado2').innerText = turnoJugador + spock + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    else if (
        (turnoJugador === "Spock" && turnoMaquina === "Lagarto")) {
        document.getElementById('resultado2').innerText = turnoMaquina + lagarto2 + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }


    // Comprobamos si las dos variables son iguales para saber si es un empate o no 
    else if (turnoJugador === turnoMaquina) {
        document.getElementById('resultado2').innerText = 'Es un empate';
        document.getElementById('resultado2').className = 'resultadoEmpate';

    }
}
=======
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
>>>>>>> 0baa3b24b36de7b9dd142512864ef3b8ed5018c1

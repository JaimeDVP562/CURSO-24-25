// Declaramos las variales
let turnoJugador = document.getElementById('turnoJugador').value; // Turno del jugador  
let turnoMaquina; // Turno de la maquina

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
let opciones = ["Piedra", "Papel", "Tijera", "Lagarto", "Spock"]

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
    document.getElementById('imagenMaquina').src = `imagenes/${turnoMaquina}.png`;

    // Llamamos a la funcion comprobarResultado
    comprobarResultado();
}


// Función para comprobar el resultado 
function comprobarResultado() {

    // Comprobamos si gana el jugador
    if (
        (turnoJugador === "Piedra" && turnoMaquina === "Lagarto")) {
        document.getElementById('resultado2').innerText = turnoJugador + piedra + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';

    } else if (
        (turnoJugador === "Piedra" && turnoMaquina === "Tijera")) {
        document.getElementById('resultado2').innerText = turnoJugador + piedra + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    // Comprobamos si gana la máquina
    else if (
        (turnoMaquina === "Piedra" && turnoJugador === "Lagarto")) {
        document.getElementById('resultado2').innerText = turnoMaquina + piedra + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';

    } else if (
        (turnoMaquina === "Piedra" && turnoJugador === "Tijera")) {
        document.getElementById('resultado2').innerText = turnoMaquina + piedra + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }
    // Comprobamos si gana la máquina
    else if (
        (turnoMaquina === "Papel" && turnoJugador === "Piedra")) {
        document.getElementById('resultado2').innerText = turnoMaquina + papel + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    } else if (
        (turnoMaquina === "Papel" && turnoJugador === "Spock")) {
        document.getElementById('resultado2').innerText = turnoMaquina + papel2 + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }
    // Comprobamos si gana el jugador
    else if (
        (turnoJugador === "Papel" && turnoMaquina === "Piedra")) {
        document.getElementById('resultado2').innerText = turnoJugador + papel + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    } else if (
        (turnoJugador === "Papel" && turnoMaquina === "Spock")) {
        document.getElementById('resultado2').innerText = turnoJugador + papel2 + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    // Comprobamos si gana el jugador
    else if (
        (turnoJugador === "Tijera" && turnoMaquina === "Papel")) {
        document.getElementById('resultado2').innerText = turnoJugador + tijera + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    } else if (
        (turnoJugador === "Tijera" && turnoMaquina === "Lagarto")) {
        document.getElementById('resultado2').innerText = turnoJugador + tijera2 + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    // Comprobamos si gana la máquina
    else if (
        (turnoMaquina === "Tijera" && turnoJugador === "Papel")) {
        document.getElementById('resultado2').innerText = turnoMaquina + tijera + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    } else if (
        (turnoMaquina === "Tijera" && turnoJugador === "Lagarto")) {
        document.getElementById('resultado2').innerText = turnoMaquina + tijera2 + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }
    // Comprobamos si gana el jugador
    else if (
        (turnoJugador === "Lagarto" && turnoMaquina === "Papel")) {
        document.getElementById('resultado2').innerText = turnoJugador + lagarto + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    } else if (
        (turnoJugador === "Lagarto" && turnoMaquina === "Spock")) {
        document.getElementById('resultado2').innerText = turnoJugador + lagarto2 + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    // Comprobamos si gana la máquina
    else if (
        (turnoMaquina === "Lagarto" && turnoJugador === "Papel")) {
        document.getElementById('resultado2').innerText = turnoMaquina + lagarto + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    } else if (
        (turnoMaquina === "Lagarto" && turnoJugador === "Spock")) {
        document.getElementById('resultado2').innerText = turnoMaquina + lagarto2 + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }
    // Comprobamos si gana el jugador 
    else if (
        (turnoJugador === "Spock" && turnoMaquina === "Tijera")) {
        document.getElementById('resultado2').innerText = turnoJugador + spock + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    } else if (
        (turnoJugador === "Spock" && turnoMaquina === "Piedra")) {
        document.getElementById('resultado2').innerText = turnoJugador + spock2 + turnoMaquina + ganaJugador;
        document.getElementById('resultado2').className = 'resultadoGanador';
    }
    // Comprobamos si gana la máquina
    else if (
        (turnoMaquina === "Spock" && turnoJugador === "Tijera")) {
        document.getElementById('resultado2').innerText = turnoMaquina + spock + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    } else if (
        (turnoMaquina === "Spock" && turnoJugador === "Piedra")) {
        document.getElementById('resultado2').innerText = turnoMaquina + spock2 + turnoJugador + ganaMaquina;
        document.getElementById('resultado2').className = 'resultadoPerdedor';
    }
    // Comprobamos si las dos variables son iguales para saber si es un empate o no 
    else if (turnoJugador === turnoMaquina) {
        document.getElementById('resultado2').innerText = 'Es un empate';
        document.getElementById('resultado2').className = 'resultadoEmpate';

    }
}

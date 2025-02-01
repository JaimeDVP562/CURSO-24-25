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
const empate = ' Empate';


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

    // Mostamos el resultado de la partida 
    document.getElementById('imagenJugador').src = "imagenes/{turnoJugador}.png";
    document.getElementById('imagenMaquina').src = "imagenes/{turnoMaquina}.png";
    document.getElementById('resultado').innerText = (turnoMaquina + ' ' + turnoJugador); // Muestra el resultado 

}

switch (turnoJugador) {
    case 'Piedra':
        if (turnoMaquina == 'Piedra') {
            document.getElementById('resultado2').innerText = empate;
        } else if (turnoMaquina == 'Papel') {
            document.getElementById('resultado2').innerText = turnoMaquina + papel2 + turnoJugador + ganaMaquina;
        } else if (turnoMaquina == 'Tijera') {
            document.getElementById('resultado2').innerText = turnoJugador + piedra + turnoMaquina + ganaJugador;
        } else if (turnoMaquina == 'Lagarto') {
            document.getElementById('resultado2').innerText = turnoJugador + piedra + turnoMaquina + ganaJugador;
        } else if (turnoMaquina == 'Spock') {
            document.getElementById('resultado2').innerText = turnoMaquina + spock2 + turnoJugador + ganaMaquina;
        } break;
    case 'Papel':
        if (turnoMaquina == 'Papel') {
            document.getElementById('resultado2').innerText = empate;
        } else if (turnoMaquina == 'Pîedra') {
            document.getElementById('resultado2').innerText = turnoJugador + papel1 + turnoMaquina + ganaJugador;
        } else if (turnoMaquina == 'Tijera') {
            document.getElementById('resultado2').innerText = turnoMaquina + tijera + turnoJugador + ganaMaquina;
        } else if (turnoMaquina == 'Lagarto') {
            document.getElementById('resultado2').innerText = turnoMaquina + lagarto + turnoJugador + ganaMaquina;
        } else if (turnoMaquina == 'Spock') {
            document.getElementById('resultado2').innerText = turnoJugador + papel2 + turnoMaquina + ganaJugador;
        } break;
    case 'Tijera':
        if (turnoMaquina == 'Tijera') {
            document.getElementById('resultado2').innerText = empate;
        } else if (turnoMaquina == 'Piedra') {
            document.getElementById('resultado2').innerText = turnoMaquina + piedra + turnoJugador + ganaMaquina;
        } else if (turnoMaquina == 'Papel') {
            document.getElementById('resultado2').innerText = turnoJugador + tijera + turnoMaquina + ganaJugador;
        } else if (turnoMaquina == 'Lagarto') {
            document.getElementById('resultado2').innerText = turnoJugador + tijera2 + turnoMaquina + ganaJugador;
        } else if (turnoMaquina == 'Spock') {
            document.getElementById('resultado2').innerText = turnoMaquina + spock + turnoJugador + ganaMaquina;
        } break;
    case 'Lagarto':
        if (turnoMaquina == 'Lagarto') {
            document.getElementById('resultado2').innerText = empate;
        } else if (turnoMaquina == 'Piedra') {
            document.getElementById('resultado2').innerText = turnoMaquina + piedra + turnoJugador + ganaMaquina;
        } else if (turnoMaquina == 'Papel') {
            document.getElementById('resultado2').innerText = turnoJugador + tijera + turnoMaquina + ganaJugador;
        } else if (turnoMaquina == 'Tijera') {
            document.getElementById('resultado2').innerText = turnoJugador + tijera2 + turnoMaquina + ganaJugador;
        } else if (turnoMaquina == 'Lagarto') {
            document.getElementById('resultado2').innerText = turnoMaquina + spock + turnoJugador + ganaMaquina;
        }
        break;

    default:
        break;
}
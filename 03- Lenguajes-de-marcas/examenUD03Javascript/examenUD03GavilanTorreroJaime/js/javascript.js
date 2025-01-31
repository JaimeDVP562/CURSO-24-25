// Declaramos las variales
let turnoJugador = document.getElementById('turnoJugador').value; // Turno del jugador  
let turnoMaquina; // Turno de la maquina
// Array que guarda las opciones posibles de la máquina
let opciones = ["Piedra", "Papel", "Tijera", "Lagarto", "Spock"]

/**
 * Variables de control de resultado
let empate = false;
let ganaJugador = false;
let ganaMaquina = false;
 
 */
    document.getElementById('turnoJugador').addEventListener('change', function () {
        turnoJugador = this.value; // Elije el jugador 
    });
// Función para jugar
function jugar() {

    turnoMaquina = opciones[Math.floor(Math.random() * opciones.length)]; // Elije la máquina de manera aleatoria
    document.getElementById('resultado').innerText = (turnoMaquina + ' ' + turnoJugador); // Muestra el resultado 
}

// Función para comprobar el resultado 
function comprobarResultado() {
    if (turnoJugador === turnoMaquina) {
        document.getElementById('resultado2').innerText = 'Empate';
    } else if ((turnoJugador === "Piedra" && (turnoMaquina === "Tijera" || turnoMaquina === "Lagarto")) ||
        (turnoJugador === "Papel" && (turnoMaquina === "Piedra" || turnoMaquina === "Spock")) ||
        (turnoJugador === "Tijera" && (turnoMaquina === "Papel" || turnoMaquina === "Lagarto")) ||
        (turnoJugador === "Lagarto" && (turnoMaquina === "Papel" || turnoMaquina === "Spock")) ||
        (turnoJugador === "Spock" && (turnoMaquina === "Piedra" || turnoMaquina === "Tijera"))) {
        document.getElementById('resultado2').innerText = 'Gana jugador';
    } else {
        document.getElementById('resultado2').innerText = 'Gana la máquina';
    }
}

/**
 * // Imprimir resultado
if (empate) {
    document.getElementById('resultado2').innerText = "Empate";

} else if (ganaJugador) {
    document.getElementById('resultado2').innerText = "Gana jugador";

} else if (ganaMaquina) {
    document.getElementById('resultado2').innerText = "Gana la máquina";

}
 */


/*

// Date: 2021/05/21
const rules = {
    Piedra: ['Tijera', 'Lagarto'],
    Papel: ['Piedra', 'Spock'],
    Tijera: ['Papel', 'Lagarto'],
    Lagarto: ['Papel', 'Spock'],
    Spock: ['Piedra', 'Tijera']
};

// Get computer's choice
function getComputerChoice() {
    const choices = Object.keys(rules);
    const randomIndex = Math.floor(Math.random() * choices.length);
    return choices[randomIndex];
}

// Determine winner
function determineWinner(playerChoice, computerChoice) {
    if (playerChoice === computerChoice) {
        return "¡Empate!";
    }
    if (rules[playerChoice].includes(computerChoice)) {
        return "¡Ganaste!";
    }
    return "¡Perdiste!";
}

// Main game function
function jugar() {
    // Get player's choice from select element
    const selectElement = document.querySelector('select');
    const playerChoice = selectElement.value;

    // Validate selection
    if (!playerChoice) {
        document.getElementById('resultado').textContent = "Por favor, elige una opción";
        return;
    }

    // Get computer's choice
    const computerChoice = getComputerChoice();

    // Determine winner
    const result = determineWinner(playerChoice, computerChoice);

    // Display result
    document.getElementById('resultado').textContent =
        `Tú elegiste: ${playerChoice}\nLa máquina eligió: ${computerChoice}\n${result}`;
}


*/
// Prueba juego casero





/*

// Date: 2021/05/21
const rules = {
    Piedra: ['Tijera', 'Lagarto'],
    Papel: ['Piedra', 'Spock'],
    Tijera: ['Papel', 'Lagarto'],
    Lagarto: ['Papel', 'Spock'],
    Spock: ['Piedra', 'Tijera']
};

// Get computer's choice
function getComputerChoice() {
    const choices = Object.keys(rules);
    const randomIndex = Math.floor(Math.random() * choices.length);
    return choices[randomIndex];
}

// Determine winner
function determineWinner(playerChoice, computerChoice) {
    if (playerChoice === computerChoice) {
        return "¡Empate!";
    }
    if (rules[playerChoice].includes(computerChoice)) {
        return "¡Ganaste!";
    }
    return "¡Perdiste!";
}

// Main game function
function jugar() {
    // Get player's choice from select element
    const selectElement = document.querySelector('select');
    const playerChoice = selectElement.value;

    // Validate selection
    if (!playerChoice) {
        document.getElementById('resultado').textContent = "Por favor, elige una opción";
        return;
    }

    // Get computer's choice
    const computerChoice = getComputerChoice();

    // Determine winner
    const result = determineWinner(playerChoice, computerChoice);

    // Display result
    document.getElementById('resultado').textContent =
        `Tú elegiste: ${playerChoice}\nLa máquina eligió: ${computerChoice}\n${result}`;
}


*/
// Prueba juego casero

// Declaramos las variales
let turnoJugador = document.getElementById('turnoJugador').value; // Turno del jugador  
let opciones = ["Piedra","Papel", "Tijera", "Lagarto" , "Spock" ] // Turno de la máquina de manera aleatoria  

function jugar() {
    document.getElementById('turnoJugador').addEventListener('change', function () {
        let turnoJugador = this.value; // Elije el jugador 
        let turnoMaquina = opciones[Math.floor(Math.random() * opciones.length)]; // Elije la máquina de manera aleatoria
        document.getElementById('resultado').innerText = (turnoJugador + ' ' + turnoMaquina); // Muestra el resultado 

    });

}




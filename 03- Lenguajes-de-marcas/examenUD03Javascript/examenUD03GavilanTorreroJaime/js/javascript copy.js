    // Comprobamos si gana el jugador sacando la Tijera
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
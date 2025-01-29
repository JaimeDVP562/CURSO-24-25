// Funcion para jugar
function jugar() {
  let opcionJugador = parseInt(document.getElementById("Piedra").value);
  //let n2 = parseInt(document.getElementById("numero2").value);

  if (isNaN(n1) || isNaN(n2)) {
    document.getElementById("resultado").innerText = "Error, es obligatorio introducir los dos números";
    document.getElementById("resultado").style = "red";
  } else {
    document.getElementById("resultado").innerText = "La suma es " + (n1 + n2);
    document.getElementById("resultado").className = "resultadoSuma";
  }

}



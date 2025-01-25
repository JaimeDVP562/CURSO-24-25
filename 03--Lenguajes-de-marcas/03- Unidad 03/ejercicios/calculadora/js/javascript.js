// Funcion para sumar
function suma() {
  let n1 = parseInt(document.getElementById("numero1").value);
  let n2 = parseInt(document.getElementById("numero2").value);

  document.getElementById("resultado").innerText = "La suma es " + (n1 + n2);
  document.getElementById("resultado").className = "resultadoSuma";
}

// Funcion para restar
function resta() {
  let n1 = parseInt(document.getElementById("numero1").value);
  let n2 = parseInt(document.getElementById("numero2").value);

  document.getElementById("resultado").innerText = "La resta es: " + (n1 - n2);
  document.getElementById("resultado").className = "resultadoResta";
}

// Funcion para multiplicar
function multiplicacion() {
  let n1 = parseInt(document.getElementById("numero1").value);
  let n2 = parseInt(document.getElementById("numero2").value);

  document.getElementById("resultado").innerText = "El producto es: " + n1 * n2;
  document.getElementById("resultado").className = "resultadoMultiplicacion";
}

// Funcion para dividir
function division() {
  let n1 = parseInt(document.getElementById("numero1").value);
  let n2 = parseInt(document.getElementById("numero2").value);

  if (n2 != 0) {
    document.getElementById("resultado").innerText =
      "La división es: " + n1 / n2;
    document.getElementById("resultado").className = "resultadoDivision";
  } else {
    document.getElementById("resultado").innerText =
      "Error el divisor no puede ser menor que el dividendo ";
    document.getElementById("resultado").style.color = "red";
  }
}

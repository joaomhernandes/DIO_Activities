// Tipos primitivos

// Boolean
var vOuF = false;
console.log(typeof vOuF, vOuF);

// Number
var numeroQualquer = 1;
console.log(typeof numeroQualquer, numeroQualquer);

// String
var nome = "João";
console.log(typeof nome, nome);

// Como declarar

var variavel = "João";
variavel = "Carrenho";
console.log(variavel);

let variavel2 = "João";
variavel2 = "Carrenho";
console.log(variavel2);

const constante = "João";
// constante = "Carrenho"; Não pode ser reatribuído
console.log(constante);

// Escopo local e global

var escopoGlobal = "Global";
console.log(escopoGlobal);

function escopoLocal() {
  let escopoLocalInterno = "Local";
  console.log(escopoLocalInterno);
}

escopoLocal();

// Atribuição
var atribuição = "João";

// Comparação
var comparacao = "0" == 0;
console.log(comparacao);

// Comparação idêntica
var comparacaoIdentica = "0" === 0;
console.log(comparacaoIdentica);

// operadores aritméticos
// adição
var adicao = 1 + 1;
console.log(adicao);

//subtração
var subtracao = 2 - 1;
console.log(subtracao);

//multiplicação
var multiplicacao = 2 * 3;
console.log(multiplicacao);

//divisão real
var divisaoReal = 6 / 2;
console.log(divisaoReal);

//divisão inteira
var divisaoInteira = 5 % 2;
console.log(divisaoInteira);

//potenciação
var potenciacao = 2 ** 10;
console.log(potenciacao);

// operadores relacionais
// maior que
var maiorQue = 5 > 2;
console.log(maiorQue);

// menor que
var menorQue = 5 < 2;
console.log(menorQue);

// maior ou igual a
var maiorOuIgual = 5 >= 2;
console.log(maiorOuIgual);

// menor ou igual a
var menorOuIgual = 5 <= 2;
console.log(menorOuIgual);

// operadores lógicos
// && - todos os valores devem ser true
var e = true && true;
console.log(e);

// || - somente um valor deve ser true
var ou = true || false;
console.log(ou);

// ! - inverte os valores
var nao = !true;
console.log(nao);

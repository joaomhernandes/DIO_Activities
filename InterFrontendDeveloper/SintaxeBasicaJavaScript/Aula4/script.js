console.log("Estruturas condicionais");

console.log("Estruturas de decisão");

console.log("if");

var jogador1 = 0;
var jogador2 = 1;
var placar;

console.log("Aninhando if's");
console.log("if ternário");

jogador1 != -1 && jogador2 != -1
  ? console.log("Os jogadores são válidos")
  : console.log("os jogadores não são válidos");
if (jogador1 > 0 && jogador2 == 0) {
  console.log("O jogador 1 marcou ponto");
  placar = jogador1 > jogador2;
} else if (jogador2 > 0 && jogador1 == 0) {
  console.log("Usando o else if");
  console.log("O jogador 2 marcou ponto");
  placar = jogador2 > jogador1;
} else {
  console.log("Usando o else");
  console.log("Ninguem marcou ponto");
}

console.log("Usando switch case");
switch (placar) {
  case (placar = jogador1 > jogador2):
    console.log("Jogador 1 ganhou");
    break;
  case (placar = jogador2 > jogador1):
    console.log("Jogador 2 ganhou");
    break;
  default:
    console.log("Ninguem marcou ponto");
}

console.log("Estruturas de repetição");
let array = ["valor1", "valor2", "valor3", "valor4", "valor5"];
let object = {
  propriedade1: "12",
  propriedade2: "valor2",
  propriedade3: "valor3",
};

console.log("for - Executa até que seja false");
for (let i = 0; i < array.length; i++) {
  console.log(i);
}

console.log("for/in - Executa repetição a partir de uma propriedade");
console.log("Com array");
for (i in array) {
  console.log(i);
}
console.log("Com object");
for (i in object) {
  console.log(i);
}

console.log("for/of - Executa repetição a partir de um valor");
console.log("Com array");
for (i of array) {
  console.log(i);
}
console.log("Com object não funciona pois não é iterável");
for (i of object.propriedade1) {
  console.log(i);
}

console.log("while - Executa enquanto for verdadeira");
var a = 0;
while (a < 10) {
  a++;
  console.log(a);
}

console.log(
  "do - Executa até que seja falsa, porem irá realizar ao menos uma iteração"
);
do {
  a++;
  console.log(a);
} while (a < 10);

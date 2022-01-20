console.log("Funções - functions");

console.log("Como declarar");
console.log(
  'Deve ser declarada usando a palavra function seguida de "()" e "{}"'
);
function funcao() {
  console.log("Mensagem de uma função");
}
console.log("Chamando a função");
funcao();

console.log("Função com parâmetros");
console.log("Definindo parâmetros");
function mensagem(primeiro, segundo) {
  console.log(primeiro, segundo);
}
console.log("Chamando a função atribuindo valor aos parâmetros");
mensagem("Tudo certo", "jovem!");

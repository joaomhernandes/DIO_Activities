console.log("Tipos de função");

console.log("Função declarativa");
console.log(
  'Deve ser declarada usando a palavra reservada function seguida do nome da funçao, parênteses "()" e chaves "{}"'
);
console.log("Deve ser nomeada obrigatioriamente");

function nomeDaFuncao() {
  console.log("Sou uma função declarativa!");
}
console.log("Devemos chamar a função para ver o resultado");
console.log("Chamando a função");
nomeDaFuncao();

console.log("Expressão de função");
console.log("São funções atribuídas à expressões");
console.log("A nomeação é opcional");

console.log("Com nomeação");
var funcao = function funcao() {
  console.log("Sou uma expressão de função nomeada!");
};

console.log("Sem nomeação");
var funcao = function () {
  console.log("Sou uma expressão de função não nomeada!");
};

console.log("Arrow Function");
console.log("Função de expressão de sintaxe curta");
console.log("Sempre anônima, não pode ser nomeada");
console.log(
  'Deve ser declarada com parênteses "()", seguido de "=>" e depois chaves "{}"'
);
var funcao = () => {
  console.log("Sou uma função anônima!");
};
funcao();

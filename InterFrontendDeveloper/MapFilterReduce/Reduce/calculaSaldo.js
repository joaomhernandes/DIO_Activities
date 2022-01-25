const lista = [
  {
    nome: "maçã",
    preco: 2,
  },
  {
    nome: "roupa",
    preco: 30,
  },
  {
    nome: "carne",
    preco: 25,
  },
];

const saldoDisponivel = 100;

function calculaSaldo(saldoDisponivel, lista) {
  return lista.reduce(function (prev, current, index) {
    console.log("rodada ", index + 1);
    console.log({ prev });
    console.log({ current });
    return prev - current.preco;
  }, saldoDisponivel);
}

console.log(calculaSaldo(saldoDisponivel, lista));

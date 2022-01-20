alert("Comparando dois números");
entradaDados();

function entradaDados() {
  const PRIMEIRO_NOME = Number(prompt("Digite o primeiro número"));
  const SEGUNDO_NOME = Number(prompt("Digite o segundo número"));
  if (!PRIMEIRO_NOME || !SEGUNDO_NOME) {
    alert("Algum número digitado é inválido");
    entradaDados();
  } else comparacao(PRIMEIRO_NOME, SEGUNDO_NOME);
}

function comparacao(primeiroNumero, segundoNumero) {
  let soma = primeiroNumero + segundoNumero;
  let mensagem = "";
  if (primeiroNumero == segundoNumero) {
    mensagem = `Os números ${primeiroNumero} e ${segundoNumero} são iguais. Sua soma é ${soma}, `;
  } else {
    mensagem = `Os números ${primeiroNumero} e ${segundoNumero} não são iguais. Sua soma é ${soma}, `;
  }

  maiorOuMenor(soma, mensagem);
}

function maiorOuMenor(soma, mensagem) {
  if (soma < 10) {
    mensagem = `${mensagem}que é menor que 10 e menor que 20`;
  } else if (soma == 10) {
    mensagem = `${mensagem}que é igual à 10`;
  } else if (soma > 10 && soma < 20) {
    mensagem = `${mensagem}que é maior que 10 e menor que 20`;
  } else if (soma == 20) {
    mensagem = `${mensagem}que é maior que 10 e igual à 20`;
  } else if (soma > 10 && soma > 20) {
    mensagem = `${mensagem}que é maior que 10 e maior que 20`;
  }
  alert(mensagem);
  const REPETICAO = Number(
    prompt(
      "Deseja realizar uma nova comparação? \nDigite 1 para SIM\n2 para Não"
    )
  );
  switch (REPETICAO) {
    case 1:
      entradaDados();
      break;
    case 2:
      alert("Até logo!");
      break;
    default:
      alert("Até logo!");
      break;
  }
}

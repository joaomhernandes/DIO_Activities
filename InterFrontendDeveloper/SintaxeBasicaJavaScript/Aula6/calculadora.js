console.log("Criando uma calculadora");
function calculadora() {
  console.log("Definindo as operações e pegando valor de entrada do usuário");
  console.log('Usamos "\\n" para fazer uma quebra de linha');
  const operacao = Number(
    prompt(
      "Escolha uma opção:\n 1 - soma (+)\n 2 - subtração (-)\n 3 - multiplicação (*)\n 4 - divisão real (/)\n 5 - divisão inteira (%)\n 6 - potenciação (**)"
    )
  );

  console.log("Verificando se a operação é válida");
  if (!operacao || operacao >= 7) {
    alert("erro - operação inválida");
    calculadora();
  } else {
    console.log("Definindo variáveis");
    console.log("Todas as entradas devem ser do tipo number");
    let n1 = Number(prompt("Insira o primeiro valor:"));
    let n2 = Number(prompt("Insira o segundo valor:"));
    let resultado;
    console.log("Verificando se as variáveis são válidas");
    if (!n1 || !n2) {
      alert("erro - parâmetros inválidos");
      calculadora();
    } else {
      console.log("Definindo as funções");
      function soma() {
        resultado = n1 + n2;
        console.log("Mostrando o resultado usando template strings");
        alert(`${n1} + ${n2} = ${resultado}`);
        novaOperacao();
      }
      function subtracao() {
        resultado = n1 - n2;
        alert(`${n1} - ${n2} = ${resultado}`);
        novaOperacao();
      }
      function multiplicacao() {
        resultado = n1 * n2;
        alert(`${n1} * ${n2} = ${resultado}`);
        novaOperacao();
      }
      function divisaoReal() {
        resultado = n1 / n2;
        alert(`${n1} / ${n2} = ${resultado}`);
        novaOperacao();
      }
      function divisaoInteira() {
        resultado = n1 % n2;
        alert(`O resto da divisão entre ${n1} e ${n2} é igual a ${resultado}`);
        novaOperacao();
      }
      function potenciacao() {
        resultado = n1 ** n2;
        alert(`${n1} elevado à ${n2}ª potência é ${resultado}`);
        novaOperacao();
      }
      console.log("Nova operação");
      function novaOperacao() {
        let opcao = prompt("Deseja fazer outra operação?\n 1 - Sim\n 2 - Não");
        if (opcao == 1) {
          calculadora();
        } else if (opcao == 2) {
          alert("Até mais!");
        } else {
          alert("Digite uma opção válida!");
          novaOperacao();
        }
      }
    }
  }

  console.log(
    "Escolhendo operação (modo == 0 -> if && else; modo != 0 -> switch case)"
  );
  const modo = Number(
    prompt(
      "Escolha uma opção:\n 0 - if && else \n Qualquer outro numero - switch case"
    )
  );
  if (modo == 0) {
    console.log("Usando if e else");
    if (operacao == 1) {
      soma();
    } else if (operacao == 2) {
      subtracao();
    } else if (operacao == 3) {
      multiplicacao();
    } else if (operacao == 4) {
      divisaoReal();
    } else if (operacao == 5) {
      divisaoInteira();
    } else if (operacao == 6) {
      potenciacao();
    }
  } else {
    console.log("Usando switch case");
    switch (operacao) {
      case 1:
        soma();
        break;
      case 2:
        subtracao();
        break;
      case 3:
        multiplicacao();
        break;
      case 4:
        divisaoReal();
        break;
      case 5:
        divisaoInteira();
        break;
      case 6:
        potenciacao();
        break;
    }
  }
}
calculadora();

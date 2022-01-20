escolha();

function escolha() {
  const ESCOLHA = Number(
    prompt(
      "Escolha o que deseja ver:\n1 - Verificar se uma palavra é palíndromo.\n2 - Editar um array de números\n3 - Sair."
    )
  );
  if (!ESCOLHA) {
    return;
  }
  switch (ESCOLHA) {
    case 1:
      palindromo();
      return;
    case 2:
      numeros();
      return;
    case 3:
      alert("Até Logo!");
      return;
    default:
      alert("A opção digitada é inválido");
      return;
  }
}

function palindromo() {
  const PALAVRA = prompt(
    "Será verificado de duas formas diferentes se a palavra digitada é um palíndromo\nDigite a palavra que deseja verificar"
  );
  if (!PALAVRA) {
    alert("A palavra digitada é inválida");
    palindromo();
    return;
  } else {
    comparacaoFor(PALAVRA);
    return;
  }
}

function comparacaoFor(palavra) {
  for (let i = 0; i < palavra.length; i++) {
    if (palavra[i] != palavra.length - 1 - i) {
      alert(`A palavra ${palavra} não é um palíndromo!`);
      return;
    }
  }
  alert(`A palavra ${palavra} é um palíndromo!!`);
  comparacaoReverse(palavra);
  return;
}

function comparacaoReverse(palavra) {
  if (palavra === palavra.split("").reverse().join("")) {
    alert(`A palavra ${palavra} else é um palíndromo!`);
    escolha();
    return;
  } else {
    alert(`A palavra ${palavra} não é um palíndromo!`);
    return;
  }
}

function numeros() {
  const ENTRADA_DE_DADOS = Number(
    prompt(
      "Escolha o que deseja:\n1 - Entrar manualmente com os números.\n2 - Inserir automáticamente n números."
    )
  );
  const QUANTIDADE = Number(
    prompt("Digite a quantidade de numeros que irá inserir.")
  );
  switch (ENTRADA_DE_DADOS) {
    case 1:
      let numeros;
      if ((QUANTIDADE = 0)) {
        alert(-1);
      } else {
        for (let i = 0; i < QUANTIDADE; i++) {
          numeros.push(Number(prompt(`Digite o ${i + 1}º numero.`)));
        }
        edicaoNumeros(numeros);
      }
      break;
    case 2:
      if ((QUANTIDADE = 0)) {
        alert(-1);
      } else {
        aleatorio(QUANTIDADE);
      }
      break;
    default:
      alert("A opção digitada é inválido");
      numeros();
      break;
  }
}

function aleatorio(quantidade) {
  let numeros = new Number();
  for (let i = 0; i < quantidade; i++) {
    numeros.push(Math.floor(Math.random() * 101));
  }
  alert("Os números escolhidos foram: \n" + numeros);
  console.log(numeros);
  edicaoNumeros(numeros);
  return;
}

function edicaoNumeros(numeros) {
  let numerosEditado;
  for (let numero in numeros) {
    if (numero % 2 == 0 && numero != 0) {
      numero = 0;
    }
    numerosEditado.push(numero);
  }
  alert(numerosEditado);
  return;
}

function somaNumeros(arr) {
  if (!arr || !arr.length) return;
  const soma = arr.reduce((prev, curr) => prev + curr);

  return soma;
}

const nums = [1, 1, 1, 3];

console.log(somaNumeros(nums));

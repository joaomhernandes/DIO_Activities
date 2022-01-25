function filtraPares(arr) {
  if (!arr || !arr.length) return;

  const filteredArr = arr.filter((item) => item % 2 === 0);

  return filteredArr;
}
const meuArray = [1, 23, 55, 67, 30, 2, 4];

console.log(filtraPares(meuArray));

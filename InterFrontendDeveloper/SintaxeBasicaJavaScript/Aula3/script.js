// Vetores ou Arrays
// Como declarar um array
let array = ["string", 1, true];
// Deve ser declarado entre colchetes "[]";
console.log(array);

// Como um array pode guardar difentes valores inclusive outros arrays
array = ["string", 1, true, ["array1"], ["array2"], ["array3"], ["array4"]];

// Como acessar o índice de um array
console.log(array[0]);

// Manipulando um array

// forEach - Realiza uma função para cada item do array
array.forEach(function (item, index) {
  console.log(item, index);
});

// push - Adiciona item no final do array
array.push("novo item");
console.log(array);

// pop - Remove o último item do array
array.pop();
console.log(array);

// shift - Remove o primeiro item do array
array.shift();
console.log(array);

// unshift - Adiciona item no início do array
array.unshift("novo item");
console.log(array);

// indexOf - Retorna o índice de um item do array
console.log(array.indexOf(true));

// splice - Remove ou substitui item por índice
array.splice(0, 3);
console.log(array);

// slice - Retorna uma parte de um array existente
let novoArray = array.slice(0, 3);
console.log(novoArray);

// Objetos
// Como declarar um objeto
let object = { propriedade1: "valor1", propriedade2: "valor2" };
// Deve ser declarado entre chaves "{}";
console.log(object);

// Assim como arrays as propriedades de objetos podem guardar quaisquer valores
object = {
  string: "string",
  number: 1,
  boolean: true,
  array: ["array"],
  objectInterno: { objetoInterno: "objeto Interno" },
};

// Como acessar propriedades de objetos
// Usando ponto "."
console.log(object.objectInterno);

// Manipulando objeto
// Desestruturando objeto
let string = object.string;
let number = object.number;
let boolean = object.boolean;

// Desestruturando usando chaves
let { string1, number1, boolean1 } = object;
console.log(string1, number1, boolean1);


let pessoa = {
    nome: 'Vinicius', // ou 'nome-da-pessoa' (entre aspas): 'Vinicius'
    idade: 24,
}

console.log(pessoa) //aparece todos os dados da pessoa

console.log(pessoa.nome)// acessa só o nome da pessoa
console.log(pessoa.idade) //acessa só a idade da pessoa

console.log(pessoa['nome-da-pessoa']) //quando o nome está entre aspas

pessoa.altura = 1.80 // adicionou altura no objeto

delete pessoa.altura //deleta altura do objeto

for (let indice in pessoa){ //aqui ele percorreu as chaves do objeto
    console.log(chave)
}


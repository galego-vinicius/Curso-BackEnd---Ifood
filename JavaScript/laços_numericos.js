const input = require('readline-sync')

for (let i = 0; i<10; i++ ){
    console.log("Repetição", i)
}

for (let i = 12; i>8; i-- ){
    console.log("Repetição", i)
}

let nota;
let soma = 0;

for (let j = 1; j<=3; j++){
    nota = Number(input.question(`Imforme a nota ${j} do aluno: `))
    soma = nota + soma
}

console.log(soma)
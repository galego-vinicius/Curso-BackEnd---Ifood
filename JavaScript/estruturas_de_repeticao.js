const input = require('readline-sync')
const numero_sorteado = 12
// npm install readline-sync -> arquivo para conseguir ler dados que os usuarios fornecerem só nesse diretorio
// se quiser colocar em todos os diretorios é npm install -g readline-sync

let numero = Number (input.question('Qual o numero que voce escolhe?'))
// Precisa do Number para converter de string para numero no input

console.log(numero, typeof numero) 

while(numero !== numero_sorteado){
    console.log("Voce errou o numero. Tente novamente!")
    numero = Number (input.question('Qual o numero que voce escolhe?'))
}

console.log("Voce acertou!")

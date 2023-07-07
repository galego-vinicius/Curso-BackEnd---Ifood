function saudacao(){
    console.log("Olá!")
}

saudacao()
console.clear()

// como enviar paramentros para as funções

function saudacao(usuario){
    console.log(`Olá, ${usuario}`)
}

saudacao('Vinicius')
console.clear()

// mais de 1 parametro
function saudacao(usuario, curso){
    console.log(`Olá, ${usuario}!, Bem vindo ao curso ${curso}`)
}

saudacao('Vinicius', 'JavaScript')

//Retorno da função

function soma(numero1, numero2){
    return numero1 + numero2
}

const resultado = soma(30, 20)
console.log(resultado)
resultado2 = resultado/2
console.log(Number(resultado2))

function maiorDoQue50(numero){
    if(numero>50){
        return true
    }
    return false
}
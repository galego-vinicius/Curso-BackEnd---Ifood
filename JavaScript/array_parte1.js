let arr = ['Vinícius', 24, 1.80, true]

console.log(arr)

console.log('Primeiro elemento: ', arr[0])

console.log('Tamanho da array: ', arr.length)

console.clear()

for(let i=0; i < arr.length; i++){
    console.log(arr[i])
}
// mesma coisa que o de baixo 
for(let elemento of arr){
    console.log(elemento)
}

console.clear()

for(let variavel in arr){ //percorre os indices da array
    console.log(variavel)
}
//mesma coisa que o de baixo
for(let indice in arr){ //percorre os indices da array
    console.log(indice, arr[indice])
}
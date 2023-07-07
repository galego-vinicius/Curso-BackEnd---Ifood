const arr1 = [30, 20, 10, 0, -10]
const arr2 = [30, 20, 10, 0, -10]

console.log(arr1.slice(0, 2)) //inicio e final da fatia da array
console.log(arr1.slice(2)) //vai do indice 2 em diante

console.clear ()

arr1.push(-20) //adiciona no ultimo indice
arr1.unshift(40) // adiciona no 1° indice

console.log(arr1)
console.clear()

arr2.pop() //remove o ultimo elemento da array
console.log(arr2)

arr2.shift() // remove o primeiro elemento da array
console.log(arr2)

console.clear()

console.log(arr1.concat(arr2))
console.clear()

let IndiceDoElemento20 = arr1.indexOf(20) //procura o indice do elemento
console.log(IndiceDoElemento20)
console.clear()

console.log(arr1.includes(10)) //se a array tem o elemento

const arrayInvertido = arr1.reverse()
console.log(arrayInvertido)

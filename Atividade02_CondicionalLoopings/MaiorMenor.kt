//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 27/08/24
/*Faça um programa na Linguagem Kotlin que efetue a leitura de cinco números inteiros e identificar o maior e o menor valor. Não execute a ordenação de valores.*/

fun main() {
  val numbers = IntArray(5)
  
  for (i in numbers.indices) {
    println("Digite o ${i + 1}º número:")
    numbers[i] = readLine()!!.toInt() }
  
  var maiorNum = numbers[0]
  var menorNum = numbers[0]
  
  for (num in numbers) {
    if (num > maiorNum) {
      maiorNum = num
    }
    if (num < menorNum) {
      menorNum = num
    } 
  } 
  println("O maior número é: $maiorNum")
  println("O menor número é: $menorNum")
}
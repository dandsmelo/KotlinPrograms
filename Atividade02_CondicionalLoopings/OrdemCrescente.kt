//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 27/08/24
/*Faça um programa na Linguagem Kotlin que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente*/

fun main() {
  println("Digite um valor para o primeiro elemento: ")
  var num01 = readLine()!!.toInt()
  
  println("Digite um valor para o segundo elemento: ")
  var num02 = readLine()!!.toInt()
  
  println("Digite um valor para o terceiro elemento: ")
  var num03 = readLine()!!.toInt()
  
  var menor: Int
  var meio: Int
  var maior: Int
  
  if (num01 <= num02 && num01 <= num03) {
    menor = num01
    if (num02 <= num03) {
      meio = num02 maior = num03
    } else { 
      meio = num03
      maior = num02
    } 
  } else if (num02 <= num01 && num02 <= num03) { 
    menor = num02
    if (num01 <= num03) {
      meio = num01
      maior = num03
    } else {
      meio = num03
      maior = num01 }
  } else {
    menor = num03
    if (num01 <= num02) {
      meio = num01
      maior = num02 
    } else { 
      meio = num02
      maior = num01 }
  }
  println("Os números em ordem crescente são: $menor, $meio, $maior")
}
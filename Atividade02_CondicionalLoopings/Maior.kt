//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 27/08/24
/*Faça um programa na Linguagem Kotlin que leia 3 números inteiros e mostre o maior deles.*/

fun main() { 
  println("Digite um valor para o primeiro elemento: ") 
  var num01 = readLine()!!.toInt()
  
  println("Digite um valor para o segundo elemento: ")
  var num02 = readLine()!!.toInt()
  
  println("Digite um valor para o terceiro elemento: ")
  var num03 = readLine()!!.toInt()
  
  val maiorNum = when {
    num01 >= num02 && num01 >= num03 -> num01
    num02 >= num01 && num02 >= num03 -> num02
    else -> num03
  }
  
  println("O maior número é $maiorNum") }
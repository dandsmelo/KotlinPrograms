//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 20/08/24
/*Faça um programa na Linguagem Kotlin  para ler dois valores inteiros para as variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados*/

import kotlin.io.readLine

fun main() {
  println("Digite um valor para a:")
  var a = readLine()!!.toInt()
  
  println("Digite um valor para b:")
  var b = readLine()!!.toInt()
  
  var temp: Int = a
  a = b
  b = temp
  
  println("Agora o valor de A é: $a") println("Agora o valor de B é: $b") }
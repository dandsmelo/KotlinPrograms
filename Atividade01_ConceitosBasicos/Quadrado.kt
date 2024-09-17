//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 20/08/24
/*Faça um programa na Linguagem Kotlin para efetuar a leitura de um número inteiro e apresentar o resultado do quadrado desse número*/

import kotlin.io.readLine

fun main() {
  println("Digite um número inteiro")
  var numI = readLine()!!.toInt()
  
  var result : Float
  result = numI.toFloat() * numI.toFloat()
  println(result) }
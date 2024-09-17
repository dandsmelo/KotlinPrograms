//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 20/08/24
/*Faça um programa na Linguagem Kotlin  para calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:VOLUME <-- 3.14159 * RAIO2 * ALTURA*/

import kotlin.io.readLine

fun main() {
  
  println("Digite o raio:")
  val raio = readLine()!!.toDouble()
  
  println("Digite a altura: ") 
  val altura = readLine()!!.toDouble()
  
  val volume = 3.14159 * (raio*raio) * altura
  
  println("O valor do volume da lata de óleo é %.2f".format(volume)) }
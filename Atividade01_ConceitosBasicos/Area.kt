//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 20/08/24
/* Faça um programa na Linguagem Kotlin que calcule a área da circunferência*/

import kotlin.io.readLine

fun main() {
  println("Digite o raio da circunferência:")
  val raio = readLine()!!.toDouble()
  
  val area = 3.14159 *(raio*raio)
  
  println("A área da circunferência é %.2f".format(area)) }
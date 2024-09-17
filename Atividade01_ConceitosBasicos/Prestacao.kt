//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 20/08/24
/*Faça um programa na Linguagem Kotlin para efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO)*/

import kotlin.io.readLine

fun main() {
  println("Digite o valor da prestação:")
  val valor = readLine()!!.toDouble()
  
  println("Digite o valor da taxa: ")
  val taxa = readLine()!!.toDouble()
  
  println("Digite o tempo de atraso: ")
  val tempo = readLine()!!.toInt()
  
  val prestacao = valor + (valor * (taxa/100) * tempo)
  println("O valor da prestação é de R$ %.2f".format(prestacao)) }
//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 20/08/24
/*Faça um programa na Linguagem Kotlin que leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura em Fahrenheit e C a temperatura em Celsius*/

import kotlin.io.readLine 
import kotlin.text.toDouble

fun main() { 
  
  print("Digite a temperatura em graus Celsius: ")
  var tempC = readLine()!!.toDouble()
  
  var tempF : Double
  tempF = (9 * tempC + 160)/5
  
  println(tempF)
}
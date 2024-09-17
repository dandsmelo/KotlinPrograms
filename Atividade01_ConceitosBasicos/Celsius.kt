//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 20/08/24
/*Faça um programa na Linguagem Kotlin que leia uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A formula de conversão é C <-- (F - 32) * (5/9), sendo f a temperatura em Fahrenheit e C a temperatura em Celsius*/

import kotlin.io.readLine
import kotlin.text.toDouble
fun main() {
  
  print("Digite a temperatura em graus Fahrenheit: ")
  var tempF = readLine()!!.toDouble()
  
  var tempC : Double
  tempC = (tempF - 32) * (5/9)
  
  println(tempC) 
}
//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 20/08/24
/*Faça um programa na Linguagem Kotlin que receba 2 números e apresente a multiplicação dos dois números*/

import kotlin.io.readLine
import kotlin.text.toDouble

fun main() { 
  var num1 : Double 
  var num2 : Double 
  
  print("Digite o primeiro número: ") 
  num1 = readLine()!!.toDouble() 
  
  print("Digite o segundo número: ") 
  num2 = readLine()!!.toDouble() 
  
  var resultado = num1 * num2
  println(resultado) 
}
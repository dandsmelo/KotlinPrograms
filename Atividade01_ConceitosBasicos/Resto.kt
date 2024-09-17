//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 20/08/24
/*Faça um programa na Linguagem Kotlin que receba um número e mostre o resto da divisão por 6.*/

import kotlin.io.readLine
import kotlin.text.toDouble

fun main() {
  println("Digite um número: ")
  var num1 = readLine()!!.toDouble()
  
  var resultado : Double resultado = num1 % 6
  println(resultado) }
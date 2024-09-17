//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 20/08/24
/*Faça um programa na Linguagem Kotlin que leia a idade de uma pessoa expressa em ano, mês e dia e mostre-as em dias*/

import kotlin.io.readLine

fun main() {
  println("Digite sua idade em anos: ")
  val anos = readLine()!!.toInt()
  
  println("Digite a idade em meses: ") 
  val meses = readLine()!!.toInt()
  
  println("Digite sua idade em dias: ")
  val dias = readLine()!!.toInt() 
  
  val idadeDias = (anos * 365) + (meses * 30) + dias
  println("Sua idade em dias é $idadeDias") }

//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 20/08/24
/* Faça um programa na Linguagem Kotlin que efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira*/

import kotlin.io.readLine

fun main() {
  println("Digite o valor da cotação do dólar: ")
  val cotacao = readLine()!!.toDouble()
  
  println("Digite a quantidade de dólares disponível: ")
  val qtdDolar = readLine()!!.toDouble()
  
  val valorReais = cotacao * qtdDolar
  
  println("O valor em reais é R$ %.2f".format(valorReais)) }
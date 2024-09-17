//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 27/08/24
/*Faça um programa na Linguagem Kotlin que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.*/

fun main() {
  println("Digite um número: ")
  val num = readLine()!!.toInt()
  
  if(num%2 == 0){
    println("$num é um número par")
  } else{
    println("$num é um número ímpar")
  }
}
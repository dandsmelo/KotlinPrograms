//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 27/08/24
/*Faça um programa na Linguagem Kotlin para apresentar o total da soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100). */

fun main() {
  var sum:Int = 0
  for(i in 1..100){
    sum += i
  }
  println(sum)
}
//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 27/08/24
/*Faça um programa na Linguagem Kotlin que que receba um número e mostre o fatorial desse número.*/

fun main() {
  println("Digite um número: ")
  val num = readLine()!!.toInt()
  
  var fatorial: Int = 1
  var multi = 1
  
  while (multi <= num) {
    fatorial *= multi
    multi += 1
  }
  
  println("O fatorial de $num é $fatorial")
}
//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 27/08/24
/*Faça um programa na Linguagem Kotlin que leia quatros valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o valor da média do aluno para qualquer condição*/

fun main() {
  println("Digite o valor da primeira nota: ")
  val nota01 = readLine()!!.toDouble()
  
  println("Digite o valor da segunda nota: ")
  val nota02 = readLine()!!.toDouble()
  
  println("Digite o valor da terceira nota: ")
  val nota03 = readLine()!!.toDouble()
  
  println("Digite o valor da quarta nota: ")
  val nota04 = readLine()!!.toDouble()
  
  val media = (nota01 + nota02 + nota03 + nota04) / 4
  
  if(media>7){
    println("O aluno foi aprovado com média $media")
  } else{
    println("O aluno foi reprovado com média $media")
  }
}
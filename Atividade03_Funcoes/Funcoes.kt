//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 30/08/24
/* Faça um programa na Linguagem Kotlin que leia tenha 3 opções:     1 - Fatorial    2 - Quadradro de um número    3 - Volume de uma lata    4 – Sair do ProgramaUtilize os conceitos de funções em Kotlin*/

import kotlin.math.pow
import kotlin.math.PI

fun main() {
  
  while(true){
    println("Digite o número da opção desejada: ")
    println("1 - Fatorial")
    println("2 - Quadrado de um número")
    println("3 - Volume de uma lata")
    println("4 - Sair do programa")

    var numOption = readLine()!!.toInt()
    
    when(numOption){
      1 -> {
        println("Digite um número para calcular o fatorial: ")
        var num = readLine()!!.toInt()
        println("Fatorial de $num é ${fatorial(num)}")
      }
      
      2 -> {
        println("Digite um número para calcular o quadrado: ") 
        var num = readLine()!!.toDouble()
        println("O quadrado de $num é ${quadrado(num)}")
      }
      3 -> {
        println("Digite o raio da base da lata:")
        val raio = readLine()!!.toDouble()
        
        println("Digite a altura da lata:")
        var altura = readLine()!!.toDouble()
        
        println("O volume da lata é ${volume(raio, altura)}")
      }
      4 ->{
        println("Saindo do programa")
        break
      }
      else ->{
        println("Opção inválida")
      }
    }
  }
}

fun fatorial(n:Int): Int {
  var result: Int = 1
  for (i in 1..n){
    result *= i
  }
  return result
}

fun quadrado(num: Double) : Double{
  return num.pow(2)
}

fun volume(raio: Double, altura: Double) : Double{
  return PI * raio.pow(2) * altura
}
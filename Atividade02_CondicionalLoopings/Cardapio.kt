//Dandara Melo -  4º semestre
//Fatec Diadema - Luigi Papaiz
//Disciplina: Programação mobile - 27/08/24
/*O cardápio de uma lanchonete é o seguinte:                       Especificação Código PreçoCachorro quente 100 1,20Bauru simples 101 1,30Bauru com ovo 102 1,50Hambúrger 103 1,20Cheeseburguer 104 1,30Refrigerante 105 1,00Faça um programa na Linguagem Kotlin que leia o código do item pedido, a quantidade e calcule o valor a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item*/

fun main() {
  println("Digite o código do item: ")
  val code = readLine()!!.toInt()
  
  println("Quantidade de itens: ")
  val qtde = readLine()!!.toInt()
  
  when(code){
    100, 103 -> {
      val preco = 1.20 * qtde
      println("Valor total: R$ $preco")
    }
    101, 104 -> {
      val preco = 1.30 * qtde
      println("Valor total: R$ $preco")
    }
    102 -> { 
      val preco = 1.50 * qtde
      println("Valor total: R$ $preco")
    }
    105 -> {
      val preco = 1.0 * qtde
      println("Valor total: R$ $preco")
    }
    else -> println("Código inválido")
  }
}
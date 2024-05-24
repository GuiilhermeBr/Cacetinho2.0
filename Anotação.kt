fun main() {
    // Anotações em uma única linha

    /* Anotação
     * em
     * várias
     * linhas
    */ 
    
    /* A programação é feita de variáveis e constantes
     * Variável: Valor que pode sofrer alterações
     * Constante: O valor vai permanecer sempre o mesmo
     * 
     * Tipos de variáveis
     * 
     * String: Variável de texto, declarada entre aspas ""
     * Boolean: Verdadeiro ou falso (True or False)
     * 
     * Tipos de variáveis numéricas
     * 
     * Int: Guarda números inteiros (ex: 1)
     * Float: Guarda números decimais até 7 casas, para especificar uma float é
     * necessário colocar um f na frente (ex: 1.0000000f)
     * Double: Guarda números decimais até 15 casas (ex: 1.000000000000000)
     * Long: Guarda números grandes, a partir de 17 dígitos (ex: 10000000000000000)
     */
    
    // Exemplo de variáveis
    var dinheiro = 100
    var mensagem = "Kleberson Gay"
    
    // Exemplo de constantes
    val id = 1234
    val nome = "Kleberson Reginaldo Ferreira de Oliveira"
    
    // String
    var string = "string"
    
    // Boolean
    var boolean = true
    var boolean2 = false
    
    // Int
    var int = 1
    
    // Float
    var float = 1.1f
    
    /* Você não necessariamente precisa atribuir um valor para a variável,
     * É necessário apenas especificar seu tipo (com letra maiúscula)
     * Por não possuir nenhum valor, só o seu tipo, será atribuído um valor
     * Padrão chamado null (nulo)
    */
    
    var texto: String
    var numero: Int
    var real: Boolean
    
    /*
     * print
     * Feito para imprimir textos no console
     * Muito utilizado para fazer logs
     * logs nada mais são do que registros que uma pessoa pode fazer para
     * saber se seu código está funcionando ou não.
    */
    
    // print: Na mesma linha
    print("Lucas Gay")
    
    // Println: Quebra de linha, ou seja, vai para a linha de baixo
    println(" Gay Lucas")
    println("Kleberson tbm")
    
    // Você pode imprimir o valor de variáveis de qualquer tipo, por exemplo
    var prato_do_dia = "Kleberson"
    println(prato_do_dia)
    
    // Você pode colocar variáveis no meio do texto do print, chamamos isso de
    // Concatenação, basta colocar um $ e o nome da variável
    var numero_premiado = 72
    println("O número premiado é: $numero_premiado!")
}

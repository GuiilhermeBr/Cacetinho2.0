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
    
    // Você pode mudar o valor de variáveis no meio do código
    // A variável não volta com o seu valor original a não ser que você reinicie o código
    // Exemplo:
    
    var idadeKleberson = 80
    println("Kleberson tem $idadeKleberson anos! ")
    idadeKleberson = 90
    println("Agora Kleberson tem $idadeKleberson anos! ")
    
    /*
     * Atividade 1
     * 3 pessoas diferentes tem uma quantidade de dinheiro diferente
     * O nome de cada pessoa tem que estar armazenado em uma variável
     * e o dinheiro também
     * exiba no console o nome da pessoa e quanto ela tem na conta montando uma frase,
     * usando a concatenação
     * ex: Olá João, você tem 10 reais na conta, pobre
     * é necessário uma linha para cada pessoa
     */
     
    var nome1 = "João Paschoal"
    var nome2 = "Victor Eduardo"
    var nome3 = "Henrique Pinto"
    var dinheiro1 = 10000000000000000000000000000000000000000000000000000000000000000000000000000000.00
    var dinheiro2 = 5000.00
    var dinheiro3 = 0.00
    	
    println("$nome1 é o maior gostosão da cidade. Ele é multimilionário, tem R$$dinheiro1! ")
    println("Já o $nome2 é o maior pegador. Ele tem R$$dinheiro2! ")
    println("E o $nome3 é o maior viadão. Ele é pobre, tem R$$dinheiro3! ")
    
    /*
     * Operadores matemáticos
     * + soma
     * - subtração
     * * multiplicação
     * / divisão
     * % módulo (resto da divisão)
     * ++ adicionar 1 na variável
     * -- subtrair 1 na variável
     * += acúmulo de valores dentro na variável
     * -= decréscimo de valores dentro da variável
     */
    
    var numeroOperacao = 1
    numeroOperacao = 1 + 1
    numeroOperacao = 1 - 1
    numeroOperacao = 1 * 1
    numeroOperacao = 1 % 1
    numeroOperacao = 1 / 1
    
    // Você pode usar operadores em basicamente qualquer lugar do código
    println(numeroOperacao + 3)
    
    numeroOperacao++
    println(numeroOperacao)
    
    numeroOperacao--
    println(numeroOperacao)
    
    // Importante
    var numeroAdicao = 5
    numeroAdicao + 5 // Não vai fazer o valor ser 10
    println(numeroAdicao)
    numeroadicao += 5 // Agora sim
    println(numeroAdicao)
    
    // Mesma coisa para a subtração
    var numeroSubtracao = 5
    numeroSubtracao - 5 // Não vai fazer o valor ser 0
    println(numeroSubtracao)
    numeroSubtracao -= 5 // Aagora sim
    println(numeroSubtracao)
    
    /*
     * Operadores condicionais
     * if - verifica se uma condição é verdadeira e então, executa uma ação
     * 
     * else if - executa uma ação se a condição do if não for verdadeira, ele verifica
     * se outra condição é verdadeira
     * 
     * else - Executa uma ação se nenhuma das outras condições forem verdadeiras
     * 
     * Comparadores
     * == - Comparar uma igualdade
     * != - Comparar a diferença
     * >= - Comparar se um valor é maior ou igual
     * <= - Comparar se um valor é menor ou igual
     * > - Comparar se um valor é maior que outro
     * < - Comparar se um valor é menor que outro
     * ! = Inverter o valor
     */
}

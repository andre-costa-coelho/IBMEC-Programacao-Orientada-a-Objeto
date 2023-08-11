public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Este é um comentário 
         * de bloco. Posso escrever várias linhas.
         */
        System.out.println("Hello, World!"); // Cometário de uma linha

        // Tipo de dados:
        //<tipoVar> <nomeVar1>, <nomeVar2>, <nomeVar3>;
        double x, y, z;
        // <tipoVar> <nomeVar> = <valor>;
        String nome = "André";

        // Inteiros
        byte a = -50;          // 8 Bits   -> -128 a 127
        short b = 15750;       // 16 Bits  -> -32.768 a 32.767
        int c = 1050000;       // 32 Bits  -> Padrão
        long d = 156000000l;   // 64 Bits

        // Decimais
        float e = 4.85f;      // 32 Bits
        double f = -105.48;   // 64 Bits  -> Padrão

        // Booleano
        boolean teste = true;
        boolean outroTeste = false;

        // Texto
        char letra = 'a'; // uso das aspas simples. Ocupa 2 bytes e usa UNICODE
        String outroNome = "André"; // não é um tipo de dado primitivo!

        // type casting
        f = (double) b;
        c = (int) e; 
        System.out.println(c);

        // Operadores:
        x = 10.5;
        y = -4.5;
        z = 2.2;
        // > Aritiméticos
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println(x % y);

        // > Atribuição
        x += 2;  // x = x + 2
        z-= 1.5; // z = z - 1.5

        System.out.println("--------------------");
        System.out.println(x);
        System.out.println(x++); // Uso da variável e depois o incremento
        System.out.println(x);
        System.out.println("--------------------");
        System.out.println(++x); // Incremento e depois uso da variável
        System.out.println("--------------------");
        
        c = 2;
        int w = ++c;
        System.out.println(w);

        w = c--;
        System.out.println(w);

        // > Comparação
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x > y);
        System.out.println(x < y);

        // > Lógicos
        System.out.println(!false);         // NOT
        System.out.println(true && false);  // AND
        System.out.println(true || false);  // OR

        // Estruturas de decisão
        // if-else
        int idade = 19;
        if (idade > 18) {
            System.out.println("Você é maior de idade.");
        } else if (idade < 0) {
            System.out.println("Idade inválida.");
        } else {
            System.out.println("Você é menor de idade");
        }

        // NÂO É UMA BOA PRÁTICA!!!
        if (idade > 18) 
            System.out.println("Você é maior de idade.");
        else 
            System.out.println("Você é menor de idade");
            

        // switch
        String opcao = "a";

        switch (opcao) {
            case "a":
                System.out.println("Opção a");
                break;
            case "b":
                System.out.println("Opção a");
                break;
            case "c":
                System.out.println("Opção a");
                break;
            default:
                System.out.println("Opção inválida.");
            
        }
        System.out.println("--------------------");
        // Estruturas de repetição
        //for
        for (int i = 0; i <= 5; i++){
            System.out.println(i);
        }

        int i = 0;
        for (i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println(i);

        for (i = 0; i < 10; i++){
            i++;
            if (i == 3){
                continue; // Interrompe a interação
            }
            System.out.println(i);
            if (i == 5){
                break;    // Interrompe o for
            }
        }

        //while
        i = 10;
        while (i > 0){
            System.out.println(i--);
        }

    }
}
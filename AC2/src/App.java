import java.util.Scanner;

public class App { 
/*1- Desenvolva uma calculadora. Implemente métodos para as operações de soma, subtração, multiplicação e divisão,
que retornem os respectivos resultados;*/
    public static double soma(double x, double y) {
        return x + y;
    }
    public static double sub(double x, double y) {
        return x - y;
    } 
    public static double mult(double x, double y) {
        return x * y;
    } 
    public static double div(double x, double y) {
        return x / y;
    } 
    public static void main(String[] args) throws Exception {
        System.out.println("========================================");
        System.out.println("         *CALCULADORA EM JAVA*          ");
        System.out.println("========================================");
/*2- Implemente uma interface por linha de comando, em que o programa pede um número, em seguida pede para escolher
uma operação, pede um segundo número e apresenta um resultado;*/
        Scanner leitor = new Scanner(System.in);
        int op1 = 0;
        int op2 = 0;
        double primeiroNum;
        double segundoNum;
        double resultado = 0;
        System.out.println("Informe o primeiro número: ");
        primeiroNum = leitor.nextDouble();
        while (op1 != 5){
            System.out.println("Informe o segundo número: ");
            segundoNum = leitor.nextDouble();
            System.out.println("OPERAÇÕES:");
            System.out.println("1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão"); /*O programa continua nesse loop até o usuário pedir para sair (escolha uma mensagem para ser inserida pelo 
usuário, como sair ou x).*/
            op1 = leitor.nextInt();
            switch (op1) {
                case 1:
                    resultado = soma(primeiroNum,segundoNum);
                    System.out.println("RESULTADO: " + resultado );
                break;
                case 2:
                    resultado = sub(primeiroNum,segundoNum);
                    System.out.println("RESULTADO: " + resultado);
                break;
                case 3:
                    resultado = mult(primeiroNum,segundoNum);
                    System.out.println("RESULTADO: " + resultado);
                break;
                case 4:
                    resultado = div(primeiroNum,segundoNum);
                    System.out.println("RESULTADO: " + resultado);
                break;
                case 5:                   
                break;
                default:
                    System.out.println("Opção inválida");
            }
/*3- Após o primeiro resultado exibido, o programa dá a opção do usuário limpar a memória e recomeçar o cálculo,
ou escolher uma nova operação, para então pedir um outro número e calcular um novo resultado;*/
            System.err.println("MENU:");
            System.out.println("1- Limpar a memória e recomeçar o cálculo, 2- Escolher uma nova operação ou 3- Parar:");
            op2 = leitor.nextInt();
            if (op2 == 1){
                System.out.println("Informe o primeiro número: ");
                primeiroNum = leitor.nextDouble();
                continue;                
            } else if (op2 == 2){
                primeiroNum = resultado;
/*O programa continua nesse loop até o usuário pedir para sair (escolha uma mensagem para ser inserida pelo 
usuário, como sair ou x).*/
            } else if (op2 == 3){
                break;
            }

        }
    }
}


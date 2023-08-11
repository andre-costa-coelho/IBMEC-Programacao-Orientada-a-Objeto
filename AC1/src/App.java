public class App {
    public static void main(String[] args) throws Exception {
        // Aplicando a função "nota":
        System.out.println("----------------------------------------");
        System.out.println("Calculando média do aluno...");
        System.out.print("A média é ");
        nota(7.5,8.4,7.9);
        System.out.println("----------------------------------------");
        // Aplicando a função "num100a150 "
        System.out.println("Os números de 100 à 150 são: ");
        num150a200();
        System.out.println("----------------------------------------");
        // Aplicando a função "ePrimo"
        System.out.println("Teste de número primo:");
        int num = 10;
        boolean testePrimo = ePrimo(num);
        if (testePrimo == true){
            System.out.println("O número é primo.");
        } else{
            System.out.println("O número não é primo.");
            System.out.print("O divisores de ");
            System.out.print(num);
            System.out.println(" são");
            for (int i = 1; i <= num; i++){
                if (num % i == 0){
                    if(i < num){ 
                        System.out.print(i);
                        System.out.print(", ");
                        } else {
                            System.out.println(i);
                        }
                }
            }
			}
        System.out.println("----------------------------------------");
        // Aplicando a função diaSemana:

        System.out.print("O dia da semana é ");
        diaSemana(3);
        System.out.println("----------------------------------------");

        // Aplicando a função "eBissexto"
        int ano = 2004;
        System.out.print("O ano "); 
        System.out.print(ano);
        if (eBissexto(ano) == true){
            System.out.print(" é bissexto.");
        } else {
            System.out.print("não é bissexto."); 
        }
    }             
    
    public static void nota(double ap1, double ap2, double ac){
       
        double media = ap1 * 0.4 + ap2 * 0.4 + ac * 0.2;
        System.out.println(media);
    }
    public static void num150a200(){
        for (int i = 150; i <= 200; i++) {
            if(i < 200){ 
            System.out.print(i);
            System.out.print(", ");
            } else {
                System.out.println(i);
            }
        
        }
    }

    public static boolean ePrimo(int n){
        if (n <= 1) {  
            return false;
        }
    
        for (int i = 2; i*i <= n; i++) {  
            if (n%i == 0) {
                return false;  
            }
        }
        return true;
    }

    public static void diaSemana(int n){
        switch (n){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira"); 
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira"); 
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira"); 
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor Inválida");
                break;
        }
    }

    public static boolean eBissexto (int n){
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) { 
            return true;
        }
        return false;
    }
}
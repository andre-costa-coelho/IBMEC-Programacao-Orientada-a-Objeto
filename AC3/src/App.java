import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int op1 = 0;

        while (op1 != 4){
            System.out.println("=====================================");
            System.out.println("              EVENTOS!!              ");
            System.out.println("=====================================");
            System.out.println("Selecione o menu que deseja acessar: ");
            System.out.println("1- Criar um evento, 2- Cadastrar um aluno, 3- Cadastrar um palestrante e 4- Fechar programa: ");
            op1 = leitor.nextInt();
            switch (op1){
                case 1:
                    System.out.println("------------------------------------------------------------------------");
                    String nomeEvento, data, local,info;
                    int numMax;

                    System.out.println("Insira o nome do evento: ");
                    nomeEvento = leitor.next();
                    System.out.println("Insira a data (DD/MM/AAAA) do evento: ");
                    data = leitor.next();
                    System.out.println("Insira o local do evento: ");
                    local = leitor.next();
                    System.out.println("Insira o número máximo de alunos no evento: ");
                    numMax = leitor.nextInt();
                    System.out.println("Insira informações adicionais do evento: ");
                    info = leitor.next();

                    Evento novoEvento = new Evento(nomeEvento,data,local,numMax,info);
                break;
                case 2:
                    System.out.println("------------------------------------------------------------------------");
                    String nomeAluno, curso, eventoAluno;
                    int idade;
                    System.out.println("Insira o nome do aluno: ");
                    nomeAluno = leitor.next();
                    System.out.println("Insira o curso do aluno: ");
                    curso = leitor.next();
                    System.out.println("Insira o evento que o aluno deseja participar: ");
                    eventoAluno = leitor.next();
                    System.out.println("Insira a idade do aluno: ");
                    idade = leitor.nextInt();

                    Aluno novoAluno = new Aluno(nomeAluno, curso, eventoAluno, idade);
                break;
                case 3:
                    System.out.println("------------------------------------------------------------------------");1
                    String nomePalestra, assunto, eventoPalestra;
                    System.out.println("Insira o nome do palestrante: ");
                    nomePalestra = leitor.next();
                    System.out.println("Insira o assunto da palestra: ");
                    assunto = leitor.next();
                    System.out.println("Insira o evento que o aluno deseja participar: ");
                    eventoPalestra = leitor.next();

                    Palestrante novoPalestrante = new Palestrante(nomePalestra, assunto, eventoPalestra);
                    break;
                case 4:
                    System.out.println("Obrigado, volte sempre!");
                    break;
                default:
                System.out.println("Opção invalida");
            }
        }
    }
}

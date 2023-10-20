import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
public class App {
    public static void main(String[] args) throws Exception {
        //vetores();
        //arrayList();
        //linkedList();
        //pilhas();
        //conjuntos();
        mapas();

    }

    public static void vetores() {
        int tamanho = 5;
        int[] arrayInteiros = new int[5];
        System.out.println(arrayInteiros);

        String[] letras = { "A", "B", "C", "D", "E" };
        System.out.println(letras);
        //tamanho do vetor:
        System.out.println(letras.length);


        System.out.println("==========================");
        System.out.println(letras[2]);
        letras[2] = "Z";
        System.out.println(letras[2]);

        arrayInteiros[3] = 4;

        System.out.println("==========================");

        // percorrendo todos os elementos do array.
        for (int i = 0; i < tamanho; i++) {
            System.out.println(arrayInteiros[i]);
        }

        // for letra in letras.
        for (String letra : letras) {
            System.out.println(letra);
        }
    }

    // aumenta o tamanho do vetor.
    public static String[] aumentaVetor (String[] vetor) {
        String[] novoVetor = new String[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }
        return novoVetor;
    }

    public static void arrayList() {
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println(numeros);

        numeros.add(8); // adiciona um elemento no final do arrayList.
        numeros.add(3);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.get(1));

        
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // remove o elemento da arrayList.
        numeros.remove(0);
        System.out.println(numeros);

        // verifica se o elemento está contido na arrayList.
        System.out.println(numeros.contains(8));
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);

        numeros.add(0, 16); // adiciona o elemento na posição 0.

        // modifica elemento na posição 0.
        numeros.set(0, 999);
        

        numeros.clear(); // limpa o arrayList.
    }

    public static void linkedList() {
        //Ex:
        LinkedList<String> carros = new LinkedList<>();

        carros.add("Porsche 911");
        carros.add("Ferrari F40");

        System.out.println(carros);

        System.out.println(carros.indexOf("Ferrari F40"));

        // pop e push são mais eficientes que o add e remove.
        // remove o elemento da posição 0.
        carros.pop();
        System.out.println(carros);

        // adiciona o elemento na posição 0.
        carros.push("Mercedes AMG GT");
        System.out.println(carros);
        
        carros.remove(1);
        System.out.println(carros);
    }

    public static void pilhas(){
        //Ex:
        Stack<Double> notas = new Stack<>();

        notas.push(9.5);
        notas.push(8.5);
        System.out.println(notas.peek()); // retorna o elemento do topo da pilha.

        notas.push(7.5);
        System.out.println(notas.peek());

        notas.pop();
        System.out.println(notas.peek());

        //exibe todos os elementos da pilha.
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }

    public static void conjuntos() {
        //Ex:
        HashSet<String> frutas = new HashSet<>();
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Pera");
        System.out.println(frutas);

        frutas.add("Banana");
        System.out.println(frutas);

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        frutas.remove("Banana");
        System.out.println(frutas);
    }

    public static void mapas() {
        HashMap<String, String> alunos = new HashMap<>();

        alunos.put("1234", "João"); // adiciona um elemento no mapa.
        alunos.put("5678", "Maria");

        System.out.println(alunos);
        System.out.println(alunos.get("1234")); // retorna o valor da chave.
        System.out.println(alunos.get("1235")); // null
        System.out.println(alunos);

        System.out.println(alunos.containsKey("1234")); // verifica se a chave existe.
        System.out.println(alunos.containsValue("Maria")); // verifica se o valor existe.

        System.out.println(alunos.size()); // retorna o tamanho do mapa.
        

        System.out.println(alunos.keySet()); // retorna todas as chaves do mapa.
        for (String matricula : alunos.keySet()) {
            System.out.println(matricula);
            System.out.println(alunos.get(matricula));
        }

        for (String nome : alunos.values()) {
            System.out.println(nome);
        }
    }
}

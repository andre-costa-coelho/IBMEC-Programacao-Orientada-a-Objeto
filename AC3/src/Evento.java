public class Evento {
    String nome, data, local, alunos, info;
    int numMax;

    Evento(String nome, String data, String local, int numMax, String info) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.numMax = numMax;
        this.info = info;
    }
}
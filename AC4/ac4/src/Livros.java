public abstract class Livros {
    String nome;
    String autor;
    String estado;

    public Livros(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.estado = "Guardado";
    }

    public void reservar(){}

    public void emprestar() {}

    public void cancelarReserva(){}

    public void devolver(){}
}
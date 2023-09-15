public class Ebooks extends Livros {
    String tipo;

    public Ebooks(String nome, String autor, String tipo) {
        super(nome, autor);
        this.tipo = tipo;
    }

    @Override
    public void reservar(){
        System.out.println("O Ebook \"" + super.nome + "\" foi reservado.");
        super.estado = "Reservado";
    }

    @Override
    public void emprestar() {
        System.out.println("Ebooks aceitam apenas reservas.");
    }

    @Override
    public void cancelarReserva(){
        System.out.println("A reserva do Ebook \"" + super.nome + "\" foi cancelada.");
        super.estado = "Guardado";
    }

    @Override
    public void devolver(){
        System.out.println("O Ebook \"" + super.nome + "\" foi devolvido.");
        super.estado = "Guardado";
    }
}
public class LivrosFisicos extends Livros{

    public LivrosFisicos(String nome, String autor) {
        super(nome, autor);
    }

    @Override
    public void reservar(){
        System.out.println("O livro físico \"" + super.nome + "\"  foi reservado.");
        super.estado = "Reservado";
    }

    @Override
    public void emprestar() {
        if (super.estado.equals("Reservado")) {
            System.out.println("O livro físico \"" + super.nome + "\"  foi emprestado.");
            super.estado = "Emprestado";
        } else if (super.estado.equals("Emprestado")){
            System.out.println("O ivro físico \"" + super.nome + "\" já está emprestado.");
        } else{
            System.out.println("Primeiro é necessário reserva.");
        }
    }

    @Override
    public void cancelarReserva(){
        System.out.println("A reserva do livro físico \"" + super.nome + "\" foi cancelado.");
        super.estado = "Guardado";
    }

    @Override
    public void devolver(){
        System.out.println("O livro físico \"" + super.nome + "\"  foi devolvido.");
        super.estado = "Guardado";
    }
}
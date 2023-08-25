public class App {
    public static void main(String[] args) throws Exception {
        Jogador jog1, jog2;
        
        jog1 = new Jogador();
        jog1.nome = "Neymar";
        jog1.posX = -15.2;
        jog1.posY = 25.4;
        jog1.numeroCamisa = 10;
        jog1.time = "Al-Hilal";

        System.out.println(jog1.peso);
        System.out.println(jog1.posX + " , " + jog1.posY);
        jog1.andar(-10, 28);
        System.out.println(jog1.posX + " , " + jog1.posY);

        jog2 = new Jogador();
        jog2.nome = "Neymar";
        jog2.posX = -15.2;
        jog2.posY = 25.4;
        jog2.numeroCamisa = 10;
        jog2.time = "Al-Hilal";

        System.out.println(jog1);
        System.out.println(jog1);
        System.out.println(jog1 == jog2);  //Objetos diferentes (resultado = false)

        Jogador jog3 = new Jogador("Arrascaeta", "Flamengo", 1.72, 60, "Meio-Campo");
        System.out.println(jog3.nome);
        System.out.println(jog3.velocidade);

    }
}

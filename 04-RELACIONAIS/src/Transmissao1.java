public class Transmissao1 implements ITransmiteDados {
    @Override
    public void enviaJson() {
        System.out.println("Enviando .json");
    }

    @Override
    public String recebeMsg(String protocolo){
        return "Recebida mensagem usando protocolo " + protocolo;
    }
    
}

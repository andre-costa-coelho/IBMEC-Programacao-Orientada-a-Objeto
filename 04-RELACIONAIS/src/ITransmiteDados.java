public interface ITransmiteDados {
    
    // Métodos em interface são abstrator por padrão
    // Então não é preciso explicitar.
    void enviaJson();
    String recebeMsg(String protocolo);
}

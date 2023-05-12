public class Consutorio implements Setor{
    private static Consutorio instancia = new Consutorio();

    private Consutorio() {}

    public static Consutorio getInstancia() {
        return instancia;
    }

    public String receberDiagnostico(String mensagem) {
        return "O seu diagnostico é: " + mensagem;
    }

    public String receberReceita(String mensagem) {
        return "O seu remédio é: " + mensagem;
    }

    public String receberDuvida(String mensagem) {
        return "A sua duvida é: " + mensagem;
    }
}

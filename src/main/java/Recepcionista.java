public class Recepcionista {
    private static Recepcionista instancia = new Recepcionista();

    private Recepcionista() {}

    public static Recepcionista getInstancia() {
        return instancia;
    }

    public String receberDiagnosticoConsulta(String mensagem) {
        return "Seu diagnostico será analisado.\n"+
                "O consutório respondeu conforme a mensagem a seguir.\n" +
                ">>" + Consutorio.getInstancia().receberDiagnostico(mensagem);
    }

    public String receberReceitaConsulta(String mensagem) {
        return "Sua receita será analisada.\n"+
                "O consutório respondeu conforme a mensagem a seguir.\n" +
                ">>" + Consutorio.getInstancia().receberReceita(mensagem);
    }

    public String receberDuvidaConsulta(String mensagem) {
        return "Sua dúvida será analisada.\n"+
                "O consutório respondeu conforme a mensagem a seguir.\n" +
                ">>" + Consutorio.getInstancia().receberDuvida(mensagem);
    }

}

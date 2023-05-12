public class Pessoa {
    public String receberDiagnosticoConsultorio(String mensagem) {
        return Consutorio.getInstancia().receberDiagnostico(mensagem);
    }

    public String receberReceitaConsultorio(String mensagem) {
        return Consutorio.getInstancia().receberReceita(mensagem);
    }

    public String duvidaConsultorioConsultorio(String mensagem) {
        return Consutorio.getInstancia().receberDuvida(mensagem);
    }
}

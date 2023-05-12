import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {
    @Test
    void devePedirDiagnostico() {
        Paciente paciente = new Paciente();
        assertEquals("Seu diagnostico será analisado.\nO consutório respondeu conforme a mensagem a seguir.\n" +
                        ">>O seu diagnostico é: Gripe",
                paciente.receberDiagnosticoConsultorio("Gripe"));
    }

    @Test
    void devePedirReceita() {
        Paciente paciente = new Paciente();
        assertEquals("Sua receita será analisada.\nO consutório respondeu conforme a mensagem a seguir.\n" +
                        ">>Você deve tomar: Benegripe",
                paciente.receberReceitaConsultorio("Benegripe"));
    }

    @Test
    void deveTirarDuvida() {
        Paciente paciente = new Paciente();
        assertEquals("Sua dúvida será analisada.\nO consutório respondeu conforme a mensagem a seguir.\n" +
                        ">>A resposta para sua dúvida é : 2 horas de repouso",
                paciente.duvidaConsultorioConsultorio("2 horas de repouso"));
    }
}

package sistema_de_estoque.teste.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sistema_de_estoque.builder.SolicitanteBuilder;
import sistema_de_estoque.modelo.Solicitante;

public class SolicitanteModeloTest {
    @Test
    public void deveCriarSolicitanteComBuilder(){
        Solicitante solicitante = SolicitanteBuilder.umSolicitante().constroi();

        Assertions.assertEquals("Patrick Viegas", solicitante.getNome());
        Assertions.assertEquals("99999999999", solicitante.getCpf());
        Assertions.assertEquals("9899999999", solicitante.getTelefone());
    }

    @Test
    public void deveCriarSolicitanteCostumizadoComBuilder(){
        Solicitante solicitante = SolicitanteBuilder.umSolicitante()
                .comNome("Fernando")
                .comCpf("1234")
                .comTelefone("8888").constroi();
        Assertions.assertEquals("Fernando", solicitante.getNome());
        Assertions.assertEquals("1234", solicitante.getCpf());
        Assertions.assertEquals("8888",solicitante.getTelefone());

    }
}
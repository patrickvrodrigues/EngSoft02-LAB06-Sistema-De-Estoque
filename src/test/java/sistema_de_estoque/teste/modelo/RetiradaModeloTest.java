package sistema_de_estoque.teste.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sistema_de_estoque.builder.RetiradaBuilder;
import sistema_de_estoque.modelo.Retirada;

import java.time.LocalDate;

public class RetiradaModeloTest {
    @Test
    public void deveCriarRetiradaComBuilder(){

        Retirada retirada = RetiradaBuilder.umaRetirada().constroi();

        Assertions.assertEquals("Patrick Viegas", retirada.getSolicitante().getNome());
        Assertions.assertEquals("Sabão em pó", retirada.getProduto().getNome());
        Assertions.assertEquals(5, retirada.getQuantidade());
        Assertions.assertEquals(LocalDate.now(), retirada.getDataRetirada());
    }

}
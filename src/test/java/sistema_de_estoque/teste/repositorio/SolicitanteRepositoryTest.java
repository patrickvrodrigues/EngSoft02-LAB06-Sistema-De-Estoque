package sistema_de_estoque.teste.repositorio;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import sistema_de_estoque.builder.SolicitanteBuilder;
import sistema_de_estoque.modelo.Solicitante;
import sistema_de_estoque.repositorio.SolicitanteRepository;

import java.util.Optional;


@DataJpaTest
public class SolicitanteRepositoryTest {
    private Solicitante solicitante;
    @Autowired
    private SolicitanteRepository solicitanteRepository;

    @BeforeEach
    public void before() {

        solicitante = SolicitanteBuilder.umSolicitante().constroi();
        solicitante = solicitanteRepository.save(solicitante);

    }

    @AfterEach
    public void after() {
        solicitanteRepository.deleteAll();
    }

    @Test
    public void deveBuscarSolicitantePeloNome() {

        Optional<Solicitante> solicitanteTeste = solicitanteRepository.buscaPorNome("Patrick Viegas");
        Assertions.assertTrue(solicitanteTeste.get().equals(solicitante));
    }

    @Test
    public void deveBuscarSolicitantePeloCodigo() {

        Optional<Solicitante> solicitanteTeste = solicitanteRepository.findById(1l);
        Assertions.assertTrue(solicitanteTeste.get().equals(solicitante));
    }
}

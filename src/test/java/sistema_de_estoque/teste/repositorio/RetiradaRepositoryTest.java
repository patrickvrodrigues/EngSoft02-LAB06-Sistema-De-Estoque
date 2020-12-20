package sistema_de_estoque.teste.repositorio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import sistema_de_estoque.builder.ProdutoBuilder;
import sistema_de_estoque.builder.RetiradaBuilder;
import sistema_de_estoque.builder.SolicitanteBuilder;
import sistema_de_estoque.modelo.Produto;
import sistema_de_estoque.modelo.Retirada;
import sistema_de_estoque.modelo.Solicitante;
import sistema_de_estoque.repositorio.ProdutoRepository;
import sistema_de_estoque.repositorio.RetiradaRepository;
import sistema_de_estoque.repositorio.SolicitanteRepository;

import java.util.List;

@DataJpaTest
public class RetiradaRepositoryTest {
    private Retirada retirada;
    private Solicitante solicitante;
    private Produto produto;
    @Autowired
    private RetiradaRepository retiradaRepository;
    @Autowired
    private SolicitanteRepository solicitanteRepository;
    @Autowired
    private ProdutoRepository produtoRepository;


    @BeforeEach
    public void before() {
        solicitante = SolicitanteBuilder.umSolicitante().constroi();
        solicitante = solicitanteRepository.save(solicitante);
        produto = ProdutoBuilder.umProduto().constroi();
        produto = produtoRepository.save(produto);

        retirada = RetiradaBuilder.umaRetirada().comProduto(produto).comSolicitante(solicitante).constroi();
        retirada = retiradaRepository.save(retirada);

    }

    @AfterEach
    public void after() {
        retiradaRepository.deleteAll();
        produtoRepository.deleteAll();
        solicitanteRepository.deleteAll();

    }

    @Test
    public void deveBuscarRetiradaPeloCliente() {

        List<Retirada> listaRetirada = retiradaRepository.buscaPor(solicitante);
        //Verificação
       Assertions.assertEquals("Patrick Viegas", listaRetirada.get(0).getSolicitante().getNome());
    }


}

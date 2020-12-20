package sistema_de_estoque.teste.repositorio;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import sistema_de_estoque.builder.ProdutoBuilder;
import sistema_de_estoque.modelo.Produto;
import sistema_de_estoque.repositorio.ProdutoRepository;

import java.util.Optional;


@DataJpaTest
public class ProdutoRepositoryTest {
    private Produto produto;
    @Autowired
    private ProdutoRepository produtoRepository;

    @BeforeEach
    public void before() {

        produto = ProdutoBuilder.umProduto().constroi();
        produto = produtoRepository.save(produto);

    }

    @AfterEach
    public void after() {
        produtoRepository.deleteAll();
    }

    @Test
    public void deveBuscarProdutoPeloNome() {

        Optional<Produto> produtoTeste = produtoRepository.buscaPorNome("Sabão em pó");
        //Verificação
        Assertions.assertTrue(produtoTeste.get().equals(produto));
    }

    @Test
    public void deveBuscarProdutoPeloCodigo() {

        Optional<Produto> produtoTeste = produtoRepository.findById(1l);
        //Verificação
        Assertions.assertTrue(produtoTeste.get().equals(produto));
    }
}

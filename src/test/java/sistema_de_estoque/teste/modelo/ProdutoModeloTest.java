package sistema_de_estoque.teste.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sistema_de_estoque.builder.ProdutoBuilder;
import sistema_de_estoque.modelo.Produto;

public class ProdutoModeloTest {
    @Test
    public void deveCriarProdutoComBuilder(){
        Produto produto = ProdutoBuilder.umProduto().constroi();

        Assertions.assertEquals("Sabão em pó", produto.getNome());
        Assertions.assertEquals("Limpeza", produto.getCategoria());
        Assertions.assertEquals(100, produto.getQuantidadeEntrada());
        Assertions.assertEquals(100, produto.getQuantidadeAtual());
    }

    @Test
    public void deveCriarProdutoCostumizadoComBuilder(){
        Produto produto = ProdutoBuilder.umProduto().
                comNome("Pasta de dente").
                comCategoria("Higiene").
                comQuantidadeEntrada(200).comQuantitadeAtual(200)
                .constroi();
        Assertions.assertEquals("Pasta de dente", produto.getNome());
        Assertions.assertEquals("Higiene", produto.getCategoria());
        Assertions.assertEquals(200, produto.getQuantidadeEntrada());
        Assertions.assertEquals(200, produto.getQuantidadeAtual());

    }
}
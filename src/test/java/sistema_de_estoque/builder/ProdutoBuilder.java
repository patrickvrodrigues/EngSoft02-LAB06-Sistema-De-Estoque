package sistema_de_estoque.builder;

import sistema_de_estoque.modelo.Produto;

public class ProdutoBuilder {
    private Produto produto;

    private ProdutoBuilder() {
    }

    public static ProdutoBuilder umProduto() {
        ProdutoBuilder builder = new ProdutoBuilder();

        builder.produto = new Produto();

        builder.produto.setNome("Sabão em pó");
        builder.produto.setCategoria("Limpeza");
        builder.produto.setQuantidadeEntrada(100);
        builder.produto.setQuantidadeAtual(builder.produto.getQuantidadeEntrada());

        return builder;
    }

    public ProdutoBuilder comNome(String nome) {
        this.produto.setNome(nome);
        return this;
    }

    public ProdutoBuilder comCategoria(String categoria){
        this.produto.setCategoria(categoria);
        return this;
    }

    public ProdutoBuilder comQuantidadeEntrada(int quantidade){
        this.produto.setQuantidadeEntrada(quantidade);
        return this;
    }

    public ProdutoBuilder comQuantitadeAtual(int quantidade){
        this.produto.setQuantidadeAtual(quantidade);
        return this;
    }

    public Produto constroi() {
        return this.produto;
    }
}
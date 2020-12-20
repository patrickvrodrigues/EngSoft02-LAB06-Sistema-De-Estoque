package sistema_de_estoque.builder;

import sistema_de_estoque.modelo.Produto;
import sistema_de_estoque.modelo.Retirada;
import sistema_de_estoque.modelo.Solicitante;

import java.time.LocalDate;

public class RetiradaBuilder {
    private Retirada retirada;

    private RetiradaBuilder() {
    }

    public static RetiradaBuilder umaRetirada() {
        RetiradaBuilder builder = new RetiradaBuilder();

        builder.retirada = new Retirada();

        builder.retirada.setSolicitante(SolicitanteBuilder.umSolicitante().constroi());
        builder.retirada.setProduto(ProdutoBuilder.umProduto().constroi());
        builder.retirada.setDataRetirada(LocalDate.now());
        builder.retirada.setQuantidade(5);


        return builder;
    }

    public RetiradaBuilder comSolicitante(Solicitante solicitante) {
        this.retirada.setSolicitante(solicitante);
        return this;
    }
    public RetiradaBuilder comProduto(Produto produto){
        this.retirada.setProduto(produto);
        return this;
    }

    public RetiradaBuilder comDateRetirada(LocalDate dataRetirada){
        this.retirada.setDataRetirada(dataRetirada);
        return this;
    }

    public RetiradaBuilder comQuantidade(int quantidade){
        this.retirada.setQuantidade(quantidade);
        return this;
    }
    public Retirada constroi() {
        return this.retirada;
    }

}
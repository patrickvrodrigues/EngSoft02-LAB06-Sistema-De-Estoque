package sistema_de_estoque.modelo;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Retirada {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idRetirada;

    @OneToMany
    private Solicitante solicitante;
    @OneToMany
    private Produto produto;
    private int quantidade;
    private LocalDate dataRetirada;

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }
}

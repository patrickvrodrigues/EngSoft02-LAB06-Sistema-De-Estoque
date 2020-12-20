package sistema_de_estoque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sistema_de_estoque.modelo.Produto;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    @Query(value = "from Produto p where p.nome = ?1")
    Optional<Produto> buscaPorNome(String nomeProduto);

}

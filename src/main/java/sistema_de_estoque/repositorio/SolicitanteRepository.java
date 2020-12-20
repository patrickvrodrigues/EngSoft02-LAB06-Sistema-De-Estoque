package sistema_de_estoque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sistema_de_estoque.modelo.Solicitante;

import java.util.Optional;

public interface SolicitanteRepository extends JpaRepository<Solicitante,Long> {
    @Query(value = "from Solicitante s where s.nome = ?1")
    Optional<Solicitante> buscaPorNome(String nome);
}

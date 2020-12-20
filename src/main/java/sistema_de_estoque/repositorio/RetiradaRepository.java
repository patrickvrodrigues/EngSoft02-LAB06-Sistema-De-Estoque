package sistema_de_estoque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sistema_de_estoque.modelo.Retirada;
import sistema_de_estoque.modelo.Solicitante;

import java.util.List;

public interface RetiradaRepository extends JpaRepository<Retirada, Long> {
    @Query(value = "From Retirada r where r.solicitante = ?1")
    List<Retirada> buscaPor(Solicitante solicitante);
}

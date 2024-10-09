package fatec.lins.exposicao_agricola.repositories;

import fatec.lins.exposicao_agricola.entities.Julgamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JulgamentoRepository extends JpaRepository<Julgamento, UUID> {
}

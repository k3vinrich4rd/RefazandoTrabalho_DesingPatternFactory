package testandoConhecimentos.pagamentoRecebimentoPatternFactory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.PagamentoModel;
@Repository
public interface PagamentoRepository extends JpaRepository <PagamentoModel, Long>{
}

package testandoConhecimentos.pagamentoRecebimentoPatternFactory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.PagamentoModel;

public interface PagamentoRepository extends JpaRepository <PagamentoModel, Long>{
}

package testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.pagamentos;

import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalculoDePagamentos {
    public BigDecimal calculoDePagamentos(PagamentoModel pagamentoModel);

}

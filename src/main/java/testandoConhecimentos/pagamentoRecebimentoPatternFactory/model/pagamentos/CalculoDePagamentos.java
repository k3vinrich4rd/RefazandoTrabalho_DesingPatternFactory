package testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.pagamentos;

import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalculoDePagamentos { // interface que permite efetuar a lógica
    public BigDecimal calculoDePagamentos(PagamentoModel pagamentoModel);

}

package testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.pagamentos;

import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoEmAtraso implements CalculoDePagamentos { // Implementação da interface
    @Override
    public BigDecimal calculoDePagamentos(PagamentoModel pagamentoModel) {
        return pagamentoModel.getValorDoPagamento().add(new BigDecimal(String.valueOf(pagamentoModel.getDescontoTaxa())));
    }
}

package testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.pagamentos;

import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoEmDia implements CalculoDePagamentos {

    @Override
    public BigDecimal calculoDePagamentos(PagamentoModel pagamentoModel) {
                                                                            //String — conversão de valores
        return pagamentoModel.getValorDoPagamento().subtract(new BigDecimal(String.valueOf(pagamentoModel.getDescontoTaxa())));
    }
}

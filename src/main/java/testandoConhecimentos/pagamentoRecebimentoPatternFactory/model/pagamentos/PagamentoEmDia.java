package testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.pagamentos;

import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoEmDia implements CalculoDePagamentos { // Implementação da interface

    //Polimorfismo
    @Override//Lógica por trás da classe
    public BigDecimal calculoDePagamentos(PagamentoModel pagamentoModel) {
                                                                            //String — conversão de valores
        return pagamentoModel.getValorDoPagamento().subtract(new BigDecimal(String.valueOf(pagamentoModel.getDescontoTaxa())));
    }
}

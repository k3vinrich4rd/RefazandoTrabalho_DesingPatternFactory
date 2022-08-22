package testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.pagamentos;

public class PagamentoFactory {
// Classe Pattern - Factory Method

    // Método com estruturas condicionais:
    public static CalculoDePagamentos tipoDePagamento(String tipoDePagamento) {
        if (tipoDePagamento.equalsIgnoreCase("PAGAMENTO_ATRASADO")) {
            return new PagamentoEmAtraso();
        } else if (tipoDePagamento.equalsIgnoreCase("PAGAMENTO_EM_DIA")) {
            return new PagamentoEmDia();
        } else {
            return null;
        }
    }
}

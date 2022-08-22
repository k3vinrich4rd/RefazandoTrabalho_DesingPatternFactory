package testandoConhecimentos.pagamentoRecebimentoPatternFactory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.PagamentoModel;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.pagamentos.PagamentoFactory;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.repository.PagamentoRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public List<PagamentoModel> exibirPagamentos() {
        return pagamentoRepository.findAll();
    }

    public Optional<PagamentoModel> exibirPagamentoViaId(Long id) {
        return pagamentoRepository.findById(id);
    }

    public PagamentoModel cadastrarPagamentos(PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory) {
        //Conectando u utilizando métodos das classes pagamentoModel e pagamentoFactory
        BigDecimal resultado = PagamentoFactory.tipoDePagamento(pagamentoModel.getStatusDoPagamento()).calculoDePagamentos(pagamentoModel);
        pagamentoModel.setValorPago(resultado); // Valor que será pago sendo definido pelo sistema


        return pagamentoRepository.save(pagamentoModel);
    }

    public PagamentoModel alterarPagamentos(PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory) {
        //Conectando u utilizando métodos das classes pagamentoModel e pagamentoFactory
        BigDecimal resultado = PagamentoFactory.tipoDePagamento(pagamentoModel.getStatusDoPagamento()).calculoDePagamentos(pagamentoModel);
        pagamentoModel.setValorPago(resultado); // Valor que será pago sendo definido pelo sistema

        return pagamentoRepository.save(pagamentoModel);
    }

    public void deletarPagamento(Long id) {
        pagamentoRepository.deleteById(id);
    }

}

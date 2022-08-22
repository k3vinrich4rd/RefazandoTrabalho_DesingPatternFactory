package testandoConhecimentos.pagamentoRecebimentoPatternFactory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.PagamentoModel;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.pagamentos.PagamentoFactory;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.repository.PagamentoRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service // lógica do projeto
public class PagamentoService {

    @Autowired // Injeção dependência
    private PagamentoRepository pagamentoRepository;


    public List<PagamentoModel> exibirPagamentos() {
        return pagamentoRepository.findAll(); //Exibir pagamentos cadastrados
    }

    public Optional<PagamentoModel> exibirPagamentoViaId(Long id) {
        return pagamentoRepository.findById(id); // Exibir pagamentos cadastrados via id
    }

    //Cadastrar pagamentos
    public PagamentoModel cadastrarPagamentos(PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory) {
        //Conectando u utilizando métodos das classes pagamentoModel e pagamentoFactory
        BigDecimal resultado = PagamentoFactory.tipoDePagamento(pagamentoModel.getStatusDoPagamento()).calculoDePagamentos(pagamentoModel);
        pagamentoModel.setValorPago(resultado); // Valor que será pago sendo definido pelo sistema


        return pagamentoRepository.save(pagamentoModel);
    }


    //Alterar pagamentos
    public PagamentoModel alterarPagamentos(PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory) {
        //Conectando u utilizando métodos das classes pagamentoModel e pagamentoFactory
        BigDecimal resultado = PagamentoFactory.tipoDePagamento(pagamentoModel.getStatusDoPagamento()).calculoDePagamentos(pagamentoModel);
        pagamentoModel.setValorPago(resultado); // Valor que será pago sendo definido pelo sistema

        return pagamentoRepository.save(pagamentoModel);
    }

    //Deletar pagamentos
    public void deletarPagamento(Long id) {
        pagamentoRepository.deleteById(id);
    }

}

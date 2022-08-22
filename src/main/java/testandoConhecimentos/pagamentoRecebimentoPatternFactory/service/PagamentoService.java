package testandoConhecimentos.pagamentoRecebimentoPatternFactory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.PagamentoModel;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.repository.PagamentoRepository;

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

}

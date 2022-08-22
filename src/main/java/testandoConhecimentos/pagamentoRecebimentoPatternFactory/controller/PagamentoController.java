package testandoConhecimentos.pagamentoRecebimentoPatternFactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.PagamentoModel;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.model.pagamentos.PagamentoFactory;
import testandoConhecimentos.pagamentoRecebimentoPatternFactory.service.PagamentoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping
    public PagamentoModel cadastrarNovosPagamentos(@RequestBody PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory) {
        return pagamentoService.cadastrarPagamentos(pagamentoModel, pagamentoFactory);
    }

    @GetMapping
    public List<PagamentoModel> exibirPagamentosCadastrados() {
        return pagamentoService.exibirPagamentos();
    }

    @GetMapping(path = "/{id}")
    public Optional<PagamentoModel> exibirPagamentosViaId(@PathVariable Long id) {
        return pagamentoService.exibirPagamentoViaId(id);
    }

    @PutMapping(path = "/{id}")
    public PagamentoModel alterarPagamentosCadastrados(@RequestBody PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory) {
        return pagamentoService.alterarPagamentos(pagamentoModel, pagamentoFactory);
    }

    @DeleteMapping(path = "/{id}")
    public void deletarPagamentosCadastrados(@PathVariable Long id) {
        pagamentoService.deletarPagamento(id);
    }


}

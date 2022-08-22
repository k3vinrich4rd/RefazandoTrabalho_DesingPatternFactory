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

    @Autowired // Injeção de dependência
    private PagamentoService pagamentoService;

    @PostMapping // Para cadastrar
    public PagamentoModel cadastrarNovosPagamentos(@RequestBody PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory) {
        return pagamentoService.cadastrarPagamentos(pagamentoModel, pagamentoFactory);
    }

    @GetMapping // Para exibir os pagamentos
    public List<PagamentoModel> exibirPagamentosCadastrados() {
        return pagamentoService.exibirPagamentos();
    }

    @GetMapping(path = "/{id}") // Para exibir os pagamentos via id
    public Optional<PagamentoModel> exibirPagamentosViaId(@PathVariable Long id) {
        return pagamentoService.exibirPagamentoViaId(id);
    }

    @PutMapping(path = "/{id}") //Para alterar pagamentos cadastrados
    public PagamentoModel alterarPagamentosCadastrados(@RequestBody PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory) {
        return pagamentoService.alterarPagamentos(pagamentoModel, pagamentoFactory);
    }

    @DeleteMapping(path = "/{id}") // Para deletar pagamentos cadastrados
    public void deletarPagamentosCadastrados(@PathVariable Long id) {
        pagamentoService.deletarPagamento(id);
    }


}

package testandoConhecimentos.pagamentoRecebimentoPatternFactory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data // Getter e Setter
@Entity // Entidade — identifica ser uma tabela
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "registro_de_pagamento") // Tabela que será criada
public class PagamentoModel {

    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração sequencial
    private Long idDoPagamento; // atributo

    @Column(name = "status_pagamento", length = 100, nullable = false)
    private String statusDoPagamento; // atributo

    @Column(name = "valor_do_pagamento", length = 100, nullable = false)
    private BigDecimal valorDoPagamento; // atributo

    @Column(name = "valor_taxa_desconto", length = 100, nullable = false)
    private BigDecimal descontoTaxa; // atributo

    @Column(name = "valor_pago", length = 100)
    private BigDecimal valorPago; // atributo


}

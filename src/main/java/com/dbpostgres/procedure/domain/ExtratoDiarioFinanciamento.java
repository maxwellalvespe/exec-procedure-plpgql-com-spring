package com.dbpostgres.procedure.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@NamedNativeQuery(
        name = "detalharFinanciamento",
        query = "select  * from extrato_do_financiamento()",
        resultClass = ExtratoDiarioFinanciamento.class
)
public class ExtratoDiarioFinanciamento implements Serializable {
    @Id
    @Column(name = "valor_esperado")
    private BigDecimal valorEsperado;
    @Column(name = "valor_atual")
    private BigDecimal valorAtual;
    @Column(name = "valor_amortizado")
    private BigDecimal valorAmortizado;

}

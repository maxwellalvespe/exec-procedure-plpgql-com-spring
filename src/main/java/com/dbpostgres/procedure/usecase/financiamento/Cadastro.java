package com.dbpostgres.procedure.usecase.financiamento;

import com.dbpostgres.procedure.domain.Parcela;

public interface Cadastro {

    boolean cadastrar(Parcela financiamento);
}

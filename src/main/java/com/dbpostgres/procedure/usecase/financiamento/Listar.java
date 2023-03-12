package com.dbpostgres.procedure.usecase.financiamento;

import com.dbpostgres.procedure.domain.Parcela;

import java.util.List;

public interface Listar {

    List<Parcela> listar();
}

package com.dbpostgres.procedure.usecase.financiamento.listar;

import com.dbpostgres.procedure.domain.Parcela;
import com.dbpostgres.procedure.repository.Financiamento;
import com.dbpostgres.procedure.usecase.financiamento.Listar;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ListarParcelasUseCase implements Listar {


    private final Financiamento financiamento;


    @Override
    public List<Parcela> listar() {
        var parcelas =  financiamento.findAll();
        log.info("parcelas obtidas : {}",parcelas);
        return  parcelas;
    }
}

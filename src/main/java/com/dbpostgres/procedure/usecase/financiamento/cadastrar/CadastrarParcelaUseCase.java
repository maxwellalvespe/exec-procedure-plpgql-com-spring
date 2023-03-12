package com.dbpostgres.procedure.usecase.financiamento.cadastrar;

import com.dbpostgres.procedure.domain.Parcela;
import com.dbpostgres.procedure.repository.Financiamento;
import com.dbpostgres.procedure.usecase.financiamento.Cadastro;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Data
@RequiredArgsConstructor
@Service
@Slf4j
public class CadastrarParcelaUseCase implements Cadastro {


    private final Financiamento repositorio;


    @Override
    public boolean cadastrar(Parcela financiamento) {

       var responseDb =  repositorio.save(financiamento);
        return Objects.nonNull(responseDb);
    }
}

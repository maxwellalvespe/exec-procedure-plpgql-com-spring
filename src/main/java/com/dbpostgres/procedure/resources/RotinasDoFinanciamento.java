package com.dbpostgres.procedure.resources;

import com.dbpostgres.procedure.domain.Parcela;
import com.dbpostgres.procedure.usecase.financiamento.Cadastro;
import com.dbpostgres.procedure.usecase.financiamento.Listar;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("financiamentos")
@RestController
@Slf4j
@RequiredArgsConstructor
public class RotinasDoFinanciamento {

    private final Cadastro financiamento;

    private final Listar useCaseListarParcelas;

    @PostMapping
    public ResponseEntity<Boolean> cadastrar(@RequestBody Parcela parcela) {
        log.info("registro obtido :  {}", parcela);
        var response = financiamento.cadastrar(parcela);
        log.info("Cadastro realizado com suceso : id do registro -> {}" + response);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Parcela>> listar() {
        return new ResponseEntity(useCaseListarParcelas.listar(), HttpStatus.OK);
    }
}

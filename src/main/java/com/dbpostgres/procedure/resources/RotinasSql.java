package com.dbpostgres.procedure.resources;

import com.dbpostgres.procedure.repository.StoredProcedureFunctionPLPGSQLRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rotinasdb")
@Slf4j
@RequiredArgsConstructor
public class RotinasSql {

    private final StoredProcedureFunctionPLPGSQLRepository financiamento;
    @GetMapping
    public  ResponseEntity<?> exec(){
        var result =financiamento.total();
        System.out.println(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

//https://docs.oracle.com/middleware/1212/toplink/TLJPA/a_namedstoredprocedurequery.htm#TLJPA468
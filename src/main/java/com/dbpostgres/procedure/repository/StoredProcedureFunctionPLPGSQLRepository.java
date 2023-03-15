package com.dbpostgres.procedure.repository;

import com.dbpostgres.procedure.domain.ExtratoDiarioFinanciamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StoredProcedureFunctionPLPGSQLRepository extends JpaRepository<ExtratoDiarioFinanciamento, Number> {
    @Query(name = "detalharFinanciamento")
    ExtratoDiarioFinanciamento total();

}

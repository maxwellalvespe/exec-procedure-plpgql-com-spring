package com.dbpostgres.procedure.repository;

import com.dbpostgres.procedure.domain.Parcela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Financiamento extends JpaRepository<Parcela,String> {
}

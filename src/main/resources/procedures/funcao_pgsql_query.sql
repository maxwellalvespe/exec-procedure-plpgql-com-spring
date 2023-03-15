
create function detalhar_financiamento()
returns table(
                id integer,
               esperado FLOAT,
              atual FLOAT,
              AMORTIZADO FLOAT)              AS 
$$
BEGIN

RETURN QUERY

  SELECT
  		 (select 1 as id),
  		 sum(valor_parcela) esperado ,
 		 sum(valor_parcela_diaria) atual,
 		 (sum(valor_parcela)-sum(valor_parcela_diaria)) amortizado from parcela ;





return;


END;

$$LANGUAGE plpgsql;

drop function detalhar_financiamento; 


select  detalhar_financiamento();
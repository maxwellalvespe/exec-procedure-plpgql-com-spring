create or replace  FUNCTION consultar_saldo_devedor()
RETURNS float
LANGUAGE plpgsql AS
$$
declare
dados float;
begin

	select into dados sum(valor_parcela) from parcela p ;
	return dados;
    END;
$$

-- chamada da função
select consultar_saldo_devedor();
-- remoção da função
drop function consultar_saldo_devedor;
-- validação do valor retornado.
select sum(valor_parcela) from parcela
package br.com.springboot.api_tabela_unificada_sigtap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.springboot.api_tabela_unificada_sigtap.model.Procedimento;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, Long>{

	@Query(value= "select u from Procedimento u where upper(trim(u.nomeProcedimento)) like %?1%")
	List<Procedimento> buscarPorNome(String name);
}

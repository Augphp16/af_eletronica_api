package br.com.api.af_eletronica_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.af_eletronica_api.models.Diagnostico;

@Repository
public interface DiagnosticoRepository extends CrudRepository<Diagnostico, Long> {

}

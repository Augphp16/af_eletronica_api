package br.com.api.af_eletronica_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.af_eletronica_api.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}

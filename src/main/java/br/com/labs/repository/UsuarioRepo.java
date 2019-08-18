package br.com.labs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.labs.model.Usuario;

@Repository
public interface UsuarioRepo extends CrudRepository<Usuario, String> {

    
}

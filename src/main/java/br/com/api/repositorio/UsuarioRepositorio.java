package br.com.api.repositorio;

import br.com.api.dominio.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UsuarioRepositorio extends MongoRepository<Usuario, String> {

    Usuario findByFirstName(String firstname);
    List<Usuario> findByLastName(String lastname);
    Usuario findByUsername(String username);
}

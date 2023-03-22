package org.brayan.springcloud.msvc.usuarios.repositories;

import org.brayan.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);
    @Query("SELECT u FROM Usuario u WHERE u.email = ?1")
    Optional<Usuario> porEmail(String email);

    boolean existsByEmail(String email);
}

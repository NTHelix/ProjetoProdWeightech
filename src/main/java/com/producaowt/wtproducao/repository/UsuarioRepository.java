package com.producaowt.wtproducao.repository;

import com.producaowt.wtproducao.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<UsuarioEntity, Long> {
}

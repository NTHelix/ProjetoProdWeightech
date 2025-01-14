package com.producaowt.wtproducao.DTO;

import com.producaowt.wtproducao.entity.UsuarioEntity;
import org.springframework.beans.BeanUtils;

public class UsuarioDTO {

    private Long id;
    private String login;
    private String senha;

    public UsuarioDTO(UsuarioEntity usuario) {
        BeanUtils.copyProperties(usuario, this);
    }

    public UsuarioDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

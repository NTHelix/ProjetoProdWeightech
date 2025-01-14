package com.producaowt.wtproducao.controller;

import com.producaowt.wtproducao.DTO.UsuarioDTO;
import com.producaowt.wtproducao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDTO> listarTodos(){
        return usuarioService.ListarTodos();
    }
    @PostMapping
    public void inserir(@RequestBody UsuarioDTO usuario) {
        usuarioService.inserir(usuario);
    }
    @PutMapping
    public UsuarioDTO alterar(@RequestBody UsuarioDTO usuario) {
        return usuarioService.alterar(usuario);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir (@PathVariable("id") Long id){
        usuarioService.excluir(id);
        return ResponseEntity.ok().build();
    }
}

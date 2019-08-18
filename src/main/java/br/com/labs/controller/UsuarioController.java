package br.com.labs.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.labs.model.Usuario;
import br.com.labs.service.UsuarioService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public Usuario save(){
        Usuario usuario = new Usuario();
        usuario.setUsuarioId("11111");
        usuario.setNome("danilo");
        usuario.setPassword("123");
        usuario.setUsername("danilo");
        usuario.setSobrenome("queiroz");
        usuario.setDocumento("222.222.222-22");
        usuario.setEmail("danilo@gmail");
        usuario.setAtivo(1);
        return usuarioService.save(usuario);
    }

}

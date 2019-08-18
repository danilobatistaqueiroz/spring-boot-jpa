package br.com.labs.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.labs.model.Usuario;
import br.com.labs.repository.UsuarioRepo;


@Service(value = "usuarioService")
public class UsuarioService
{

	@Autowired
	private UsuarioRepo usuarioRepo;	
	
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;


    public Usuario save(Usuario usuario) {
	    usuario.setPassword(bcryptEncoder.encode(usuario.getPassword()));
        return usuarioRepo.save(usuario);
    }

}

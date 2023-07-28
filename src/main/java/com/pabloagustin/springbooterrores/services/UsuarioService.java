package com.pabloagustin.springbooterrores.services;

import com.pabloagustin.springbooterrores.models.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

	public List<Usuario> listar();
	public Usuario obtenerPorId(Integer id);
	public Optional<Usuario> obtenerPorIdOptional(Integer id);
}

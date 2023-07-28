package com.pabloagustin.springbooterrores.errors;

public class UsuarioNoEncontradoException extends RuntimeException {

	public UsuarioNoEncontradoException(String id) {
		super("Usuario con ID: ".concat(id).concat(" no existe en el sistema"));
	}

	private static final long serialVersionUID = 9876543210L;

}

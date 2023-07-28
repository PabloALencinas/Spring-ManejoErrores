package com.pabloagustin.springbooterrores.services;

import com.pabloagustin.springbooterrores.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImplement  implements UsuarioService{

	private List<Usuario> lista;
	// De momento guardamos los usuarios en un arreglo, no con base de datos
	public UsuarioServiceImplement(List<Usuario> lista) {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Pablo", "Lencinas"));
		this.lista.add(new Usuario(2, "Juan", "Lopez"));
		this.lista.add(new Usuario(3, "Pedro", "Lopez"));
		this.lista.add(new Usuario(4, "Raul", "Lopez"));
		this.lista.add(new Usuario(5, "Romina", "Lopez"));
		this.lista.add(new Usuario(6, "Juana", "Lopez"));
		this.lista.add(new Usuario(7, "Ana", "Lopez"));

	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for(Usuario usuario: this.lista){
			if(usuario.getId().equals(id)){
				resultado = usuario;
				break;
			}
		}
		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = this.obtenerPorId(id);
		return Optional.ofNullable(usuario);
	}
}

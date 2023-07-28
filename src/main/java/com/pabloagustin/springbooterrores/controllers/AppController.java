package com.pabloagustin.springbooterrores.controllers;

import com.pabloagustin.springbooterrores.errors.UsuarioNoEncontradoException;
import com.pabloagustin.springbooterrores.models.Usuario;
import com.pabloagustin.springbooterrores.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AppController {

	// Inyectamos el usuarioService
	@Autowired
	private UsuarioService usuarioService;

	// Metodo Handler
	@GetMapping("/index")
	public String index(){
		//Integer valor = 100/0;
		Integer valor = Integer.parseInt("10x");
		return "index";
	}

	// Metodo handler ver
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id, Model model){
		//Usuario usuario = usuarioService.obtenerPorId(id);

		// Preguntamos por si el id == null
		//		if(usuario == null){
		//			throw new UsuarioNoEncontradoException(id.toString());
		//		}

		Usuario usuario = usuarioService.obtenerPorIdOptional(id).orElseThrow(() -> new UsuarioNoEncontradoException(id.toString()));

		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Detalle usuario: ".concat(usuario.getNombre()));
		return "ver";
	}
}

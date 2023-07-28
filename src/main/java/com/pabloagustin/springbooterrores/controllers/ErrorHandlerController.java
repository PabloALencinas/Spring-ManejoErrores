package com.pabloagustin.springbooterrores.controllers;

import com.pabloagustin.springbooterrores.errors.UsuarioNoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ErrorHandlerController {

	// SE MAPEA A UNA EXCEPCION, no a una url con GET POST ETC.
	@ExceptionHandler(ArithmeticException.class)
	public String aritmeticaError(ArithmeticException ex, Model model){
		model.addAttribute("error", "Error de Aritmetica");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/aritmetica";
	}

	// Otro metodo para manejar el NumberFormatException
	@ExceptionHandler(NumberFormatException.class)
	public String errorFormato(NumberFormatException ex, Model model){
		model.addAttribute("error", "ERROR: Formato numero incorrecto");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/formatoerror";
	}

	// Para usuario inexistente
	@ExceptionHandler(UsuarioNoEncontradoException.class)
	public String usuarioNoEncontrado(UsuarioNoEncontradoException ex, Model model){
		model.addAttribute("error", "ERROR: Usuario no encontrado!");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		// Aqui podriamos tener una vista unica para el manejo de este error
		// return "error/usuario";  -> y creamos la vista para usuario
		return "error/404";
	}


}

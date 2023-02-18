package com.ander.aldeamo.controller;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ander.aldeamo.excepciones.ApiException;
import com.ander.aldeamo.modelo.Array;
import com.ander.aldeamo.service.IArrayService;




@RestController
@RequestMapping("resolver")
public class ArrayController {

	@Autowired
	private IArrayService service;
	
	@GetMapping("/datos")
	public ResponseEntity<Object> traerTodos(@RequestParam int idprestamo,@RequestParam int iteraciones) {
		if(idprestamo>5|idprestamo<=0) {
			throw new ApiException("Id prestamo acepta valores en los rangos 1 a 5",400);
		}
		Array resultado=service.resolver(idprestamo,iteraciones);
		if(resultado!=null) {
			JSONObject jo = new JSONObject();
			jo.put("mensaje", resultado.getInput_array());
			return ResponseEntity.ok(jo.toString());
		}
		return ResponseEntity.notFound().build();
	}
	

	

	
}

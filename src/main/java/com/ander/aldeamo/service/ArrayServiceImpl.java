package com.ander.aldeamo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ander.aldeamo.modelo.Array;
import com.ander.aldeamo.repositorio.IArrayRepo;

@Service
public class ArrayServiceImpl implements IArrayService {

	@Autowired
	public IArrayRepo repo;
	
	private int[] primos= {2,3,5,7,9,11,13,17,21,27,31};
	private int cantidad=0;
	
	@Override
	public Array resolver(int idprestamo,int iteraciones) {
		Array valores_bd= repo.findById(idprestamo);
		System.out.println("1............"+valores_bd.getInput_array());

		String respuesta="";
		String[] numerosAEvaluar=valores_bd.getInput_array().split(",");
		cantidad=numerosAEvaluar.length;
		
		int i=0;
		//recorrer valores
		while(i<iteraciones&&cantidad>0) {
			for(int j=cantidad-1;j>=0;j--) {
				if(Integer.parseInt(numerosAEvaluar[j])%primos[i]==0) {
					respuesta=respuesta+numerosAEvaluar[j]+",";
					quitarElemento(numerosAEvaluar,j);
				}
			}
			i++;
		}
		//quitar coma
		if(respuesta.length()>0) {
			respuesta=respuesta.substring(0,respuesta.length()-1);
		}
		Array retornar= new Array(0,respuesta);
		System.out.println("1............"+retornar.getInput_array());
		return retornar;
	}
	
	public void quitarElemento(String [] valores, int index) {
		for(int i=index;i<cantidad-1;i++) {
			valores[i]=valores[i+1];
		}
		cantidad--;
	}

	
}

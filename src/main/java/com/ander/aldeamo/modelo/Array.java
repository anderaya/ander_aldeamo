package com.ander.aldeamo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.Nullable;

@Entity
@Table(name = "arrays")
public class Array {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", nullable = false,length = 11)
	private int id;
	
	@Column(name = "input_array", nullable = false,length = 20)
	private String input_array;
	@Column(name = "num_iteraciones", nullable = true)
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInput_array() {
		return input_array;
	}
	public void setInput_array(String input_array) {
		this.input_array = input_array;
	}

	public Array(String input_array) {
		super();
		this.input_array = input_array;
	}
	public Array(int id, String input_array) {
		super();
		this.id = id;
		this.input_array = input_array;
	}
	public Array() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

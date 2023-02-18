package com.ander.aldeamo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ander.aldeamo.modelo.Array;

@Repository
public interface IArrayRepo extends JpaRepository<Array,Integer>{
	public Array findById(int id);
}

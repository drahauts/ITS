package com.spring.university.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.university.entity.Studente;

@Repository
public class StudentiDAOMappaImpl implements DAOStudenti {
	private Map<Integer, Studente> mappa = new HashMap<>();

	public boolean insert(Studente studente) {
	if(mappa.containsKey(studente.getMatricola()))
		return false;
	
	mappa.put(studente.getMatricola(), studente);
	return true;
	}

	public List<Studente> selectAll(){
		return new ArrayList<>(mappa.values());
	}

	public Studente selectByMatricola(Integer idStudente) {
		return mappa.get(idStudente);
	}
			
	public boolean delete(Integer idStudente) {
		Studente studente = mappa.remove(idStudente);
		return studente != null;
	}
	
//	public boolean changeAdress(Integer idStudente, String indirizzo) {
//		Studente studente = selectByMatricola(idStudente);
//		if (studente == null) {
//			return false;
//		}
//		studente.setIndirizzo(indirizzo);
//		return true;
//	}
}
package it.manytomanyjpamaven.dao;

import java.util.List;

import it.manytomanyjpamaven.model.Ruolo;

public interface RuoloDAO extends IBaseDAO<Ruolo> {
	
	public Ruolo findByDescrizioneAndCodice(String descrizione, String codice) throws Exception;
	
	public List<String> findListDescrizioni() throws Exception;

}

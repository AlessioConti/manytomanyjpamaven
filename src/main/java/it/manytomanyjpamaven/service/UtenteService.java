package it.manytomanyjpamaven.service;

import java.util.List;

import it.manytomanyjpamaven.dao.RuoloDAO;
import it.manytomanyjpamaven.dao.UtenteDAO;
import it.manytomanyjpamaven.model.Ruolo;
import it.manytomanyjpamaven.model.Utente;

public interface UtenteService {

	public List<Utente> listAll() throws Exception;

	public Utente caricaSingoloElemento(Long id) throws Exception;

	public void aggiorna(Utente utenteInstance) throws Exception;

	public void inserisciNuovo(Utente utenteInstance) throws Exception;

	public void rimuovi(Long idUtente) throws Exception;

	public void aggiungiRuolo(Utente utenteEsistente, Ruolo ruoloInstance) throws Exception;

	public void rimuoviRuoloDaUtente(Long idUtente, Long idRuolo) throws Exception;

	public Utente caricaUtenteSingoloConRuoli(Long id) throws Exception;

	// per injection
	public void setUtenteDAO(UtenteDAO utenteDAO);

	public void setRuoloDAO(RuoloDAO ruoloDAO);

	public List<Utente> cercaTuttiNatiAGiugno() throws Exception;

	public int contaQuantiAdmin() throws Exception;

	public List<Utente> cercaUtentiConPasswordPiccola() throws Exception;

	public boolean controllaSeAdminDisabilitato() throws Exception;
}

package ma.tecmind.TP1boot.service;

import java.util.List;

import ma.tecmind.TP1boot.bean.Commande;

public interface CommandeServiceInterface {
	
	public Commande findByRef(String ref);
	
	public int save(Commande commande);
	
	public int update(Commande commande);
	
	public List<Commande> findAll();

}

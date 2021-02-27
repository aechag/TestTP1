package ma.tecmind.TP1boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.tecmind.TP1boot.bean.Commande;
import ma.tecmind.TP1boot.dao.CommandeDao;

@Service
public class CommandeService implements CommandeServiceInterface{

	@Autowired
	private CommandeDao commandeDao;
	
	public Commande findByRef(String ref) {
		return this.commandeDao.findByRef(ref);
	}

	
	public int save(Commande commande) {
		if(findByRef(commande.getRef())!=null) {
			return -1;
		}else if(commande.getTotalPye()>commande.getTotal()) {
			return -2;
		}else {
			this.commandeDao.save(commande);
			return 1;
		}
	}

	public int update(Commande commande) {
		this.commandeDao.save(commande);
		return 1;
	}

	
	public List<Commande> findAll() {
		return this.commandeDao.findAll();
	}
	
	

}

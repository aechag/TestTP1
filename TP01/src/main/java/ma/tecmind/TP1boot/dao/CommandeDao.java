package ma.tecmind.TP1boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.tecmind.TP1boot.bean.Commande;

@Repository
public interface CommandeDao extends JpaRepository<Commande, Long>{

	public Commande findByRef(String ref);


}

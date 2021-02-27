package ma.tecmind.TP1boot.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String ref;
	private double total = 0D;
	private double totalPye = 0D;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getTotalPye() {
		return totalPye;
	}
	public void setTotalPye(double totalPye) {
		this.totalPye = totalPye;
	}
	
	public String toString() {
		return "Commande [id=" + id + ", ref=" + ref + ", total=" + total + ", totalPye=" + totalPye + "]";
	}
	
	
}

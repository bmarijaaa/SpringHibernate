package heroj;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
public class SuperHeroj {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHeroj;
	@Value("${ime.heroja}")
	private String ime;
	@Value("${magija.heroja}")
	private String magija;
	
	
	public int getIdHeroj() {
		return idHeroj;
	}
	public void setIdHeroj(int idHeroj) {
		this.idHeroj = idHeroj;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getMagija() {
		return magija;
	}
	public void setMagija(String magija) {
		this.magija = magija;
	}
	
	

}

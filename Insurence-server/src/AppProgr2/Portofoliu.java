package AppProgr2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Portofoliu {
	@Id
	
	private Integer idPortofoliu;
	private String denumire;
	
	
	public void adaugaPortofoliu(Portofoliu portofoliu){
		this.portofoliu.add(portofoliu);
	}

	public Integer getIdPortofoliu() {
		return idPortofoliu;
	}

	public void setIdPortofoliu(Integer idPortofoliu) {
		this.idPortofoliu = idPortofoliu;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public List<Portofoliu> getPortofoliu() {
		return portofoliu;
	}

	public void setPortofoliu(List<Portofoliu> portofoliu) {
		this.portofoliu = portofoliu;
	}

	
	public Portofoliu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Portofoliu(Integer idPortofoliu, String denumire,
			List<Portofoliu> portofoliu) {
		super();
		this.idPortofoliu = idPortofoliu;
		this.denumire = denumire;
		this.portofoliu= portofoliu;
	}
	
	
	
}

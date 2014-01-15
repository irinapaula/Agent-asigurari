package AppProgr2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autovehicul {

	@Id
	private String nrMasina;
	private String marca;
	private String model;
	private String serieSasiu;
	private Integer capacitate;
	private Integer nrLocuri;
	private Integer masa;
	
	
	public String getNrMasina() {
		return nrMasina;
	}
	public void setNrMasina(String nrMasina) {
		this.nrMasina = nrMasina;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerieSasiu() {
		return serieSasiu;
	}
	public void setSerieSasiu(String serieSasiu) {
		this.serieSasiu = serieSasiu;
	}
	
	public Integer getCapacitate() {
		return capacitate;
	}
	public void setCapacitate(Integer capacitate) {
		this.capacitate = capacitate;
	}
	public Integer getNrLocuri() {
		return nrLocuri;
	}
	public void setNrLocuri(Integer nrLocuri) {
		this.nrLocuri = nrLocuri;
	}
	public Integer getMasa() {
		return masa;
	}
	public void setMasa(Integer masa) {
		this.masa = masa;
	}
	public Autovehicul() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Autovehicul(String nrMasina, String marca, String model,
			String serieSasiu, Integer capacitate,
			Integer nrLocuri, Integer masa) {
		super();
		this.nrMasina = nrMasina;
		this.marca = marca;
		this.model = model;
		this.serieSasiu = serieSasiu;
		this.capacitate = capacitate;
		this.nrLocuri = nrLocuri;
		this.masa = masa;
	}

}

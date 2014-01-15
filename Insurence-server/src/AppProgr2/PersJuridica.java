package AppProgr2;

import javax.persistence.Entity;

@Entity
public class PersJuridica extends ClientiAsig {
	
	private CodTip permis;
	private String denSocietate;
	private String cui;
	private TipSocietate tipSoc;
	public String getDenSocietate() {
		return denSocietate;
	}
	public void setDenSocietate(String denSocietate) {
		this.denSocietate = denSocietate;
	}
	public String getCui() {
		return cui;
	}
	public void setCui(String cui) {
		this.cui = cui;
	}

	public PersJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersJuridica(Integer idClient, String nume, String adresa,
			String tipClient, String tel, String denSocietate, String cui,
			TipSocietate tipSoc) {
		super();
		this.denSocietate = denSocietate;
		this.cui = cui;
		this.tipSoc = tipSoc;
	}

}

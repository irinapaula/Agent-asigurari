package AppProgr2;

import javax.persistence.Entity;

@Entity
public class PersFizica extends ClientiAsig {
	@Override
	public String toString() {
		return "Clientul" + numePrenume + " are CNP" + cnp
				+ " si adresa=" + adresa + " si face parte din categoria " + reduceri ;
	}

	private String numePrenume;
	private String cnp;
	private CodTip permis;

	private String dataObtinerePermis;
	private String adresa;
	private ReducereMotiv reduceri;
	private Double discount;
	
	public PersFizica(String numePrenume, String cnp, CodTip permis,
			String dataObtinerePermis, String adresa, ReducereMotiv reduceri,
			Double discount) {
		super();
		this.numePrenume = numePrenume;
		this.cnp = cnp;
		this.permis = permis;
		this.dataObtinerePermis = dataObtinerePermis;
		this.adresa = adresa;
		this.reduceri = reduceri;
		this.discount = discount;
	}
	public CodTip getPermis() {
		return permis;
	}
	public void setPermis(CodTip permis) {
		this.permis = permis;
	}
	public ReducereMotiv getReduceri() {
		return reduceri;
	}
	public void setReduceri(ReducereMotiv reduceri) {
		this.reduceri = reduceri;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public PersFizica(Integer idClient) {
		super(idClient);
		// TODO Auto-generated constructor stub
	}
	public String getNumePrenume() {
		return numePrenume;
	}
	public void setNumePrenume(String numePrenume) {
		this.numePrenume = numePrenume;
	}
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	public String getDataObtinerePermis() {
		return dataObtinerePermis;
	}
	public void setDataObtinerePermis(String dataObtinerePermis) {
		this.dataObtinerePermis = dataObtinerePermis;
	}
	
	
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	//metoda cu ajutorul careia pot citi val din enum???
	public PersFizica() {
		ReducereMotiv.values();
		super();
		// TODO Auto-generated constructor stub
	}
	//parcurg lista cu enum si atunci cand o pers are o caracteristica ce se regaseste in enum-ReducereMotiv, i se afiseaza discountul corespunzator
	public Double afiseazaDiscount(){
	for(int i=0;i<ClientiAsig.Lenght;i++)	{
	if(PersFizica.reduceri=="ClientFidel"||"Veteran")
		discount=PolitaAsigurare.prima*0.10;
	if(PersFizica.reduceri=="ElevStudent"||"Pensionar"||"Bursier"||"AlteMotive")
		discount=PolitaAsigurare.prima*0.05;
	if(PersFizica.reduceri=="Bugetar"||"Somer")
		discount=PolitaAsigurare.prima*0.15;		
	}
	}
}
	
		


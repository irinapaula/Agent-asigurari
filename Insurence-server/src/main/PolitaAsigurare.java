package AppProgr2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class PolitaAsigurare {
	private static final String DATE = null;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idPolita;
	private ClientiAsig client;
	private Integer numarPolita;
	private String  serie;
	private AgentAsig agent;

	private String dataStart;

	private String dataStop;
	
	private String dataEmitere;
	private String modDePlata;
	private Integer prima;
	@OneToOne
	private Autovehicul masina;
	private Integer despagubire;
	
	public void adaugaAsigurare(PolitaAsigurare asigurare){
		this.asigurare.add(asigurare);
	}

	
	public Integer getIdPolita() {
		return idPolita;
	}
	public void setIdPolita(Integer idPolita) {
		this.idPolita = idPolita;
	}
	public ClientiAsig getIdClient() {
		return client;
	}
	public void setIdClient(Integer idClient) {
		this.client = client;
	}
	public Integer getNumarPolita() {
		return numarPolita;
	}
	public void setNumarPolita(Integer numarPolita) {
		this.numarPolita = numarPolita;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public String getDataStart() {
		return dataStart;
	}
	public void setDataStart(String dataStart) {
		this.dataStart = dataStart;
	}
	public String getDataStop() {
		return dataStop;
	}
	public void setDataStop(String dataStop) {
		this.dataStop = dataStop;
	}
	public String getDataEmitere() {
		return dataEmitere;
	}
	public void setDataEmitere(String dataEmitere) {
		this.dataEmitere = dataEmitere;
	}
	public String getModDePlata() {
		return modDePlata;
	}
	public void setModDePlata(String modDePlata) {
		this.modDePlata = modDePlata;
	}
	public Integer getPrima() {
		return prima;
	}
	public void setPrima(Integer prima) {
		this.prima = prima;
	}
	public Autovehicul getmasina() {
		return masina;
	}
	public void setNrMasina(String nrMasina) {
		this.masina = masina;
	}
	public Integer getDespagubire() {
		return despagubire;
	}
	public void setDespagubire(Integer despagubire) {
		this.despagubire = despagubire;
	}
	public PolitaAsigurare() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolitaAsigurare(Integer idPolita, Integer idClient,
			Integer numarPolita, String serie, Integer idAgent,
			String dataStart, String dataStop, String dataEmitere,
			String modDePlata, Integer prima, Autovehicul masina,
			Integer despagubire) {
		super();
		this.idPolita = idPolita;
		this.client = client;
		this.numarPolita = numarPolita;
		this.serie = serie;
		this.agent =agent;
		this.dataStart = dataStart;
		this.dataStop = dataStop;
		this.dataEmitere = dataEmitere;
		this.modDePlata = modDePlata;
		this.prima = prima;
		this.masina = masina;
		this.despagubire = despagubire;
	}
	@Override
	public String toString() {
		return "PolitaAsigurare nr" + numarPolita +", serie=" + serie + "facuta de agentul" + agent + ", dataStart=" + dataStart
				+ ", dataStop=" + dataStop + ", dataEmitere=" + dataEmitere
				+ ", modDePlata=" + modDePlata + ", prima=" + prima
				+ ", masina=" + masina + ", despagubire=" + despagubire + "]";
	}
	
	
	
	
	
	
}

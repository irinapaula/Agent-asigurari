package AppProgr2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AgentAsig  {
	@Id
	private Integer idAgent;
	private String nume;
	
	public Integer getIdAgent() {
		return idAgent;
	}
	public void setIdAgent(Integer idAgent) {
		this.idAgent = idAgent;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public AgentAsig() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AgentAsig(Integer idAgent, String nume) {
		super();
		this.idAgent = idAgent;
		this.nume = nume;
	}

}

package AppProgr2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ClientiAsig  {
	@Id
	private Integer idClient;
	
	/*public void adaugaLista(ClientiAsig lista){
	this.lista.add(lista);
	}
*/
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	
	public ClientiAsig(int i, String string) {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClientiAsig(Integer idClient) {
		super();
		this.idClient = idClient;
		
	}
	

}

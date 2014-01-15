package AppProgr2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//populare clase
		
		public Collection<ClientiAsig> c=new Collection<ClientiAsig>(7);
		public Collection<ClientiAsig> lista=new Collection<ClientiAsig>();		
		public List<Portofoliu> portofoliu=new ArrayList<Portofoliu>(4);
		public List<Autovehicul> m=new ArrayList<Autovehicul>(7);
		public List<PolitaAsigurare> asigurare=new ArrayList<PolitaAsigurare>();
		public List<ClientiAsig> lista=new ArrayList<ClientiAsig>();
		
		
		Portofoliu portofoliu1 = new Portofoliu(1,"portofoliu a1", null);
		AgentAsig a1=new AgentAsig(1,"Popescu");
		Portofoliu portofoliu2 = new Portofoliu(1,"portofoliu a2",null);
		AgentAsig a2=new AgentAsig(2,"Ionescu");
		Portofoliu portofoliu3 = new Portofoliu(1,"portofoliu a3",null);
		AgentAsig a3=new AgentAsig(3,"Serban");
		Portofoliu portofoliu4 = new Portofoliu(1,"portofoliu a4",null);
		AgentAsig a4=new AgentAsig(4,"Popa");
		
	
		
		ClientiAsig c1=new ClientiAsig(1);
		lista1.adaugaLista(c1);
		ClientiAsig c2=new ClientiAsig(2);
		lista1.adaugaLista(c2);
		ClientiAsig c3=new ClientiAsig(3);
		lista1.adaugaLista(c3);
		ClientiAsig c4=new ClientiAsig(4);
		lista1.adaugaLista(c4);
		ClientiAsig c5=new ClientiAsig(5);
		lista2.adaugaLista(c5);
		ClientiAsig c6=new ClientiAsig(6);
		lista2.adaugaLista(c6);
		ClientiAsig c7=new ClientiAsig(7);
		lista2.adaugaLista(c7);
		
		ClientiAsig c1=new ClientiAsig(1);
		ClientiAsig c2=new ClientiAsig(2);
		ClientiAsig c3=new ClientiAsig(3);
		ClientiAsig c4=new ClientiAsig(4);
		ClientiAsig c5=new ClientiAsig(5);
		ClientiAsig c6=new ClientiAsig(6);
		ClientiAsig c7=new ClientiAsig(7);
		
		
		Autovehicul m1=new Autovehicul("IS01ABC","DACIA","LOGAN","ZXV12467",1200,5,2500);
		Autovehicul m2=new Autovehicul("IS05XYZ","RENAULT","CLIO","CCH95737",1500,5,2700);
		Autovehicul m3=new Autovehicul("IS10DGC","VOLVO","X10","DIV5O36O",1400,5,3000);
		Autovehicul m4=new Autovehicul("IS30SJC","SMART","MINI","JDH8573",1000,2,1500);
		Autovehicul m5=new Autovehicul("IS29DMC","BMW","X5","FJV8839",1800,5,3500);
		Autovehicul m6=new Autovehicul("IS39DJC","VW","GOLF","JFI0599",1600,5,2800);
		Autovehicul m7=new Autovehicul("IS50DJV","OPEL","ASTRA","JJD4977",1400,5,3000);
		
		
		

		PolitaAsigurare p1=new PolitaAsigurare(1, 1, 1000,"ABC",1,"01/08/2012","01/02/2013","10/01/2012","numerar",580,m1,130000);
		p1.adaugaPolite(p1);
		PolitaAsigurare p2=new PolitaAsigurare(2, c2, 1001,"ABB",a2,"01/08/2012","01/08/2013","30/07/2012","card",600,m2,100500);
		p2.adaugaPolite(p2);
		PolitaAsigurare p3=new PolitaAsigurare(3, c3, 1002,"ABD",a1,"23/05/2012","23/05/2013","22/04/2012","op",650,m3,100900);
		p3.adaugaPolite(p3);
		PolitaAsigurare p4=new PolitaAsigurare(4, c4, 1003,"ABE",a1,"04/05/2012","04/05/2013","03/05/2012","card",600,m4,120000);
		p4.adaugaPolite(p4);
		PolitaAsigurare p5=new PolitaAsigurare(5, c5, 1004,"ABF",a3,"30/08/2012","30/08/2013","29/08/2012","card",510,m5,150000);
		p5.adaugaPolite(p5);
		PolitaAsigurare p6=new PolitaAsigurare(6, c6, 1005,"ABT",a3,"25/09/2012","25/09/2013","24/09/2012","op",550,m6,150000);
		p6.adaugaPolite(p6);
		PolitaAsigurare p7=new PolitaAsigurare(7, c7, 1006,"ABO",a2,"19/09/2012","19/09/2013","18/09/2012","numerar",575,m7,180000);
		p7.adaugaPolite(p7);
		
		
		
		PersFizica pf1=new PersFizica("MARINA IONESCU","2345532134321",A1,"05/06/1999","adresa1",AlteMotive);
		PersFizica pf2=new PersFizica("ION POPESCU","1847394503350",B,"09/09/2005","adresa2",Bugetar);
		PersFizica pf3=new PersFizica("STEFAN IORDACHE","1947363858373",C1,"08/07/2007","adresa3",CleintFidel);
		PersFizica pf4=new PersFizica("ALINA POPA","2794846384950",AM,"20/03/2010","adresa4",ElevStudent);
		
		PersJuridica pj1=new PersJuridica(B1,"ALFA","38462946",societate_comerciala);
		PersJuridica pj2=new PersJuridica(B1,"BETA","38473020",ONG);
		PersJuridica pj3=new PersJuridica(C,"ZETA","84354790",altele);
		
		
		
		
		
		

		
	}

}

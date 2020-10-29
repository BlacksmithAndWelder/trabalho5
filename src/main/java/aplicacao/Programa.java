package aplicacao;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Automovel;
import entidades.Marca;
import entidades.Modelo;

public class Programa {

	public static void main(String[] args) throws ParseException {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("auto");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Modelo md1=new Modelo();
		Modelo md2=new Modelo();
		Modelo md3=new Modelo();
		Automovel au1 = new Automovel();
		//Automovel au2 = new Automovel();
		//Automovel au3 = new Automovel();
		Marca mr1 = new Marca();
		Marca mr2 = new Marca();
		Marca mr3 = new Marca();
		mr1.setNome("FMN");
		mr2.setNome("GM");
		mr3.setNome("LADA");
		md1.setDescricao("vai arriscar?");md1.setPotencia(1300);
	    md2.setPotencia(10000);
		md3.setDescricao("Pode confiar :)");md3.setPotencia(3000);
		au1.setAnoFabricação(2000);au1.setAnoModelo(2000);
		au1.setObservacoes("furada");au1.setKm(70000);au1.setPreco( (float) 15000);
        em.persist(au1);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}

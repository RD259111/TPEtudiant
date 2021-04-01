package tpEtudiant;

import persistance.dao.EtudiantDaoImpl;
import persistance.entities.Etudiant;

public class EtudiantJavaBean {

	private int code;
	private String nom;
	private float moyenne;

	EtudiantDaoImpl dao = new EtudiantDaoImpl();
	Etudiant et = new Etudiant();

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
		et = dao.findById(code);
	}

	public String getNom() {
		return et.getNom();
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getMoyenne() {
		return et.getMoyenne().floatValue();
	}

	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}

	public boolean isAdmis() {
		if (getMoyenne() < 10)

			return false;

		else
			return true;

	}

}

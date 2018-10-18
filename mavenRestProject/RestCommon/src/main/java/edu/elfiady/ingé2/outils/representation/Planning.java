package edu.elfiady.ingé2.outils.representation;

public class Planning {
	
	int id;
	
	Planning(int id) {
		this.id=id;
	}
	
	public void modifierPlanning(int id) {
		setId(id+1);
	}
	
	public void setId(int id) {
		this.id=id;
	}

}

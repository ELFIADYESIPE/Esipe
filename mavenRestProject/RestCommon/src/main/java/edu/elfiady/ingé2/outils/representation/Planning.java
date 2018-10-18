package edu.elfiady.ingé2.outils.representation;

public class Planning {
	
	int id;
	
	public Planning(int id) {
		this.id=id;
	}
	
	public void modifierPlanning() {
		setId(this.id+1);
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}

}

package esipeMavenProjet.mavenRestProject;

public class Planning {
	int id;
	String name;
	String date;
	
	public Planning() {
		super();
	}

	public Planning(int id, String name, String date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public void planningUpdate(int id) {
		setId(id+1);
	}

	@Override
	public String toString() {
		return "Planning [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	
	
}

package E2_MAP;

public class Employees {
	private String ID; 
	private String name;
	
	public Employees(String ID, String name) {
		this.ID = ID; 
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

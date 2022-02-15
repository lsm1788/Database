package ext2;

public class Teacher extends Person {
	
	private String profesorID;

	public String getProfesorID() {
		return profesorID;
	}

	public void setProfesorID(String profesorID) {
		profesorID = profesorID;
	}

	public Teacher(String name, int age, int height, int weight, String profesorID) {
		super(name, age, height, weight);
		this.profesorID = profesorID;
	}

	@Override
	public String toString() {
		return "Person [name="+ getName() +"], Teacher [profesorID=" + profesorID + "]";
	}
	
	
}

package dto;

public class Student {
	private int id;
	private String name;
	private int sikakuid;

	public Student(int id, String name, int sikakuid){
		this.id = id;
		this.name = name;
		this.sikakuid = sikakuid;

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

	public int getSikakuid() {
		return sikakuid;
	}

	public void setSikakuid(int sikakuid) {
		this.sikakuid = sikakuid;
	}

}
package dto;

public class Students {
	private int id;
	private String name;
	private int sikakuid;

	public Students(int id,String name,int sikakuid){
		this.id = id;
		this.name = name;
		this.sikakuid = sikakuid;

	}

	public Students(int id) {
		super();
		this.id = id;
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

	public int getsikakuId() {
		return sikakuid;
	}
	public void setsikakuId(int sikakuid) {
		this.sikakuid = sikakuid;
	}
}

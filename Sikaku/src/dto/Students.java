package dto;

public class Students {
	private String id;
	private String name;
	private String sikakuid;
	private int a;
	private int b;

	public Students(String siname,String name,String sikakuid, String results){
		this.id = siname;
		this.name = name;
		this.sikakuid = results;

	}

	public Students( int a, String name, int b) {
		super();
		this.name = name;
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Students(int a) {
		super();
		this.a = a;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSikakuid() {
		return sikakuid;
	}

	public void setSikakuid(String sikakuid) {
		this.sikakuid = sikakuid;
	}
}

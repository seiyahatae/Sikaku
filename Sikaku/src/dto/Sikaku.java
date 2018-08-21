package dto;

public class Sikaku {
	private int id;
	private String name;
	private String day;
	private String results;

	public Sikaku(int id,String name,String day,String results){
		this.id = id;
		this.name = name;
		this.day = day;
		this.results = results;

	}

	public Sikaku(int id) {
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
	public String geteffect() {
		return results;
	}
	public void seteffect(String results) {
		this.results = results;
	}
}
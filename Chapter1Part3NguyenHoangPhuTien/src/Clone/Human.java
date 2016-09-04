package Clone;

public class Human implements Cloneable{

	public int id;
	public String name;
	
	public Human() {
		super();
	}

	public Human(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
       
        return super.clone();
    }
}

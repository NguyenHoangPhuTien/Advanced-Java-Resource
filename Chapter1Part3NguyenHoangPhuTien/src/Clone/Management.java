package Clone;

public class Management extends Human implements Cloneable{

	
	private Department dp;
	
	public Management() {
		super();
	}

	public Management(int id, String name, Department dp) {
		super(id, name);
		this.dp = dp;
	}


	public Department getDp() {
		return dp;
	}

	public void setDp(Department dp) {
		this.dp = dp;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
       
        return super.clone();
    }
}

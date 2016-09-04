package Clone;

import java.util.Hashtable;

import PrototypePattern.Circle;
import PrototypePattern.Rectangle;
import PrototypePattern.Shape;
import PrototypePattern.Square;

public class Cache {
	
	private static Hashtable<String, Human> shapeMap  = new Hashtable<String, Human>();

	 public static Human getHuman(String id) throws CloneNotSupportedException {
	      Human cachedShape = shapeMap.get(id);
	      return (Human) cachedShape.clone();
	   }

	 
	 public static void loadCache() {
	     
		 Employee emp = new Employee();
		 emp.setId(1);
		 emp.setDepartment(new Department(1, "abc"));
		 shapeMap.put("1", emp);
	    
		 Management manage = new Management();
		 manage.setId(2);
		 manage.setDp(new Department(1, "abc"));
		 shapeMap.put("2", manage);
	   }
}

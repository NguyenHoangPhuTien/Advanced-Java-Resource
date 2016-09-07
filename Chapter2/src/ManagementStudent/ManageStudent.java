package ManagementStudent;

import java.util.TreeMap;

/*
 * Nguyen Hoang Phu Tien
 * Version : 1.0
 * Date : 7/9/2016
 * Class for manage Student
 */
public class ManageStudent {

	TreeMap<String, Student> tree;

	public ManageStudent() {
		super();
	}

	public ManageStudent(TreeMap<String, Student> tree) {
		super();
		this.tree = tree;
	}

	public TreeMap<String, Student> getTree() {
		return tree;
	}

	public void setTree(TreeMap<String, Student> tree) {
		this.tree = tree;
	}
	
	/*
	 * Add new Student
	 */
	public void addNewStudent(Student st){
		tree.put(st.id, st);
	}
	
	/*
	 * Return Student by id
	 */
	public Student getValue(String id){
		
		return tree.get(id);
	}
	
	/*
	 * Remove Student by key
	 */
	public void removeValue(String id){
		tree.remove(id);
	}
	
	/*
	 * Display all student
	 */
	public void displayAllStudent(){
		for(Object key : tree.keySet()){
			Student student = tree.get(key);
			student.displayStudent();
		}
	}
	
	/*
	 * Check duplicate student
	 */
	public boolean checkDuplicate(String id){
		
		return tree.containsKey(id);
	}
}

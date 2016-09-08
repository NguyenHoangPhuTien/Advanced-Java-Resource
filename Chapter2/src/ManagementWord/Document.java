package ManagementWord;
import java.util.TreeMap;


/*
 * Nguyen Hoang Phu Tien
 * Version : 1.0
 * Date : 8/9/2016
 * Class for Word
 */

public class Document {

	private String word;

	public Document() {
		super();
	}

	public Document(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	/*
	 * Convert word to TreeMap
	 * Return result as a tree map type
	 */
	public TreeMap<String, Integer> convertToTreeMap(){
		
		String[] arr = word.split(" ");
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = arr[i].toLowerCase();
			if(tree.containsKey(arr[i])){
				int temp = tree.get(arr[i]);
				tree.replace(arr[i], temp + 1);
			}
			else
				tree.put(arr[i], 1);
		}
		return tree;
	}
	
	/*
	 * Print all items and count the number of occurrences of the word
	 */
	public void printInformationItems(){
		
		TreeMap<String, Integer> tree = convertToTreeMap();
		for(String key : tree.keySet()){	
			System.out.println(key + " " + tree.get(key));
		}
		
	}
	
	/*
	 * Serch by count the number of occurrences of the word
	 */
	public void searchByKey(String key){
		TreeMap<String, Integer> tree = convertToTreeMap();
		System.out.println("number of occurrences of the word is: " + tree.get(key));
	}
}

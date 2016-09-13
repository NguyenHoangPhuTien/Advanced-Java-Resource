/**
 * 
 */
package Exercise5_3;

/**
 * @author Nguyen Hoang Phu Tien
 * Version: 1.0
 * Date 13/9/2016
 * Class for sum all element array 
 */
public class MaxThread extends Thread{

	private int lo;
	private int hi;
	private int[] arr;
	private int max = 0;
	
	public MaxThread(int lo, int hi, int[] arr) {
		super();
		this.lo = lo;
		this.hi = hi;
		this.arr = arr;
	}

	public int getLo() {
		return lo;
	}

	public void setLo(int lo) {
		this.lo = lo;
	}

	public int getHi() {
		return hi;
	}

	public void setHi(int hi) {
		this.hi = hi;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	
	public int getMax() {
		return max;
	}

	public void setMax(int sum) {
		this.max = max;
	}

	//Override method run of thread
	@Override
	public void run() {
		max = arr[0];
		for(int i = this.lo; i < this.hi; i++){
			max = Math.max(max, arr[i]);
		}
	}
	
	
}

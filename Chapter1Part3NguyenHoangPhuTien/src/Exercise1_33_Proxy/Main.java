
package Exercise1_33_Proxy;

public class Main {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		image.display();
	}
}

package Exercise1_33_Proxy;
/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 05-Sep-2016 8:14:59 PM
 * Class for Proxy Image
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;
    
    public ProxyImage(String fileName){
        this.fileName= fileName;
    }
    //to call dislpay method.
    @Override
    public void display() {
       if(realImage == null){
           realImage = new RealImage(fileName);
       }
       realImage.display();
    }
    
}

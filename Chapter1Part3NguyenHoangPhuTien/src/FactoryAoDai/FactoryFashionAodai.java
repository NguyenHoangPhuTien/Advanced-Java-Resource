package FactoryAoDai;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 01-September-2016 3:52:25 PM
 * @class for implement interface FactoryAodai
 */
public class FactoryFashionAodai implements FactoryAodai {

	public FashionAodai m_FashionAodai;

	public FactoryFashionAodai(){

	}

	public void finalize() throws Throwable {

	}

	public AoDai getAodai(){
		return new FashionAodai();
	}

}
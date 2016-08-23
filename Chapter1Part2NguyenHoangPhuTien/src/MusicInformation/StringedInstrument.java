package MusicInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Class about information  Stringed instrument
 * Version 1.0.
 * This class extend by Instrument
 */

public class StringedInstrument extends Instrument{
	
	int quantityStringed;
	
	public StringedInstrument() {
		super();
	}

	public StringedInstrument(String name, String manufacturer,
			int quantityStringed) {
		super(name, manufacturer);
		this.quantityStringed = quantityStringed;
	}

	public int getQuantityStringed() {
		return quantityStringed;
	}

	public void setQuantityStringed(int quantityStringed) {
		this.quantityStringed = quantityStringed;
	}

	/*
	 * Get how to play of stringed instrument
	 * Return result as string type
	 */
	@Override
	public String play() {
		return "name of instrument : " +  name + " quantity of Stringed: " + quantityStringed;
	}
	
	
}

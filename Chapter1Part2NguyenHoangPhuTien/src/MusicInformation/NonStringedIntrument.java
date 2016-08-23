package MusicInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Class about information  Stringed instrument
 * Version 1.0.
 * This class extend by Instrument
 */

public class NonStringedIntrument extends Instrument{

	String using;

	public NonStringedIntrument() {
		super();
	}

	public NonStringedIntrument(String name, String manufacturer, String using) {
		super(name, manufacturer);
		this.using = using;
	}

	public String getUsing() {
		return using;
	}

	public void setUsing(String using) {
		this.using = using;
	}

	/*
	 * Get how to play of stringed instrument
	 * Return result as string type
	 */
	@Override
	public String play() {
		return "how to play " + using;
	}

	
}

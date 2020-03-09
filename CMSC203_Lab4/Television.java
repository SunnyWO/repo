package television;
/**
 * The purpose of this class is to model a television
 * @author Sunny Onuska
 * Date: 3/1/2020
*/
public class Television {
	//the manufacturer of the TV
	private final String MANUFACTURER;
	//the screen size of the TV
	private final int SCREEN_SIZE;
	//whether or not the TV is on(true) or off(false)
	private boolean powerOn;
	//the channel the TV is on
	private int channel;
	//the volume of the TV
	private int volume;
	
	/**
	 * creates an instance of Television
	 * @param MANUFACTURER
	 * the manufacturer of the TV
	 * @param SCREEN_SIZE
	 * the screen size of the TV
	 */
	Television(String MANUFACTURER, int SCREEN_SIZE){
		this.SCREEN_SIZE=SCREEN_SIZE;
		this.MANUFACTURER=MANUFACTURER;
		this.powerOn=false;
		this.volume=20;
		this.channel=2;
	}
	
	/**
	 * set channel value
	 * @param channel
	 * the channel the TV is on
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	/**
	 * changes powerOn from true to false or false to true
	 */
	public void power() {
		this.powerOn=!(this.powerOn);
	}
	/**
	 * adds 1 to volume
	 */
	public void increaseVolume() {
		this.volume++;
	}
	/**
	 * subtracts 1 from volume
	 */
	public void decreaseVolume() {
		this.volume--;
	}
	/**
	 * returns channel value
	 * @return channel
	 */
	public int getChannel() {
		return this.channel;
	}
	/**
	 * returns volume value
	 * @return volume
	 */
	public int getVolume() {
		return this.volume;
	}
	/**
	 * returns MANUFACTURER value
	 * @return MANUFACTURER
	 */
	public String getManufacturer() {
		return this.MANUFACTURER;
	}
	/**
	 * returns SCREEN_SIZE value
	 * @return SCREEN_SIZE
	 */
	public int getScreenSize() {
		return this.SCREEN_SIZE;
	}
}

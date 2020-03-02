/** 
 * The purpose of this class is to model a television
 * Mona Aghaaligol, 02/27/2020
 */
public class Television {
		//Two constants fields deceleration
		private final String MANUFACTURER;   // Holds the brand name
		private final int SCREEN_SIZE;       // Holds the size of television
		
		//Three variable fields deceleration
		private boolean powerOn;  // Holds the value true if the power is on, and false if the power is off
		private int channel;	  // Holds the value of the station that television is showing
		private int volume;       // Holds a number value representing the loudness (0 being no sound)
		
		/**
		 * Constructor
		 * @param manufactBrand the MANUFACTURER of the TV
		 * @param screenSize the SCREEN_SIZE of the TV
		 */
		public Television(String manufactBrand, int screenSize)
		{
			this.MANUFACTURER = manufactBrand;
			this.SCREEN_SIZE = screenSize;
			powerOn = false;
			volume = 20;
			channel = 2;
		}
		
		/**
		 * The getVolume methods returns a  
		 * Television object's volume
		 */
		
		public int getVolume()
		{
			return volume;
		}
		
		/**
		 * The getChannel methods returns a  
		 * Television object's channel
		 */
		
		public int getChannel()
		{
			return channel;
		}
		
		/**
		 * The getManufacturer methods returns a  
		 * Television object's MANUFACTURER
		 */
		
		public String getManufacturer()
		{
			return MANUFACTURER;
		}
		
		/**
		 * The getScreenSize methods returns a  
		 * Television object's SCREEN_SIZE
		 */
		
		public int getScreenSize()
		{
			return SCREEN_SIZE;
		}
		
		/**
		 * The setChannel methods accept a value to be 
		 * stored in the channel field
		 */
		
		public void setChannel(int channelField)
		{
			channel = channelField;
		}

		/**
		 * The power methods change the state from 
		 * true to false or from false to true and 
		 * store the value to powerOn
		 */
		
		public void power()
		{
			powerOn = !powerOn;
	    }
		
		
		/**
		 * The increseVolume methods increse volume by one
		 * and store the value to the volume
		 */
		
		public void increaseVolume()
		{
			volume++;
		}
		
		/**
		 * The decreaseVolume methods decrease volume by one
		 * and store the value to the volume
		 */
		
		public void decreaseVolume()
		{
			volume--;
			
		}
		
		
		
	}









package assignment01;

public class TVdriver2 {

	public static void main(String[] args) {
		// note that calling the constructor of TVRemoteClassAdapter
		// will call the constructor of TV. Both constructors will 
		// have the channel counters set to 2.
		TVRemoteClassAdapter remote = new TVRemoteClassAdapter();		
		remote.on();
		remote.showChannel();
		remote.setChannel(101);
		remote.showChannel();
		remote.setChannel(96);
		remote.showChannel();
		remote.setChannel(0);
		remote.showChannel();
		remote.setChannel(900);
		remote.showChannel();
		remote.setChannel(-10);
		remote.showChannel();
		remote.setChannel(100);
		remote.channelUp();
		remote.showChannel();
		remote.channelDown();
		remote.showChannel();
		remote.off();
	}
}

/*
EXPECTED OUTPUT IS:
TV is on
Remote Channel is 2. TV Channel is 2
Remote Channel is 101. TV Channel is 101
Remote Channel is 96. TV Channel is 96
Remote Channel is 2. TV Channel is 2
Remote Channel is 700. TV Channel is 700
Remote Channel is 2. TV Channel is 2
Remote Channel is 101. TV Channel is 101
Remote Channel is 100. TV Channel is 100
TV is off
*/

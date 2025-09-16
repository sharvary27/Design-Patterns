package assignment01;

public class TVRemoteClassAdapter extends TV implements TVRemote {
	// the remote has to keep its own copy of the TVs channel
	// since channel is private in TV
	private int tvChannel = 2;
	
	public void setChannel(int newChannel) {
		// NOTE if parameter is out of limits, the loops will be infinite
		newChannel = Math.min(newChannel, MAX_CHANNELS);
		newChannel = Math.max(newChannel, 2);
		// TODO use a loop to set TV to newChannel and match tvChannel

		while (tvChannel < newChannel) {
			super.up();
			tvChannel++;
		}

		while (tvChannel > newChannel) {
			super.down();
			tvChannel--;
		}
	}

	@Override
	public void channelUp() {
		// TODO and make sure tvChannel will match channel in TV 
		super.up();
		tvChannel = Math.min(tvChannel + 1, MAX_CHANNELS);
	}

	@Override
	public void channelDown() {
		// TODO and make sure tvChannel will match channel in TV 
		super.down();
		tvChannel = Math.max(tvChannel - 1, 2);
	}
	@Override
	public void showChannel() {
		System.out.print("Remote Channel is " + tvChannel + ". ");
		super.showChannel();
	}
}


package jungsuk.ch07;

public class MyTv2 {

	boolean isPowerOn;
	int channel;
	int volume;
	int prevChannel1;
	int prevChannel2;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setChannel(int channel) {
		if(channel<MAX_CHANNEL && channel>MIN_CHANNEL) {
		prevChannel1=this.channel;
		this.channel=channel;
		}else {
			return;
		}
	}
	
//	public void setVolume(int volume) {
//		if(volume<MAX_VOLUME && volume>MIN_VOLUME) {
//			this.volume=volume;
//			}else {
//				return;
//			}
//		
//	}
	
	public int getChannel() {
		return channel; 
	}
	
//	public int getVolume() {
//		return volume; 
//	}
//	
	public void gotoPrevChannel() {
		prevChannel2=channel;
		 channel=prevChannel1;
		 getChannel();
		 prevChannel1=prevChannel2;
	}
	
//	public int gotoPrevChannel() {
//		return prevChannel;
//	}
	
}

//class Ex7_10{
//	public static void main(String[] args) {
//		
//		MyTv2 t = new MyTv2();
//		
//		t.setChannel(10);
//		System.out.println("CH:"+t.getChannel());
//		t.setVolume(20);
//		System.out.println("VOL:"+t.getVolume());
//	}
//}
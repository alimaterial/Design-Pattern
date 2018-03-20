package abstractFactory;



public class AbstractFactoryClient {

	public static void main(String[] args) {
		IFactory factory=new ExpFactory();
		IAudio audio=factory.getAudio();
		audio.attachAudio();
		audio.playAudio();
		IVideo video=factory.getVideo();
		video.attachVideo();
		video.playVideo();
		
		
	}

}

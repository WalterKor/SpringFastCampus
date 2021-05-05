package AdapterPattern;

public class MP3 implements MediaPlayer{

	@Override
	public void play(String fileName) {
		
		System.out.println("play MP3 File"+ fileName); 
		
	}

}

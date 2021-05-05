package AdapterPattern;

public class MP4 implements MediaPackage {

	@Override
	public void playFile(String fileName) {
		System.out.println("play MP4 File"+ fileName);
		
	}

}

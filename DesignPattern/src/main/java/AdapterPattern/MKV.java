package AdapterPattern;

public class MKV implements MediaPackage {

	@Override
	public void playFile(String fileName) {
		
		System.out.println("play MKV File"+ fileName);
		
	}

}

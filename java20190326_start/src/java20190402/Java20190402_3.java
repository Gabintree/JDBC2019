package java20190402;

public class Java20190402_3 {

	public static void main(String[] args) {
		
	Song mySong = new Song("Let it go");
	Song yourSong = new Song("������Ÿ��");
	System.out.println("�� �뷡�� " + mySong.getTitle());
	System.out.println("���� �뷡�� " + yourSong.getTitle() );
	
	}
}
 
class Song {
	private String a;
	
	public Song(String b) {
		a =  b;
	}
	public String getTitle() {
		return a;
	} 
	
}


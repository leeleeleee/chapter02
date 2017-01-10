package chapter02;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song song = new Song();
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수 작곡");
		song.setTrack(3);
		song.setYear(2010);
		
		song.show();
		
		Song song2 = new Song( null, "에일리", "첫눈처럼 너에게 가겠다.", null, 0, 2016);
		song2.show();
		System.out.println(song2);
		
		Song song3 = new Song( "Beautiful", "크러쉬" );
		song3.show();
	
		
		
	}

}

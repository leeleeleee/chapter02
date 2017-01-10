package chapter02;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song() {
		
	}
	public Song(String composer, String artist, String title
			, String album, int track, int year) {
		this.composer = composer;
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.track = track;
		this.year = year;
		
	}
	
	public Song(String title, String artist) {
		this("", artist, title, "", 0, 0);
	}
	
	public String getTitle() {

		return title;
	}
	public void setTitle(String title) {

		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show() {
		System.out.println( artist + " " + title + "(" + album + ", " + year + ", " + track+ ", "+ composer +")");
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
}

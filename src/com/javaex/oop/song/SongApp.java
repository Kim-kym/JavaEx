package com.javaex.oop.song;

class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track; 
	
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
	public void setYear (int year) {
		this.year = year; 
	}
	public int getTrak() {
		return track; 
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public void showInfo() {
		System.out.printf("%s, %s, ( %s, %d, %d번 track, %s 작곡 )%n",
						artist, title, album, year, track, composer);
		
	}
}

public class SongApp {

	public static void main(String[] args) {
		Song singer1 = new Song();
		singer1.setTitle("좋은날");
		singer1.setArtist("아이유");
		singer1.setAlbum("Real");
		singer1.setComposer("이민수");
		singer1.setYear(2010);
		singer1.setTrack(3);
		
		singer1.showInfo();
		
		Song singer2 = new Song();
		singer2.setTitle("거짓말");
		singer2.setArtist("BIGBANG");
		singer2.setAlbum("Always");
		singer2.setComposer("G-DRAGON");
		singer2.setYear(2007);
		singer2.setTrack(2);
		
		singer2.showInfo();
		
		Song singer3 = new Song();
		singer3.setTitle("벚꽃엔딩");
		singer3.setArtist("버스커버스커");
		singer3.setAlbum("버스커버스커1집");
		singer3.setComposer("장범준");
		singer3.setYear(2012);
		singer3.setTrack(4);
		
		singer3.showInfo();

	}

}

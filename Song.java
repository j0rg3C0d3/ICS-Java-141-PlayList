/*Jorge Fajardo
 * ICS 141- Programming Objects
 * 10/21/2016
 * Assigment: 6
 */

public class Song {
	private String title = "";
	private String artist = "";

	public Song(String _title, String _artist) {
		this.title = _title;
		this.artist = _artist;
	}

	public String getTittle() {
		return (this.title);
	}

	public String getArtist() {
		return (this.artist);
	}

	public void setTitle(String _title) {
		this.title = _title;
	}

	public void setArtist(String _artist) {
		this.artist = _artist;
	}

	public String toString() {
		String output = "";
		output += " Title: " + this.getTittle() + "\n" + "Artist: "
				+ this.getArtist();
		return output;
	}
}

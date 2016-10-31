/*Jorge Fajardo
 * ICS 141- Programming Objects
 * 10/21/2016
 * Assigment: 6
 */
public class User {
	private String name = "";
	private PlayList favoriteSongs;

	// constructors
	public User(String _name, PlayList _favoriteSongs) {
		this.name = _name;
		this.favoriteSongs = _favoriteSongs;
	}

	public User(String _name) {
		this.name = _name;
	}

	public void setFavoriteSongs(PlayList list) {
		this.favoriteSongs = list;
	}

	public PlayList getFavoriteSongs() {
		return (this.favoriteSongs);
	}

	// return the SONG Object of the song with given title.
	public Song getSong(String _title) {
		Song outSong = null;
		for (int i = 0; i < this.favoriteSongs.getCurrentNumSongs(); i++) {
			if ((this.favoriteSongs != null)) {
				outSong = favoriteSongs.getSong(i);
			}
			return outSong;
		}
		return null;

	}

	public void addSong(String _title, String _artist) {
		favoriteSongs.addSong(_title, _artist);
	}

	// return number of songs in the play list that are authored by the input
	// artist name
	public int artistSongCount(String _artist) {
		int songCounter = 0;

		Song list[] = this.favoriteSongs.getSongList();

		for (int i = 0; i < favoriteSongs.getCurrentNumSongs(); i++) {
			if ((this.favoriteSongs != null)) {
				if (list[i].getArtist() == _artist) {
					songCounter++;
				}
			}
		}
		return songCounter;
	}

	// setters
	public void setName(String _name) {
		this.name = _name;
	}

	// getters
	public String getName() {
		return (name);
	}

	public String toString() {
		String outPut = "";
		Song list[] = favoriteSongs.getSongList();

		outPut += this.getName() + "\n";

		for (int j = 0; j < favoriteSongs.getCurrentNumSongs(); j++) {
			outPut = outPut + "\n" + list[j].getArtist() + "\t"
					+ list[j].getTittle();
		}
		return outPut;
	}
}
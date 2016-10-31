/*Jorge Fajardo
 * ICS 141- Programming Objects
 * 10/21/2016
 * Assigment: 6
 */
public class PlayList {

	private int maxNumOfSongs = 0;
	private int currentNumOfSongs = 0;
	private Song[] songList;// = new Song[5];

	public PlayList(int _maxNumOfSongs) {
		this.maxNumOfSongs = _maxNumOfSongs;
		this.songList = new Song[_maxNumOfSongs];
	}

	public int getCurrentNumSongs() {
		return (this.currentNumOfSongs);
	}

	public void addSong(String _title, String _artist) {
		Song newSong = new Song(_title, _artist);
		addSong(newSong);
	}

	public void addSong(Song _newSong) {
		this.songList[currentNumOfSongs] = _newSong; // it crashes here;
		this.currentNumOfSongs++;
	}

	// this returns a song based on an int/ possition.
	public Song getSong(int _possition) {
		Song aSong;
		if (songList != null) {
			aSong = this.songList[_possition];
			return aSong;
		}
		return null;
	}

	// takes a "string" name of song and returns possition on list;
	public int getSongPosition(String _title) {
		for (int i = 0; i < this.currentNumOfSongs; i++) {
			if (this.songList[i] != null) {
				if ((this.songList[i]).getTittle() == _title) {
					return (i);
				}
			}
		}
		return -1;
	}

	public void setMaxNumOfSongs(int _maxNumOfSongs) {
		this.maxNumOfSongs = _maxNumOfSongs;
	}

	public void setSongList(Song[] _songList) {
		this.songList = _songList;
	}

	public int getMaxNumOfSongs() {
		return (this.maxNumOfSongs);
	}

	public Song[] getSongList() {
		return (this.songList);
	}

	public String toString() {
		String outputStr = "";

		for (int i = 0; i < this.currentNumOfSongs; i++)
			if (this.songList[i] != null) {
				outputStr += this.songList[i].getTittle();
				outputStr += this.songList[i].getTittle();
			}
		return outputStr;
	}
}
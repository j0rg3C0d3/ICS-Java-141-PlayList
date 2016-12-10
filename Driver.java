public class Driver {

	public static void main(String[] args) {
		// 1
		PlayList newList = new PlayList(5);

		// 2
		newList.addSong("Milagros", "Shakira");
		newList.addSong("Felicidades", "Shakira");

		// 3
		User userOne = new User("Jorge");
		User userTwo = new User("Monica");

		// 4
		userOne.setFavoriteSongs(newList);
		userTwo.setFavoriteSongs(newList);

		// 5
		userOne.addSong("Retratos", "Qeen");

		// 6
		userTwo.addSong("Regressos", "Villas");

		// 7
		System.out.println(userOne.toString());
		System.out.println();
		System.out.println(userTwo.toString());

		// 8
		System.out.println();
		int outSong = userOne.artistSongCount("Shakira");
		System.out.println(outSong + " Songs by Same Artist");

		// 9
		String strSong = newList.getSong(1).toString();

		System.out.println();
		System.out.println("Track 1 on Play list: ");
		System.out.println(strSong);

	}

}

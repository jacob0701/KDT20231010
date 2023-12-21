import javazoom.jl.player.Player;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Bgm extends Thread {

	private String filename;
	private Player player;
	private boolean isLoop;

	public Bgm(String filename) {

		this.filename = filename;

	}

	public void run() {

		boolean loop = true;

		try {
			while (loop) {
				FileInputStream fis = new FileInputStream(filename);
				BufferedInputStream bis = new BufferedInputStream(fis);
				player = new Player(bis);
				player.play();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

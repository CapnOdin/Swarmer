import game.Game;

public class Mainn {

	public static void main(String[] args) {
		
		Game g = new Game(500, 500);
		
		while(true) {
			g.render(1);
		}
	}
}

package java_chap07;

public class Overwatch {

	public static void main(String[] args) {
		Games game = new Games();
		
		McCree mc = new McCree();
		Gengi gi = new Gengi();
		
		game.play(mc);
		game.play(gi);
		
		gi.attack();
		gi.stop();
		gi.specialSkill();

	}

}

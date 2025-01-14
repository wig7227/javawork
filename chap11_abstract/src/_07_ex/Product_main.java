package _07_ex;

public class Product_main {

	public static void main(String[] args) {
		Tv tv = new Tv ();
		
		tv.power();
		tv.channel(13);
		tv.volume("up");
		tv.volume("up");
		tv.volume("up");
		tv.volume("down");
		tv.volume("down");
		tv.volume("down");
		tv.volume("down");
		tv.volume("down");
		tv.volume(17);
		
		tv.channel(2);
		System.out.println("aaaa : " + tv.channel(3));
		
		tv.ai();
		tv.se("드라마 검색");
		tv.power();
		
		System.out.println("------------------");
		Game game = new Game();
		
		game.power();
		game.channel("마리오카트");
		game.volume("up");
		game.volume("up");
		game.volume("down");
		game.volume("down");
		game.volume("down");
		game.volume("down");
		game.volume(6);
		game.ai();
		game.se("게임 검색");
		game.power();
		
		//Product pro = new Product();

	}

}

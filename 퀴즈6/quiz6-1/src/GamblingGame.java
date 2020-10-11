import java.util.Scanner;

public class GamblingGame {
	private Player [] p;
	private Scanner scanner = new Scanner(System.in);
	
	public GamblingGame() {
		System.out.print("갬블링 게임에 참여할 선수 숫자>>");
		 
		int nPlayers = scanner.nextInt();
		scanner.nextLine(); 
		 
		p = new Player[nPlayers]; 	 
		for(int i=0; i<p.length; i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			p[i] = new Player(scanner.nextLine());
		}
	}
	
	public void run() {
		int i=0;
		while (true) {
			if (p[i].turn()) {
				System.out.println(p[i].getName()+"님이 이겼습니다!");
				break;
			}
			else {
				System.out.println("아쉽군요!");
				i++; 
				i = i%p.length;
			}
		}
	}
		
	public static void main(String [] args) {
		GamblingGame game = new GamblingGame();
		game.run();
	}
}
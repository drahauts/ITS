import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd= new Scanner(System.in);
		while(true) {
			System.out.println("A che piano devo andare: [0, 1, 2, 3]");
			int piano = rd.nextInt();
			Macchina(piano);
		}
	}
	
	static int [][] fsm = {
			{0, 1, 2, 3},
			{-1, 0, 1, 2},
			{-2, -1, 0, 1},
			{-3, -2, -1, 0}
	};
	static int stato = 0;

	// La macchina si deve muovoere al piano indicato come parametro
	private static void Macchina(int piano) {
		System.out.printf("Sono al piano %d e devo andare al piano %d: ", stato, piano);
		if (fsm[stato][piano] == 0) {
			System.out.println("Non mi devo muovere. ");
		}else if(fsm[stato][piano] > 0) {
			System.out.printf("Salgo di %d piani.\n", fsm[stato][piano]);
		}else {
			System.out.printf("Scendo di %d piani.\n", -fsm[stato][piano]);
		}
		stato += fsm[stato][piano];
	}

}

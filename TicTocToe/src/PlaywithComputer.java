import java.util.*;

public class Main {
	static ArrayList<Integer> repeat = new ArrayList<Integer>();
	static Random r = new Random();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		 int mat[][] = {{49,50,51},{52,53,54},{55,56,57}};
		 UserInterface ui = new UserInterface();
		 ui.view(mat);

		 
		 System.out.println("\n[X] - First player");
		 System.out.println("[O] - Second player");
		 
		 int i =1;
		 char player;
		 do {
			 
			 if(i%2==0) 
				 player = 'O';
			 
			 else 
				 player = 'X';
			 System.out.print("Enter " + player + " position :");
			 int pos = getPosition(i);
			 System.out.println();
				 if(!(insert(mat,pos,i,player))) {
					 System.out.println("Already fill");
					 i = i-1;
				 }
				 ui.view(mat);
				 i++;
	
		 }while(ui.checkWinLose(mat));
		 System.out.println("GAME OVER!!!");
	}
	
	private static int getPosition(int i) {
		int pos;
		boolean bool;
		if(i%2 == 0) {
			bool = true;
			while(bool) {
				pos = r.nextInt(9)+1;
				System.out.println(pos);
				if(!(repeat.contains(pos))) {
					bool = false;
					return pos;
					}
				}
		}
		else {
			bool = true;
			while(bool) {
				pos = sc.nextInt();
				if(!(repeat.contains(pos))) {
					bool = false;
					return pos;
					}
				}
			}
		return 0;
	}

	public static boolean  insert(int[][] mat,int pos,int k,char player) {
		int i,j;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(pos == mat[i][j]-48 && k%2 !=0 &&(player == 'X' || player == 'x')) {
					mat[i][j] = 'X';
					return true;
					}
				if(pos == mat[i][j]-48 && k%2 == 0 &&( player == 'O' || player == 'o')) {
					mat[i][j] = 'O';
					return true;
					}
			}
		}
		return false;
	}
}

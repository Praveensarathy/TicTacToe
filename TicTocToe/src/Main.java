import java.util.*;

public class Main {

	public static void main(String[] args) {
		 int mat[][] = {{49,50,51},{52,53,54},{55,56,57}};
		 UserInterface ui = new UserInterface();
		 ui.view(mat);
		 Scanner sc = new Scanner(System.in);
		 System.out.println("\n[X] - First player");
		 System.out.println("[O] - Second player");
		 
		 int i =1;
		 char player;
		 do {
			 
			 if(i%2==0) {

				 player = 'O';
			 }
			 else {

				 player = 'X';
			 }
			 System.out.print("Enter " + player + " position :");
			 boolean check = true;
			 int pos = 0;
			 while(check) {
			 try {
				 pos = sc.nextInt();
				 if(pos >=1 && pos <=9) {
					
					 check = false;
				 }
				 else {
					 System.out.println("Enter valid input:");
					 check = true;
				 }
			 }
			 catch(Exception e){
				check = false;
			 	}
			 }
			 if(ui.checkPosition(mat, pos)) {
				 System.out.println(insert(mat,pos,player));
				 if((insert(mat,pos,player))) {
					 System.out.println("Already fill");
					 i = i-1;
//					 System.out.println(i);
				 }
				 ui.view(mat);
				 i++;
			 }
			 
		 }while(ui.checkWinLose(mat));
		 System.out.println("GAME OVER!!!");
	}
	public static boolean  insert(int[][] mat,int pos,char player) {
		int i,j;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				
				if(pos == mat[i][j]-48 && (player == 'X' || player == 'x')) {
					mat[i][j] = 'X';
					return true;
				}
				if(pos == mat[i][j]-48 && (player == 'O' || player == 'o')) {
					mat[i][j] = 'O';
					return true;
				}
			}
		}
		return false;
	}
}

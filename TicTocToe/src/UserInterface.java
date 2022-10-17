
public class UserInterface {
	public void view(int [][]mat) {
		int i=0,j;
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				System.out.printf("   %c     |",mat[i][j]);
			}
			System.out.println();
			for(j=0;j<3;j++) {
				System.out.print("   ____  ");
			}
			System.out.println();
		}
	}
	public boolean checkPosition(int[][] mat,int pos) {
		int i,j;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(pos == mat[i][j]-48) {
					return true;
				}
			}
		}
		System.out.println("Already filled");
		return false;
		
	}
	
	public boolean checkWinLose(int[][] mat) {
		int i,j=0;
		for(i =0;i<3;i++) {
			if(mat[i][j] == 'X' && mat[i][j+1] == 'X' && mat[i][j+2] == 'X'){
				System.out.println("Player 1 wins");
				return false;
			}
			if(mat[i][j] == 'O' && mat[i][j+1] == 'O' && mat[i][j+2] == 'O'){
				System.out.println("Player 2 wins");
				return false;
			
			}
			j=0;
		}
		i =0;
		for(j=0;j<3;j++) {
			if(mat[i][j] == 'X' && mat[i+1][j] == 'X' && mat[i+2][j] == 'X') {
				System.out.println("Player 1 wins");
				return false;
			}
			else if(mat[i][j] == 'O' && mat[i+1][j] == 'O' && mat[i+2][j] == 'O') {
				System.out.println("Player 2 wins");
				return false;
			}
		}
		i=0;j=0;
		if(mat[i][j] == 'X' && mat[i+1][j+1] == 'X' && mat[i+2][j+2] == 'X') {
			System.out.println("Player 1 wins");
			return false;
		}
		else if(mat[i][j] == 'O' && mat[i+1][j+1] == 'O' && mat[i+2][j+2] == 'O') {
			System.out.println("Player 2 wins");
			return false;
		}
		i=0;j=0;
		if(mat[2][0] == 'X' && mat[0][2] == 'X' && mat[1][1] == 'X') {
			System.out.println("Player 1 wins");
			return false;
		}
		if(mat[2][0] == 'O' && mat[0][2] == 'O' && mat[1][1] == 'O') {
			System.out.println("Player 2 wins");
			return false;
		}
				
		return true;
	}
	

}

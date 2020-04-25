import java.util.ArrayList;


public class Driver {

	public static void main(String[] args) {

		int[][] twod = {{1, 2, 3, 4}, {3, 1, 2, 4}, {2, 1, 3, 4}, {3, 1, 4, 2}};

		TileGame tg = new TileGame(twod);
		tg.printy();
	}
}


public class TileGame{

	private ArrayList<NumberTile> board = new ArrayList<NumberTile>();

	public TileGame(int[][] arr) {

		// loop

		for(int i=0; i < arr.length; i++) {
			NumberTile nt = new NumberTile(arr[i]);
			board.add(nt);
		}
	}

	private int getIndexForFit(NumberTile tile) {
	
		//check if the board is empty

		if(this.board.size() == 0) {
			return(0);
		}

		else {
			//loop through the board
			boolean flag = false;
			for(int i=0; i < board.size()-1; i++) {
				int left = board.get(i).getRight();
				int right = board.get(i+1).getLeft();
				if(left == tile.getLeft() && right == tile.getRight()) {
					flag = true;
					return(i+1);
				}
			}

			if(flag == false) {
				return(-1);
			}

		}
	}


	public boolean insertTile(NumberTile tile) {
		boolean isPossible = false;
		if(this.board.size() == 0) {
			isPossible = true;
			return(isPossible);
		}
		else {
			//checking all orientations
			for(int i=0; i < 4; i++) {
				int index = getIndexForFit(tile);
				if(index > 0){
					isPossible = true; 
					return(isPossible);
				}
				else {
					tile.rotate();
				}
			}

			return(isPossible);
		}
	}

	//NON REQD methods

	public void printy() {
		for(int i=0; i < board.size(); i++) {
			board.get(i).printer();
			System.out.println();	
		}
	}
}



public class NumberTile{

	private int[] arr = new int[4];

	public NumberTile(int[] arr) {
		// copy over
		for(int i=0; i < 4; i++) {
			this.arr[i] = arr[i];
		}
	}

	public int getLeft() {
		return(this.arr[0]);
	}

	public int getRight() {
		return(this.arr[2]);
	}

	public void rotate() {

		int len = this.arr.length;
		// System.out.println(len);
		int[] newarr = new int[len];
		// copying the elements over
		for(int i=0; i < len; i++) {
			newarr[i] = this.arr[i];
		}
		// rotating the elements
		/* Rotation can be defined as swapping each elements with the next one
		*/
		for(int i=0; i < len-1; i++) {
			this.arr[i+1] = newarr[i];
		}

		// for the last element
		this.arr[0] = newarr[newarr.length-1];
	}

	public void printer() {
		// System.out.println(this.arr.length);
		for(int i=0; i < this.arr.length; i++) {
			System.out.print(this.arr[i]);
		}
	}


}

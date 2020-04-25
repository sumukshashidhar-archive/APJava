import java.util.ArrayList;



class SomeVars {
	
	private int ints = 0; 


	public SomeVars(int[] arr) {
		
		//taking some arrays and doing stuff
		
		this.ints = arr[0];
		
	}

	public int returnints() {
		
		//returns ints

		return(this.ints);

	}

}






public class test {

	public static void main(String[] args) {
		

		int[] arr = {1, 2,3, 4, 5, 6};
		SomeVars ob = new SomeVars(arr);
		int news = ob.returnints(); 
		System.out.println(news);
	
	}
}

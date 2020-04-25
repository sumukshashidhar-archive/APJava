import java.util.ArrayList;

class test2 {


	public static void main(String[] args) {

		ArrayList<someVars> objects= new ArrayList<someVars>();

		int[] arr = {1, 2, 3, 4};
		someVars ob = new someVars(arr);
		int a = ob.ret();

		objects.add(ob);
		

		System.out.println(objects.get(0).ret());


	}



}


class someVars{


	private int ints;


	public someVars(int[] arr) {


		this.ints = arr[0];

	}

	public int ret() {

		return(this.ints);

	}



}

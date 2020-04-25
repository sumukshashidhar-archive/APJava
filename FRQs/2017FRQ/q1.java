import java.util.*;
public class q1 {


	public static void main(String[] args) {
		System.out.println(new Digits(7).isStrictlyIncreasing());
		System.out.println();
		System.out.println();
		System.out.println(new Digits(1356).isStrictlyIncreasing());
		System.out.println();
		System.out.println();
		System.out.println(new Digits(1336).isStrictlyIncreasing());
		System.out.println();
		System.out.println();
		System.out.println(new Digits(1536).isStrictlyIncreasing());
		System.out.println();
		System.out.println();
		System.out.println(new Digits(65310).isStrictlyIncreasing());
	}

}


public class Digits {

	private ArrayList<Integer> digitList = new ArrayList<Integer>();


	public Digits(int num) {
		if(num == 0) {
			this.digitList.add(num);
		}
		while(num > 0) {
			int single = num%10;
			num = (int)num/10; 
			this.digitList.add(single);
		}
		Collections.reverse(this.digitList);
	}

	public boolean isStrictlyIncreasing() {
		boolean hasIncreased = true;
		int prevDigit = 0; 
		for(int digit: this.digitList) {
			// System.out.print(digit);
			if(digit > prevDigit) {
				// System.out.println(digit);
				hasIncreased = true;
				prevDigit = digit; 
			}
			else {
				hasIncreased = false;
				break;
			}
		}
		if(hasIncreased == true) {
			return true;
		}
		else {
			return false;
		}
	}

	public void main(String[] args) {
		boolean isTrue = new Digits(7).isStrictlyIncreasing();
		System.out.println(isTrue);
	}
}
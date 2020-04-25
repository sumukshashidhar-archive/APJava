import java.util.ArrayList;
class q1 {


	public static void main(String[] args) {
		System.out.println(new Digits(7).isStrictlyIncreasing());
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
				this.digitList.add(single)
			}
		}

		public boolean isStrictlyIncreasing() {
			boolean hasIncreased = true;
			int prevDigit = 0; 
			for(int digit: digitList) {
				if(digit > prevDigit) {
					hasIncreased = true;
					prevDigit = digit; 
				}
				else {
					hasIncreased = false;
				}
			}
			if(hasIncreased == true) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
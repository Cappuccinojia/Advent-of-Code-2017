public class InverseCaptcha {
	
	public String inverseCaptcha(String number) {
		String doublenNumber = number + number;
		String[] numberString = doublenNumber.split("");
		int sum = 0;
		for (int i=0; i<((numberString.length)/2); i++) {
			if (numberString[i+1].equals(numberString[i])) {
				sum = sum + Integer.parseInt(numberString[i]);
			}
		}
		return Integer.toString(sum);
	}
	

}

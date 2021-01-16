public class Palindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n" + "Enter a string: ");
		
		String str = input.next().toLowerCase();
		int left = 0;
		int right = str.length() - 1;
		
		while (str.charAt(left) == str.charAt(right) && left < right) {
			left++;
			right--;
		}

		System.out.println ((left < right)? str + " is NOT a palindrome.": str +  " is a palindrome.");
		
	}
}

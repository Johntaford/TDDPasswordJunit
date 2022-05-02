import java.util.ArrayList;
import java.util.Scanner;

public class PasswordsandUnitTest {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
		}
		

	}
	public static void pwrdList () {
		ArrayList<String> list = new ArrayList<>();
		
		passwordList(list,"Asdfghjk"); 
		passwordList(list,"asdfghjk"); 
		passwordList(list,"Asdfghjklzxcvbnm"); 
		passwordList(list,"Asd"); 
		passwordList(list,"Asdf ghjk"); 
		passwordList(list,"Asdfghjk6"); 
		passwordList(list,"AsdfghjkY1"); 
		passwordList(list,"Asdfghjk1"); 
		passwordList(list,"admin"); 
		passwordList(list,"mod"); 
		passwordList(list,"admin"); 
		passwordList(list,"mod"); 
		passwordList(list,"AsdfghjkY1"); 
		passwordList(list,"Asdfghjklz2Y");
		System.out.println(list); 
	}
	private static void passwordList(ArrayList<String> list1, String string) {
		if (Password(string) == true && list1.contains(string)==false) {
			list1.add(string);
		} else if  ((string.equalsIgnoreCase(("mod")) || string.equalsIgnoreCase("admin")) && (list1.contains("mod")== false)) {
			list1.add(string);
		} else if ((string.equalsIgnoreCase(("mod")) || string.equalsIgnoreCase("admin")) && (list1.contains("admin")== false)) {
			list1.add(string);
		} else {
			System.out.println("Inlavid password");
		}
		
	}
	private static boolean Password(String x) {
		int vowelCount = 0;

		if (x.contains("1") || x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5")
				|| x.contains("7") || x.contains("8") || x.contains("9") || x.contains("0")) {

		} else {
			System.out.println("Invalid entry. Password must contain at least one number.");
			return false;
		}

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == 'A' || x.charAt(i) == 'E' || x.charAt(i) == 'I' || x.charAt(i) == 'O'
					|| x.charAt(i) == 'U' || x.charAt(i) == 'Y') {
				vowelCount++;
			}
		}
		if (vowelCount >= 2) {

		} else {
		System.out.println("Invalid entry. Password has to have 2 uppercase vowels.");
			return false;
		}

		if (x.length() < 7 || x.length() > 12) {
		System.out.println("Invalid entry. Password has to be 7-12 characters in length.");
			return false;
		} else if (x.contains("6")) {
		System.out.println("Invalid entry. Password has the number 6.");
			return false;
		} else if (x.contains(" ")) {
		System.out.println("Invalid entry. Password has a space.");
			return false;
		} else {
			return true;
		}
	}
	public static void main1(String[] args) {
		pwrdList(); 
	}
}
	
	



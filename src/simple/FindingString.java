package simple;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingString {

	public static void main(String[] args) {

		FindingString f = new FindingString();
		f.FindingStingArray();

	}

	//create a method
	public void FindingStingArray() {
		Scanner scan = new Scanner(System.in);
		
		//ask user if he/she want to continue
		System.out.println("Do you want to add list? Y/N");
		String anwser = scan.nextLine();
		ArrayList<String> mylist = new ArrayList<String>();
		//loop while user want to add
		while (anwser.equalsIgnoreCase("y")) {
			Scanner scan2 = new Scanner(System.in);
			//insert email
			System.out.println("Please insert the eamil");
			String email = scan2.nextLine();
			//validate if the user insert valid emails
			String email_pattern = "^[_A-Za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			Pattern pattern = Pattern.compile(email_pattern);
			Matcher matcher = pattern.matcher(email);
			//if user enter right email add to the list
			if (matcher.matches()) {
				mylist.add(email);

			} else {
				System.out.println("Email isn't valid");

			}
			//

			System.out.println("Do you want to add list? Y/N");
			anwser = scan2.nextLine();
		}
		//print the list of email has been entered
		System.out.println("These are the list of emails: ");
		for (String x : mylist) {
			System.out.println(x);

		}
			//search if email we looking for is exist
		System.out.println("Enserrt your search");
		String n = scan.next();

		boolean isexist = mylist.contains(n);
		if (isexist) {
			System.out.println("is exist");
		} else {
			System.out.println("it isnot exitst");
		}

	}
}
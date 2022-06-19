import java.util.Scanner;
import java.util.Random;

 class ITSupport {
	String employeeName;
	String LastName;
	ITSupport(String n,String ln){
		employeeName=n;
		LastName=ln;
	}
	
public static void main(String[] args) {
	
	
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter your name");
	
	String name1=s.nextLine();
	
	System.out.println("enter your last name");
	
	String name2=s.nextLine();
	
	System.out.println("please enter the department from the following");
	System.out.println("1.Technical");
	System.out.println("2.Admin");
	System.out.println("3.Human Resource");
	System.out.println("4.Legal");
	
	//password code starts here
	
	
	//ends here
	
	int input=s.nextInt();
	switch(input)
	{
	case 1:
		System.out.println("Dear "+name1+" your genrated crednetials are as follows");
		System.out.println("Email:"+name1+name2+"@Technical.abc.com");
		System.out.println("Password; "+generatePassword(8));
		break;
	case 2:
		System.out.println("Dear "+name1+" your genrated crednetials are as follows");
		System.out.println("Email:"+name1+name2+"@Admin.abc.com");
		System.out.println("Password; "+generatePassword(8));
		break;
	case 3:
		System.out.println("Dear "+name1+" your genrated crednetials are as follows");
		System.out.println("Email:"+name1+name2+"@HumanResource.abc.com");
		System.out.println("Password; "+generatePassword(8));
		break;
	case 4:
		System.out.println("Dear "+name1+" your genrated crednetials are as follows");
		System.out.println("Email:"+name1+name2+"@Legal.abc.com");
		System.out.println("Password; "+generatePassword(8));
		break;
	}
}

	  private static char[] generatePassword(int length) {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = numbers+capitalCaseLetters+lowerCaseLetters  + specialCharacters ;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = numbers.charAt(random.nextInt(numbers.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[3] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	
	}

}

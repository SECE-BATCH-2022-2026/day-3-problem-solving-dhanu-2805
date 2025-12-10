import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(UserMainCode.phoneValidation(str));	
		
	}
}

class UserMainCode {
	public static boolean phoneValidation(String str){
		return str.matches("[1-9]{2}[0-9]{8}");
	}
}
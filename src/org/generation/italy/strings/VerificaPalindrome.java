package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		String parola="";
		String parolaReverse="";
		char c;
		Scanner scan=new Scanner(System.in);
		System.out.print("inserire una parola ");
		
		parola=scan.nextLine();
		for(int i=parola.length()-1;i>=0;i--) {
			c=parola.charAt(i);
			parolaReverse+=c;
		}
		System.out.println("la parola inserita al contrario è: "+parolaReverse+" ed è lunga "+parolaReverse.length()+" caratteri");
		if(parola.equals(parolaReverse)) {
			System.out.print("complimenti. La parola inserita è palindroma");
		}else {
			System.out.print("mi dispiace ma la parola non è palindroma");
		}
scan.close();
}
}

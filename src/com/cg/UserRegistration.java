package com.cg;
import java.util.*;
import java.util.regex.*;

//UC2
public class UserRegistration {
	public static void FirstNameValidation(String input) {
		String regex = "^[A-Z]+[a-z A-Z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			System.out.println("First Name Validated");
		}
		else {
			System.out.println("First Name Not Validated");
		}
	}
	
	public static void LastNameValidation(String input) {
		String regex = "^[A-Z]+[a-z A-Z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			System.out.println("Last Name Validated");
		}
		else {
			System.out.println("Last Name Not Validated");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration!!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First Name : ");
		String firstName = sc.nextLine();
		FirstNameValidation(firstName);
		
		System.out.println("Enter The Last Name : ");
		String lastName = sc.nextLine();
		LastNameValidation(lastName);
	}
}

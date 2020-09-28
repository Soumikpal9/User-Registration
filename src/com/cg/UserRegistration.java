package com.cg;
import java.util.*;
import java.util.regex.*;

//UC6
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
	
	public static void EmailValidation(String input) {
		String regex = "^[A-Z 0-9]+[A-Z 0-9 +._-]*@[A-Z 0-9]+.[A-Z]+[A-Z .]*$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			System.out.println("Email Address Validated");
		}
		else {
			System.out.println("Email Address Not Validated");
		}
	}
	
	public static void MobileNumberValidation(String input) {
		String regex = "^[0-9]{2}\s[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			System.out.println("Mobile Number Validated");
		}
		else {
			System.out.println("Mobile Number Not Validated");
		}
	}
	
	public static void PasswordRule1Validation(String input) {
		String regex = "[A-Z a-z 0-9]{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			System.out.println("Password Rule 1 Validated");
		}
		else {
			System.out.println("Password Rule 1 Not Validated");
		}
	}
	
	public static void PasswordRule2Validation(String input) {
		String regex = "^[A-Z a-z]*(?=.*[A-Z])[A-Z a-z 0-9]*${8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			System.out.println("Password Rule 2 Validated");
		}
		else {
			System.out.println("Password Rule 2 Not Validated");
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
		
		System.out.println("Enter The Email Address : ");
		String email = sc.nextLine();
		EmailValidation(email);
		
		System.out.println("Enter The Mobile Number : ");
		String mobile = sc.nextLine();
		MobileNumberValidation(mobile);
		
		System.out.println("Enter The Password");
		String password = sc.nextLine();
		PasswordRule1Validation(password);
		PasswordRule2Validation(password);
	}
}

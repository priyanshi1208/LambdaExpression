package com.magic.Registeration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLambaExpression {


    public static boolean regexCheck(String reg, String input){
        Pattern compile = Pattern.compile(reg);
        Matcher matcher = compile.matcher(input);
        boolean matches=matcher.matches();
        return matches;
    }
    static IRegexLambaExpression firstName=(details)->{
        String reg="[A-Z][a-z]{3,}";
       return regexCheck(reg,details);
    };
    static IRegexLambaExpression lastName=(details)->{
        String reg="[A-Z][a-z]{3,}";
        return regexCheck(reg,details);
    };
    static IRegexLambaExpression Email=(details)->{
        String reg="^[a-za-z0-9-\\+]+(\\.[a-za-z0-9-]+)*@"+"[a-za-z0-9-]+(\\.[a-za-z0-9]+)*(\\.[a-za-z]{2,})$";
        return regexCheck(reg,details);
    };
    static IRegexLambaExpression phoneNumber=(details)->{
        String reg="[\\d]{2}[ ]?[\\d]{10}";
        return regexCheck(reg,details);
    };
    static IRegexLambaExpression password=(details)->{
        String reg="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&*-+=()]).{8,}$";
        return regexCheck(reg,details);
    };
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstname,lastname,email,phonenumber,Password;
        do {
            System.out.println("Enter First Name");
            firstname = scanner.next();
            firstName.validatePersonDetails(firstname);
        }while(!firstName.validatePersonDetails(firstname));
        do {
            System.out.println("Enter Last Name");
            lastname = scanner.next();
            lastName.validatePersonDetails(lastname);
        }while(!lastName.validatePersonDetails(lastname));
        do {
            System.out.println("Enter Email");
            email = scanner.next();
            Email.validatePersonDetails(email);
        }while(!Email.validatePersonDetails(email));
        do {
            System.out.println("Enter Phone Number");
            phonenumber = scanner.next();
            phoneNumber.validatePersonDetails(phonenumber);
        }while(!phoneNumber.validatePersonDetails(phonenumber));
        do {
            System.out.println("Enter Password");
            Password = scanner.next();
            password.validatePersonDetails(Password);
        }while(!password.validatePersonDetails(Password));
        System.out.println("You have Registered Successfully!");
    }
}



package com.pluralsight;
import java.util.Scanner;
public class calculator1 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Please enter the loan amount: ");
        double loanAmount = scanner.nextDouble();
     System.out.print("Please enter the loan term in years: ");
        int yearlyLoanTerm = scanner.nextInt();
     System.out.print("Please enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

     int monthlyLoanTerm = yearlyLoanTerm *12;
     double monthlyInterestRate = annualInterestRate /100 /12;
     double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, - monthlyLoanTerm));

     System.out.printf("Your total monthly payment is: $%.2f", monthlyPayment);
     System.out.printf("Your total interest over the life of the loan is: " );
    }
}

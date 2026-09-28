package LoanShark;

public class main {
    // public static void main(String[] args) {
    //    System.out.println("Welcome to the Interest Calculator!");
    //    loan loan1 = new loan(1000, 10, 1, 12);
    //    System.out.println("Loan 1: Simple Interest: $" + loan1.calculateSimpleInterest());
    //     System.out.println("Loan 1 Total Repayment: $" + loan1.calculateTotalRepayment()); 

    //    System.out.println("Welcome to the Interest Calculator!");
    //    loan loan2 = new loan(5000, 6.75, 12.5, 4);
    //    System.out.println("Loan 2: Simple Interest: $" + loan2.calculateSimpleInterest());
    //    System.out.println("Loan 2 Total Repayment: $" + loan2.calculateTotalRepayment());  
       
         // TODO: write for all customers 
         public static void main(String[] args){
            Customer c = Customer.generateRandom();
            System.out.println("--- Customer " + 1 + " ---");
            System.out.println("Name: " + c.getName());
            System.out.println("Credit Score: " + c.getCreditScore());
            System.out.println("Loan: $" + String.format("%.2f", c.getLoanAmount()));
            System.out.println("Defaulted? " + c.determineDefault());
            System.out.println();
         }


    }



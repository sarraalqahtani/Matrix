import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out .println("Welcome to Java program to calcualte multiplicate of two matrices");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter details of first matrix");
        System.out.print("Please Enter number of rows: ");
        int row1 = scnr.nextInt();
        System.out.print("Please Enter number of columns: ");
        int column1 = scnr.nextInt();
        System.out.println();
        System.out.println("Enter first matrix elements");
        Matrix first = new Matrix(row1, column1);
        first.read();
        System.out.println("Please enter details of second matrix");
        System.out.print("Please Enter number of rows: ");
        int row2 = scnr.nextInt();
        System.out.print("Please Enter number of columns: ");
        int column2 = scnr.nextInt();
        System.out.println();
        System.out.println("Enter second matrix elements");
        Matrix second = new Matrix(row2, column2);
        second.read();
        Matrix product = first.multiply(second);
        System.out.println("first matrix: ");
        first.print();
        System.out.println("second matrix: ");
        second.print();
        System.out.println("product of two matrices is:"); product.print();
        Matrix sum = first.multiply(second);
        System.out.println("addition of two matrices is:"); sum.print();
        scnr.close();


    }


}

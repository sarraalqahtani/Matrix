import java.util.Scanner;

/* * Java class to represent a Matrix.
It uses a two dimensional array to * represent a Matrix. */
class Matrix {
    private int rows;
    private int columns;
    private int[][] data;

    public Matrix(int row, int column) {
        this.rows = row;
        this.columns = column;
        data = new int[rows][columns];
    }

    public Matrix(int[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    //read() fills matrix from data entered by user in console
     public void read() {

    }

    //multiply() multiplies the matrix in this current object with the matrix from other object and returns the product matrix
    //consider the 2 conditions of multiplying 2 matrices
    public Matrix multiply(Matrix other)
    {

    }

    //sum() adds the matrix in this current object with the matrix from other object and returns the resulted matrix
    public Matrix sum(Matrix other)
    {

    }

    //prints the matrix in a proper format
    public void print() {

    }
}
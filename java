Implement command line calculator
 package com.company;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int d;
        System.out.println("which performance are perform + - * / ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println("enter the first integer");
        int b = sc.nextInt();
        System.out.println("enter the second integer");
        int c = sc.nextInt();

        switch (a)
        {
            case "+":
                d = b+c;
                System.out.println(d);
                break;
            case "-":
                d =b-c;
                System.out.println(d);
                break;
            case "*":
                d =b*c;
                System.out.println(d);
                break;
            case "/":
                d =b/c;
                System.out.println(d);
                break;
            default:
                System.out.println("choose right oprator");
        }
    }
}






To print Fibonacci series.
package com.company;
import java.util.Scanner;

public class m_fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to print the fibonacci series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i =1;i<=n;i++) {
            c = a+b;
            System.out.print(" " +c );
             a=b;
             b=c;

        }

    }
}







Define a class Array with following member

package com.company;
class Array {
    public int[] Data = new int[0];

    public void array() {
        int[] Data = new int[10];
    }

    public void array(int size) {
        int[] Data = new int[size];
    }

    public void array(int[] Data) {

        for (int i = 0; i < Data.length; i++) {
            System.out.println(Data[i]);
        }
    }

    public void Reverse_an_array(int[] Data) {

        int swap;
        int l = Data.length;
        int a = Math.floorDiv(Data.length, 2);
        System.out.println("this is an array ");
        for (int i = 0; i < Data.length; i++) {
            System.out.println(Data[i]);
        }
        System.out.println("this is an reverse order");
        for (int i = 0; i < a; i++) {
            swap = Data[i];
            Data[i] = Data[l - i - 1];
            Data[l - i - 1] = swap;

        }
        for (int Element : Data) {
            System.out.println(Element);
        }
    }
        public void Maximum_of_array(int[] Data) {

            int max = Integer.MIN_VALUE;
            for (int e : Data) {
                if (max < e) {
                    max = e;
                }
            }
            System.out.println("the maximum number of array is " + max);
        }
        public void Averge_Of_Array(int[] Data){
            float sum = 0;
            for (int i=0;i<Data.length;i++){
                sum = sum+Data[i];
            }
            float avg = sum/ Data.length;

            System.out.println("The averge of an array is "+avg);
        }
        public void Sorting_of_Array(int[] Data){
            int swap;
            int l =  Math.floorDiv(Data.length,2);
            for (int i=0;i< Data.length-1;i++){
                for (int j = i+1;j< Data.length;j++) {
                    if (Data[i] > Data[j]) {
                        swap = Data[i];
                        Data[i] = Data[j];
                        Data[j] = swap;
                    }
                }
            }
            System.out.println("the array is sorted");
            for (int e: Data){
                System.out.println(e);
            }
        }
        public int Searching_of_Array(int[]Data,int number)
        {
            int change=0;
            for (int i=0;i< Data.length;i++)
            {
                if (number==Data[i])
                {
                    System.out.println("the number is found on index "+i);
                    change =1;

                }

            }
             if(change==0){
            System.out.println("the number is not found");
            change = -1;
        }
            return change;
        }
    }
public class LAb2 {

            public static void main(String[] args) {
                com.company.Array sc = new com.company.Array();
                int[] Data = {1, 20, 30, 15, 4};
                sc.array(5);
                sc.array(Data);
                sc.Reverse_an_array(Data);
                sc.Maximum_of_array(Data);
                sc.Averge_Of_Array(Data);
                sc.Sorting_of_Array(Data);
                sc.Searching_of_Array(Data,4);
                System.out.println("the size of an array is: "+Data.length);

        }
    }
    
    
    
    
    
    Define a class Matrix with following
  package com.company;

import java.util.Scanner;

class Matrix {
    int row, colum;
    float[][] mat;
    float[][] mat1;
    float[][] mat2;
    float[][] mat3;


    Matrix(int[][] a) {

    }

    Matrix() {

    }

    Matrix(int row, int colum) {

    }


    public void Read_of_Matrix(int row, int colum) {
        mat = new float[row][colum];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix element row is: " + row + " colum is: " + colum);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.printf("Enter the matrix Element %d %d: ", i, j);
                int sc1 = sc.nextInt();
                mat[i][j] = sc1;
            }
        }

        System.out.println();
        System.out.println("this is a matrix you enter");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(mat[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void Transpose_of_Matrix(int row, int colum) {
        mat1 = new float[colum][row];
        System.out.println("this is a Transpose matrix");

        for (int j = 0; j < colum; j++) {
            for (int i = 0; i < row; i++) {
                mat1[j][i] = mat[i][j];
            }
        }
        for (int i = 0; i < colum; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(mat1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public void matrixMultiplication(int row2, int colum2) {
        Read_of_Matrix(3,3);

        mat2 = new float[row2][colum2];
        mat3 = new float[row2][colum2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix element: " + row2 + " By " + colum2);
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < colum2; j++) {
                System.out.printf("Enter the matrix Element %d %d: ", i, j);
                int sc1 = sc.nextInt();
                mat2[i][j] = sc1;
            }
        }


        System.out.println("multiplication of two matrix");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < colum2; j++) {
                mat3[i][j] = mat[i][j] * mat2[i][j];
            }
        }
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < colum2; j++) {
                System.out.print(mat3[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public void maximum_of_array(int row,int colum) {

        Read_of_Matrix(3, 3);

        float max = mat[0][0];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < colum; j++)
            {
                if (max < mat[i][j])
                {
                    max = mat[i][j];
                }
            }
        }
        System.out.println("MAX: "+max);
    }

    public void average_of_array(int row,int colum){
        Read_of_Matrix(3,3);
        float avg = 0;
        for (int i=0;i<row;i++)
        {
            for (int j = 0;j<colum;j++)
            {
                avg = avg+mat[i][j];
            }
        }
        float avj = avg/(row*colum);
        System.out.println("average of matrix is: " +avj);
    }
}
public class lab3 {
    public static void main(String[] args) {
        Matrix obj = new Matrix(3, 3);
        obj.Read_of_Matrix(3,3);
        obj.Transpose_of_Matrix(3,3);
        obj.matrixMultiplication(3, 3);
        obj.maximum_of_array(3,3);
        obj.average_of_array(3,3);
    }
}





Write a program to demonstrate usage of different methods of Wrapper class

package com.company;
public class lab4 {
    public static void main(String[] args) {
        //primitive to wrapper class
       int a = 20;
       Integer i = Integer.valueOf(a);      //boxing
        Integer j = a;                      // autoboxing

        System.out.println("boxing: " + i + ", autoboxing: " + j);

        //wrapper to primitive

        Integer a1 = 3;
        int i1 = a1.intValue();        //unboxing
        int j1 = a1;                   //autounboxing
        System.out.println("unboxing: " +i1+ ", autounboxing: " +j1);
        char c='a';
        Character charobj=c;
        char charvalue=charobj;
        System.out.println("Character object: "+charobj);
        System.out.println("char value: "+charvalue);

        float f=50.0F;
        Float floatobj=f;
        float floatvalue=floatobj;
        System.out.println("Float object: "+floatobj);
        System.out.println("float value: "+floatvalue);
    }
}




Write a program to demonstrate usage of String and StringBuffer class

package com.company;
import java.util.Locale;
public class lab5 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("ADITOFADIT");
        StringBuffer g = new StringBuffer("ADITOFADIT");
        int p = s.capacity();
        int q = s.length();
        String r = String.valueOf(s.append("ADIT"));
        char e = s.charAt(3);
        StringBuffer t = s.insert(14,"mitul");
        StringBuffer y = s.reverse();
        StringBuffer x = new StringBuffer("ADIT");
        StringBuffer u = x.delete(1,3);
        StringBuffer i = g.replace(0,4,"mitul");
        String f = "345";
        String h = "adit";
        System.out.println(r);
        System.out.println(p);
        System.out.println(q);
        System.out.println(e);
        System.out.println(t);
        System.out.println(y);
        System.out.println(u);
        System.out.println(i);
        System.out.println(f.toString());
        System.out.println(x.lastIndexOf("T"));
        System.out.println(h.toUpperCase(Locale.ROOT));
    }
}





Define a class Cipher with following data
 package com.company;
class Cipher{
    String plainText;
    int key;
    public Cipher(String plaintext, int key){
        this.plainText = plaintext;
        this.key = key;
    }
    public String Encryption(){
        char[] ch = plainText.toCharArray();
        char[] ch1 = plainText.toCharArray();
        System.out.println("plainText: " +ch);
        for (int i=0;i<plainText.length();i++){
            ch1[i] = (char) (ch[i]+key);
        }
        String st = String.valueOf(ch1);
        System.out.println("Encryption: " +st);
        return st;
    }
    public String Decryption(){
        char[] ch2 = plainText.toCharArray();
        char[] ch1 = plainText.toCharArray();
        for (int i=0;i<plainText.length();i++){
            ch2[i] = (char) (ch1[i]-key);
        }

        String st1 = String.valueOf(ch1);
        System.out.println("Decryption: "+st1);
        return st1;
    }
}
public class lab6 {
    public static void main(String[] args) {
        Cipher s = new Cipher("GCET",3);
        s.Encryption();
        s.Decryption();
    }
}






Create a class BankAccount that has Depositor name , Acc_no, Acc_type, Balance as Data Members and void createAcc() . void Deposit(), void withdraw() and void BalanceInquiry as Member Function. When a new Account is created assign next serial no as account number. Account number starts from 1.

package com.company;
import java.util.Scanner;
class  BankAccount{
    String[]Depositor_name = new String[100];
    int [] Acc_no = new int[100];
    String[] Acc_type = new String[100];
    int[] Balance = new int[100];
    int count = 0;

    public void createAcc(){
        count+=1;
        System.out.println("Enter the name of Depositor");
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your account type");
        Scanner sc1 = new Scanner(System.in);
        Acc_no[count] = count;
        Balance[count] = 0;
        Depositor_name[count] = sc.nextLine();
        Acc_type[count] = sc1.nextLine();
        System.out.println("The Depositor_name is: " +Depositor_name[count]);
        System.out.println("The Acc_no is: " +Acc_no[count]);
        System.out.println("The Acc_type is: " +Acc_type[count]);
        System.out.println("your balance is: " +Balance[count]);
        System.out.println("your account is created successfully");
    }

    public void Deposit(int rupiees,int accountno){
        count = accountno;
        Balance[count] = Balance[count]+rupiees;
    }
    public void withdraw(int rupiees,int accountno){
        count = accountno;
        Balance[count] = Balance[count]-rupiees;
    }
    public void BalanceInquiry(int accountno){
        count = accountno;
        System.out.println("your name is: " +Depositor_name[count]);
        System.out.println("your account no is: " +Acc_no[count]);
        System.out.println("your balance is: " +Balance[count]);
        System.out.println("your Account type is: " +Acc_type[count]);
    }
}
public class lab7 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.createAcc();
        obj.createAcc();
        obj.Deposit(500,1);
        obj.Deposit(500,2);
        obj.withdraw(300,2);
        obj.BalanceInquiry(2);
    }
}




Create a class time that has hour, minute and second as data members. Create a parameterized constructor to initialize Time Objects. Create a member Function Time Sum (Time, Time) to sum two time objects.

package com.company;
import static com.company.Time.timesum;

class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static void timesum(Time t, Time q) {
        int totalhr, totalmin, totalsec;
        totalhr = t.hour + q.hour;
        totalmin = t.minute + q.minute;
        totalsec = t.second + q.second;

        if (totalsec > 60){
            totalsec = totalsec - 60;
            totalmin += 1;
        }
        if (totalmin > 60){
            totalmin = totalmin - 60;
            totalhr += 1;
        }
        System.out.println(" " +totalhr + " : " +totalmin +" : " +totalsec);
    }
}
public class lab8 {
    public static void main(String[] args) {
        Time t = new Time(12,55,56);
        Time q = new Time(12,55,56);
        timesum(t,q);
    }
}





Define a class with the Name, Basic salary and dearness allowance as data members.Calculate and print the Name, Basic salary(yearly), dearness allowance and tax deduced at source(TDS) and net salary, where TDS is charged on gross salary which is basic salary + dearness allowance and TDS rate is as per following table. Gross Salary TDS Rs. 100000 and below NIL Above Rs. 100000 10% on excess over 100000 DA is 74% of Basic Salary for all. Use appropriate member function.

package com.company;
class TDSCAL
{
    private String Name;
    private int Salary;
    private int dearnessAllowance;

    public TDSCAL(String name, int salary)
    {
        Name = name;
        Salary = salary;
        this.dearnessAllowance = ((74*salary)/100);
    }
    public void PrintName()
    {
        System.out.println("Name: " +Name);
    }
    public void PrintSalary()
    {
        System.out.println("Salary: " +Salary);
    }
    public void DearnessAllowance()
    {
        System.out.println("dearnessAllowance: " +dearnessAllowance);
    }
    public void Finalsalary()
    {
        double TDS = 0;
        if ((this.Salary+this.dearnessAllowance) <= 100000)
        {
            TDS = 0;
        }
        else if ((this.Salary+this.dearnessAllowance) > 100000)
        {
            TDS = (((this.Salary+this.dearnessAllowance) - 100000) * 0.1);
        }
        System.out.println("TDS: " +TDS);
        System.out.println("Net Salary: " +((this.Salary+this.dearnessAllowance)-TDS));
    }
}
public class lab9 {
    public static void main(String[] args) {
        TDSCAL obj = new TDSCAL(“Shubham",1000000);
        obj.PrintName();
        obj.DearnessAllowance();
        obj.PrintSalary();
        obj.Finalsalary();
    }
}





 Class Cricket having data members name, age and member methods display() and setdata(). class Match inherits Cricket and has data members no_of_odi, no_of_test. Create an array of 5 objects of class Match. Provide all the required data through command line and display the information.

package com.company;
import java.util.Scanner;
class Cricket{
    String Name;
    int age;

    public void display(){
        System.out.println("The cricketer Name is: "+Name+ " and age is: " +age);
    }
    public void SetData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        Name = sc.nextLine();
        System.out.println("Enter the age");
        age = sc.nextInt();
    }
}
class Match extends Cricket{
    int no_of_odi;
    int no_of_test;

    public void setData(){
        super.SetData();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("test");
        no_of_test = sc1.nextInt();
        System.out.println("odi");
        no_of_odi = sc1.nextInt();
    }

    public void Display(){
        super.display();
        System.out.println("And the no_of_odi is: "+no_of_odi+ " and the no_of_test is: " +no_of_test);
        System.out.println();
    }
}
public class lab10 {
    public static void main(String[] args) {
    Match obj[] = new Match[5];
    for (int i=0;i<5;i++){
        obj[i]=new Match();
        obj[i].setData();
    }
    for (int i=0;i<5;i++){
            obj[i].Display();
        }
}}




Define a class Cipher with following data
package com.company;
abstract class Cipher1
{
    String plainText;
    int key;

    Cipher1(String plainText,int key)
    {
    }
    abstract  String Encryption();
    abstract String Decryption();
}
class Substitution_Cipher1 extends Cipher1
{
    Substitution_Cipher1(String plainText, int key)
    {
        super(plainText, key);
        this.plainText = plainText;
        this.key = key;
    }
    public String Encryption()
    {
        this.plainText = plainText;
        char[] plaintext = plainText.toCharArray();
        char[] plaintext1 = plainText.toCharArray();
        System.out.println("Encryption: ");
        System.out.println(plaintext);
        for (int i=0;i<plaintext.length;i++)
        {
            if(plaintext[i] == 'a')
            {
               plaintext1[i] = 'q';
            }
            else if (plaintext[i] == 'b')
            {
                plaintext1[i] = 'a';
            }
            else if (plaintext[i] == 'c')
            {
                plaintext1[i] = 'z';
            }
            else if (plaintext[i] == 'd')
            {
                plaintext1[i] = 'w';
            }
            else if (plaintext[i] == 'e')
            {
                plaintext1[i] = 's';
            }
            else if (plaintext[i] == 'f')
            {
                plaintext1[i] = 'x';
            }
            else if (plaintext[i] == 'g')
            {
                plaintext1[i] = 'e';
            }
            else if (plaintext[i] == 'h')
            {
                plaintext1[i] = 'd';
            }
            else if (plaintext[i] == 'i')
            {
                plaintext1[i] = 'c';
            }else if (plaintext[i] == 'j')
            {
                plaintext1[i] = 'r';
            }
            else if (plaintext[i] == 'k')
            {
                plaintext1[i] = 'f';
            }
            else if (plaintext[i] == 'l')
            {
                plaintext1[i] = 'v';
            }else if (plaintext[i] == 'm')
            {
                plaintext1[i] = 't';
            }else if (plaintext[i] == 'n')
            {
                plaintext1[i] = 'g';
            }else if (plaintext[i] == 'o')
            {
                plaintext1[i] = 'b';
            }else if (plaintext[i] == 'p')
            {
                plaintext1[i] = 'y';
            }
            else if (plaintext[i] == 'q')
            {
                plaintext1[i] = 'h';
            }
            else if (plaintext[i] == 'r')
            {
                plaintext1[i] = 'n';
            }else if (plaintext[i] == 's')
            {
                plaintext1[i] = 'u';
            }else if (plaintext[i] == 't')
            {
                plaintext1[i] = 'j';
            }else if (plaintext[i] == 'u')
            {
                plaintext1[i] = 'm';
            }else if (plaintext[i] == 'v')
            {
                plaintext1[i] = 'i';
            }
            else if (plaintext[i] == 'w')
            {
                plaintext1[i] = 'k';
            }
            else if (plaintext[i] == 'x')
            {
                plaintext1[i] = 'o';
            }
            else if (plaintext[i] == 'y')
            {
                plaintext1[i] = 'l';
            }else if (plaintext[i] == 'z')
            {
                plaintext1[i] = 'p';
            }
        }
        String st = String.valueOf(plaintext1);
        System.out.println(st);
        return st;
    }
    public String Decryption(){
    this.plainText = plainText;
        char[] plaintext2 = plainText.toCharArray();
        char[] plaintext1 = Encryption().toCharArray();
        System.out.println("Decryption: ");
        System.out.println(plaintext1);
        for (int i=0;i<plaintext1.length;i++)
        {
            if(plaintext1[i] == 'q')
            {
                plaintext2[i] = 'a';
            }
            else if (plaintext1[i] == 'a')
            {
                plaintext2[i] = 'b';
            }
            else if (plaintext1[i] == 'z')
            {
                plaintext2[i] = 'c';
            }
            else if (plaintext1[i] == 'w')
            {
                plaintext2[i] = 'd';
            }
            else if (plaintext1[i] == 's')
            {
                plaintext2[i] = 'e';
            }
            else if (plaintext1[i] == 'x')
            {
                plaintext2[i] = 'f';
            }
            else if (plaintext1[i] == 'e')
            {
                plaintext2[i] = 'g';
            }
            else if (plaintext1[i] == 'd')
            {
                plaintext2[i] = 'h';
            }
            else if (plaintext1[i] == 'c')
            {
                plaintext2[i] = 'i';
            }else if (plaintext1[i] == 'r')
            {
                plaintext2[i] = 'j';
            }
            else if (plaintext1[i] == 'f')
            {
                plaintext2[i] = 'k';
            }
            else if (plaintext1[i] == 'v')
            {
                plaintext2[i] = 'l';
            }else if (plaintext1[i] == 't')
            {
                plaintext2[i] = 'm';
            }else if (plaintext1[i] == 'g')
            {
                plaintext2[i] = 'n';
            }else if (plaintext1[i] == 'b')
            {
                plaintext2[i] = 'o';
            }else if (plaintext1[i] == 'y')
            {
                plaintext2[i] = 'p';
            }
            else if (plaintext1[i] == 'h')
            {
                plaintext2[i] = 'q';
            }
            else if (plaintext1[i] == 'n')
            {
                plaintext2[i] = 'r';
            }else if (plaintext1[i] == 'u')
            {
                plaintext2[i] = 's';
            }else if (plaintext1[i] == 'j')
            {
                plaintext2[i] = 't';
            }else if (plaintext1[i] == 'm')
            {
                plaintext2[i] = 'u';
            }else if (plaintext1[i] == 'i')
            {
                plaintext2[i] = 'v';
            }
            else if (plaintext1[i] == 'k')
            {
                plaintext2[i] = 'w';
            }
            else if (plaintext1[i] == 'o')
            {
                plaintext2[i] = 'x';
            }
            else if (plaintext1[i] == 'l')
            {
                plaintext2[i] = 'y';
            }else if (plaintext1[i] == 'p')
            {
                plaintext2[i] = 'z';
            }
        }
        String st2 = String.valueOf(plaintext2);
        System.out.println(st2);
        return plainText;
    }
}
public class lab11 {
    public static void main(String[] args) {
        Substitution_Cipher1 obj = new Substitution_Cipher1("gcet",10);
        obj.Encryption();
        obj.Decryption();
    }
}






Declare an interface called Property containing a method computePrice to compute and return the price. The interface is to be implemented by following two classes i) Bungalow and ii) Flat
package com.company;
import java.util.Scanner;
interface property {
    public double computePrise();
}
class flat implements property {
    double f = 0;
    float ad_cost = 200000.0f;
    double c_cost = 500;
    public double computePrise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many area in sq.feet you want to buy:");
        float ca = sc.nextFloat();
        f = ca * c_cost;
        f = f + ad_cost;
        return f;
    }
}
class bungalow implements property {
    public double computePrise() {
        double f = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many sq.feet area you want to by for bungalow:");
        float ca = sc.nextFloat();
        System.out.print("How many sq.feet land area you want to by for bungalow:");
        float la = sc.nextFloat();
        f = (ca * 500) + (la * 400) + (la * 200);
        return f;
    }
}

public class lab12 {
    public static void main(String[] args) {
        double p;
        flat a = new flat();
        bungalow a1 = new bungalow();
        p = a.computePrise();
        p = a1.computePrise();
        System.out.println("flat price is:" + p);
        System.out.println("bungalow price is:" + p);
    }
}





Define following classes and interfaces
package com.company;
interface GeometricShape {
    public void describe();
}
interface TwoDShape extends GeometricShape {
    public double area();
}
interface ThreeDShape extends GeometricShape {
    public double volume();
}
class Cone implements ThreeDShape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double volume() {
        return ((3.14 * radius * radius * height) / 3);
    }
    public void describe() {
        System.out.println("volume of cone is:" + volume());
    }
}

class Rectangle implements TwoDShape {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return (width * height);
    }

    public double perimeter() {
        return (2 * (width + height));
    }

    public void describe() {
        System.out.println("area of rectangle is:" + area() + " and perimeter of rectangle is:" + perimeter());
    }
}
class Sphere implements ThreeDShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }
    public double volume() {
        return ((1.33 * 3.14 * radius * radius * radius));
    }

    public void describe() {
        System.out.println("volume of sphere is:" + volume());
    }
}

public class lab13 {
    public static void main(String args[]) {
        Cone c = new Cone(3, 3);
        c.describe();
        Rectangle r = new Rectangle(6, 10);
        r.describe();
        Sphere s = new Sphere(7);
        s.describe();
    }
}




Define two nested classes: Processor and RAM inside the outer class: CPU with following data members
package com.company;
import java.util.Scanner;
class cpu
{
    double price;
    class Processor
    {
        double cores;
        String manufacturer;
        Processor(String s,double core)
        {
            manufacturer=s;
            cores=core;
        }
        double getCache()
        {
            System.out.println("how many cache do u needed ? ");
            double d;
            Scanner s=new Scanner(System.in);
            d=s.nextDouble();
            return d;
        }
        void displayProcesorDetail()
        {
            System.out.println("Cache :"+getCache());
            System.out.println("Manufacture :"+manufacturer);
            System.out.println("Core :"+cores);
        }
    }
    protected class ram
    {
        double memory;
        String manufacturer;
        Double clockSpeed;
        ram(String s,double c)
        {
            manufacturer=s;
            memory=c;
        }
        double getClockSpeed()
        {
            System.out.println("how many speed of ram do u want ");
            Scanner s=new Scanner(System.in);
            clockSpeed=s.nextDouble();
            return clockSpeed;
        }
        void displayRAMDetail()
        {
            System.out.println("clockspeed :"+getClockSpeed());
            System.out.println("Manufacture : "+manufacturer);
            System.out.println("memory :"+memory);
        }
    }
}

public class lab14 {
    public static void main(String args[])
    {
        cpu a=new cpu();
        cpu.Processor p=a.new Processor("HP",8);
        cpu a1=new cpu();
        cpu.ram r=a1.new ram("DELL",4500);
        p.displayProcesorDetail();
        r.displayRAMDetail();
    }
}




Write a program to demonstrate usage of static inner class, local inner class and anonymous inner class

Static inner class
package com.company;
class Outer_Demo {
    int num;
    private class Inner_Demo {
        public void print() {
            System.out.println("This is an inner class");
        }
    }
    void display_Inner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}
public class lab15 {
    public static void main(String[] args) {
        Outer_Demo outer = new Outer_Demo();
        outer.display_Inner();
    }
}



Local Inner Class
package com.company;
class Local_In {
    private String s = "GCET";
    void display() {
        class Local {
            void msg() {
                System.out.println(s);
            }        }
        Local l = new Local();
        l.msg();
    }     }
public class lab16 {
    public static void main(String args[]) {
        Local_In obj = new Local_In();
        obj.display();
    }     
}






Annonymous Inner Class
package com.company;
abstract class Person{
    abstract void car();   }
public class lab17 {
    public static void main(String args[]){
        Person p=new Person(){
            void car(){
                System.out.println("Rolls Royce");
            }
        };
        p.car();
    }
}





Write a program for creating a Bank class, which is used to manage the bank account of customers. Class has two methods, Deposit () and withdraw (). Deposit method display old balance and new balance after depositing the specified amount. Withdrew method display old balance and new balance after withdrawing. If balance is not enough to withdraw the money, it throws ArithmeticException and if balance is less than 500rs after withdrawing then it throw custom exception, NotEnoughMoneyException.

package com.company;
import java.util.Scanner;
class BankLimit {
    int balance = 5000;
    int d;
    int w, curr_balance;
    int n_balance;
    Scanner c = new Scanner(System.in);
    void deposite() {
        System.out.println("Enter amount: ");
        d = c.nextInt();
        System.out.println("ammount you have deposited is: " + d);
        n_balance = balance + d;
        System.out.println("Old balance is: " + balance);
        System.out.println("New balance is: " + n_balance);
        balance = n_balance;
    }
    void withdraw() {
        System.out.println("Enter amount: ");
        w = c.nextInt();
        System.out.println("Amount you have withdrawn is: " + w);
        try {
            n_balance = balance - w;
        }
        catch (ArithmeticException e) {
            System.out.println("Insufficient Balance");
        }
        System.out.println("Old balance is: " + balance);
        System.out.println("New balance is: " + n_balance);
        balance = n_balance;
    }
}
public class lab18 {
    public static void main(String args[]) {
        BankLimit b1 = new BankLimit();
        b1.withdraw();
        b1.deposite();
        b1.withdraw();
    }
}






Write a complete program for calculation average of n +ve integer numbers of Array A
package com.company;
import java.util.Scanner;
public class AvgNumExc {
    public static void main(String args[]) {
        try {
            Scanner c = new Scanner(System.in);
            int n;
            System.out.println("Enter size of array: ");
            n = c.nextInt();
            int a[];
            a = new int[n];
            int i,sum=0;
            System.out.println("Enter array elements: ");
            for (i = 0; i < n; i++) {
                a[i] = c.nextInt();
                if (a[i] <= 0) {
                    throw new ArithmeticException("Enter positive number: ");
                }else
                    sum+=a[i];
            }
            System.out.println("Avg is "+sum/n);
        }
        catch (ArithmeticException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}





Write a program to find prime number in given range using both method of multithreading. Also run the same program using executor framework.
package com.company;
import java.util.Scanner;
class part1 extends Thread {
    public  void run()
    {
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        for (i = 1; i <= 50; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0)
                    counter ++;
            }
            if (counter == 2)
                primeNumbers = primeNumbers + i + " ";
        }
        System.out.println("\nPrime numbers from 0 to 100 : \n"+ primeNumbers);
        System.out.println();
    }
}
public class lab19 {
    public static void main(String args[])
    {
        part1 t1 = new part1();
        Thread t = new Thread(t1);
        Scanner sc = new Scanner(System.in);
        t.start();
    }
}





Assume one class Queue that defines queue of fix size says 15

package com.company;
class Q {
    int n;
    boolean valueSet = false;
    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}
class Producer implements Runnable {
    Q q;
    Producer(Q q) {
        this.q = q;
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY + 1);
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
class Consumer implements Runnable {
    Q q;
    Consumer(Q q) {
        this.q = q;
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY - 1);
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while (true) {
            q.get();
        }
    }
}
public class lab20 {
    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }
}




 Write a program to demostrate user of ArrayList, LinkedList ,LinkedHashMap, TreeMap and HashSet Class. And also implement CRUD operation without database connection using Collection API.
ArrayList:
package com.company;
import java.util.ArrayList;
import java.util.Iterator;
public class lab21 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("MITUL");
        list.add("OM");
        list.add("SHUBHAM");
        list.add("DHRUV");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}




Linkedlist:
package com.company;
import java.util.Iterator;
import java.util.LinkedList;
public class lab22 {
    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("MITUL");
        al.add("om");
        al.add("SHUBHAM");
        al.add("DhRUV");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}




LinkedHashMap: 
package com.company;
import java.util.LinkedHashMap;
import java.util.Map;

public class lab23 {
    public static void main(String args[]){
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
        hm.put(100,"ADIT");
        hm.put(101,"CVMU");
        hm.put(102,"GCET");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}




Tree Map:
package com.company;
import java.util.Map;
import java.util.TreeMap;
public class lab34 {
    public static void main(String args[]) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "ADIT");
        map.put(102, "CVMU");
        map.put(101, "GCET");
        map.put(103, "MBIT");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}




Write a program to Sort Array,ArrayList,String,List,Map and Set
Array:
package com.company;
import java.util.Arrays;
public class lab24 {
    public static void main(String[] args) {
        int[] array = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 };
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}





ArrayList:
package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class lab25 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("mitul");
        list.add("om");
        list.add("abhi");
        list.add("shubham");
        list.add("dhruv");
        list.add("tirth");
        list.add("raj");
        list.add("shiv");
        System.out.println("Before Sorting: " + list);
        Collections.sort(list);
        System.out.println("After Sorting: " + list);
    }

}







String
package com.company;
import java.util.Arrays;
// sort string
public class lab30 {
        public static String sortString(String inputString)
        {
            // Converting input string to character array
            char tempArray[] = inputString.toCharArray();

            // Sorting temp array using
            Arrays.sort(tempArray);

            // Returning new sorted string
            return new String(tempArray);
        }

        public static void main(String[] args)
        {
            // Custom string as input
            String inputString = "mitulpatel";
            String outputString = sortString(inputString);

            // Print and display commands

            // Input string
            System.out.println("Input String : " + inputString);
            // Output string
            System.out.println("Output String : "
                    + outputString);
        }
}




List:
package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lab30_1 {
    public static void main(String[] args)
    {
//returns a list view
        List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");
        List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}




Map:
package com.company;
import java.util.*;
public class lab30_2 {
    public static void main(String[] args) {
        // create a map and store elements to it
        LinkedHashMap<String, String> capitals = new LinkedHashMap();
        capitals.put("Nepal", "Kathmandu");
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washington");
        capitals.put("England", "London");
        capitals.put("Australia", "Canberra");
        // call the sortMap() method to sort the map
        Map<String, String> result = sortMap(capitals);

        for (Map.Entry entry : result.entrySet()) {
            System.out.print("Key: " + entry.getKey());
            System.out.println(" Value: " + entry.getValue());
        }
    }
    public static LinkedHashMap sortMap(LinkedHashMap map) {
        List<Map.Entry<String, String>> capitalList = new LinkedList<>(map.entrySet());

        // call the sort() method of Collections
        Collections.sort(capitalList, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));
        // create a new map
        LinkedHashMap<String, String> result = new LinkedHashMap();
        // get entry from list to the map
        for (Map.Entry<String, String> entry : capitalList) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}





Set:
package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public class lab30_3 {
    public static void main(String args[])
    {
        // Creating a HashSet
        HashSet<String> set = new HashSet<String>();

        // Adding elements into HashSet using add()
        set.add("mitul");
        set.add("practice");
        set.add("contribute");
        set.add("ide");

        System.out.println("Original HashSet: "
                + set);

        // Sorting HashSet using List
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);

        // Print the sorted elements of the HashSet
        System.out.println("HashSet elements "
                + "in sorted order "
                + "using List: "
                + list);
    }
}





Write a programme to count occurrence of a given words in a file.

package com.company;
public class lab26 {
    public static void main(String args[]) {
        String string = "I am an engineering student pursuing IT engineering from ADIT college which is an engineering college";
        String word = "college";
        String temp[] = string.split(" ");
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (word.equals(temp[i]))
                count++;
        }
        System.out.println("The string is: " + string);
        System.out.println("The word " + word + " occurs " + count + " times in the above string");
    }
}




 Write a program to print it self.
package com.company;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class lab32 {
    public static void main(String args[]) throws IOException {
        File fileName = new File("D:\\Sem 4\\java\\BRRead.java");
        FileInputStream inFile = new FileInputStream("D:\\Sem 4\\java\\BRRead.java");
        int fileLength = (int) fileName.length();
        byte Bytes[] = new byte[fileLength];
        System.out.println("File size is: " + inFile.read(Bytes));
        String file1 = new String(Bytes);
        System.out.println("File content is:\n" + file1);
        inFile.close();
    }
}





// Use a BufferedReader to read characters from the console. 
import java.io.*; 
 
class BRRead { 
  public static void main(String args[]) throws IOException 
  { 
    char c; 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.println("Enter characters, 'q' to quit.");
    // read characters 
c = (char) br.read(); 
      System.out.println(c); 
    } while(c != 'q'); 
  } 
}

•  Write a program to display list of all the files of given directory
package com.company;
import java.io.File;
public class lab31 {
    static void RecursivePrint(File[] arr, int level)
    {
        // for-each loop for main directory files
        for (File f : arr) {
            // tabs for internal levels
            for (int i = 0; i < level; i++)
                System.out.print("\t");

            if (f.isFile())
                System.out.println(f.getName());
else if (f.isDirectory()) {
                System.out.println("[" + f.getName() + "]");

                // recursion for sub-directories
                RecursivePrint(f.listFiles(), level + 1);
            }
        }
    }
    // Driver Method
    public static void main(String[] args)
    {
        String maindirpath
                = "D:\\coding\\JAVA\\adit1\\src\\com\\company";
        File maindir = new File(maindirpath);
        if (maindir.exists() && maindir.isDirectory()) {
            File arr[] = maindir.listFiles();
            System.out.println(
                    "**********************************************");
            System.out.println(
                    "Files from main directory : " + maindir);
            System.out.println(
                    "**********************************************");
            // Calling recursive method
            RecursivePrint(arr, 0);
        }
    }}

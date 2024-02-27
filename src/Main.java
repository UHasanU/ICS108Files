import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        /* TODO: Declare any necessary variables here. */
        PrintWriter writer =new PrintWriter("report.txt");
        scnr=new Scanner(new File("StudentInfo.tsv"));
        int total1=0;
        int total2=0;
        int total3=0;
        int Average1;
        char grade;
        double Average2;
        double Average3;
        double Average4;
        int Num1;
        int Num2;
        int Num3;
        String String1;
        String String2;
        double Students=0;
        /* TODO: Read a file name from the user and read the tsv file here. */
        while(scnr.hasNext()){
            String1=scnr.next();
            String2=scnr.next();
            Num1=scnr.nextInt();
            total1=total1+Num1;
            Num2=scnr.nextInt();
            total2=total2+Num2;
            Num3=scnr.nextInt();
            total3=total3+Num3;
            grade = scnr.next().charAt(0);
            Average1=(Num1+Num2+Num3)/3;
            if (Average1>=90){
                writer.println(String1+"\t" +String2+"\t"+Num1+"\t"+Num2+"\t"+Num3+"\t"+"A");
            }
            else if (Average1>=80){
                writer.println(String1+"\t" +String2+"\t"+Num1+"\t"+Num2+"\t"+Num3+"\t"+"B");
            }
            else if (Average1>=70){
                writer.println(String1+"\t" +String2+"\t"+Num1+"\t"+Num2+"\t"+Num3+"\t"+"C");
            }
            else if (Average1>=60){
                writer.println(String1+"\t" +String2+"\t"+Num1+"\t"+Num2+"\t"+Num3+"\t"+"D");
            }
            else{
                writer.println(String1+"\t" +String2+"\t"+Num1+"\t"+Num2+"\t"+Num3+"\t"+"F");
            }
            Students=Students+1;
        }

        /* TODO: Compute student grades and exam averages, then output results to a text file here. */
        Average2=total1/Students;
        Average3=total2/Students;
        Average4=total3/Students;
        writer.printf("\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", Average2, Average3, Average4);

        writer.close();
    }
}
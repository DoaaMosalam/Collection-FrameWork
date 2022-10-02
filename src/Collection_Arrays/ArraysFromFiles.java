package Collection_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ArraysFromFiles {
    public static void printF(double[][] array){
        for (int row=0;row<array.length;row++){
            for (int column=0;column<array[row].length;column++){
                System.out.printf("{%.2f}-",array[row][column]);
            }
            System.out.println();
        }
    }
    public static void printArray(double[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.printf("{%.2f}-",arr[i]);
        }
        System.out.println("");
    }

    public static double[]toDoubleArray(String line){
        String[] pieces = line.split("[ ]");
        double[] array = new double[pieces.length];
        for (int i=0;i<array.length;i++){
            array[i]=Double.parseDouble(pieces[i]);
        }
        return array;
    }

    public static double getMaximum(double[]array){
        double max = array[0];
        for (double value:array) {
            if (value>max)
                max=value;
        }
        return max;
    }
    public static double sum(double[]r){
        double total=0;
       for (int i=0;i<r.length;i++){
           total+=r[i];
       }
       return total;
    }

    public static double[][]loadData(String filename,int row)throws FileNotFoundException{
        Scanner input = new Scanner(new File("E:\\Coders Programming\\Java\\Videos\\Arrays(FadelK)\\"+filename));
//        String line = input.nextLine();
        double[][] sales = new double[row][];
        for (int i=0;i<sales.length;i++){
            //sales[i]=toDoubleArray(line);
            sales[i]=toDoubleArray(input.nextLine());
        }
        return sales;
    }

    public static double[][]loadData(String filename,int row,int start)throws FileNotFoundException{
        Scanner input = new Scanner(new File("E:\\Coders Programming\\Java\\Videos\\Arrays(FadelK)\\"+filename));
        for (int i = 0; i < start; i++) {
            System.out.println(input.nextLine()); }
        double[][] sales = new double[row][];
        for (int i=0;i<sales.length;i++){
            sales[i]=toDoubleArray(input.nextLine());
        }
        return sales;
    }

    public static void printMAxandSum(double[][] array){
        System.out.println("Sum   |" + " Max   |" + " Data");
        System.out.println("-----------------------------------------------");
        for (int i=0;i<array.length;i++){
            System.out.printf("%.2f|", sum(array[i]));
            System.out.printf(" %.2f |", getMaximum(array[i]));
            printF(array);
            System.out.println(" ");
        }
    }

    public static double totalOfTotal(double[][]array){
        double total=0;
        for (int i=0;i<array.length;i++){
            total+=sum(array[i]);
        }
        return total;
    }

 public static double sumColumn(double[][]arra,int numColumn){
        double total=0;
     for (int i = 0; i <arra.length ; i++) {
         if (numColumn<arra[i].length){
             total+=arra[i][numColumn];
         }
     }
     return total;
 }


    public static void display()throws FileNotFoundException {
        double[][] days  = loadData("oneYear.txt",100);
      //  double[][]days = loadData("oneYear.txt",20,3);
        printF(days);
//        System.out.println("----------------------------------------------");
//        printMAxandSum(days);
//        System.out.println("---------------------------------------------------");
//        System.out.println("Grand Total of days is: " + totalOfTotal(days));

        //System.out.printf("Total Sum column Number is%.2f",sumColumn(days,2));

        //// Sum Total column in array.
//        System.out.println("-----------------------------------------------------------");
//        double[] total = new double[days.length];
//        for (int i=0;i<total.length;i++){
//            total[i] = sumColumn(days,i);
//        }
//           printF(days);
        System.out.println("--------------------------------------------------------");

    }


}
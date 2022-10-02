package Collection_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Arraycollection {
    public static double[]toDoubleArray(String line){
        String[]pieces = line.split("[ ]");
        double[] sales = new double[pieces.length];
        for (int i = 0; i <sales.length ; i++) {
            sales[i]= Double.parseDouble(pieces[i]);
        }
        return sales;
    }
    public static double[][]loadData(String filename,int row) throws FileNotFoundException{
        Scanner input = new Scanner(new File("E:\\Coders Programming\\Java\\Videos\\FadelK\\Arrays(FadelK)\\"+filename));
        double[][]data = new double[row][];
        for (int i = 0; i <data.length ; i++) {
            data[i]=toDoubleArray(input.nextLine());
        }
        return data;
    }

    public static double[] loadDataArray(String filename, int row)throws FileNotFoundException{
        Scanner input = new Scanner(new File("E:\\Coders Programming\\Java\\Videos\\FadelK\\Arrays(FadelK)\\"+filename));
        String line =input.nextLine();
        double [] data = new double[row];
        for (int i = 0; i <data.length ; i++) {
            data=toDoubleArray(line);
        }
        return data;
    }

    public static void displayMessage(double[]array,String description){
        System.out.println(description);
        for (double value:array) {
            System.out.println(value);
        }
    }
    public static void displayMessage(int[]array,String description){
        System.out.println(description);
        for (double value:array) {
            System.out.println(value);
        }
    }

    public static void showInfo()throws FileNotFoundException {
//Collection Array in Two Dimension
        double[][] days = loadData("01.txt",6);
        double[][]years = loadData("0neYear.txt",6);
        ArraysFromFiles.printF(days);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Sort Array is: ");

        int i;
        for ( i=0;i<days.length;i++) {
            Arrays.sort(days[i]);
            System.out.println("-------------------------------------------------");
//        }
            ArraysFromFiles.printF(days);

//        for (;i<days.length;i++){
            double location = Arrays.binarySearch(days[i], 44.28);
            if (location >= 0) {
                System.out.printf("Found element 44.28 in %.2f location %d in Row\n", location,i);

            } else {
                System.out.println("Not found elemnet");
            }

        }
        System.out.println("-----------------------------------------------");
//Collection Array in one Dimension
//        double[] sales = loadDataArray("01.txt",1);
//        double[]year = loadDataArray("oneYear.txt",sales.length);
//        ArraysFromFiles.printArray(sales);
//        System.out.println("---------------------------------------------------");
//        Arrays.sort(sales);
//        System.out.println("Sort double Array:  ");
//        for (double values : sales)
//            System.out.printf("%.1f ", values);
//        System.out.println("----------------------------------------------------------");
//
//        double location = Arrays.binarySearch(sales,55.15);
//        if (location>=0){
//            System.out.printf("Found element 55.15 in %.2f location\n",location);
//        }else {
//            System.out.println("Not found elemnet");
//        }
//        System.out.println("-------------------------------------------------------------");
//
//        boolean b =Arrays.equals(sales,year);
//        System.out.println(Arrays.equals(sales,year));
//       // System.out.printf("Sale Array %s Year array\n",(b?"==":"!="));
//        System.out.println("-------------------------------------------------------------");
////        System.arraycopy(sales,0,year,0,year.length);
////        displayMessage(sales,"Original sale array ");
////        displayMessage(year,"Copy year array");
////        System.out.println("-----------------------------------------------------");
//        double[] data = Arrays.copyOf(sales,5);
//        System.out.print("Copy of Array Sales is: " );
//        ArraysFromFiles.printArray(data);
//        System.out.println("------------------------------------------------------------------------------------------");
//
//        double[] info = Arrays.copyOfRange(sales,0,5);
//        System.out.print("Copy Of Range Sales Array is: " );
//        ArraysFromFiles.printArray(info);
//
//        //-------------------------------------------------------------------------------------------------------------
//
    }
}

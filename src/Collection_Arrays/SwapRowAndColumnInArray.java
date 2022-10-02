package Collection_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SwapRowAndColumnInArray {
    public static void printI(int[][] array){
        for (int row=0; row<array.length;row++){
            for (int column=0;column<array[row].length;column++){
                System.out.printf("{%d}",array[row][column]);
            }
            System.out.println();
        }
    }
    public static void print(int[]array){
        for (int i=0;i<array.length;i++){
            System.out.printf("{%.2d}",array[i]);
        }
    }

    public static int[]toIntArray(String line){
        String[] pieces = line.split("[ ]");
        int[] array = new int[pieces.length];
        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(pieces[i]);
        }
        return array;
    }

    public static int[][]loadIntData(String filename,int row)throws FileNotFoundException{
        Scanner input = new Scanner(new File("E:\\Coders Programming\\Java\\Videos\\Arrays(FadelK)\\"+filename));
        int[][] sales = new int[row][];
        for (int i=0;i<sales.length;i++){
            //sales[i]=toDoubleArray(line);
            sales[i]=toIntArray(input.nextLine());
        }
        return sales;
    }

    public static void swap(int[][]array,int row1,int row2){
        int[]swap = array[0];  //=85 40 36
        array[row1] = array[row2];     //data[0]= 22 73 50 79 43 23 16
        array[row2]=swap;// data[1]=85 40 36\
        printI(array);
    }

    public static int[][] transpose(int[][]x){
        printI(x);
        System.out.println("---------------------------------");
        int[][] transpose = new int[x[0].length][x.length];
        //      row col      row col
//       transpose[0][0] = data[0][0];
//        transpose[1][0] = data[0][1];
//        transpose[2][0] = data[0][2];

        // الصف الثاني
        transpose[0][0] = x[0][0];
        for (int y=0;y<x.length;y++) {
            for (int i = 0; i < transpose.length; i++) { // يعتبر دا لوب للصف او العمود المتغير
                transpose[i][y] = x[y][i];
            }
        }

       return transpose;
    }

    public static void printF(int[][] array){
        if (array!=null) {
            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array[row].length; column++) {
                    System.out.printf("{%d}", array[row][column]);
                }
                System.out.println();
            }
        }else {
            System.out.println("Null Matrix");
        }
    }

    public static int[][] trans(int[][]array){
        boolean theSameLength=true;
        int len = array[0].length;
        for (int i=0;i<array.length;i++){
            if (len!=array[i].length){
                theSameLength=false;
                break;
            }
        }
        if (theSameLength) {
            int[][] trans = new int[array[0].length][array.length];
            trans[0][0] = array[0][0];
            for (int k = 0; k < array.length; k++) {
                for (int i = 0; i < trans.length; i++) {
                    trans[i][k] = array[k][i];
                }
            }
            return trans;
        }else return null;
    }


    public static void showDetails()throws FileNotFoundException{
        int[][] data = loadIntData("oneYearInt.txt",7);
        printI(data);
        System.out.println("---------------------------------");
        //swap(data,0,6);

        int[][] x= {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}};
        printI(transpose(x));

        System.out.println("--------------------------------------");
        printF(trans(data));


    }

}

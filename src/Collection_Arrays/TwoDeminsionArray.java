package Collection_Arrays;

public class TwoDeminsionArray {

    public static void print(int[][] array){
        for (int row=0;row<array.length;row++){
            for (int column=0;column<array[row].length;column++){
                System.out.print(array[row][column] + "-");
            }
            System.out.println("");
        }
    }

    public static void sum(int[][]x){
        int total=0;
        for (int i=0;i<x[0].length;i++){
            total+=x[0][i];
        }
        System.out.println("Sum row 0 is:"+ total);
    }

    public static void totalSum(int[][]arr){
        int total=0;
        for (int row=0;row<arr.length;row++){
            for (int column=0;column<arr[row].length;column++){
                total+=arr[row][column];
            }
        }
        System.out.println("\n Total Sum Array is: "+ total);
    }

    public static void SumRowAlone(int[][]arr){
        int total=0;
        int grandTotal=0;
        for (int row=0;row<arr.length;row++){
            for (int column=0;column<arr[row].length;column++){
                System.out.print(arr[row][column]+ "-");
                total+=arr[row][column];
            }
            grandTotal+=total;
            System.out.printf("\t{Tota is %d}\n",total);
        }
        System.out.println("Grand Total Array is: " + grandTotal);
    }

    public static void sumFirstRow(int[][]arr){
        int total=0;
        for (int row=0;row<arr.length;row++){
                total+=arr[row][0];
        }
        System.out.println(total);
    }
    public static void display() {
        //column      0  1  2
        int[][] x = {{1, 2, 3},//row 0
                     {4, 5, 6},//row 1
                     {10,53,876,213,97,123}, //row 2
                     {453,7123,27812,88,678,23,126} }; // row3
        print(x);
//        System.out.println();
//        sum(x);
//       // totalSum(x);
//        SumRowAlone(x);
       // sumFirstRow(x);
    }

}

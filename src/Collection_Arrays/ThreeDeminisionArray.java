package Collection_Arrays;

public class ThreeDeminisionArray {
    public static void ThreeArray() {


        int[][][] all = {
                //2DArray name is x
                {
                        {1, 2, 3, 4},
                        {9, 8, 7, 6, 2}
                },
                //2DArray name is y
                {
                        {5, 6, 7, 8, 9, 10},
                        {11, 12, 13, 15, 16}
                },
                //2DArray name is z
                {
                        {13, 545, 123, 75, 13},
                        {2, 5, 1, 0, 0, 8, 81, 95}
                }
        };
       for (int k=0;k<all.length;k++){
           for (int j=0;j<all[k].length;j++){
               for (int i=0;i<all[k][j].length;i++){
                   System.out.print(all[k][j][i] +"--");
               }
               System.out.println();
           }
           System.out.println("-------------------------------------------");
       }


    }


}

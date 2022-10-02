package Collection_Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class IntegerArrays {
    public static void solution(int[] list){

        for (int i = 0; i <list.length ; i++) {
            System.out.println(i+"\t"+list[i]);
        }
    }

    public static double average(int[]array) {
        int total=0;
        for (int i=0;i<array.length;i++){
            total= (int) (total+array[i]);

        }
        return total/array.length;
    }


    public static boolean contains(int[] x ,int f){
        boolean r = false;
        for (int i = 0; i <x.length ; i++) {
            if (f==x[i]){
                r=true;
                break;
            }
        }
        return r;
    }

    public static int findIndex(int[] x ,int num){
        int r =-1;
        for (int i=0;i<x.length;i++){
            if (num==x[i]){
                r=i;
                break;
            }
        }
        return r;

    }


    public static int find(int[]x,int f){
        int location = Arrays.binarySearch(x,33);
        if (location>=0)
            System.out.println("find numer in array index: "+location);
        return location;
//        int k=0;
//        for (int i = 0; i <x.length ; i++) {
//            if (x[i]==f){
//                k=i;
//                break;
//            }
//        }
//        return k;

    }

    public static int resitElement(int[]arrays,int index){
        for (int i = 0; i <arrays.length ; i++) {
            if (arrays[i]==index){
                return i;
            }
            else {
                i+=1;
            }
        }
        return -1;
    }


   public static boolean equalArray(int[]array) {
       boolean b=false;
       int[] y = new int[array.length];
       for (int i = 0; i < y.length; i++) {
           y[i] = array[i];
           if (y[i] == array[i]) {
               return true;

           }

       }
       return b;
   }

   public static int[] append(int[]array,int p){
      int[] y = new int[array.length+1];
      for (int i=0;i<array.length;i++){
          y[i] = array[i];
      }
      y[y.length-1] = p;
      return y;
   }

   public static int[] preAppend(int[]array,int num){
        int[] y = new int[array.length+1];
       for (int i = 0; i <array.length ; i++) {
           y[i] = array[i];

       }
       y[0] = num;
       return y;
   }

   public static int[] insert(int[]x,int num,int location){

       int [] y = new int[x.length+1];
       for (int i =0;i<location;i++){
           y[i] = x[i];

       }
       y[location] = num;
       for (int i =location;i<x.length;i++){
           y[i+1] = x[i];
       }
       return y;
   }

   public static int[] deleteOneValue(int []x,int num) {
      int i;
      int []y = null;
      y = new int[x.length-1];
      for ( i =0;i<x.length;i++){
          if (num==x[i]) {
              break;
          }
          y[i]=x[i];
      }

      i++;
      for (;i<x.length;i++){
          y[i-1] = x[i];
      }
      return y;
   }

   public static boolean[] equal(int[]x,int[]y){
        boolean b = true;
       for (int i=0;i<y.length;i++){
           if (y[i]!=x[i]){
               b = false;
               break;
           }
       }
       return new boolean[]{b};
   }

   public static void swap(int[]x,int num1,int num2){
       System.out.println(Arrays.toString(x));
            //        a=4
            int t = x[num1];
//     a=4       b=6
            x[num1] = x[num2]; // a =6;
            x[num2] = t; //num2=4;


       for (int i=0;i<x.length;i++){
           System.out.printf("%d\t%d\n",i,x[i] );
       }
       System.out.printf("\nSwap number one and number two in array is: %d\t%d\n" ,x[num1] , x[num2]);

   }

  public static int getMinimum(int []x){
//        int lownumber=x[0];
//        for (int i=0;i<x.length;i++){
//            if (x[i]<lownumber){
//                lownumber=x[i];
//            }
//        }
//        return lownumber;

      int smallNumber = x[0];
      for (int i=0;i<x.length;i++){
          if (smallNumber>x[i]){
              smallNumber = x[i];
          }
      }
      return smallNumber;
  }
// find index small number in array.
  public static  int findSmallestIndex(int[]x,int start){
        int s = start;
        for (int i=start;i<x.length;i++){
            if (x[s]>x[i]){
                s=i;
            }
        }
        return s;
  }

  public static int findgreatestIndex(int[]x,int start){
        int greatest = start;
        for (int i=start;i<x.length;i++){
            if (x[i]>x[greatest]){
                greatest=i;
                }
        }
        return greatest;
  }
// Sort array ascending without collection sort.
  public static void sortAsc(int[]x){
        for (int i=0;i<x.length;i++){
            int smallInd = findSmallestIndex(x,i);
            swap(x,i,smallInd);
        }
  }

  public static void sortDesc(int[]x){
        for (int i=0;i<x.length;i++){
            int great = findgreatestIndex(x,i);
            swap(x,i,great);
        }
  }



    public static void dispalyMessage(int[]arrays,String decryption){
        System.out.println(decryption);
        for (int values: arrays) {
            System.out.println(values);
        }
    }

    public static void displaySolution(){

        int[] list = {33,44,66,22,55,99,77,88};
        int[] y = {100,200,300,400,500,600};

        System.out.println("List of Array is: ");
        solution(list);
        System.out.println("Average array is: " + average(list));


       // int p = 22;
        int p =123;
        System.out.println(p +" Exists= " + contains(list,p));
         find(list,33);
        System.out.println("number in array by index is: "+resitElement(list,44));

        System.out.println("equal array list ot y array: "+equalArray(list));

//// insert element at end array (append)
        System.out.println("append element at end Array"+ Arrays.toString(append(list, 1000)));
//// insert element at first array(pre append)
        System.out.println("Pre append element at first array"+ Arrays.toString(preAppend(list,11))
                            + Arrays.toString(append(list , 1000)));

        System.out.println("Insert element at array"+ Arrays.toString(insert(list,4000,3)));
        System.out.println(Arrays.toString(deleteOneValue(list,44)));

        System.out.println("equal two array " + Arrays.toString(equal(list,y)));
        swap(list,0,list.length-1);

        System.out.println("Minimum number in array is: " + getMinimum(list));

        //sortAsc(list);
        sortDesc(list);










//                  // or
//        //int[]y= new int[list.length];
//        System.arraycopy(list,0,y,0,list.length);
//        dispalyMessage(list, "Int Array");
//        dispalyMessage(y, "Int Array Copy");
//
//       boolean b=  Arrays.equals(list,y);
//        System.out.printf("\n\nint Array %s int Array Copy\n",(b?"==":"!=="));

////Insert element at end Array y.
//         y = new int[list.length];
//        for (int i = 0; i <list.length ; i++) {
//            y[i] = list[i];
//            y[y.length-1]=5;
//            System.out.print(y[i] +"|");
        }



}

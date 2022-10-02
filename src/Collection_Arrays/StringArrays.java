package Collection_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringArrays {
    public static void print(String[]s){
        for (int i = 0; i <s.length-1 ; i++) {
            System.out.print(s[i] + "-");
        }
        System.out.println(s[s.length-1]);
    }

    public static String longest(String[]x){
        int location =0;
        for (int i = 1; i <x.length ; i++) {
            if (x[location].length()<x[i].length()){
                location = i;

            }
        }
        return x[location];
    }

    public static void oneString(String[]x){
        String total="";
        for (int i =0;i<x.length;i++){
            total+=x[i] +" ";
        }
        System.out.println(total);
        System.out.println("----------------------------------------------------------------------");
    }

    public static String join(String[]words){
        String total="";
        for (int i = 0; i <words.length ; i++) {
            if (words[i].length()>0) {
                total += words[i] + " ";
            }
        }
        return total;
    }

   public static void split(String[]words){
        String covid ="Total   cases are based on aggregate counts of COVID-19 cases reported by state and territorial jurisdictions to the Centers for Disease Control and Prevention (CDC) since January 21, 2020," +
                " with the exception of persons repatriated to the United States from Wuhan," +
                " China, and Japan.   The numbers are confirmed and probable COVID-19 cases as reported by US states, U.S. " +
                "territories, New York City, and the District of Columbia from the previous day.";
       System.out.println("String text is: " + covid);
       System.out.println();
//Convert String to Array.
        words = covid.split("[,.() ]");
//       for (String text : words ) {
//           System.out.println(text);
//       }
       print(words);
       System.out.println("\nLength Array words is: "+ words.length);
       System.out.println();
//then return String Array to String without , . () -
       String total="";
       for (int i =0;i<words.length;i++){
           if (words[i].length()>0) {
               total += words[i] + " ";
           }
       }
       System.out.println("Total Array words in one String "+ total);
       words = total.split("[ ]");
       System.out.println(Arrays.toString(words));
       System.out.println("Length words Array after split " + words.length);
       System.out.println();
//// find longest word in Array words.
//      int location =0;
//      for (int i=1;i<words.length;i++){
//          if (words[location].length() < words[i].length()){
//              location = i;
//          }
//      }
//       System.out.println(words[location]);
       //// or method
       System.out.println(longest(words));

   }

    public static void StringArrays(){
//        String[]str = {"Abdul Rahman","Saleh","Fadel","Doaa Mosalam Youssef"};
//        System.out.print(">> ");
//        print(str);
//        System.out.println("\nLength Array is:"+ str.length);
//
//        System.out.println(longest(str));
//
//        oneString(str);
       // split(str);

        String covid ="Total   cases are based on aggregate counts of COVID-19 cases reported by state and territorial jurisdictions to the Centers for Disease Control and Prevention (CDC) since January 21, 2020," +
                " with the exception of persons repatriated to the United States from Wuhan," +
                " China, and Japan.   The numbers are confirmed and probable COVID-19 cases as reported by US states, U.S. " +
                "territories, New York City, and the District of Columbia from the previous day.";
       String[] piece = covid.split("[,.() ]");
       print(piece);
        System.out.println("\n"+piece.length);

        covid = join(piece);
        System.out.println(covid);
    }

    //                                a=4        b =6
    public static void swap(String[] x,int num1,int num2){
        String c = x[num1]; // c=4
        x[num1] = x[num2];  //num1 = 6
        x[num2] = c;     // num2 =4
        System.out.printf("\nSwap number one and number two in array is: %s\t%s\n" ,x[num1] , x[num2]);
    }


    public static String findsmallest(String[]x,int start){
        String s = x[start];
        for (int i=start;i<x.length;i++){
            if (s.compareTo(x[i])>0){
                s = x[i];
            }
        }
        return s;
    }

    public static int findsmallestIndex(String[]x,int start){
        int s = start;
        for (int i=start;i<x.length;i++){
            if (x[s].compareTo(x[i])>0){
                s=i;
            }
        }
        return s;
    }

    public static int findgreatestIndex(String[]x,int start){
        int s = start;
        for (int i=start;i<x.length;i++){
            if (x[s].compareTo(x[i])<0){
                s=i;
            }
        }
        return s;
    }

    public static void SortAsc(String[]x){

       for (int i=0;i<x.length;i++){
           int small = findsmallestIndex(x,i);
           swap(x,i,small);
       }
    }
    public static void Sortdec(String[]x){
        for (int i=0;i<x.length;i++){
            int bigest = findgreatestIndex(x,i);
            swap(x,i,bigest);
        }
    }

    public static void fixCase(String[]x){
        for (int i=0;i<x.length;i++){
            String n = x[i].toLowerCase();
            String first = n.charAt(0)+"";
            first = first.toUpperCase();
            x[i] = first+n.substring(1);
            System.out.print(x[i] + "-");
        }

    }
    public static void display(){
        String[] names={"doAa","Ahmed","AbdulRahmman","Fatma","Mosalam","Amr"};
        print(names);
        System.out.print("Fix First Case Upper Case  " );
        fixCase(names);
        System.out.println();
//        swap(names,0,1);
       // print(names);

        System.out.println("Find samllest String in array:" + findsmallest(names,0));
//
        System.out.println("Find Samllest index String in array" + findsmallestIndex( names,0));
       System.out.println("Find Greast index String in array" + findgreatestIndex(names,0));
//        print(names);
//         SortAsc(names);
//         print(names);
//        System.out.println("-------------------------------------------------");
//         Sortdec(names);
//         print(names);

       ////----------------------------------------------------------------------------------------------

//        //System.out.println("Type your text here: ");
//        //  Scanner input = new Scanner(System.in);
//        Scanner input = null;
//        try {
//            input = new Scanner(new File("C:\\Users\\Queen\\Desktop\\abc.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        String str = input.nextLine();
//        System.out.println(">>>"+str+" >>>");
//        String[]words = str.split("[.,'() ]");
//        System.out.println();
//        print(words);
//        System.out.println("\n"+words.length);
//        str=join(words);
//        System.out.println(str);
//        words=str.split("[ ]");
//        System.out.println(words.length);

    }


}

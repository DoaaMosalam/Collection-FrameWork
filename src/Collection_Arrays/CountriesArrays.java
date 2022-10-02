package Collection_Arrays;

import java.util.Arrays;

public class CountriesArrays {

    public static void print(String[]c){
        for (int counter=0;counter<c.length;counter++){
         //   System.out.printf("%d\t%s\n",counter,c[counter]);
            System.out.print("{"+(counter+1)+"."+c[counter]+"}");
        }
      //  System.out.println(c[c.length-1]);
    }
    public static String[] subMonths(String[]mMonths){
        int start=2;
        int end = mMonths.length;
        String[] subMonths = new String[end-start];
        for (int i = 0; i <subMonths.length ; i++) {

            subMonths[i]=mMonths[i+start];
        }
//        print(subMonths);
        return subMonths;
    }

    public static String[] subArray(String[] arr,int start,int end){
        String[] sub = new String[end-start];
        for (int i = 0; i <arr.length; i++) {
            sub[i]=arr[i+start];
        }
        return sub;
    }
    public static String[] deleteDuplicates(String[]arr){
        String[] deleteArray = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            boolean exist = false;
            for (int j=0;j<deleteArray.length;j++){
                if (arr[i].equals(deleteArray[j])){
                    exist = true;
                }
            }
            if (exist==false){
                deleteArray[i]=arr[i];
            }
        }
        int notNullCounter =0;
        for (int y=0;y<deleteArray.length;y++){
            if (deleteArray[y]!=null){
                notNullCounter++;
            }
        }
        String[] last=new String[notNullCounter];
        int n=0;
        for (int z=0;z<deleteArray.length;z++){
            if (deleteArray[z]!=null){
                last[n]=deleteArray[z];
                n++;
            }
        }
        return last;

    }

//    public static String[]removeduplicates(String[]arr){
//
//    }

    public static void fixCase(String[]s){
       for (int i=0;i<s.length;i++){
           String n = s[i].toUpperCase();
           String first = n.charAt(0)+"";
           first = first.toLowerCase();
           s[i] = first+n.substring(1);
           System.out.print("{"+s[i]+"}");
       }
    }


    public static void display(){
        String[]countries ={"Egypt","Kuwait","Brazil","Germany","Franch","Italiy",
                "U.S","Dubai","Japan","Chince","Australia","Canada"};
        fixCase(countries);
////-----------------------------------------------------------------------------------------
        String[]months ={"January","February","Marsh","Apri","May","June",
                       "July","August","September","October","November","December"};
//        System.out.println("Origianl Array is: " );
//        print(months);
//        System.out.println("\n-----------------------");
//        System.out.println("\n Sub Month from original array is: ");
//        print(subMonths(months));
//        System.out.println("\n----------------------------------");
//        fixCase(months);
////-----------------------------------------------------------------------------------------
        String[] days ={"Sat","Sun","Sat","Mon","Tuts","Sat","Mon","Fri","Wed","Tuts"};
//       String[] last = removeduplicates(days);
//        print(days);
//        System.out.println("\n");
//        print(last);









//
    }

}

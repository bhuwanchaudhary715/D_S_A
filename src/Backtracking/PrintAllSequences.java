package Backtracking;

import java.util.ArrayList;

public class PrintAllSequences {

    public static void printSequences(int arr[], int idx, ArrayList<Integer> temparr){

         // Base_case Condition
        if( idx == arr.length ){

              // Print all the sequences -- but do not print empty entries
            if(temparr.size() > 0) {
                System.out.println(temparr);
            }
            return;
        }

        // Recursive call

        // Include
        printSequences(arr,idx+1,temparr);
        temparr.add(arr[idx]);

        // do not include
        printSequences(arr,idx+1,temparr);
        temparr.remove(temparr.size()-1);


    }

    public static void main(String[] args) {

       int arr[]={1,2,3};
       printSequences(arr,0,new ArrayList<Integer>());

    }
}

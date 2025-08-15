public class PrintAllPermutations {

    public static String swap(String str,int i, int j){

        char temp;
        char charArray[] = str.toCharArray();
        temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);

    }

         /*
             str -- > Input string
             l  --> Starting index
             r  --> ending index
         */
    public static void permute(String  str, int l, int r){

      // base case condition
        if( l == r ){
            System.out.println(str);
        }
        for (int i=l; i<=r; i++){
            str=swap(str, l, i);
            permute(str,l+1, r);
            //backtracking
            str=swap(str, l, i);
        }
    }

    public static void main(String[] args) {

         String str="ABC";
         int n = str.length();
         permute(str,0,n-1);
    }
}

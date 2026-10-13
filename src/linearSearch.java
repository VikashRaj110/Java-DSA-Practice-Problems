public class linearSearch {
    static void main(String[] args) {
        int [] arr ={2,5,8,9,5,5};
        int key = 88;
       boolean ans =  isSearch(arr,key);
        System.out.println(ans);
       if(!ans) System.out.println("No found");
    }
    public static boolean isSearch(int[] arr,int key){
        int n = arr.length;
        for(int i=0;i<n;i++){
           if(arr[i]== key){
               System.out.println("found at " + i);
               return true;
           }
        }
        return false;
    }
}

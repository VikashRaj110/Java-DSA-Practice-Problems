public class uniqueElement {
    static void main(String[] args) {
        int [] arr = {2,4,5,2,4,5,6,7};
        unique(arr);
    }
    public static void unique(int [] arr){
        int n = arr.length;
        int xorSum =0;
        for(int num:arr){
            xorSum = xorSum ^ n;
        }
        System.out.println(xorSum);
    }
}

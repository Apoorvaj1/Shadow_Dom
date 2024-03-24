package Questions_04thFeb;

public class Program_4 {

    public static void SumArray(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        SumArray(arr);
    }
}

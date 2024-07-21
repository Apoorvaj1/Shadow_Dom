package Array;

public class PracticeQuestion3_Alternativeway {
    public static void main(String[] args) {
        boolean isSorted = true;
        int [] arr = {1,2,6,8,12};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted==true){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}

package ExceptionHandling;

public class IdxOutOfBound {
    public static void main(String[] args) {
        int arr[] = {122,3,4,3,2,3,4};
        try{
            for (int i=0;i<arr.length+2;i++){
                System.out.print(arr[i]+" ");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("hello");
    }
}

package ExceptionHandling;

public class ArithmeticE {
    public static void main(String[] args) {
        int Numerator[] = {1,2,3,4,5,6};
        int Denominator[] = {5,4,3,2,0,1};
        for (int i=0;i<Numerator.length;i++){
            System.out.println(divide(Numerator[i],Denominator[i]));
        }
        System.out.println("hello");
    }
    static int divide(int N,int D){
        try{
            return N/D;
        }catch (Exception e){
            System.out.println(e);
            return -1;
        }finally {
            System.out.println("hello from finally");
        }

    }

}

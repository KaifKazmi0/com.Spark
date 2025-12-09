package String;


public class StringDemo {
    static void swap(char arr[],int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        String s = "name";
        String ss = new String("name");

        System.out.println(s.equals(ss));
        System.out.println(s.hashCode());
        System.out.println(ss.hashCode());
//        String s = "Hello";
//        System.out.println(s);
//
//
//
//        StringBuilder ss = new StringBuilder(s);
//        int i = 0;
//        int j = ss.length()-1;
//        while (i<j){
//            char temp = ss.charAt(i);
//            ss.setCharAt(i,ss.charAt(j));
//            ss.setCharAt(j,temp);
//
//            i++;
//            j--;
//        }
//        System.out.println(ss);
//        char arr[] = s.toCharArray();
//
//        int i = 0, j = s.length()-1;
//        while (i<j){
//            swap(arr,i,j);
//            i++;
//            j--;
//        }
//
//        System.out.println(Arrays.toString(arr));
//        String reversed = new String(arr);
//        System.out.println(reversed);
    }
}

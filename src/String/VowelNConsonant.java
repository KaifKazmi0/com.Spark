package String;

public class VowelNConsonant {
    public static void main(String[] args) {
        String s = "kaifkazmi";
        int v =0;
        int c =0;

        for (int i=0;i<s.length();i++){

//            char ch = Character.toLowerCase(s.charAt(i));
            char ch = s.charAt(i);
            if((ch>='a'&&ch<='z') || (ch>='A' && ch<='Z')){

                if ("aeiou".indexOf(ch)!=-1){
                    v++;
                }else c++;

            }
        }



//        for (int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                v++;
//            }else c++;
//        }
        System.out.println("V "+v+"\nC "+c);
    }
}

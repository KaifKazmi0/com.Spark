package Collection;

public class Demo {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");

        System.out.println(i==i2);
        System.out.println(i.compareTo(i2));
        System.out.println(Integer.valueOf(i)==Integer.valueOf(i2));


        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);
        System.out.println(a==b);  //true-> becoz of Integer cache -128 to 127

        Integer x = Integer.valueOf(200);
        Integer y = Integer.valueOf(200);
        System.out.println(x==y);


        //Parse
        int n = Integer.parseInt("123");
        try{
            int m = Integer.parseInt("hello");
            System.out.println(m);
        }catch (Exception e){
            System.out.println(e);
        }

        Double d = 9.88;
        int dd = d.intValue();
        System.out.println(dd);

        boolean aTrue = Boolean.parseBoolean("true");
        System.out.println(aTrue);
    }
}

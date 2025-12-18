    package Collection.MyEnemuration;

    import java.util.Enumeration;
    import java.util.Vector;

    public class EnamurationDemo {
        public static void main(String[] args) {
            Vector<String> v = new Vector<>();

            v.add("Kaif");
            v.add("Kumail");
            v.add("Ali");
            v.add("Arif");

            Enumeration<String> en = v.elements();

            while (en.hasMoreElements()){
                System.out.println(en.nextElement());
            }
        }
    }

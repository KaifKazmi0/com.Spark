package String;

public final class MyImmutable {

    private final int age;

    public MyImmutable(int age) {
        this.age = age;
    }

    public final int getter(){
        return age;
    }
}

class exp{
    public static void main(String[] args) {
        MyImmutable obj = new MyImmutable(123);
        System.out.println(obj.getter());
    }
}

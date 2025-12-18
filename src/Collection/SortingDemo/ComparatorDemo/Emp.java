package Collection.SortingDemo.ComparatorDemo;

public class Emp {

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSalary(){
        return salary;
    }

    private int id;
    private String name;
    private String salary;

    public Emp(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

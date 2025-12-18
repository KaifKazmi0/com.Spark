package Collection.CustomList;

public class Student {

        int rollNum;
        String name;
        String course;

        public Student(int rollNum, String name, String course) {
            this.rollNum = rollNum;
            this.name = name;
            this.course = course;
        }

        @Override
        public String toString() {
            return rollNum+" "+name+" "+course;
        }
    }

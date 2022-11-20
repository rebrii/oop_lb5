public class Main {
    public static class Person {
        private final String name;
        private final String lastname;
        private final int age;

        public Person(String name, String lastname, int age) {
            this.name = name;
            this.lastname = lastname;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getLastname() {
            return lastname;
        }	   public int getAge() {
            return age;
        }

        public String toString() {
            return "Человек " + lastname +
                    " " + name +
                    ", возраст: " + age;
        }
    }
    public static class Student extends Person {

        private final int group;
        private final int studentID;

        public Student(String name, String lastname, int age, int group, int studentID) {
            super(name, lastname, age);
            this.group = group;
            this.studentID = studentID;
        }

        public String toString() {
            return "Студент группы " + group +
                    ", " + getLastname() +
                    " " + getName() +
                    ", возраст: " + getAge() +
                    ". Номер студенческого билета: "+ studentID;
        }
    }
    public static class Lecturer extends Person {

        private final String department;
        private final int payment;

        public Lecturer(String name, String lastname, int age, String department, int payment) {
            super(name, lastname, age);
            this.department = department;
            this.payment = payment;
        }

        public String toString() {
            return "Преподаватель кафедры " + department +
                    ", " + getLastname() +
                    " " + getName() +
                    ", возраст: " + getAge() +
                    ". Зарплата: " + payment;
        }
    }

    public static void main(String[] args) {

        Lecturer l1 = new Lecturer("Henry", "Headthink", 33, "IS", 9700);
        Lecturer l2 = new Lecturer("Grigory", "Kadahera", 60, "IM", 8900);
        Student s1 = new Student("Vika", "Igorevna", 12, 222, 42671);
        Student s2 = new Student("Alexandr", "Alexanrovich", 17, 123, 23985);
        Person[] pArray = new Person[]{l1,s1,l2,s2};

        for (Person p : pArray) {
            System.out.println(p.toString());
        }
    }
}

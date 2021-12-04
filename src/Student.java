public class Student extends People {

    Student() {
        super();
    }

    Student(String nameS, String lastnameS, int ageS) {
        super(nameS, lastnameS, ageS);
    }

    void learn() {
        System.out.println(name + " учится");
    }
}
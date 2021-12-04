public class Main {
    public static void main(String[] args) {
        People people =  new People("Наташа","Необутова",19);
        people.walk();
        people.run();
        people.voice();

        Student student = new Student("Наташа","Необутова",19);
        student.learn();

        Teacher teacher = new Teacher("Николай","Петров",19);
        teacher.teach();
    }
}

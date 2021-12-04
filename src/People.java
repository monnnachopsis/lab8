public class People {
    protected String name;
    protected String lastname;
    protected int age;

    People() {
        name = "n";
        lastname = "n";
        age = 0;
    }

    People(String nameW, String lastnameW, int ageW) {
        name = nameW;
        lastname = lastnameW;
        age = ageW;
    }

    @Override
    public String toString() {
        return "People{" + "name =' " + name + '\'' + ", lastname =' " + lastname + '\'' + ", age = " + age + '}';
    }

    void walk() {
        System.out.println(name + " ходит");
    }

    void voice() {
        System.out.println(name + " говорит");
    }

    void run() {
        System.out.println(name + " бежит");
    }
}
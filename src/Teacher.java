public class Teacher extends People{
    Teacher(){
        super();
    }

    Teacher(String nameT, String lastnameT, int ageT){
        super(nameT,lastnameT,ageT);
    }

    void teach(){
        System.out.println(name + " учит");
    }
}
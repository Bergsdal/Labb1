/**
 * Created by Dexter on 2016-11-01.
 */
public class Human {
    private int age;
    private String name;

    public Human(int ageIn, String nameIn){
        age = ageIn;
        name = nameIn;
    }

    public String toString(){
        return "ålder: " + age + ", namn: " + name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Human putte = new Human(25,"davidutsasdadasd");
        putte.getAge();
        putte.getName();
        System.out.println(putte.toString());
    }
}

package practice05;

public class Teacher extends Person {

    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        this(name, age, 0);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce(){
        if (klass != 0){
            return String.format(super.introduce()+"I am a Teacher. I teach Class %d.",getKlass());}
        else {
            return String.format(super.introduce()+" I am a Teacher. I teach No Class.");
        }
    }
}

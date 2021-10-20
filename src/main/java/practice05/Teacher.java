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
        if (getKlass() != 0){
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", getName(), getAge(), getKlass());}
        else {
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", getName(), getAge());
        }
    }
}

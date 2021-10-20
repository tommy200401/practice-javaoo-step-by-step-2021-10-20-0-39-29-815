package practice06;

public class Teacher extends Person {

    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        this(name, age, 0);
    }

    public String introduce(){
        if (klass != 0){
            return String.format(super.introduce()+"I am a Teacher. I teach Class %d.",getKlass());}
        else {
            return String.format(super.introduce()+" I am a Teacher. I teach No Class.");
        }
    }

    public String introduceWith(){
        String introduction = super.introduce();
        introduction += "I am a Teacher. I ";
        if (klass.getNumber() == student.getKlass().getNumber()){
            introduction += String.format("teach %s.", student.getName());
        }
        else {
            introduction += String.format("don't teach %s.", student.getName());
        }
        return introduction;
    }

    public int getKlass(){
        return klass;
    }
}

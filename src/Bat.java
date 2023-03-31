public class Bat extends Predator implements Flyable{ //Летучая мышь
    public Bat(String name) {
        super(name);
    }

    @Override
    public String feed (){
        return "Insects"; //Насекомые
    }
    @Override
    public String speak() {
        return "Sssss";
    }

    @Override
    public int flySpeed() {
        return 70;
    }
}

public abstract class Herbivore extends Mammal{ //Травоядные

    public Herbivore(String name) {
        super(name);
    }
    @Override
    public String feed (){
        return "Grass"; //трава
    }

}

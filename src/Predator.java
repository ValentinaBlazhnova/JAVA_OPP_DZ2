public abstract class Predator extends Mammal{ // Хищник
    public Predator(String name) {
        super(name);
    }

    @Override
    public String feed (){
        return "Meat"; //мясо
    }
}

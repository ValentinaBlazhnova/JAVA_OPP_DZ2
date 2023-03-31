public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cow("Byrenka"));
        zoo.addAnimal(new Bear("M. Potapich", 60));
        zoo.addAnimal(new Platypus("Parry"));
        zoo.addAnimal(new Woof("Seriy"));
        zoo.addAnimal(new Goat("Manya"));
        zoo.addAnimal(new Bat("Mikki"));
        zoo.addAnimal(new Bear("Kosolapich", 61));
        zoo.addAnimal(new Dolphin("Glasha"));

        zoo.noise();
        zoo.showAll();
        System.out.println();
        System.out.println("Champion by run: ");
        System.out.println(zoo.championByRun());
        System.out.println();
        System.out.println("Champion by fly: ");
        System.out.println(zoo.championByFly());
    }

}
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List <Animal> animals = new ArrayList<>(); //Список животных
    private Radio radio = new Radio();

    public void addAnimal (Animal newAnimal){ //Добавление животных в список
        this.animals.add(newAnimal);
    }

    public void showAll (){                 //Печать животных по именам
        for (Animal animal: this.animals) {
            System.out.println(animal);
        }
    }

    public void noise (){                   //Печать животных по звукам без имени
        for (Speakable speak:noises()) {
            System.out.print(speak.speak());
        }
        System.out.println();
    }

    private List<Speakable> noises (){  //Радио
        List<Speakable> res = new ArrayList<>();
        for (Animal animal:animals) {
            res.add(animal);
        }
        res.add(radio);
        return res;
    }

    private List<Walkable> runners (){ //Список всех бегающих животных
        List<Walkable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Walkable) {
                res.add((Walkable) animal);
            }
        }
        return res;
    }

    public Animal championByRun () { // Чемпион среди бегунов
        List<Walkable> start = runners();
        Walkable champ = start.get(0);
        for (Walkable runner:start) {
            if (champ.runSpeed()< runner.runSpeed()){
                champ = runner;
            }
        }
        return (Animal)champ;
    }

    private List<Flyable> flyers (){  //Список всех летающих 
        List<Flyable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Flyable) {
                res.add((Flyable) animal);
            }
        }
        return res;
    }

    public Animal championByFly () {  //Чемпион по полёту (Поиск максимума)
        List<Flyable> start = flyers();
        Flyable champ = start.get(0);
        for (Flyable flyer:start) {
            if (champ.flySpeed()< flyer.flySpeed()){
                champ = flyer;
            }
        }
        return (Animal)champ;
    }
}

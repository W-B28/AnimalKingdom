package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static List<Animals> printAnimals(List<Animals> animals, CheckAnimal tester)
    {   
    List<Animals>tempList = new ArrayList<>();
        for(Animals a:animals) 
        {
            if (tester.test(a))
            {
            
                tempList.add(a);
                // System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYearDiscovered());
            }
        }
        return tempList;
        
    }
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Hello from the AnimalKingdom");
        System.out.println("-----------------------------");
        
        List<Animals> animalArrList = new ArrayList<>();

        // Mammals
        animalArrList.add(new Mammals("Panda", 1869));
        animalArrList.add(new Mammals("Zebra", 1778));
        animalArrList.add(new Mammals("Koala", 1816));
        animalArrList.add(new Mammals("Sloth", 1804));
        animalArrList.add(new Mammals("Armadillo", 1758));
        animalArrList.add(new Mammals("Raccoon", 1758));
        animalArrList.add(new Mammals("Bigfoot", 2021));

        // Birds
        animalArrList.add(new Birds("Pigeon", 1837));
        animalArrList.add(new Birds("Peacock", 1821));
        animalArrList.add(new Birds("Toucan", 1758));
        animalArrList.add(new Birds("Parrot", 1824));
        animalArrList.add(new Birds("Swan", 1758));

        // Fish
        animalArrList.add(new Fish("Salmon", 1758));
        animalArrList.add(new Fish("Catfish", 1817));
        animalArrList.add(new Fish("Perch", 1758));

        System.out.println("*** MVP ***");
        System.out.println();
        System.out.println("*** List all the animals in descending order by year discovered ***");
        animalArrList.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
        System.out.println(animalArrList.toString());

        System.out.println();
        System.out.println("*** List all the animals alphabetically ***");
        animalArrList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animalArrList.toString());

        System.out.println();
        System.out.println("*** List all the animals order by how they move ***");
        animalArrList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animalArrList.toString());

        System.out.println();
        System.out.println("*** List only those animals the breath with lungs ***");
        List <Animals> lungList = printAnimals(animalArrList, a -> (a.breathe().equalsIgnoreCase("lungs")));
        lungList.forEach(( v ) -> System.out.println(v));

        System.out.println();
        System.out.println("*** List only those animals that breathe with lungs and were discovered in 1758 ***");
        List <Animals> lungList1758 = printAnimals(animalArrList, a -> (a.breathe().equalsIgnoreCase("lungs") && a.getYearDiscovered() == 1758));
        lungList1758.forEach(( v ) -> System.out.println(v));
        
        
        
        System.out.println();
        System.out.println("*** List only those animals that lay eggs and breathe with lungs ***");
        List <Animals> eggLungs = printAnimals(animalArrList, a -> (a.reproduce().equalsIgnoreCase("eggs") && a.breathe().equalsIgnoreCase("lungs")));
        eggLungs.forEach(( v ) -> System.out.println(v));
        
        
        
        System.out.println();
        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        List <Animals> named1758 = printAnimals(animalArrList, a -> (a.getYearDiscovered() == 1758));
        animalArrList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        named1758.forEach(( v ) -> System.out.println(v));
    }
}
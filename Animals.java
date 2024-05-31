import java.util.ArrayList;

public class Animals {
    private ArrayList<String> animals = new ArrayList<>(); 

    public Animals() {
        // Initializing the ArrayList with some animals
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Lion");
        // Add more animals as needed
    }
    public void manipulate() {
        for (int k = animals.size() - 1; k >= 0; k--) {
            if (animals.get(k).substring(0, 1).equals("b")) {
                animals.add(animals.remove(k));
            }
        }
    }

    public static void main(String[] args) {
        Animals animalObject = new Animals();

        animalObject.manipulate();

        // Print the manipulated ArrayList
        System.out.println("Manipulated ArrayList:");
        for (String animal : animalObject.animals) {
            System.out.println(animal);
        }
    }
}

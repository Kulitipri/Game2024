import java.util.ArrayList;
import java.util.List;

public class HeroList {
    private List<Hero> heroes;

    public HeroList() {
        heroes = new ArrayList<>();
    }

    // Add a hero to the list
    public void addHero(Hero hero) {
        heroes.add(hero);
        System.out.println(hero.getName() + " has been added to the list.");
    }

    // Remove a hero from the list
    public void removeHero(Hero hero) {
        if (heroes.remove(hero)) {
            System.out.println(hero.getName() + " has been removed from the list.");
        } else {
            System.out.println(hero.getName() + " is not in the list.");
        }
    }

    // Retrieve all heroes
    public List<Hero> getHeroes() {
        return new ArrayList<>(heroes); // Return a copy to prevent external modifications
    }

    // Display details of all heroes in the list
    public void displayHeroes() {
        System.out.println("Current Heroes:");
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
}

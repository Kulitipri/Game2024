import java.util.List;

public class DarkElf extends Mob implements AreaAttack{

    public DarkElf() {
        super("Dark Elf", 160, 32, 0, 0); // Initialize with given stats
    }

    @Override
    public void areaAttack(List<Hero> heroes) {
        System.out.println(getName() + " performs an area attack, dealing full physical damage to all heroes in a small area.");
        for (Hero hero : heroes) {
            hero.takeDamage(getPhysicalDamage());
            System.out.println(hero.getName() + " takes " + getPhysicalDamage() + " damage from " + getName() + ".");
        }
    }


    // Combined action: Perform area attack, then execute low-health heroes
    public void performAction(HeroList heroList) {
        List<Hero> heroes = heroList.getHeroes();
        areaAttack(heroes);
        areaAttack(heroes);
        areaAttack(heroes);
        areaAttack(heroes);
    }
}

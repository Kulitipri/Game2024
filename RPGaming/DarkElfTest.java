public class DarkElfTest {
    public static void main(String[] args) {
        // tạo list hero rỗng
        HeroList heroList = new HeroList();

        // tạo Dark Elf
        DarkElf darkElf = new DarkElf();

        // tạo hero
        Hero crusader = new Crusader("crusader", 100, 10, 0, 5, 0.3, 30);

        //add hero vào list
        heroList.addHero(crusader);
        heroList.displayHeroes(); // show hero trong list

        // thực hiện hành động
        darkElf.performAction(heroList);

        // Display the heroes' status after the attack
        crusader.displayCharacterInfo();
    } 
}

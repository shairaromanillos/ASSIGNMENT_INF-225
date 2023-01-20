public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "Gondar";
        thief.sayMyName();

        Weapon sword = new Weapon();

        sword.name = "Le Samourai";
        sword.damage = 1111;
        sword.rarity = "Epic";
        sword.LeSamourai();
        sword.AddDamage(10);

        System.out.print(sword.showNameandRarity());

        Character shooter = new Character();

        shooter.name = "Heisenberg";
        shooter.Attack();
        
    }
}

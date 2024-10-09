package Gear.Potions;

import Character.PlayerCharacter;

public class SmallPotion extends Potion {
    public SmallPotion() {
        super("Small Potion", 2);
    }

    @Override
    public void interact(PlayerCharacter playerCharacter) {
        System.out.println("I am a Small Potion");
    }
}

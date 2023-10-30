import EnemeyClasses.Dragon;
import EnemeyClasses.Troll;
import PlayersClasses.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void contextLoads(){};

    @Test
    public void MonkCanAttackCheck(){
        Monk marrisa = new Monk("Marrisa", 150);
        marrisa.setCurrentWeapon("Staff");
        Troll kitty = new Troll(30);
        marrisa.attack(kitty);
        assertEquals(0, kitty.getHealth());
    }

    @Test
    public void MonkCanAttackWithTwoSeperateWeapons(){
        Monk marrisa = new Monk("Marrisa", 150);
        marrisa.setCurrentWeapon("Staff");
        Troll kitty = new Troll(300);
        marrisa.attack(kitty);
        marrisa.setCurrentWeapon("Fists");
        marrisa.attack(kitty);
        assertEquals(245, kitty.getHealth());
    }

    @Test
    public void FighterCanAttackCheck(){
        Fighter tyler = new Fighter("Tyler", 150);
        Troll kitty = new Troll(41);
        tyler.attack(kitty);
        assertEquals(1, kitty.getHealth());
    }

    @Test
    public void FighterCanChangeWeaponAndAttackCheck(){
        Fighter tyler = new Fighter("Tyler", 150);
        Troll kitty = new Troll(60);
        tyler.attack(kitty);
        tyler.setCurrentWeapon("Broad sword");
        tyler.attack(kitty);
        assertEquals(0, kitty.getHealth());
    }

    @Test
    public void WarlockCanChangeSpellAndAttackCheck(){
        Warlock edgey = new Warlock("Edgey", 100);
        Troll kitty = new Troll(75);
//        System.out.println(edgey.getPreparedSpell());
        edgey.attack(kitty);
        edgey.setPreparedSpell("Eldritch Blast");
        edgey.attack(kitty);
        assertEquals(5, kitty.getHealth());
    }

    @Test
    public void ClericCanHeal(){
        Warlock ouchy = new Warlock("OUchy", 50);
        Cleric savannah = new Cleric("Savannah", 50);
        savannah.heal(ouchy);
        assertEquals(70, ouchy.getHealth());
    }

    @Test
    public void ClericCanCahngeSpellAndHeal(){
        Warlock ouchy = new Warlock("OUchy", 50);
        Cleric savannah = new Cleric("Savannah", 50);
        savannah.heal(ouchy);
        savannah.setPreparedHealingSpell("Cure Wounds");
        savannah.heal(ouchy);
        assertEquals(110, ouchy.getHealth());
    }

    @Test
    public void WizardsFamiliarTakesDamage(){
        Wizard elliot = new Wizard("Elliot", 5);
        Dragon smog = new Dragon(100);
        smog.dragonPlayerAttack(elliot);
        assertEquals(0, elliot.getFamiliar().getHealth());
    }

    @Test
    public void WarlockFamilarTakesDamage(){
        Warlock squishy = new Warlock("Sir Squishy", 6);
        Dragon smog = new Dragon(100);
        smog.dragonPlayerAttack(squishy);
        assertEquals(0, squishy.getFamiliar().getHealth());

    }


}

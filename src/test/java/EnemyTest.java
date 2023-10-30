import EnemeyClasses.Dragon;
import EnemeyClasses.Orc;
import EnemeyClasses.Troll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EnemyTest {
    @Test
    public void contextLoads(){};

    @Test
    public void DragonAttackCheck(){
        Dragon bunny = new Dragon(100);
        assertEquals("ROOOAR! GET READY FOR MY FLAMES!!!", bunny.attack());
    }

    @Test
    public void OrcAttackCheck(){
        Orc kitty = new Orc(50);
        assertEquals("Oh boy, I'm attacking", kitty.attack());
    }

    @Test
    public void TrollAttackCheck(){
        Troll katty = new Troll(25);
        assertEquals("Get ready for my attack!", katty.attack());
    }

    @Test
    public void DragonAttachReducesHPTo0(){
        Dragon bunny = new Dragon(100);
        Orc kitty = new Orc(50);
        bunny.dragonSpecialAttack(kitty);
        assertEquals(0, kitty.getHealth());
    }

    @Test
    public void DragonAttackReducedHPToAbove0(){
        Dragon bunny = new Dragon(100);
        Orc superKitty = new Orc(500);
        bunny.dragonSpecialAttack(superKitty);
        assertEquals(405, superKitty.getHealth());
    }

    @Test
    public void OrcAttackReducedHpToAbove0(){
        Dragon bunny = new Dragon(100);
        Orc kitty = new Orc(50);
        kitty.orcSpecialAttack(bunny);
        assertEquals(46, bunny.getHealth());
    }

    @Test
    public void OrcAttackReducedHpTo0(){
        Dragon bunny = new Dragon(100);
        Orc kitty = new Orc(50);
        kitty.orcSpecialAttack(bunny);
        kitty.orcSpecialAttack(bunny);
        assertEquals(0, bunny.getHealth());
    }

    @Test
    public void TrollAttackRecucedHpToAbove0(){
        Orc kitty = new Orc(50);
        Troll katty = new Troll(55);
        kitty.orcSpecialAttack(katty);
        assertEquals(1, katty.getHealth());
    }

    @Test
    public void TrollAttackRecucedHpTo0(){
        Orc kitty = new Orc(50);
        Troll katty = new Troll(55);
        kitty.orcSpecialAttack(katty);
        kitty.orcSpecialAttack(katty);
        assertEquals(0, katty.getHealth());
    }


}

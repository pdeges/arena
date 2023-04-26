package fiend;

import game.GameObject;
import hero.Hero;

public class Spider extends Fiend {

	public Spider() {
		health = 40;
	}
	
	public String getName() {return "Spider";}

	@Override
	public void attack(GameObject f) {
		f.sustainDamage(20);
		logAction("Spider attacked for 20dmg");
		
	}

	@Override
	public void sustainDamage(int dmg) {
		health -= dmg;
		logAction("Spider took " + dmg + "dmg");
	}

	
}

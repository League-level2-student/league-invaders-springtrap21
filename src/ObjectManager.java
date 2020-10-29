import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rs;
	ArrayList<Projectile> pj;
	ArrayList<Alien> al;
	Random rnd;

	ObjectManager(Rocketship rs) {
		this.rs = rs;
		pj = new ArrayList<Projectile>();
		al = new ArrayList<Alien>();
	}

	void addProjectile(Projectile pj) {

	}

	void addAlien() {
		al.add(new Alien(rnd.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
	}

	void update() {
		for (int i = 0; i < pj.size(); i++) {
			Projectile p1 = pj.get(i);
			p1.update();
			if (p1.y < 0) {
				p1.isActive = false;
			}
		}
		for (int i = 0; i < al.size(); i++) {
			Alien a1 = al.get(i);
			a1.update();
			if (a1.y > LeagueInvaders.HEIGHT) {
				a1.isActive = false;
			}
		}
	}
	void draw(Graphics g) {
		rs.draw(g);
		for (int i = 0; i <al.size(); i++) {
			Alien a1 = al.get(i);
			a1.draw(g);
		}
		for (int i = 0; i <pj.size(); i++) {
			Projectile pro = pj.get(i);
			pro.draw(g); 
		}
	}
	void purgeObjects() {
		for (int i = al.size(); i >= 0; i--) {
			Alien a1 = al.get(i);
			if (a1.isActive == false) {
				al.remove(a1);
			}
		}
		for (int i = pj.size()-1; i >= 0; i--) {
			Projectile pro = pj.get(i);
			if (pro.isActive == false) {
				pj.remove(pro);
			}
		}
	}
}

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocketMember;
	Random random = new Random();
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();

	ObjectManager(Rocketship r) {
		rocketMember = r;
	}

	void addProjectile(Projectile p) {
		projectiles.add(p);
	}

	void addAlien() {
		aliens.add(new Alien(random.nextInt(LeagueInvaders.width), 0, 50, 50));
	}

	void update() {
		for (int i = 0; i < aliens.size(); i++) {
			Alien alien = aliens.get(i);
			alien.update();
		}

	}

	void draw(Graphics g) {
		rocketMember.draw(g);
		for (int i = 0; i < aliens.size(); i++) {
			Alien alien = aliens.get(i);
			alien.draw(g);
		}
		for (int e = 0; e < projectiles.size(); e++) {
			Projectile projectile = projectiles.get(e);
			projectile.draw(g);
		}
	}

	void purgeObjects() {
		for (int i = 0; i < aliens.size(); i++) {
			Alien alien = aliens.get(i);
			if (alien.isActive = false) {

			}
		}
	}
}

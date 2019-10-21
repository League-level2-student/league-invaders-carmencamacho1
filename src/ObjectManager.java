import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
Rocketship rocketMember;
Random random = new Random();
ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
ArrayList<Alien> aliens = new ArrayList<Alien>();

ObjectManager(Rocketship r){
	rocketMember = r;
}
void addProjectile(Projectile p){
	projectiles.add(p);
}
void addAlien(){
	aliens.add(new Alien(random.nextInt(LeagueInvaders.width),0,50,50));
}
void update(){
}
}

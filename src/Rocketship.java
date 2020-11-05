import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject{

	public boolean movingUp, movingDown, movingRight, movingLeft;
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
		if (needImage) {
		    loadImage ("rocket.png");
		}
	}
	void draw(Graphics g) {
	    if (gotImage) {
	        	g.drawImage(image, x, y, width, height, null);
	        } else {
	        	g.setColor(Color.BLUE);
	        	g.fillRect(x, y, width, height);
	        }
	} 
	public void right() {
		if (x < LeagueInvaders.WIDTH - width) {
			x+=speed;
		}
    }
	public void left() {
        if (x > 0) {
        	x-=speed;
		}
    }
	public void up() {
		if (y > 0) {
			y-=speed;
		}
    }
	public void down() {
		if (y < LeagueInvaders.HEIGHT - height) {
			y+=speed;
		}
    }
	
	void update() {
		if (movingUp) {
			up();
		}
		if (movingDown) {
			down();
		}
		if (movingRight) {
			right();
		}
		if (movingLeft) {
			left();
		}
	}
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	public Projectile getProjectile() {
        return new Projectile(x+width/2, y, 10, 10);
} 

}


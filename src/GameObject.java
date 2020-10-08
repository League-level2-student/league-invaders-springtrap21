
public class GameObject {
	 int x;
	 int y;
	 int width;
	 int height;
	 int speed = 0;
	 boolean isActive = true;
	 GameObject(int x, int y, int width, int height) {
		 this.x = x;
		 this.y = y;
		 this.width = width;
		 this.height = height;
		 int speed = 10;
	 }
	 void update() {
		 
	 }
	 public void right() {
	        x+=speed;
	    }
	 public void left() {
	        x+=speed;
	    }
	 public void up() {
	        x+=speed;
	    }
	 public void down() {
	        x+=speed;
	    }

}

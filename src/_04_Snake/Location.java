package _04_Snake;

public class Location {
private int x;
private int y;
public Location(int x, int y) {
	this.x = x;
	this.y = y;
}
public int getX() {
	return x;
}
public int getY() {
	return y;
}
public boolean equals(Location snake) {
	 //2. Create an equals method in Location that takes in a Location and returns
	 //true if the member variable x and y match the passed in Location's x and y.
	if(snake.x == x && snake.y == y) {
		return true;
	}
	else {
		return false;
	}
	
}
}

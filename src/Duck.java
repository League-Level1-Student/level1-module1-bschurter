
public class Duck {
	int numberOfFriends;
	String favoriteFood;
	
	public Duck(int numberOfFriends, String favoriteFood) {
		this.numberOfFriends = numberOfFriends;
		this.favoriteFood = favoriteFood;
	}
	
	public void printDuck() {
		System.out.println("Duck has " + numberOfFriends + " friends and like to eat " + favoriteFood);
	}
	
	public void quack() {
		System.out.println("Duck says QUACK!");
	}
}



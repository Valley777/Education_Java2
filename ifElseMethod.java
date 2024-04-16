package methods;

public class ifElseMethod {
    static void checkAge(int age) {
    	if(age<18) {
    		System.out.println("Smoking prohibited.\nYou are not old enouph!");
    	}else {
    		System.out.println("Not recommended.\nYou are old enouph.");
    	}
    }
	public static void main(String[] args) {
		checkAge(20);
	}
}

package epam.test.JunitTest;

public class App 
{
	public String removeAfromFirst2Char(String input) {
		int length = input.length();
		String remaining = input.substring(2,length);
		char first = input.charAt(0);
		char second = input.charAt(1);
		if(second != 'A')
			remaining = second + remaining;
		if(first != 'A')
			remaining = first + remaining;
		return remaining;
	}
}

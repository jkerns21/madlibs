import java.util.Scanner;

public class Madlib 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter an adjective:  ");
		String adjectiveOne = keyboard.nextLine();
		System.out.print("Please enter a plural noun:  ");
		String pluralNounOne = keyboard.nextLine();
		System.out.print("Please enter a verb:  ");
		String verbOne = keyboard.nextLine();
		System.out.print("Please enter a noun:  ");
		String nounOne = keyboard.nextLine();
		System.out.print("Please enter an adverb:  ");
		String adverbOne = keyboard.nextLine();
		System.out.print("Please enter a verb ending in -ing:  ");
		String ingVerb = keyboard.nextLine();
		System.out.print("Please enter a clothing item:  ");
		String clothingItem = keyboard.nextLine();
		System.out.print("Please enter a plural noun:  ");
		String pluralNounTwo = keyboard.nextLine();
		System.out.print("Please enter a noun:  ");
		String nounTwo = keyboard.nextLine();
		System.out.print("Please enter a verb:  ");
		String verbTwo = keyboard.nextLine();
		System.out.print("Please enter an adjective:  ");
		String adjectiveTwo = keyboard.nextLine();
		System.out.print("Please enter a noun:  ");
		String nounThree = keyboard.nextLine();
		System.out.print("Please enter a noun:  ");
		String nounFour = keyboard.nextLine();
		
		System.out.println("\n\n\n\nWinter sports are so much " + adjectiveOne + ". There's skiing, where you put two " +
							pluralNounOne + " on your feet and " + verbOne + " down a steep " + nounOne + " really " + 
							adverbOne + ".");
		System.out.println("You can also do cross-country " + ingVerb + " or snow " + clothingItem + 
							" if you don't live near steep " + pluralNounTwo + ". Snowboarding is similar,");
		System.out.println("but you stand on one " + nounTwo +  " and " + verbTwo  +  " downhill. Another fun downhill sport is  sledding or tubing,  where you ride a " +
							adjectiveTwo + " " + nounThree);
		System.out.println("or an air-filled "  + nounFour + " downhill.");

	}

}

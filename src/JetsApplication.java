import java.util.Scanner;

public class JetsApplication {

	private static Airfield airfield = new Airfield();

	static Jet jet = new Jet();

	static Scanner kb = new Scanner(System.in);

	public JetsApplication() {

	}

	public static void main(String[] args) {
		launch();
	}

	private static void launch() {
		welcome();
		displayUserMenu();

	}

	private static void welcome() {
		System.out.println("Welcome to the Jets application.");
	}

	private static void displayUserMenu() {
		System.out.println("Menu: \n 1. List Fleet\n 2. Fly all jets\n 3. View fastest jet\n 4. "
				+ "View jet with longest range\n 5. Load all Cargo Jets\n 6. Dogfight!\n "
				+ "7. Add a jet to the Fleet\n 8. Quit");
		System.out.print("To continue, please select an option (1-7 or 8 to quit): ");
		int answer = kb.nextInt();
		boolean flag = true;
		while (flag)
			switch (answer) {
			case 1:
				listFleet();
				flag = false;
				displayUserMenu();
				break;
			case 2:
				for (int i = 0; i < airfield.getArrayOfJets().length; i++) {
					if (airfield.getArrayOfJets()[i] == null) {
						flag = false;
						break;
					}
					airfield.getArrayOfJets()[i].fly();
				}
				flag = false;
				displayUserMenu();
				break;
			case 3:
				double topSpeed = airfield.getArrayOfJets()[0].getSpeed();
				int count = 0;
				for (int i = 0; i < airfield.getArrayOfJets().length; i++) {
					if (airfield.getArrayOfJets()[i] == null) {
						flag = false;
						break;
					}
					if (airfield.getArrayOfJets()[i].getSpeed() > topSpeed) {
						topSpeed = airfield.getArrayOfJets()[i].getSpeed();
						count = i;
					}
				}
				int topSpeed2 = (int) (topSpeed);
				System.out.println("The fastest jet is " + airfield.getArrayOfJets()[count].toString());
				flag = false;
				displayUserMenu();
				break;
			case 4:
				double topRange = airfield.getArrayOfJets()[0].getRange();
				int counter = 0;
				for (int i = 0; i < airfield.getArrayOfJets().length; i++) {
					if (airfield.getArrayOfJets()[i] == null) {
						flag = false;
						break;
					}
					if (airfield.getArrayOfJets()[i].getRange() > topRange) {
						topRange = airfield.getArrayOfJets()[i].getRange();
						counter = i;
					}
				}
				int topRange2 = (int) (topRange);
				System.out.println(
						"The aircraft with the longest range is " + airfield.getArrayOfJets()[counter].toString());
				flag = false;
				displayUserMenu();
				break;
			case 5:
				airfield.loadCargoPlanes();
				flag = false;
				displayUserMenu();
				break;
			case 6:
				int counter2 = 0;
				for (int i = 0; i < airfield.getArrayOfJets().length; i++) {
					if (airfield.getArrayOfJets()[i] == null) {
						flag = false;
						break;
					}
					if (airfield.getArrayOfJets()[i].getClass() == FighterJet.class) {
						((FighterJet) airfield.getArrayOfJets()[i]).fight();
					}
				}
				displayUserMenu();
				break;
			case 7:
				System.out.print("Enter the model name of the aircraft you'd like to add to the fleet: ");
				String model = kb.next();
				System.out.print("Enter the speed of your aircraft in mph: ");
				double speed = kb.nextDouble();
				System.out.print("Enter the range of your aircraft in nautical miles: ");
				int range = kb.nextInt();
				System.out.print("Lastly, enter the cost of your aircraft: ");
				long cost = kb.nextLong();
				System.out.println("Press 1 to view the updated fleet: ");
				Jet add = new Jet(model, speed, range, cost);
				airfield.addJet(add);
				flag = false;
				displayUserMenu();
				break;
			case 8:
				System.out.println("Thank you for using the Jets application. Goodbye.");
				System.exit(0);
			default:
				if (answer < 1 || answer > 8) {
					System.out.println("That is not a valid input. Please try again.");
					System.out.print("To continue, please select a valid option (1-7 or 8 to quit): ");
					answer = kb.nextInt();
					break;
				}
			}
	}

	public static void listFleet() {
		for (int i = 0; i < airfield.getArrayOfJets().length; i++) {
			if (airfield.getArrayOfJets()[i] != null) {
				System.out.println(airfield.getArrayOfJets()[i].toString());
			}
		}
	}
}

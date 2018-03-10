
public class Airfield {

	private static Jet[] arrayOfJets = new Jet[20];

	public Airfield() {

		Jet f35 = new FighterJet("F-35B", 1200, 900, 122_400_000);
		Jet f22 = new FighterJet("F-22 Raptor", 1498, 1302, 150_000_000);
		Jet mq9 = new JetImpl("MQ-9 Reaper", 300, 999, 16_900_000);
		Jet rq4 = new JetImpl("RQ-4 Global Hawk", 391, 12300, 222_700_000);
		Jet f18 = new FighterJet("F/A-18E/F Super Hornet", 1190, 1798, 70_500_000);
		Jet c17 = new CargoPlane("C-17 GlobeMaster III", 518, 5610, 218_000_000);

		arrayOfJets[0] = f35;
		arrayOfJets[1] = f22;
		arrayOfJets[2] = mq9;
		arrayOfJets[3] = rq4;
		arrayOfJets[4] = f18;
		arrayOfJets[5] = c17;
	}

	public static Jet[] getArrayOfJets() {
		return arrayOfJets;
	}

	public void setArrayOfJets(Jet[] arrayOfJets) {
		this.arrayOfJets = arrayOfJets;
	}
	
	public void loadCargoPlanes () {
		for (int i = 0; i < arrayOfJets.length; i++) {
				if (getArrayOfJets()[i] == null) {
					break;
				}
				if (arrayOfJets[i].getClass() == CargoPlane.class) {
					((CargoPlane) arrayOfJets[i]).loadCargo();
			}
			}
		}
	
	
	public void addJet(Jet jet) {
		for (int i = 0; i < arrayOfJets.length; i++) {
			if (arrayOfJets[i] == null) {
				arrayOfJets[i] = jet;
				break;
			}
		}
	}
	
}

package exercise8;

import java.util.ArrayList;
import java.util.Iterator;
import exercise7.Weight;

public class list {

	public list(){
		Weight wom1 = new Weight(50);
		Weight wom2 = new Weight(56);
		Weight wom3 = new Weight(64);

		ArrayList<Weight> weightlist = new ArrayList<Weight>();

		weightlist.add(wom1);
		weightlist.add(wom2);
		weightlist.add(wom3);

		Iterator<Weight> weightIt = weightlist.iterator();
		while (weightIt.hasNext()) {
			weightIt.next().weightCalculation();
		}
	
}
}

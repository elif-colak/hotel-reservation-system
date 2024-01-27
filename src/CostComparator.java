import java.util.Comparator;

public class CostComparator implements Comparator<Services>{

	@Override
	public int compare(Services s1, Services s2) {
		if (s1.getCost() == s2.getCost())
            return 0;
        else if (s1.getCost() < s2.getCost())
            return 1;
        else
            return -1;
	}

	
}

package ArrayList1;

import java.util.ArrayList;
import java.util.List;

public class Tester {
	 public static void main(String[] args) {
	        participant[] finalists1 = {new participant("Hazel", "Singing", 91.2),
	                new participant("Ben", "Instrumental", 95.7),
	                new participant("John", "Singing", 94.5),
	                new participant("Bravo", "Singing", 97.6)};

	        List<participant> finalists1List = generateListOfFinalists(finalists1);

	        System.out.println("All Finalists:");
	        for (participant finalist : finalists1List) {
	            System.out.println(finalist.toString());
	        }

	        List<participant> singingFinalists = getFinalistsByTalent(finalists1List, "Singing");

	        System.out.println("\nSinging Finalists:");
	        for (participant finalist : singingFinalists) {
	            System.out.println(finalist.toString());
	        }

	        participant[] finalists2 = {new participant("Mark", "Instrumental", 81.2),
	                new participant("Ella", "Instrumental", 65.7),
	                new participant("Lily", "Singing", 86.5)};

	        List<participant> finalists2List = generateListOfFinalists(finalists2);

	        System.out.println("\nAll Finalists:");
	        for (participant finalist : finalists2List) {
	            System.out.println(finalist.toString());
	        }

	        List<participant> instrumentalFinalists = getFinalistsByTalent(finalists2List, "Instrumental");

	        System.out.println("\nInstrumental Finalists:");
	        for (participant finalist : instrumentalFinalists) {
	            System.out.println(finalist.toString());
	        }
	    }

	    public static List<participant> generateListOfFinalists(participant[] finalists) {
	        List<participant> finalistList = new ArrayList<>();
	        for (participant finalist : finalists) {
	            finalistList.add(finalist);
	        }
	        return finalistList;
	    }

	    public static List<participant> getFinalistsByTalent(List<participant> finalists, String talent) {
	        List<participant> filteredList = new ArrayList<>();
	        for (participant finalist : finalists) {
	            if (finalist.getpTalent().equals(talent)) {
	                filteredList.add(finalist);
	            }
	        }
	        return filteredList;
	    }
	}


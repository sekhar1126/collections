package Queue1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Tester {

	public static List<Deque<patient>> splitQueue(Deque<patient> patientsQueue) {
		List<Deque<patient>> queuesList = new ArrayList<Deque<patient>>();
		Deque<patient> seniorQueue = new ArrayDeque<patient>();
		Deque<patient> normalQueue = new ArrayDeque<patient>();
		
		for (patient patient : patientsQueue) {
			if(patient.getAge() >= 60) {
				seniorQueue.add(patient);
			}
			else {
				normalQueue.add(patient);
			}
		}
		
		queuesList.add(seniorQueue);
		queuesList.add(normalQueue);
		
		return queuesList;
	}
	
	public static void main(String[] args) {
		
		patient patient1 = new patient("Jack","Male",25);
		patient patient2 = new patient("Tom","Male",64);
		patient patient3 = new patient("Simona","Female",24);
		
		Deque<patient> patientsQueue = new ArrayDeque<patient>();
		patientsQueue.add(patient1);
		patientsQueue.add(patient2);
		patientsQueue.add(patient3);
		
		List<Deque<patient>> queuesList = splitQueue(patientsQueue);
	
		int counter=0;
		for (Deque<patient> queue : queuesList) {
			if(counter==0)
				System.out.println("Patients in the senior queue\n============================");
			else
				System.out.println("Patients in the normal queue\n============================");
			
			for (patient patient : queue) {
				System.out.println("Name : "+patient.getName());
				System.out.println("Age : "+patient.getAge());
				System.out.println();
			}
			counter++;
		}	
	}
	
}

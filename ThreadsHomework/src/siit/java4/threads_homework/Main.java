package siit.java4.threads_homework;
/**
 * @author Romeo Tout
 * @version 1.0
 */

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList<String> queue = new LinkedList<>();
		FestivalGate gate = new FestivalGate();

		TicketType ticketType;

		// TODO CODE REVIEW: you could have used just new FestivalAttendeeThread(TicketType.randomTicketType(), 4gate, queue); 
		FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType = TicketType.randomTicketType(),
				gate, queue);

		FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate, queue);
		statsThread.start();

		festivalAttendee.generateAtendeeThreads(80);

	}

}

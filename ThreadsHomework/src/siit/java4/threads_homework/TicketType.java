package siit.java4.threads_homework;

import java.util.Random;

public enum TicketType {

	FULL, FULL_VIP, FREE_PASS, ONE_DAY, ONE_DAY_VIP;
	/**
	 * @returns a random ticket type
	 */
	public static TicketType randomTicketType() {
		// TODO CODE REVIEW: Generating random instances of ticketType isn't
		// necessarily the TicketType class' responsability. You could have done
		// this in Main for example.
		Random random = new Random();
		return values()[random.nextInt(values().length)];

	}
}

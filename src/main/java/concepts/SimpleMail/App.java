package concepts.SimpleMail;

import Email.GEmailSender;

public class App {
	public static void main(String[] args) {
		GEmailSender gEmailSender = new GEmailSender();
		String to = "khannehalacecomp@gmail.com";
		String from = "shaikhibrahim9999@gmail.com";
		String subject = "Sending email using Gmail.";
		String text = "This is a test mail.";

		boolean b = gEmailSender.sendEmail(to, from, subject, text);
		if (b) {
			System.out.println("Email is sent Successfully.");
		} else {
			System.out.println("There is a problem in sending mail.");
		}
	}
}

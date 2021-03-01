import java.util.Scanner;

/**
 * 
 */

/**
 * @author John
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numb;
		
		do {
			/**
			 * Main Menu
			 */
			System.out.println("===========================");
			System.out.println("Select one of the following:");
			System.out.println("1: To add a video");
			System.out.println("2: To delete a video");
			System.out.println("3: To add a customer");
			System.out.println("4: To delete a customer");
			System.out.println("5: To check if a particular video is in store");
			System.out.println("6: To check out a video");
			System.out.println("7: To check in a video");
			System.out.println("8: To print all customers");
			System.out.println("9: To print all videos");
			System.out.println("10: To print in store videos");
			System.out.println("11: To print all rent videos");
			System.out.println("12: To print the videos rent by a customer");
			System.out.println("13: To exit");
			System.out.println("===========================");
			
			Scanner input = new Scanner(System.in);
			numb = input.nextInt();
			
			switch(numb) {
			/**
			 * (1) a message is printed to ask the information of the video;
			 * (2) the information is entered;
			 * (3) the video is added to the data structure if the provided information is valid;
			 * (4) the main Menu is shown.
			 */
			case 1:
				System.out.println("Adding Video");
				break;
			/**
			 * (1) a message is printed to ask the information of the video;
			 * (2) the information is entered;
			 * (3) the video is deleted from the data structure if the provided information is valid;
			 * (4) the main Menu is shown.
			 */
			case 2:
				System.out.println("Deleting Video");
				break;
			/**
			 * (1) a message is printed to ask the information of the customer;
			 * (2) the information is entered;
			 * (3) the customer is added to the data structure if the provided information is valid;
			 * (4) the main Menu is shown.	
			 */
			case 3:
				System.out.println("Adding Customer");
				break;
			/**
			 * (1) a message is printed to ask the information of the customer;
			 * (2) the information is entered;
			 * (3) the customer is deleted from the data structure if the provided information is valid;
			 * (4) the main Menu is shown.
			 */
			case 4:
				System.out.println("Deleting Customer");
				break;
			/**
			 * (1) a message is printed to ask the information of the video;
			 * (2) the information is entered;
			 * (3) “true” is printed if the video is in store; “false” is printed otherwise;
			 * (4) the main Menu is shown.
			 */
			case 5:
				System.out.println("Checking if Video is in store");
				break;
			/**
			 * (1) a message is printed to ask the information of the customer and video;
			 * (2) the information is entered;
			 * (3) the video is checked out if the video is in store;
			 * (4) the main Menu is shown.
			 */
			case 6:
				System.out.println("Checking out Video");
				break;
			/**
			 * (1) a message is printed to ask the information of the video;
			 * (2) the information is entered;
			 * (3) the video is checked in if the provided information is valid;
			 * (4) the main Menu is shown.
			 */
			case 7:
				System.out.println("Checking in Video");
				break;
			/**
			 * (1) all customers are printed;
			 * (2) the main Menu is shown.
			 */
			case 8:
				System.out.println("Printing All Customers");
				break;
			/**
			 * (1) all videos (in store videos and rent videos) are printed;
			 * (2) the main Menu is shown.
			 */
			case 9:
				System.out.println("Printing All Videos");
				break;
			/**
			 * (1) the in store videos are printed;
			 * (2) the main Menu is shown.
			 */
			case 10:
				System.out.println("Printing in Store Videos");
				break;
			/**
			 * (1) all rent videos are printed;
			 * (2) the main Menu is shown.
			 */
			case 11:
				System.out.println("Printing All Rented Videos");
				break;
			/**
			 * (1) a message is printed to ask the information of the customer;
			 * (2) the information is entered;
			 * (3) the videos rent by the customer are printed if the provided information is valid;
			 * (4) the main Menu is shown.
			 */
			case 12:
				System.out.println("Printing All Rented Videos by a Customer");
				break;
			/**
			 * (1) “Goodbye” message is printed and program terminates.
			 */
			case 13:
				System.out.println("Goodbye!");
				break;
				
			}
		} while(numb != 13);
		
	}

}

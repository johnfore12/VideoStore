import java.util.Scanner;

import SLL.SLL;
import SLL.SNode;
import DLL.DLL;
import DLL.DNode;
import BST.BST;
import AVL.AVL;


/**
 * 
 */

/**
 * @author John W. Fore
 *
 */
public class VideoStore {

	public static SLL sll = new SLL();
	public static DLL dll = new DLL();
	public static BST bst = new BST();
	public static AVL avl = new AVL();
	
	
	/**
	 * Driver method for project
	 * @param args
	 * @throws InstantiationException 
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) {
		
		/**
		 * checks for arguments and runs appropriate method
		 */
		if(args[0].equals("SLL")) {
			 System.out.println("Yes");
			 VideoStoreWSll(sll);
				 
		 }
		 else if(args[0].equals("DLL")) {
			 VideoStoreWDll(dll);
			
		 }
		 else if(args[0].equals("BST")) {
			 VideoStoreWBST(bst);
		 }
		 else if(args[0].equals("AVL")) {
			 VideoStoreWAVL(avl);
		 }
		
	}
	
	
	/**
	 * Method to run the video store with SLL
	 */
	private static void VideoStoreWSll(SLL sll) {
		
		int numb;
		System.out.println("Running VideoStoreWSll ...\n");
		
		do {
			
			printMenu();
			
			Scanner input = new Scanner(System.in);
			numb = input.nextInt();
			
			switch(numb) {
			/**
			 * (1) a message is printed to ask the information of the video;
			 * (2) the information is entered;
			 * (3) the video is added to the data structure if the provided information is valid;
			 * (4) the main Menu is shown.
			 * WORKING
			 */
			case 1:
				System.out.println("Please enter the name of the Video");
				Scanner videoInput = new Scanner(System.in);
				Object videoName = videoInput.nextLine();
				SNode sNode = new SNode(videoName, null);
				sll.add(sNode); 
				
				break;
			/**
			 * (1) a message is printed to ask the information of the video;
			 * (2) the information is entered;
			 * (3) the video is deleted from the data structure if the provided information is valid;
			 * (4) the main Menu is shown.
			 */
			case 2:
				System.out.println("Deleting Video...");
				System.out.println("Please enter the name of the Video");
				Scanner deleteInput = new Scanner(System.in);
				String video = deleteInput.nextLine();
				boolean tempBoolean = sll.search(video);
				if( tempBoolean == true) {
					sll.removeNodeAt(sll.findIndex(video));
				}else {
					System.out.println("Video entered does not exist...");
				}
				
				//TODO SLL method to remove at index and search for element
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
				Scanner searchInput = new Scanner(System.in);
				System.out.println("Enter video name: ");
				String searchValue = searchInput.next();
				System.out.println(sll.search(searchValue));
				System.out.println("Index of Video: " + sll.findIndex(searchValue));
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
			 * WORKING
			 */
			case 9:
				System.out.println("Printing All Videos");
				System.out.print("SLL Videos: "); sll.print();
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
	
	/**
	 * Method to run the video store with DLL
	 */
	private static void VideoStoreWDll(DLL dll) {
		
		int numb;
		
		do {
			
			System.out.println("Running VideoStoreWDll ...\n");
			printMenu();
			
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
				System.out.println("Please enter the name of the Video");
				Scanner dllVideoInput = new Scanner(System.in);
				Object videoName = dllVideoInput.nextLine();
				DNode dNode = new DNode(videoName, null, null);
				
				if(dll.getHeader().getNext() == null) {
					dll.addFirst(dNode); 
					System.out.println("Added first");
				}else{
					dll.addLast(dNode);
					System.out.println("Added last");
				}
			
				//Insert into data structure if valid. 
				
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
				System.out.print("DLL Videos: "); dll.print();
				
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
	
	/**
	 * Method to run the video store with BST
	 */
	private static void VideoStoreWBST(BST bst) {
		
		int numb;
		
		do {
			
			System.out.println("Running VideoStoreWBST ...\n");
			printMenu();
			
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
				System.out.println("Please enter the name of the Video");
				
				Object videoName = input.nextLine();
			
				//Insert into data structure if valid. 
				
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
	
	/**
	 * Method to run the video store with AVL
	 */
	private static void VideoStoreWAVL(AVL avl) {
		
		int numb;
		
		do {
			System.out.println("Running VideoStoreWAVl ...\n");
			printMenu();
			
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
				System.out.println("Please enter the name of the Video");
				
				Object videoName = input.nextLine();
			
				//Insert into data structure if valid. 
				
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
	
	/*
	 * Prints the main menu
	 */
	private static void printMenu() {
		
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
		
	}
}

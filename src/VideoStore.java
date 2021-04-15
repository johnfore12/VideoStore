import java.util.Scanner;

import SLL.SLL;
import SLL.SNode;
import Video.Video;
import DLL.DLL;
import DLL.DNode;
import BST.BST;
import BST.BSTNode;
import Customer.Customer;
import AVL.AVL;


/**
 * 
 */

/**
 * @author John W. Fore
 *
 */
public class VideoStore {

	public static SLL sllVideos = new SLL();
	public static SLL sllCustomers = new SLL();
	public static DLL dllVideos = new DLL();
	public static DLL dllCustomers = new DLL();
	public static BST bstVideos = new BST();
	public static BST bstCustomers = new BST();
	public static AVL avlVideos = new AVL();
	public static AVL avlCustomers = new AVL();
	public static int customerCounter = 1;
	public static int videoCounter = 0;
	public static int id = 0;
	
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
			 VideoStoreWSll(sllVideos, sllCustomers); 
		 }
		 else if(args[0].equals("DLL")) {
			 VideoStoreWDll(dllVideos, dllCustomers);
		 }
		 else if(args[0].equals("BST")) {
			 VideoStoreWBST(bstVideos, bstCustomers);
		 }
		 else if(args[0].equals("AVL")) {
			 VideoStoreWAVL(avlVideos, avlCustomers);
		 }
	}

	/**
	 * Method to run the video store with SLL
	 */
	private static void VideoStoreWSll(SLL sllVideos, SLL sllCustomers) {
		
		int numb;
		System.out.println("\nRunning VideoStoreWSll ...\n");
		
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
				String videoName = videoInput.nextLine();
				Video video = new Video(videoName, videoCounter);
				video.setTitle(videoName);
				video.setId(videoCounter);
				SNode sNode = new SNode(video, null);
				sllVideos.add(sNode);
				videoCounter++;
				break;
			/**
			 * (1) a message is printed to ask the information of the video;
			 * (2) the information is entered;
			 * (3) the video is deleted from the data structure if the provided information is valid;
			 * (4) the main Menu is shown.
			 * WORKING
			 */
			case 2:
				System.out.println("Deleting Video...");
				System.out.println("Please enter the index of the Video");
				Scanner deleteVidInput = new Scanner(System.in);
				int videoNumb = deleteVidInput.nextInt();
				sllVideos.removeNodeAt(videoNumb);
				break;
			/**
			 * (1) a message is printed to ask the information of the customer;
			 * (2) the information is entered;
			 * (3) the customer is added to the data structure if the provided information is valid;
			 * (4) the main Menu is shown.
			 * WORKING	
			 */
			case 3:
				System.out.println("Adding Customer");
				System.out.println("Please enter the name of the Customer");
				Scanner customerInput = new Scanner(System.in);
				String customerName = customerInput.nextLine();
				Customer customer = new Customer(customerName, customerCounter);
				customer.setName(customerName);
				customer.setId(customerCounter);
				SNode sCustomerNode = new SNode(customer, null);
				sllCustomers.add(sCustomerNode);
				customerCounter++;
				break;
			/**
			 * (1) a message is printed to ask the information of the customer;
			 * (2) the information is entered;
			 * (3) the customer is deleted from the data structure if the provided information is valid;
			 * (4) the main Menu is shown.
			 * WORKING
			 */
			case 4:
				System.out.println("Deleting Customer");
				System.out.println("Please enter the index of the Customer");
				Scanner deleteCustInput = new Scanner(System.in);
				int custNumb = deleteCustInput.nextInt();
				sllCustomers.removeNodeAt(custNumb);
				break;
			/**
			 * (1) a message is printed to ask the information of the video;
			 * (2) the information is entered;
			 * (3) “true” is printed if the video is in store; “false” is printed otherwise;
			 * (4) the main Menu is shown.
			 * WORKING
			 */
			case 5:
				System.out.println("Checking if Video is in store");
				Scanner searchInput = new Scanner(System.in);
				System.out.println("Enter video name: ");
				String searchValue = searchInput.next();
				System.out.println(sllVideos.searchVideo(searchValue));
				break;
			/**
			 * (1) a message is printed to ask the information of the customer and video;
			 * (2) the information is entered;
			 * (3) the video is checked out if the video is in store;
			 * (4) the main Menu is shown.
			 */
			case 6:
				System.out.println("Checking out Video");
				Scanner custInput = new Scanner(System.in);
				System.out.println("Enter customer: ");
				String cust = custInput.nextLine();
				Scanner vidInput = new Scanner(System.in);
				System.out.println("Enter video: ");
				String vid = vidInput.nextLine();
				
				if(sllVideos.searchVideo(vid) == true) {
					//check out video
				}else {
					System.out.println("Video is not present...");
				}
				
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
			 * WORKING
			 */
			case 8:
				System.out.println("Printing All Customers");
				System.out.print("SLL Customers: "); 
				sllCustomers.print();
				break;
			/**
			 * (1) all videos (in store videos and rent videos) are printed;
			 * (2) the main Menu is shown.
			 * WORKING
			 */
			case 9:
				System.out.println("Printing All Videos");
				System.out.print("SLL Videos: "); 
				sllVideos.print();
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
			 * WORKING
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
	private static void VideoStoreWDll(DLL dllVideos, DLL dllCustomers) {
		
		int numb;
		
		do {
			
			System.out.println("\nRunning VideoStoreWDll ...\n");
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
				String videoName = videoInput.nextLine();
				Video video = new Video(videoName, videoCounter);
				video.setTitle(videoName);
				video.setId(videoCounter);
				DNode dNode = new DNode(video, null, null);
				
				if(dllVideos.getHeader().getNext() == dllVideos.getTrailer()) {
					dllVideos.addFirst(dNode); 
					System.out.println("Added first");
				}else{
					dllVideos.addLast(dNode);
					System.out.println("Added last");
				}
				videoCounter++;
				
				break;
			/**
			 * (1) a message is printed to ask the information of the video;
			 * (2) the information is entered;
			 * (3) the video is deleted from the data structure if the provided information is valid;
			 * (4) the main Menu is shown.
			 * WORKING
			 */
			case 2:
				System.out.println("Deleting Video...");
				System.out.println("Please enter the index of the Video");
				Scanner deleteVidInput = new Scanner(System.in);
				int videoNumb = deleteVidInput.nextInt();
				dllVideos.removeNodeAt(videoNumb);
				
				break;
			/**
			 * (1) a message is printed to ask the information of the customer;
			 * (2) the information is entered;
			 * (3) the customer is added to the data structure if the provided information is valid;
			 * (4) the main Menu is shown.	
			 * WORKING
			 */
			case 3:
				System.out.println("Adding Customer");
				System.out.println("Please enter the name of the Customer");
				Scanner customerInput = new Scanner(System.in);
				String customerName = customerInput.nextLine();
				Customer customer = new Customer(customerName, customerCounter);
				customer.setName(customerName);
				customer.setId(customerCounter);
				DNode dCustomerNode = new DNode(customer, null, null);
				
				if(dllCustomers.getHeader().getNext() == dllCustomers.getTrailer()) {
					dllCustomers.addFirst(dCustomerNode); 
					System.out.println("Added first");
				}else{
					dllCustomers.addLast(dCustomerNode);
					System.out.println("Added last");
				}
				customerCounter++;
				
				break;
			/**
			 * (1) a message is printed to ask the information of the customer;
			 * (2) the information is entered;
			 * (3) the customer is deleted from the data structure if the provided information is valid;
			 * (4) the main Menu is shown.
			 * WORKING
			 */
			case 4:
				System.out.println("Deleting Customer");
				System.out.println("Please enter the index of the Customer");
				Scanner deleteCustInput = new Scanner(System.in);
				int custNumb = deleteCustInput.nextInt();
				dllCustomers.removeNodeAt(custNumb);
				break;
			/**
			 * (1) a message is printed to ask the information of the video;
			 * (2) the information is entered;
			 * (3) “true” is printed if the video is in store; “false” is printed otherwise;
			 * (4) the main Menu is shown.
			 * WORKING
			 */
			case 5:
				System.out.println("Checking if Video is in store");
				Scanner searchInput = new Scanner(System.in);
				System.out.println("Enter video name: ");
				String searchValue = searchInput.next();
				System.out.println(dllVideos.searchVideo(searchValue));
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
				System.out.print("DLL Customers: "); dllCustomers.print();
				break;
			/**
			 * (1) all videos (in store videos and rent videos) are printed;
			 * (2) the main Menu is shown.
			 * WORKING
			 */
			case 9:
				System.out.println("Printing All Videos");
				System.out.print("DLL Videos: "); dllVideos.print();
				
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
			 * WORKING
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
	private static void VideoStoreWBST(BST bstVideo, BST bstCustomer) {
		
		int numb;
		
		do {
			
			System.out.println("\nRunning VideoStoreWBST ...\n");
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
				String videoName = videoInput.nextLine();
				Video video = new Video(videoName, videoCounter);
				video.setTitle(videoName);
				video.setId(videoCounter);
				BSTNode bstNode = new BSTNode(id, video);
				
				if(bstVideos.getRoot() == null) {
					bstVideos.setRoot(bstNode);
				}else {
					bstVideos.insert(id, video); 
				}
				
				videoCounter++;
				id++;
				
				break;
			/**
			 * (1) a message is printed to ask the information of the video;
			 * (2) the information is entered;
			 * (3) the video is deleted from the data structure if the provided information is valid;
			 * (4) the main Menu is shown.
			 * WORKING
			 */
			case 2:
				System.out.println("Deleting Video");
				break;
			/**
			 * (1) a message is printed to ask the information of the customer;
			 * (2) the information is entered;
			 * (3) the customer is added to the data structure if the provided information is valid;
			 * (4) the main Menu is shown.	
			 * WORKING
			 */
			case 3:
				System.out.println("Adding Customer");
				System.out.println("Please enter the name of the Customer");
				Scanner customerInput = new Scanner(System.in);
				String customerName = customerInput.nextLine();
				Customer customer = new Customer(customerName, customerCounter);
				customer.setName(customerName);
				customer.setId(customerCounter);
				BSTNode bstCustomerNode = new BSTNode(id, customer);
				
				if(bstCustomers.getRoot() == null) {
					bstCustomers.setRoot(bstCustomerNode);
				}else {
					bstCustomers.insert(id, customer); 
				}
				
				customerCounter++;
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
				int searchValue = searchInput.nextInt();
				System.out.print(bstVideos.searchVideo(searchValue));
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
			 * WORKING
			 */
			case 8:
				System.out.println("Printing All Customers");
				bstCustomers.print();
				break;
			/**
			 * (1) all videos (in store videos and rent videos) are printed;
			 * (2) the main Menu is shown.
			 * WORKING
			 */
			case 9:
				System.out.println("Printing All Videos");
				bstVideos.print();
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
			 * WORKING
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
	private static void VideoStoreWAVL(AVL avlVideo, AVL avlCustomer) {
		
		int numb;
		
		do {
			System.out.println("\nRunning VideoStoreWAVl ...\n");
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
		System.out.println("\n===========================");
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
		System.out.println("===========================\n");
		
	}
}

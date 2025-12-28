package TrainBookingSystem;

import java.util.List;
import java.util.Scanner;

public class IRCTCAPP {
    private Scanner sc = new Scanner(System.in);
    private UserServices userServices = new UserServices();
    private BookingService bookingService = new BookingService();
    public static void main(String[] args) {
        new IRCTCAPP().start();

    }

    private void start(){
        while (true){

            System.out.println("-------Welcome to IRCTC APP-------");
            if (!userServices.isLoggedIn()){
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> register();
                    case 2 -> login();
                    case 3 -> exitApp();
                    default -> System.out.println("Invalid choice");
                }
            }else {
                showUserMenu();
            }
        }
    }


    private void register(){
        sc.nextLine();
        System.out.print("Enter Full Name: ");
        String fullname = sc.nextLine();
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Contact Number: ");
        String contact = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        boolean success =
                userServices.registerUser(fullname, username, password, contact);
        if (success){
            System.out.println("Registration successful");
        } else {
            System.out.println("Username already exists");
        }
    }


    private void login(){
        System.out.println("Enter User name");
        String username=sc.next();
        System.out.println("Enter password");
        String password=sc.next();
        boolean success = userServices.loginUser(username,password);
        if (success){
            System.out.println("Login successful");
            return;
        }
        System.out.println("Invalid Login Credentials");
    }

    private void showUserMenu(){
        System.out.println("1. Search Trains");
        System.out.println("2. Book Tickets");
        System.out.println("3. View My Tickets");
        System.out.println("4. View All Trains");
        System.out.println("5. Cancel All Tickets");
        System.out.println("6. Cancel Ticket");
        System.out.println("7. Logout");
        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();
        switch (choice){
            case 1 -> searchTrains();
            case 2 -> bookTickets();
            case 3 -> viewMyTickets();
            case 4 -> bookingService.listAllTrain();
            case 5 -> cancelAllTickets();
            case 6 -> cancelTicket();
            case 7 -> logout();
            default -> System.out.println("Invalid Choice ");
        }
    }

    private void searchTrains() {
        System.out.println("Enter Source: ");
        String source = sc.nextLine();
        System.out.println("Enter Destination: ");
        String destination = sc.nextLine();
        List<Train> train = bookingService.searchTrain(source,destination);
        if (train!=null){
            for (Train train1: train){
                System.out.println(train1);
            }
        }else {
            System.out.println("No train available Btw "+source+" and "+destination);
        }



        System.out.println("Do you want to book ticket? (yes/no");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("yes")){
            bookTickets();
        }

    }

    private void bookTickets(){
        System.out.println("Enter Train ID");
        int trainId = sc.nextInt();
        System.out.println("Enter seats: ");
        int seats = sc.nextInt();
        Ticket ticket = bookingService.bookTicket(userServices.currentUser,trainId,seats);

        if (ticket!=null){
            System.out.println("Booking successful");
        }else {
            System.out.println("Seats not available");
        }
    }

    private void viewMyTickets(){
        List<Ticket> ticketList = bookingService.getTicketByUser(userServices.currentUser);
        if (ticketList!=null){
            for (Ticket ticket:ticketList){
                System.out.println(ticket);
            }
        }else {
            System.out.println("No ticket found with user "+userServices.currentUser);
            showUserMenu();
        }
    }

    private void cancelAllTickets(){
        List<Ticket> ticketList= bookingService.getTicketByUser(userServices.currentUser);
        if (ticketList==null || ticketList.isEmpty()){
            System.out.println("NO tickets found for user "+userServices.currentUser);
            return;
        }
        for (Ticket ticket:ticketList){
            bookingService.cancelTicket(ticket.getTicketId(),userServices.currentUser);
        }

    }

    private void cancelTicket(){
        System.out.println("Enter Ticket Id");
        int ticketId = sc.nextInt();
        bookingService.cancelTicket(ticketId,userServices.currentUser);
    }


    private void logout(){
        System.out.println("Thank you for using IRCTC APP");
        userServices.logoutUser();
    }


    private void exitApp(){
        System.exit(0);
    }




}

package TrainBookingSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookingService {
    List<Train> trainList = new ArrayList<>();
    List<Ticket> ticketList = new ArrayList<>();

    BookingService(){
        trainList.add(new Train(101, "Rajdhani Express", "New Delhi", "Mumbai Central", 300));
        trainList.add(new Train(102, "August Kranti Rajdhani", "New Delhi", "Mumbai Central", 280));
        trainList.add(new Train(103, "Duronto Express", "New Delhi", "Mumbai Central", 350));
        trainList.add(new Train(104, "Garib Rath Express", "Hazrat Nizamuddin", "Mumbai Central", 600));
        trainList.add(new Train(105, "Paschim Express", "Delhi Cantt", "Mumbai Central", 900));
        trainList.add(new Train(106, "Mumbai Rajdhani", "New Delhi", "Mumbai Central", 320));
        trainList.add(new Train(107, "Golden Temple Mail", "New Delhi", "Mumbai Central", 850));
        trainList.add(new Train(108, "Avantika Superfast", "Hazrat Nizamuddin", "Mumbai Central", 720));
    }

    List<Train> searchTrain(String source,String destination){
        List<Train> res = new ArrayList<>();
        for (Train train: trainList){
            if (train.getSource().equalsIgnoreCase(source)&&
                train.getDestination().equalsIgnoreCase(destination)){
                res.add(train);
            }
        }
        return res;
    }

    Ticket bookTicket(User user, int trainId,int seatCount){
        for (Train train: trainList){
            if ((train.getTrainId()==trainId)){
                if (train.bookSeats(seatCount)){
                    Ticket ticket  = new Ticket(train,user, seatCount);
                    ticketList.add(ticket);
                    return ticket;
                }else {
                    System.out.println("Seats not available");
                    return null;
                }
            }
        }
        System.out.println("Train not found");
        return null;
    }

    List<Ticket> getTicketByUser(User user){
        List<Ticket> res = new ArrayList<>();
        for (Ticket ticket: ticketList){
            if (ticket.getUser().equals(user)){
                res.add(ticket);
            }
        }
        return res;
    }

    public boolean cancelTicket(int ticketId,User user){
        Iterator<Ticket> iterator = ticketList.iterator();
        while (iterator.hasNext()){
            Ticket ticket = iterator.next();
            if (ticket.getUser().equals(user) && ticket.getTicketId()==ticketId){
                ticket.getTrain().cancelSeats(ticket.getSeatBooked());
                iterator.remove();
                return true;
            }
        }
        System.out.println("ticket not found with user "+user);
        return false;
    }

    public void listAllTrain(){
        for (Train train: trainList){
            System.out.println(train);
        }
    }



}

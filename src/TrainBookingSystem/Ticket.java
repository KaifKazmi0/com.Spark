package TrainBookingSystem;

public class Ticket {
    private static int count = 10001;
    private int ticketId;
    private Train train;
    private User user;
    private int seatBooked;

    public Ticket( Train train, User user, int seatBooked) {
        this.ticketId += count++;
        this.train = train;
        this.user = user;
        this.seatBooked = seatBooked;
    }


    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }

    @Override
    public String toString(){
        return "TicketId: "+ticketId+" | "+"Train "+train.getTrainName()+
                "Route "+train.getSource()+" -> "+train.getDestination()+
                " | SeatAvailable"+train.getAvailableSeat()+" | UserName: "+user.getFullName();
    }
}

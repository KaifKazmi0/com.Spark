package TrainBookingSystem;

public class Train {
    private String trainName;
    private String source;
    private String destination;
    private int totalSeat;
    private int availableSeat;
    private int trainId;

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public Train(String trainName, String source, String destination,
                 int totalSeat, int trainId) {
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.totalSeat = totalSeat;
        this.availableSeat = totalSeat;
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public int getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(int availableSeat) {
        this.availableSeat = availableSeat;
    }

    @Override
    public String toString(){
        return "Train Name and Id: "+trainName+" | "+trainId+" | Route: "+source+" -> "+destination+" Available Seats: "+availableSeat;
    }
}

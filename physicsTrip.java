public class physicsTrip {
    private static int fee = 1;
    private String travelersName;
    private String destination;
    private int duration;
    private boolean physicsRuined;
    private double totalCost;

    public physicsTrip(){
        this.travelersName = "Danny";
        this.destination = "Issac Newton's House";
        this.duration = 1;
        this.physicsRuined = true;
    }
    public String gettravelersName() {
    return travelersName;
}
    public String getdestination(){
    return destination;
}
    public int getduration(){
    return duration;
}
    public boolean getphysicsRuined(){
    return physicsRuined;
}
    public double gettotalCost(){
    return totalCost;
}
public String toString(){
    String state = "physicsTrip[" + travelersName +  " went on a trip to " + destination + " for " + duration + " day and it is " + physicsRuined + " that physics was ruined.]";
    return state;
}
}
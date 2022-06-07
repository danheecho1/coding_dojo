public class TestHashmatique {
    public static void main(String[] args) {

    Hashmatique getTrack = new Hashmatique();
    
    getTrack.addTrack("We are family", "I got all my sisters with me");
    getTrack.addTrack("Heaven must be missing an angel", "'cause you're here with me right now");
    getTrack.addTrack("You're the first, the last, my everything", "You and me baby");
    getTrack.addTrack("Fire", "'cause when we kiss, ooh");

    System.out.println(getTrack.pickATrack("We are family"));

    getTrack.listAllTracks();

    }
}
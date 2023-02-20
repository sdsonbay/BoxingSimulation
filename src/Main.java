public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 30, 100,90, 0);
        Fighter alex = new Fighter("Alex", 30, 100, 90, 0);
        Ring ring = new Ring(marc, alex, 90, 100);
        ring.run();
    }
}

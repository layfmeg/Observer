public class DisplayPhone implements Observer {
    public void update(int temperature) {
        System.out.println("DisplayPhone: Current temperature is " + temperature + " degrees.");
    }
}

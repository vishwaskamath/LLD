package behavioral.observer;

public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String latestVideo) {
        System.out.println(name + " received notification about new video: " + latestVideo);
    }
}

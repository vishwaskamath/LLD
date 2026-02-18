package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    private String channelName;
    private List<Observer> subscribers = new ArrayList<>();
    private String latestVideo;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : subscribers) {
            o.update(latestVideo);
        }
    }

    public void uploadVideo(String newVideo){
        this.latestVideo = newVideo;
        System.out.println("Channel " + channelName + " uploaded a new video: " + newVideo);
        notifyObservers();
    }

}

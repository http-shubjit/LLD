import java.util.ArrayList;
import java.util.List;

interface Subscriber {
    void update(String videoTitle);
}

class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(this.name + " has been notified of a new video: " + videoTitle);
    }
    
    @Override
    //  it will return a string that consists of the class name followed by the "@" symbol like User@1f32e575 to its actual string name
    public String toString() {
        return name; 
    }
}

interface Channel {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();
}

class YoutubeChannel implements Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestVideo;


    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber + " has subscribed to the channel.");
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber + " has unsubscribed from the channel.");
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            
            subscriber.update(latestVideo);
        }
    }

    public void uploadVideo(String title) {
        this.latestVideo = title;
        System.out.println("New video uploaded: " + title);
        notifySubscribers();
    }
    
}

public class Observer {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        // Create subscribers
        Subscriber user1 = new User("Alice");
        Subscriber user2 = new User("Shubh");
        Subscriber user3 = new User("Ktm");
        Subscriber user4 = new User("Enfield");
        

        // Subscribe users to the channel
        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);
        channel.subscribe(user4);

        // Upload videos and notify subscribers
        channel.uploadVideo("Design Patterns in Java");
        channel.uploadVideo("Observer Pattern Explained");

        // Unsubscribe a user and upload another video
        channel.unsubscribe(user1);
        channel.uploadVideo("Factory Pattern Tutorial");
    }
}



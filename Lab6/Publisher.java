import java.util.ArrayList;

public class Publisher {
	private String name;
	private ArrayList<Subscriber> subscriberList;
	private ArrayList<Video> videoList;
	
	// Cosntructor publisher with parameter name
	public Publisher (String name) {
		this.name = name;
		this.subscriberList = new ArrayList<Subscriber>();
		this.videoList = new ArrayList<Video>();
	}
	
	// Return the name of the this publisher
	public String getName () {
		return this.name;
	}
	
	// Add video to this publisher videoList
	// and add video to their subscriber timeline
	public void uploadVideo (Video video) {
		video.setPublisher(this);
		videoList.add(video);
		for (Subscriber subscriber : subscriberList) {
			subscriber.addVideo(video);
		}
	}
	
	// Add subscriber to this publisher
	public void addSubscriber (Subscriber subscriber) {
		subscriberList.add(subscriber);
	}
	
	// Remove subscriber from this publisher
	public void removeSubscriber (Subscriber subscriber) {
		subscriberList.remove(subscriber);
	}
	
	// Print all of this publisher subscriber if exist
	public void printSubscribers () {
		System.out.printf("%s : ", this.name);
		if (subscriberList.size() == 0) {
			System.out.println("no subscribers");
		} else {
			for (Subscriber subscriber : subscriberList) {
				System.out.printf("%s ", subscriber.getName());
			}
			System.out.println();
		}
	}
}
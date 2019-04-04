import java.util.ArrayList;

public class Subscriber {
	private String name;
	private ArrayList<Publisher> publisherList;
	private ArrayList<Video> videoList;
	
	// Subscriber constructor
	public Subscriber (String name) {
		this.name = name;
		this.publisherList = new ArrayList<Publisher>();
		this.videoList = new ArrayList<Video>();
	}
	
	// Return this subscriber name
	public String getName () {
		return this.name;
	}
	
	// Watch video by add their view count
	public void watch (Video video) {
		video.getWatch();
	}
	
	// Add video to this subscriber timeline
	public void addVideo (Video video) {
		videoList.add(video);
	}
	
	// Add this to publisher subscriber list
	// and add publisher to this publisher list
	public void subscribe(Publisher publisher) {
		publisher.addSubscriber(this);
		publisherList.add(publisher);
	}
	
	// Remove this from publisher subscriber list
	// and remove publisher from this publisher list
	public void unsubscribe(Publisher publisher) {
		publisher.removeSubscriber(this);
		publisherList.remove(publisher);
	}
	
	// Print all the video in this timeline
	public void printTimeline () {
		System.out.printf("%s : ", this.name);
		for (Video video : videoList) {
			System.out.printf("[%s] ", video.getTitle());
		}
		System.out.println();
	}
	
	// Print all publisher that this subscribe
	public void printPublishers () {
		System.out.printf("%s : ", this.name);
		for (Publisher publisher : publisherList) {
			System.out.printf("%s ", publisher.getName());
		}
		System.out.println();
	}
}
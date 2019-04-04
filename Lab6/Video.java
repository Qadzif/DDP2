import java.util.ArrayList;

public class Video {
	private String title;
	private int viewCounter;
	private Publisher publisher;
	
	// Video constructor
	public Video (String title) {
		this.title = title;
		this.viewCounter = 0;
	}
	
	// Return this video title
	public String getTitle () {
		return this.title;
	}
	
	// Print this video details
	// [title] - publisher - views
	public void getDetails () {
		System.out.printf("[%s] - %s - %d views\n",this.title, this.publisher.getName(), this.viewCounter);
	}
	
	// Add video view count when get watch
	public void getWatch () {
		this.viewCounter++;
	}
	
	// Set publisher of this video
	public void setPublisher (Publisher publisher) {
		this.publisher = publisher;
	}
}
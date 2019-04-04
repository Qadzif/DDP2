public class Main {
    public static void main(String[] args) {
        Publisher publisher1 = new Publisher("Joe");
        Publisher publisher2 = new Publisher("Sam");

        Subscriber subscriber1 = new Subscriber("Dep");
        Subscriber subscriber2 = new Subscriber("Kev");

        Video video1 = new Video("TITLE 1");
        Video video2 = new Video("TITLE 2");
        Video video3 = new Video("TITLE 3");
        Video video4 = new Video("TITLE 4");
        Video video5 = new Video("TITLE 5");

        subscriber1.subscribe(publisher1);
        publisher1.uploadVideo(video1);

        subscriber2.subscribe(publisher1);
        publisher1.uploadVideo(video2);

        subscriber1.printTimeline();
        // should print = Dep : [TITLE 1] [TITLE 2]
        subscriber2.printTimeline();
        // should print = Kev : [TITLE 2]

        subscriber1.watch(video2);
        subscriber2.watch(video2);
        subscriber1.watch(video2);
        video2.getDetails();
        // should print = [TITLE 2] - Joe - 3 views

        subscriber2.watch(video1);
        video1.getDetails();
        // should print = [TITLE 1] - Joe - 1 views
        // notice that subscriber2 does not have the video2 on his/her timeline, but the video can still be watched

        subscriber1.subscribe(publisher2);
        subscriber1.printPublishers();
        // should print = Dep : Joe Sam

        publisher2.uploadVideo(video3);

        subscriber1.printTimeline();
        // should print = Dep : [TITLE 1] [TITLE 2] [TITLE 3]
        subscriber2.printTimeline();
        // should print = Kev : [TITLE 2]

        publisher2.printSubscribers();
        // should print = Sam : Dep

        subscriber1.unsubscribe(publisher2);
        
        publisher2.printSubscribers();
        // should print = Sam :
        // no subscribers
        
        publisher2.uploadVideo(video4);
        publisher1.uploadVideo(video5);
        
        subscriber1.printTimeline();
        //should print = Dep : [TITLE 1] [TITLE 2] [TITLE 3] [TITLE 5]
        subscriber2.printTimeline();
        //should print = Kev : [TITLE 2] [TITLE 5]

    }
}
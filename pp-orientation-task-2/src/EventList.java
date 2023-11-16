import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Random;

public class EventList {
    private PriorityQueue<Event> eventList;

    public EventList() {
        eventList = new PriorityQueue<>();
    }

    public void add(Event e) {
        System.out.println("Adding to the event list " + e);
        eventList.add(e);
    }

    public Event remove() {
        System.out.println("Removing from the event list " + eventList.peek());
        return eventList.remove();
    }

    public void print() {
        Object[] tmp = eventList.toArray();
        Arrays.sort(tmp);
        for (Object e : tmp) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        EventList eventList = new EventList();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            EventType type;
            if (random.nextBoolean())
                type = EventType.ARR;
            else
                type = EventType.DEP;
            eventList.add(new Event(type, random.nextInt(1000)));
        }

        System.out.println("Event " + eventList.remove() + " removed");

        eventList.print();
    }
}

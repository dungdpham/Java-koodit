import eduni.distributions.Negexp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simulator\n");

        EventList eventList = new EventList();
        ArrivalProcess arrivalProcess = new ArrivalProcess(new Negexp(10, System.currentTimeMillis()), eventList, EventType.ARR);
        for (int i = 0; i < 10; i++) {
            Clock.getInstance().setClock(arrivalProcess.generateNextEvent());
        }
        System.out.println("Last event: " + Clock.getInstance().getClock());

        ServicePoint servicePoint = new ServicePoint();
        Event e = eventList.remove();
        while (e != null) {
            if (e.getType() == EventType.ARR) {
                Customer customer = new Customer(e.getTime());
                servicePoint.addToQueue(customer);
            }
            e = eventList.remove();
        }

        servicePoint.serve();
    }
}

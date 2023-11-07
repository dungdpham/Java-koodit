public class CustomerGenerator {
    public CustomerGenerator(ServicePoint servicePoint, int customerAmount) {
        for (int i = 0; i < customerAmount ; i++)
            servicePoint.addToQueue(new Customer());
    }
}

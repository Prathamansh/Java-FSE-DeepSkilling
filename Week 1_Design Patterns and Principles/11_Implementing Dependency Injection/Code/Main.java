public class Main {
    public static void main(String[] args) {
        // Create repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject dependency into service
        CustomerService service = new CustomerService(repository);

        // Use the service
        service.getCustomerDetails(1);
        service.getCustomerDetails(3);
    }
}
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {
        if (id == 1) return "Prathamansh";
        if (id == 2) return "Jasrotia";
        return "Customer Not Found";
    }
}
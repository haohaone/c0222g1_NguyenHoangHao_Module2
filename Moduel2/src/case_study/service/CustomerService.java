package case_study.service;

public interface CustomerService extends Service {
    @Override
    void display();

    @Override
    void addNew();

    @Override
    void edit();

    @Override
    void delete();
}

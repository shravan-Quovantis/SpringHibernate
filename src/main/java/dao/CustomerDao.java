package dao;

import entities.Address;
import entities.Customer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Setter
@Getter
public class CustomerDao {

    private HibernateTemplate hibernateTemplate;

    @Transactional
    //This annotation is used to write, update & delete operation not read
    public int addCustomer(Customer customer) {

        final Integer saved = (Integer) this.hibernateTemplate.save(customer);
        return saved;
    }

    @Transactional
    public Customer getCustomer(int custId) {
        //get returns null if data is not found whereas load returns Exception
        final Customer customer = this.hibernateTemplate.load(Customer.class, custId);
        return customer;
    }

    public List<Customer> getAllCustomer() {
        final List<Customer> customers = this.hibernateTemplate.loadAll(Customer.class);
        return customers;
    }

    @Transactional
    public Customer deleteCustomer(int custId) {
        final Customer customerdeleted = getCustomer(custId);
        final Customer customer = this.hibernateTemplate.get(Customer.class, custId);
        this.hibernateTemplate.delete(customer);
        return customerdeleted;
    }

    @Transactional
    public Customer updateCustomer(Customer customer) {
        this.hibernateTemplate.update(customer);
        return getCustomer(customer.getCustId());
    }

    @Transactional
    public int addAdress(Address address){
        final Integer save = (Integer) this.hibernateTemplate.save(address);
        return save;
    }
}

package org.example;

import dao.CustomerDao;
import entities.Address;
import entities.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        final CustomerDao customerDoa = (CustomerDao) context.getBean("customerDoaBean");

//        final Customer customer = new Customer();
//        customer.setEmailId("Salini0@gmail.com");
//        customer.setFirstName("Salini");
//        customer.setLastName("Kumari");
//        customer.setDob(LocalDate.of(2012, 4, 3));
//        customer.setGender("Female");
//
//        final Address address = new Address("JV colony", "Hyderabad", "Telangana");
//        address.setCustomer(customer);
//
//        final Address addressA = new Address("Balaji Road", "Vizag", "Andhra Pradesh");
//        addressA.setCustomer(customer);
//
//        List<Address> addressList = new ArrayList<>();
//        addressList.add(address);
//        addressList.add(addressA);
//        customer.setAddressList(addressList);
//
//        customerDoa.addCustomer(customer);
//        customerDoa.addAdress(address);
//        customerDoa.addAdress(addressA);

//        //Fetching customer with id
//        Customer customerZ = customerDoa.getCustomer(1);
//        System.out.println(customerZ);

//        for (Address addressZ : customerZ.getAddressList()) {
//            System.out.println(addressZ);
//        }

//        System.out.println(" Customer inserted with id: " +result);

//        final Customer customerV = customerDoa.getCustomer(1);
//        System.out.println(customerV);
//
//        final List<Customer> allCustomer = customerDoa.getAllCustomer();
//        for (Customer customerB:allCustomer) {
//            System.out.println(customerB);
//        }

//        final Customer customerC = new Customer("anjali@gmail.com","Anjali", "Singh", "Female", LocalDate.of(2012,4,02));
//        final Customer customerUpdated = customerDoa.updateCustomer(customerC);
//        System.out.println("Updated "+ customerUpdated);
//
//        final Customer customerDeleted = customerDoa.deleteCustomer(485);
//        System.out.println("Deleted "+ customerDeleted);
    }
}

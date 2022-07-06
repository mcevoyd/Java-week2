package uk.ac.serc.customers.darren;

public class Customer {

    String CustomerID, CompanyName, ContactName;

    public Customer(String customerID, String companyName, String contactName) {
        CustomerID = customerID;
        CompanyName = companyName;
        ContactName = contactName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    @Override
    public String toString() {
        return "Customer [CompanyName=" + CompanyName + ", ContactName=" + ContactName + ", CustomerID=" + CustomerID
                + "]";
    }

    
}

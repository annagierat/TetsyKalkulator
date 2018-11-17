public class ManageCustomers {

    DBInterface dbInterface;

    public ManageCustomers(DBInterface dbInterface) {
        this.dbInterface = dbInterface;
    }

    public int calculateCustomer(String surname){
        return this.dbInterface.getCustomerIdBySurname(surname);
    }
}

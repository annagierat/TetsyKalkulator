public class DBinterfaceStub implements DBInterface{


    public int getCustomerIdBySurname(String Surname) {
        return 3;
    }

    public String getCustomerSurnameById(int id) {
        return "Kowalski";
    }

    public String saveCustoemrName(String name) {
        return name;
    }
}

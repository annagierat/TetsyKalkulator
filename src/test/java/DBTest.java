import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DBTest {

    @Test
    public void testCalculateCustomer(){
        ManageCustomers manageCustomers = new ManageCustomers(new DBinterfaceStub());
        String surname = "Kowalski";
        int expectedResult = 3;

        Assert.assertEquals(expectedResult, manageCustomers.calculateCustomer("Kowalski"));

    }
    @Test
    public void testCalculateCustomerMock(){
        DBInterface db = mock(DBInterface.class);
        when(db.getCustomerIdBySurname("Kowalski")).thenReturn(3);
        ManageCustomers manageCustomers = new ManageCustomers(db);
        String surname = "Kowalski";
        int expectedResult = 3;

        Assert.assertEquals(expectedResult, manageCustomers.calculateCustomer("Kowalski"));

    }

}

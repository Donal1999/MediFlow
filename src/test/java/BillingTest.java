import ie.atu.week10.Billing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BillingTest {

    @Test
    public void testBillingCreation() {
        Billing bill = new Billing(1001, 1, 250.00, "Unpaid");
        assertEquals(1001, bill.getBillID());
        assertEquals(1, bill.getPatientID());
        assertEquals(250.00, bill.getAmount());
        assertEquals("Unpaid", bill.getPaymentStatus());
    }

    @Test
    public void testBillingSetters() {
        Billing bill = new Billing(1001, 1, 250.00, "Unpaid");
        bill.setAmount(300.00);
        bill.setPaymentStatus("Paid");

        assertEquals(300.00, bill.getAmount());
        assertEquals("Paid", bill.getPaymentStatus());
    }
}


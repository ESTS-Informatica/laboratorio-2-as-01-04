import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class CompanyTest {

    private static Company company1 = new Company();
    private static final User client1 = new User("José Manuel", "9111111", "zemanel@yahoo.com");
    private static final User client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
    private static final User seller1 = new User("Fernando Fernades", "966777101", "fefe@remax.pt");
    private static final User seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
    private static final Property property1 = new Property("Casa1", 100000);
    private static final Property property2 = new Property("Casa2", 100000);
    private static final Sell sell1 = new Sell(client1, seller1, property1);
    private static final Sell sell2 = new Sell(client2, seller2, property2);


    public CompanyTest() {

    }

    @BeforeEach
    public void setUp(){
        company1.registerClient(client1);
        company1.registerClient(client2);
        company1.registerSeller(seller1);
        company1.registerSeller(seller2);
    }

    @Test
    public void testConstructor(){
        assert !company1.getClients().isEmpty();
        assert !company1.getSellers().isEmpty();
    }


    @Test
    public void testRegisterClientDuplicate(){
        assert !company1.registerClient(client1);
    }

    @Test
    public void testRegisterClientNull(){
        assert !company1.registerClient(null);
    }


    @Test
    public void testCreateSell() {
        assert company1.createSell(client1, seller1, property1);
        assert company1.createSell(client2, seller2, property2);
    }


    @Test
    public void testCalculateSellsOfTheYear() {
        company1.createSell(client1, seller1, property1);
        company1.createSell(client2, seller2, property2);
        assert company1.calculateSellsOfTheYear(2024) > 0;
    }

    @Test
    public void testFindSellerOfTheYear() {
        company1.createSell(client1, seller1, property1);
        company1.createSell(client2, seller2, property2);
        assert !company1.findSellerOfTheYear(2024).equals("");
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompanyTest {

    private static Company company1 = new Company();
    private static User client1 = new User("José Manuel", "9111111", "zemanel@yahoo.com");
    private static User client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
    private static User seller1 = new User("Fernando Fernades", "966777101", "fefe@remax.pt");
    private static User seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");


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

}

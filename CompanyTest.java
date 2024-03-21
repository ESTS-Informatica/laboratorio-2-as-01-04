import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompanyTest {

    public static Company company1 = new Company();


    public CompanyTest() {

    }

    @BeforeEach
    public void setUp(){
        company1.registerClient(new User("José Manuel", "911111111", "zemanel@yahoo.com"));
        company1.registerClient(new User("António Francisco", "922222222", "tochico@hotmail.com"));
        company1.registerSeller(new User("Fernando Fernades", "966777101", "fefe@remax.pt"));
        company1.registerSeller(new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt"));
    }

    @Test
    public void testConstructor(){
        assert !company1.getClients().isEmpty();
        assert !company1.getSellers().isEmpty();
    }

}

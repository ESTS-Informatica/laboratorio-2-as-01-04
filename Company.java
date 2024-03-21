
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

/**
 * Manage a company.
 *
 * @author POO
 * @version 03/2024
 */
public class Company {

    // Clients registry
    private ArrayList<User> clients;
    // Sellers registry
    private ArrayList<User> sellers;
    // Properties registry
    private ArrayList<Property> properties;
    // Sells registry
    private ArrayList<Sell> sells;

    /**
     * Constructor of class Company
     */
    public Company() {
        clients = new ArrayList<>();
        sellers = new ArrayList<>();
        properties = new ArrayList<>();
        sells = new ArrayList<>();
    }

    /**
     * Get the list of clients.
     *
     * @return This company clients.
     */
    public List<User> getClients() {
        return clients;
    }

    /**
     * Get the list of sellers.
     *
     * @return This company sellers.
     */
    public List<User> getSellers() {
        return sellers;
    }

    /**
     * Get the list of properties.
     *
     * @return This company's properties.
     */
    public List<Property> getProperties() {
        return null;         // dummy implementation
    }

    /**
     * Get the list of sells.
     *
     * @return This company sells.
     */
    public List<Sell> getSells() {
        return null;         // dummy implementation
    }

    /**
     * Register a client.
     *
     * @param client to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerClient(User client) {
        if(this.clients.contains(client)) {
            return false;
        }
        if(client == null) {
            return false;
        }
        this.clients.add(client);
        return true;
    }

    /**
     * Register a seller.
     *
     * @param seller to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSeller(User seller) {
        if(this.sellers.contains(seller)) {
            return false;
        }
        if(seller == null) {
            return false;
        }
        this.sellers.add(seller);
        return true;
    }

    /**
     * Register a property.
     *
     * @param property to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerProperty(Property property) {
        if(this.properties.contains(property)) {
            return false;
        }
        if(property == null) {
            return false;
        }
        this.properties.add(property);
        return true;
    }

    /**
     * Register a sell.
     *
     * @param sell to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSell(Sell sell) {
        return true;         // dummy implementation
    }

    /**
     * Generate a new sell and register that sell.
     *
     * @param client Must be already registered.
     * @param seller Must be already registered.
     * @param property Must be already registered.
     * @return true If the request succeeds, false otherwise.
     */
    public boolean createSell(User client, User seller, Property property) {
        return true;         // dummy implementation
    }

    /**
     * Calculates the total number of sells within the provided year.
     *
     * @param year
     * @return The total number of sells in the year.
     */
    public int calculateSellsOfTheYear(int year) {
        return 0;         // dummy implementation
    }

    /**
     * Find the seller with more sells within the provided year.
     *
     * @param year
     * @return The name of the seller of the year.
     */
    public String findSellerOfTheYear(int year) {
        return null;         // dummy implementation
    }

}

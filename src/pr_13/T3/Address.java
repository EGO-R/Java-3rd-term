package pr_13.T3;
import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String country, String region, String city, String street, String house, String building, String apartment) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.building = building;
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                "}\n";
    }

    public static Address parseComma(String address){
        String[] parts = address.split(",");
        if (parts.length != 7) {
            System.out.println("Error: [" + address + "]");
            return null;
        }
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
        }
        return new Address(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
    }

    public static Address parseAll(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;-");
        if (tokenizer.countTokens() != 7) {
            System.out.println("Error: [" + address + "]");
            return null;
        }
        String country = tokenizer.nextToken().trim();
        String region = tokenizer.nextToken().trim();
        String city = tokenizer.nextToken().trim();
        String street = tokenizer.nextToken().trim();
        String house = tokenizer.nextToken().trim();
        String building = tokenizer.nextToken().trim();
        String apartment = tokenizer.nextToken().trim();
        return new Address(country, region, city, street, house, building, apartment);
    }
}

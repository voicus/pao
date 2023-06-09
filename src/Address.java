import java.util.Scanner;

public class Address {
    private String street, city, county;
    private int postalCode;

    public Address(String street, String city, String county, int postalCode) {
        this.street = street;
        this.city = city;
        this.county = county;
        this.postalCode = postalCode;
    }

    public Address(Scanner in){
        this.read(in);
    }

    public void read(Scanner in){
        System.out.println("Street: ");
        this.street = in.nextLine();
        System.out.println("City: ");
        this.city = in.nextLine();
        System.out.println("County: ");
        this.county = in.nextLine();
        System.out.println("Postal code: ");
        this.postalCode = Integer.parseInt(in.nextLine());
    }

    @Override
    public String toString() {
        return "{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public int getPostalCode() {
        return postalCode;
    }
}

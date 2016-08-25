public class Address {
    
    private Number number;
    private String street;
    private String suburb;
    private String postCode;
    private String state;

    public Address(Number number, String street, String suburb, 
        String postCode, String state) {
        this.number = number;
        this.street = street;
        this.suburb = suburb;
        this.postCode = postCode;
        this.state = state;
    }

    public static Address fromPostCode(String postCode) {
        return new Address(null, null, null, postCode, null);
    }

    // Acessors & Mutators.
    ...
    ...
    ...

}
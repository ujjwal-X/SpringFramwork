package dependentobject;

public class Address {
    private String houseNo;
    private String pincode;
    private String state;
    private String country;


    public Address(String houseNo, String pincode, String state, String country) {
        this.houseNo = houseNo;
        this.pincode = pincode;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", pincode='" + pincode + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

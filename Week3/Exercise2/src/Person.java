public class Person {
    private String name;
    private String address;
    private String phone_number;
    private String email_address;

    Person() {
        this.name = "Undefined";
        this.address = "Undefined";
        this.phone_number = "Undefined";
        this.email_address = "Undefined";
    }

    Person(String name, String address, String phone_number, String email_address) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email_address = email_address;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    public void setAddress(String address) { this.address = address; }
    public String getAddress() { return this.address; }

    public void setPhone(String phone_number) { this.phone_number = phone_number; }
    public String getPhone() { return this.phone_number; }

    public void setEmail(String email) { this.email_address = email; }
    public String getEmail() { return this.email_address; }

    @Override
    public String toString() {
        return  "Name: " + this.getName() + ", " +
                "Address: " + this.getAddress() + ", " +
                "Phone: " + this.getPhone() + ", " +
                "Email: " + this.getEmail();
    }
}

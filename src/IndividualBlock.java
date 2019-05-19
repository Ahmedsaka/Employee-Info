import java.util.UUID;

public class IndividualBlock {
    private final UUID id;//This creates a unique identifier for each individual employee.
    public String firstName, lastName;
    public double monthlyEarnings;
    public String email;
    public String gradeLevel;
    public String homeAddress;
    public String DateOfBirth;

    public IndividualBlock(String fname, String lname, double salary, String level, String homeAddress){
        this.firstName = fname;
        this.lastName = lname;
        this.monthlyEarnings = salary;
        this.gradeLevel = level;
        this.email = fname.toLowerCase()+"."+lname.toLowerCase()+"@interswitchgroup.com";
        this.id = generate();
        this.homeAddress = "";
        this.DateOfBirth = "";
    }

    private UUID generate(){
        IdGenerator requestId = new IdGenerator();
        return requestId.generator();
    }

    public String getEmail() {
        return this.email;
    }

    public UUID getId() {
        return id;
    }
    /*public String getAddress(){

    };*/
}

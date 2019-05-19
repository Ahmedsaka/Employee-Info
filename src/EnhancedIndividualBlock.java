import java.util.Date;

public class EnhancedIndividualBlock /*extends IndividualBlock */{

    public String homeAddress;
    public Date dateOfBirth;

    public EnhancedIndividualBlock(String address, Date dob){
        super();
        //super(String fname, String lname, double salary, String level);
        this.dateOfBirth = dob;
        this.homeAddress = address;

    }

}

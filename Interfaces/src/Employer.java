public class Employer extends Person implements IEmployer{
    String companyName;

    public Employer(String firstName, String lastName, String companyName) {
        super(firstName, lastName);
        this.companyName = companyName;
    }

    @Override
    public String getCompany() {
        return companyName;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

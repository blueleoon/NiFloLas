package domain;

public abstract class Employee {

    private static String NAME_PATTERN = "%s %s %s";
    private String firstname;
    private String lastname;
    private int age;
    private String entryYear;
    private String type;


    public Employee(String firstname, String lastname, int age, String entryYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.entryYear = entryYear;
    }

    public abstract double calculerSalaire();

    public abstract String getPosition();

    public String getName() {
        return String.format(NAME_PATTERN, getPosition(), firstname, lastname);
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEntryYear() {
        return entryYear;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

}

class Student 
{
    private String name;
    private String gender;
    private String email;
    private String password;
    private int age;

    Student()
    {
        /// default constructor
    }

    Student(String name , String gender, String email, String password,int age)
    {
        this.name = name;
        this.gender=gender;
        this.email = email;
        this.password = password;
    }

    // public String toString()
    // {
    //     return "name = "+name+" Gender :- "+gender+" email  :- "+email+" password "+password;
    // }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
    public String getPassword() {
        return password;
    }
}

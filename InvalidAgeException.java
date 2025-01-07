

class InvalidAgeException extends RuntimeException
{
    private String msg = "Invalid Age !!!";
    InvalidAgeException()
    {
        // default constructor
    }
    InvalidAgeException(String msg)
    {
        this.msg=msg;
    }
    public String toString()
    {
        return "msg "+msg;
    }
}

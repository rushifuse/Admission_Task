
class InvalidPasswordException extends RuntimeException
{
    private String msg = "Invalid Age !!!";
    public InvalidPasswordException ()
    {
        // default constructor
    }
    public InvalidPasswordException (String msg)
    {
        this.msg=msg;
    }
    public String toString()
    {
        return "msg "+msg;
    }
}

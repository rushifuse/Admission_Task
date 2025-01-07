

class InvalidEmailException extends RuntimeException
{
    private String msg = "Invalid Email !!!";
     InvalidEmailException()
    {
        // default constructor
    }
     InvalidEmailException(String msg)
    {
        this.msg=msg;
    }
    public String toString()
    {
        return "msg "+msg;
    }
}

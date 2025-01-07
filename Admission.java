
class Admission 
{
    String email1 = "@gmail.com";
    String email2 = "@hotmail.com";
    String email3 = "@live.com";
    String digit="0123456789";
   public void getAdmission(Student s)
    {
        if(s.getAge()<=5)
        {
            if(s.getEmail().contains(email1) || s.getEmail().contains(email2) || s.getEmail().contains(email3))
            {
                    if(s.getPassword().length()>=8 && s.getPassword().length()<=15 && digit(s) &&  upper(s) && lower(s) && special(s))
                    { 
                            System.out.println("Admission is confirm");
                    }
                    else
                    {
                        throw new InvalidPasswordException("Invalid Email ");
                    }
            }
            else
            {
                throw new InvalidEmailException("Invalid Email ");
            }
        }
        else
        {
            throw new InvalidAgeException("Inavlid Age Enter Age less Than 5 Or Equal 5");
        }
    }


    public boolean digit(Student s)
    {
        char ch[] = s.getPassword().toCharArray();
        boolean b = false;
        String str="0123456789";
        for(int i=0;i<ch.length;i++)
        {
            if(str.contains(String.valueOf(ch[i])))
            {
                b = true;
            }
        }
        return b;
    }
    public boolean upper(Student s)
    {
        char ch[] = s.getPassword().toCharArray();
        boolean b = false;
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<ch.length;i++)
        {
            if(str.contains(String.valueOf(ch[i])))
            {
                b = true;
            }
        }
        return b;
    }

    public boolean lower(Student s)
    {
        char ch[] = s.getPassword().toCharArray();
        boolean b = false;
        String str="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<ch.length;i++)
        {
            if(str.contains(String.valueOf(ch[i])))
            {
                b = true;
            }
        }
        return b;
    }

    public boolean special(Student s)
    {
        char ch[] = s.getPassword().toCharArray();
        boolean b = false;
        String str="!@#$%^&*";
        for(int i=0;i<ch.length;i++)
        {
            if(str.contains(String.valueOf(ch[i])))
            {
                b = true;
            }
        }
        return b;
    }
}

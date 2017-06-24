
package prototype;


class CheckAccount extends Account
{
    
    RegisterAccount r1 = new RegisterAccount();
    int number;
    public boolean check_username(String user)
    {
        setup_admin();
        setup_account();
        boolean isCorrect = true;
        
        for(int a =0; a < 100; a++)
        {
            if(username[a].length()!=0)
            {
                if(username[a].equals(user))
                {
                    isCorrect = true;
                    number = a;
                    a=100;

                }
                else{
                    isCorrect = false;
                }  
            }
            else
            {
                a=100;
            }
            
        }
        return isCorrect;
    }

    public boolean check_password(String pass)
    {
        boolean isCorrect = true;
        
        
            if(password[number].length()!=0)
            {
                if(password[number].equals(pass))
                {
                    isCorrect = true;
                    

                }
                else{
                    isCorrect = false;
                }  
            }
           
            
        
        
        return isCorrect;
    }
    
    
}


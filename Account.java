package prototype;
public class Account {
    static public final int limit_number = 100;
    static String[] username = new String[limit_number];
    static String[] password = new String[limit_number];
    public void setup_admin()
    {
        username[0] = "admin";
        password[0] = "123456";
        
    }
    public void setup_account()
    {
        for(int x = 0; x< 100; x++)
        {
            if(username[x]!=null && username[x].length() >0){
                
            }else
            {
                username[x] = "a";           
                password[x] = "b";
            }
        }
    }  
}



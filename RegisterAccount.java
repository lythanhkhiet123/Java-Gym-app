/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import javax.swing.JOptionPane;

/**
 *
 * @author Vincent
 */
public class RegisterAccount extends Account
{
    String name ="",gender="",address="",state="";
    int date=0,month=0,year=0;
    int postcode=0;
    String user_name,pass_word;
    boolean isCorrect_user = true;
    boolean isCorrect_password = true;
    
    double fheight=0,fweight=0,fbmi=0;
    double sheight=0,sweight=0,sbmi=0;
    public boolean getname(String a)
    {
        
        
        name = a;
        boolean isCorrect = true;
        return isCorrect;
    }
    public boolean getdate(String a)
    {
        
        date = Integer.parseInt(a);
        boolean isCorrect = true;
        return isCorrect;
    }
    public boolean getmonth(String a)
    {
        month = Integer.parseInt(a);
        boolean isCorrect = true;
        return isCorrect;
    }
    public boolean getyear(String a)
    {
        year = Integer.parseInt(a);
        boolean isCorrect = true;
        return isCorrect;
    }
    public boolean getgender(String a)
    {
        gender = a;
        boolean isCorrect = true;
        return isCorrect;
    }
    public boolean getaddress(String a)
    {
        address = a;
        boolean isCorrect = true;
        return isCorrect;
    }
    public boolean getstate(String a)
    {
        state = a;
        boolean isCorrect = true;
        return isCorrect;
    }
    public boolean getpostcode(String a)
    {
        postcode = Integer.parseInt(a);
        boolean isCorrect = true;
        return isCorrect;
    }
   
       
    public String getusername(String a)
    {
        int count =0;
        setup_admin();
        setup_account();
        for (int x=0;x<100;x++)
        {
            if (username[x].equals(a))
            {
                JOptionPane.showMessageDialog(null, "Username already existed");
                isCorrect_user = false;
                x=100;
            }
            else if (username[x].equals("a"))
            {
                username[x] = a;
                count = x;
                user_name = username[x];
                
                x=100;
                isCorrect_user = true;
            }
            
        }
        return username[count];
    }
    public boolean BoolUser(String x)
    {
        return isCorrect_user;
    }
    public boolean BoolPass(String x)
    {
        return isCorrect_password;
    }
    public String getpassword(String a)
    {
       int count=0;
        
        for (int x=0; x<100;x++)
        {
            if(password[x].equals("b"))
            {
                password[x] = a;
                count = x;
                pass_word = password[x];
               
                x=100;
                isCorrect_password = true;
            }
            else
            {
                isCorrect_password = false;
            }
        }
        
        return password[count];
    }
    
   
}


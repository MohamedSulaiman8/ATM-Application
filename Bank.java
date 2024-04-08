
import java.util.*;

public class Bank  {
    String bankName; 
    long amount; 
    public HashMap<String, Customer> customers = new HashMap<>();
    
    public HashMap<String, Customer> getCustomer(){
    	return customers;
    }
    public Bank(String bankName, long amount){ 
        this.bankName=bankName;
        this.amount=amount;
        System.out.println("BANK CREATED!");
    }
    public void delete(){ 
        customers=new HashMap<>();
        System.out.println("ACCOUNT DELETED SUCCESSFULLY!");
    }
    public void addCustomer(String ac_number, String name, long amount){ 
        if(customers.containsKey(ac_number)){
            System.out.println("CUSTOMER ALREADY EXIST!");
        }
        else{
            if(amount==0){
                customers.put(ac_number, new Customer(name, 0));
            }
            else{
                customers.put(ac_number, new Customer(name, 0, amount));
            }
            System.out.println("CUSTOMER CREATED!");
        }
    }
    public void deleteCustomer(String ac_number){ 
        if(customers.containsKey(ac_number)){
            customers.remove(ac_number);
            System.out.println("CUSTOMER DELETED!");
        }
        else{
            System.out.println("CUSTOMER DOESN'T EXIST!");
        }
    }
    

	public boolean validate(String acc_no, int user_password) {
		if(customers.containsKey(acc_no)){
            return customers.get(acc_no).validate(user_password);
        }   
        else{
            return false;
        }
	}
	
}
        

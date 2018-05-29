/*
 * Student Name:Ugo Chirat
 * Student number: 2954737
 *
 *
 **/
/*
For this assignment the class Coin is given. You are required to complete the methods
for the Purse class and then complete the class Assignment10_2017Test by writing JUnit 
test methods that check all of its methods.
*/
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
public class Assignment10_2017{
  //create a Purse instance and write asserts that test its methods. 
  /*Purse purse;
  public Assignment10_2017Test(){
    purse = new Purse();
	
	@Test
	public void 
    //purse.add(Arrays.asList(Coin.TWENTY,...));
  }*/
  
}

class Purse{
	private ArrayList<Coin> purse;
	Purse(){purse = new ArrayList<Coin>();}
	public void add(Coin c){ purse.add(c);}//add coin to purse
	public void add(List<Coin> coins){
		purse.addAll(coins);
	}//add a fist of coins to the purse
	public boolean contains(Coin c){
		return purse.contains(c);
	}//check if coin is in the purse
	public boolean remove(Coin c){
		return purse.remove(c);
	}//remove a single coin from purse if it is in the purse
	public boolean removeAll(Coin c){
	ArrayList<Coin> f = new ArrayList<Coin>();
	for(Coin p : purse)
		 if(p.equals(c))
			 f.add(p);
		 
		return purse.removeAll(f);
	}//remove all coin c from purse if it is in the purse
	public int freq(Coin c){
		int f = 0;
		 for(Coin p : purse)
		 if(p.equals(c))
			f++;
		return f;
	}//calculate the frequency of c in the purse
	public int value(Coin c){
		int f = 0;
		 for(Coin p : purse)
		 if(p.equals(c))
			f++;
		return f*c.value();
	}//calculate the total value of c in the purse
	public int sum(){
		int sum;
		for(Coin p : purse)
			sum+=p.value();
		return sum;
	}//calculate the sum of money in the purse
	public String getSum(){
			int sum;
		for(Coin p : purse)
			sum+=p.value();
		return "the sum is : " + sum;
		//return a string representation of the sum in euros
    // e.g. 2.65
	}
	public String toString(){
		return purse.toString();
	}//string representation of all coins in purse
}

enum Coin{
	ONE,TWO,FIVE,TEN,TWENTY,FIFTY,ONEEURO,TWOEURO;
	public String toString(){
	  String lst[] = {"1 Cent","2 Cent","5 Cent","10 Cent","20 Cent","50 Cent","1 Euro","2 Euro"};
		return lst[this.ordinal()];
	}
	public int value(){
		int val[] ={1,2,5,10,20,50,100,200};
		return val[this.ordinal()];
	}
	public int add(Coin c){
		return (this.value()+ c.value());
	}
	public int add(int x){ //add sum of money in cents to this coin
	 if(x >= 0) return x + this.value();
	 else return this.value();
	}
}
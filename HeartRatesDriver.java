import java.util.*;
class HeartRatesDriver{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	HeartRates myHeartRate[]=new HeartRates[2];
	for(int count=0;count<(myHeartRate.length);count++){
	System.out.println("enter first name: ");
	String firstName=input.nextLine();
	System.out.println("enter the last name: ");
	String lastName=input.nextLine();
	System.out.println("enter birthdate"+"\nmm"+"\nyear");
	int month=input.nextInt();
	int day=input.nextInt();
	int year=input.nextInt();
	input.nextLine();
	myHeartRate[count]=new HeartRates(firstName,lastName,month,day,year);
	System.out.println("firstName"+"\t"+"last name"+"\t"+"\t"+"Age in years"+"\t"+"Maximum heartrate"+"\t"+"targetHeartRate\n");
	System.out.println(firstName+"\t"+lastName+"\t"+myHeartRate[count].getAge()+"\t"+myHeartRate[count].MaximumHeartRate());
	myHeartRate[count].targetHeartRate();
	}
	}
}
import java.util.Scanner;
import java.io.*;
class Vehicle
{
   String Vehicle_name;
    String Vehicle_number;
    String Vehicle_brand;
    double Vehicle_price;
    String Vehicle_color;
    
    public static void start()
    {
        
    }
    
    public static void stop()
    {
        
    }
    
    public static void drive()
    {
        
    }
   }
    
   class owner_details
    {
        private String owner_name="Darshan";
        private long owner_mob_number=1234567890;
        public String getOwner_Name()
        {
            return owner_name;
        }
        
        public long getOwner_Mob_Number()
        {
            return owner_mob_number;
        }
    }

class Two_wheeler extends Vehicle
{
    
    {
      System.out.println("two wheeler section");
    }
}

class Bike extends Two_wheeler
{
    
}
class Bajaj extends Bike
{
    
}
class Pulsar_220 extends Bajaj
{
     Pulsar_220(String Vehicle_name,  String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
    {
      this.Vehicle_name=Vehicle_name;
  this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Dominar extends Bajaj
{
     Dominar(String Vehicle_name,  String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
    {
      this.Vehicle_name=Vehicle_name;
  this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Honda extends Bike
{
    
}
class Activa extends Honda
{
    Activa( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}

class CBR250 extends Honda
{
    CBR250( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Royal_enfield extends Bike
{
    
}
class Bullet_350 extends Royal_enfield
{
    Bullet_350( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Continentalgt extends Royal_enfield
{
    Continentalgt( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Interceptor extends Royal_enfield
{
    Interceptor( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}

class Cycle extends Two_wheeler
{
    Cycle( String Vehicle_name,  String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
     
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}

class Three_wheeler extends Vehicle
{
    
    {
      System.out.println("three wheeler section");
    }
}

class Auto_rikshaw extends Three_wheeler
{
       Auto_rikshaw(String Vehicle_name,  String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}

class Tum_tum extends Three_wheeler
{
    Tum_tum( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}

class Chota_Hathi extends Three_wheeler
{
    Chota_Hathi( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}

class Four_wheeler extends Vehicle
{
    
    {
      System.out.println("four wheeler section");
    }
}
class Petrol extends Four_wheeler
{
    
}
class MarutiSuzuki extends Four_wheeler
{
  
}
class Kia extends Four_wheeler
{
  
}
class Vitara_brezza extends MarutiSuzuki 
{
     Vitara_brezza( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Wagonr extends MarutiSuzuki 
{
     Wagonr( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}

class Alto extends MarutiSuzuki
{
     Alto( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Seltos extends Kia
{
     Seltos( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Diesel extends Four_wheeler
{
    
}
class Toyota extends Diesel
{
    
}
class Mahindra extends Diesel
{
    
}
class Ford extends Diesel
{
    
}
class Innova extends Toyota
{
    Innova( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Fortuner extends Toyota
{
    Fortuner( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Scorpio extends Mahindra
{
    Scorpio( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class XUV500 extends Mahindra
{
    XUV500( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Endevour extends Ford
{
    Endevour( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Electric extends Four_wheeler
{
    
}
class Tata extends Electric
{
    
}
class MG extends Electric
{
    
}
class Hyundai extends Electric 
{
    
}

class Tata_nexon extends Tata
{
    Tata_nexon( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class ZS_EV extends MG
{
    ZS_EV( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}
class Tuscon extends Hyundai 
{
    Tuscon( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}

class Six_wheeler extends Vehicle
{
    
    {
      System.out.println("six wheeler section");
    }
}
class Truck extends Six_wheeler
{
    Truck( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}
}

class Bus extends Six_wheeler
{
   Bus( String Vehicle_name, String Vehicle_number, String Vehicle_brand,  double Vehicle_price,String Vehicle_color)
       {
         this.Vehicle_name=Vehicle_name;
      this. Vehicle_number=Vehicle_number;
    this.Vehicle_brand=Vehicle_brand;
  this.  Vehicle_price=Vehicle_price;
    this. Vehicle_color=Vehicle_color;
}

}

class Sample
{
    public static void main(String[] args)
    {
     
     System.out.println("Fill Enquiry Form");
     Scanner sc1 = new Scanner(System.in);     System.out.println(" ");
     System.out.println("Enter Full Name:");
     String s = sc1.nextLine();
     
     Scanner sc2 = new Scanner(System.in);     System.out.println(" ");
     System.out.println("Enter Your Number:");
     
     Long l = sc2.nextLong();
  
     
     
     
     {
     if(l==10)
     {
       
       System.out.println("Valid number");
     }
     else
     {
     //  System.out.println("Please Enter Valid Number");
     }
     }
     
     Scanner sc3 = new Scanner(System.in);     System.out.println(" ");
     System.out.println("Enter Email:");
     String e = sc3.nextLine();
     if(e=="abc@12.com")
     {
       System.out.println(" ");
     }
     else
     {
     //  System.out.println("Enter Valid Mail id");
     }
     
     
     System.out.println(" ");
     System.out.println("Enquiry Done..!!");
     
      Scanner sc4 = new Scanner(System.in);
      System.out.println(" ");
          System.out.println("!!!.....welcome to the Darshan Vehicle Showroom.....!!!");
          System.out.println("Enter 1 For Two wheeler");
          System.out.println("Enter 2 For Three wheeler");
System.out.println("Enter 3 For Four wheeler");
System.out.println("Enter 4 For Six wheeler");
System.out.println("Enter 5 For main page");
int num = sc4.nextInt();
      
     while(true){
     switch (num)
     {
         case 1:
     //    System.out.println(new Two_wheeler());

System.out.println("Enter 1 For Bajaj");
System.out.println("Enter 2 For Honda" );
System.out.println("Enter 3 For Royal Enfield");
System.out.println("Enter 4 For Cycle");
//System.out.println("vehicle price: "+ref1.Vehicle_price);
//System.out.println("vehicle color: "+ref1.Vehicle_color);
//System.out.println("Thank You For Select Pulsar 220 Vehicle");

int num1= sc4.nextInt();
      
     
     switch (num1)
     {
         case 1:
     //    System.out.println(new Two_wheeler());
Vehicle   ref1   = new  Pulsar_220("Pulsar 220","mh12e3456","bajaj",130000,"red");
System.out.println("vehicle name: "+ref1.Vehicle_name);
System.out.println("vehicle number: "+ref1.Vehicle_number);
System.out.println("vehicle brand : "+ref1.Vehicle_brand);
System.out.println("vehicle price: "+ref1.Vehicle_price);
System.out.println("vehicle color: "+ref1.Vehicle_color);
System.out.println("Thank You For Select Pulsar 220 Vehicle");
           break;
           
          case 2:
     //    System.out.println(new Two_wheeler());
Vehicle   activa   = new  Activa("Activa 5g","mh12e356","Honda",30000,"red");
System.out.println("vehicle name: "+activa.Vehicle_name);
System.out.println("vehicle number: "+activa.Vehicle_number);
System.out.println("vehicle brand : "+activa.Vehicle_brand);
System.out.println("vehicle price: "+activa.Vehicle_price);
System.out.println("vehicle color: "+activa.Vehicle_color);
System.out.println("Thank You For Select Activa 5g Vehicle");

         break ;
         
          case 3:
     //    System.out.println(new Two_wheeler());
Vehicle   bullet   = new  Bullet_350("Bullet 350","mh12e356","Royal Enfield",200000,"black");
System.out.println("vehicle name: "+bullet.Vehicle_name);
System.out.println("vehicle number: "+bullet.Vehicle_number);
System.out.println("vehicle brand : "+bullet.Vehicle_brand);
System.out.println("vehicle price: "+bullet.Vehicle_price);
System.out.println("vehicle color: "+bullet.Vehicle_color);
System.out.println("Thank You For Select Bullet 350 Vehicle");

         break ;
         
          case 4:
     //    System.out.println(new Two_wheeler());
Cycle   bi_cycle  = new  Cycle("Cycle","Hercules",10000,"black");
System.out.println("vehicle name: "+bi_cycle.Vehicle_name);

System.out.println("vehicle brand : "+bi_cycle.Vehicle_brand);
System.out.println("vehicle price: "+bi_cycle.Vehicle_price);
System.out.println("vehicle color: "+bi_cycle.Vehicle_color);
System.out.println("Thank You For Select Cycle Vehicle");

         break ;
     
         
         default: System.out.println("Enter Valid Number");
         break;
     
     }
     
     
     
     
    Scanner sc5 = new Scanner(System.in);
    System.out.println(" ");
    break;
     //  int num3= sc5.nextInt();
     
       
 //   switch(num3)
         
  case 2:
   

System.out.println("Enter 1 For Auto Rikshaw");
System.out.println("Enter 2 For Tum Tum" );
System.out.println("Enter 3 For Chota Hathi");
//System.out.println("vehicle price: "+ref1.Vehicle_price);
//System.out.println("vehicle color: "+ref1.Vehicle_color);
//System.out.println("Thank You For Select Pulsar 220 Vehicle");
         


 int num2= sc4.nextInt();
     
       
 
switch(num2)
{
           
         case 1:
      //   System.out.println(new Three_wheeler());
         Vehicle   auto   = new  Auto_rikshaw("auto rikshaw","mh16e9456","auto",130000,"black");
         System.out.println("vehicle name: "+auto.Vehicle_name);
System.out.println("vehicle number: "+auto.Vehicle_number);
System.out.println("vehicle brand : "+auto.Vehicle_brand);
System.out.println("vehicle price: "+auto.Vehicle_price);
System.out.println("vehicle color: "+auto.Vehicle_color);
System.out.println("Thank You For Select Auto Rikshaw Vehicle");


         break;
         
           
         case 2:
      //   System.out.println(new Three_wheeler());
         Vehicle   tum_tum   = new  Auto_rikshaw("Tum Tum","mh46e9056","L&T",230000,"brown");
         System.out.println("vehicle name: "+tum_tum.Vehicle_name);
System.out.println("vehicle number: "+tum_tum.Vehicle_number);
System.out.println("vehicle brand : "+tum_tum.Vehicle_brand);
System.out.println("vehicle price: "+tum_tum.Vehicle_price);
System.out.println("vehicle color: "+tum_tum.Vehicle_color);
System.out.println("Thank You For Select tum tum Vehicle");

break;

 case 3:
      //   System.out.println(new Three_wheeler());
         Vehicle   chota_hathi = new  Auto_rikshaw("chota hathi","mh06e9006","plagaglo",230000,"brown");
         System.out.println("vehicle name: "+chota_hathi.Vehicle_name);
System.out.println("vehicle number: "+chota_hathi.Vehicle_number);
System.out.println("vehicle brand : "+chota_hathi.Vehicle_brand);
System.out.println("vehicle price: "+chota_hathi.Vehicle_price);
System.out.println("vehicle color: "+chota_hathi.Vehicle_color);
System.out.println("Thank You For Select chota hathi Vehicle");

break;

         default: System.out.println("Enter Valid Number");
         break;
}
     
Scanner sc6 = new Scanner(System.in);
    System.out.println(" ");
    break;
    
  case 3:
   

System.out.println("Enter 1 For petrol");
System.out.println("Enter 2 For Diesel " );
System.out.println("Enter 3 For Electric");

 int num3= sc4.nextInt();
     
       
 
switch(num3)
{
         
   case 1:
   System.out.println("Enter 1 For vitara brezza");
System.out.println("Enter 2 For wagonr " );
System.out.println("Enter 3 For alto");

      
    int num4= sc4.nextInt();
     
       
 
switch(num4)  
{
      case 1 :
      //   System.out.println(new Four_wheeler());
          Vehicle   vitara_brezza  = new  Vitara_brezza("vitara brezza","mh16e9456","petrol car",1300000,"grey");
          System.out.println("vehicle name: "+vitara_brezza.Vehicle_name);
System.out.println("vehicle number: "+vitara_brezza.Vehicle_number);
System.out.println("vehicle brand : "+vitara_brezza.Vehicle_brand);
System.out.println("vehicle price: "+vitara_brezza.Vehicle_price);
System.out.println("vehicle color: "+vitara_brezza.Vehicle_color);
System.out.println("Thank You For Select Vitara brezza Vehicle");
         break;
         
         case 2 :
      //   System.out.println(new Four_wheeler());
          Vehicle   wagonr  = new  Wagonr("wagonr","mh17he9400","petrol car",400000,"grey-silver");
          System.out.println("vehicle name: "+wagonr.Vehicle_name);
System.out.println("vehicle number: "+wagonr.Vehicle_number);
System.out.println("vehicle brand : "+wagonr.Vehicle_brand);
System.out.println("vehicle price: "+wagonr.Vehicle_price);
System.out.println("vehicle color: "+wagonr.Vehicle_color);
System.out.println("Thank You For Select wagonr Vehicle");
         break;
         
           case 3 :
      //   System.out.println(new Four_wheeler());
          Vehicle   alto  = new  Alto("alto","mh09e8956","petrol car",450000,"grey-silver");
          System.out.println("vehicle name: "+alto.Vehicle_name);
System.out.println("vehicle number: "+alto.Vehicle_number);
System.out.println("vehicle brand : "+alto.Vehicle_brand);
System.out.println("vehicle price: "+alto.Vehicle_price);
System.out.println("vehicle color: "+alto.Vehicle_color);
System.out.println("Thank You For Select alto Vehicle");
         break;
}
}
         
         case 4:
    //     System.out.println(new Six_wheeler());
         Vehicle   ref4   = new  Truck("Truck","mh36e456","eicher",1600000,"brown");
         System.out.println("vehicle name: "+ref4.Vehicle_name);
System.out.println("vehicle number: "+ref4.Vehicle_number);
System.out.println("vehicle brand : "+ref4.Vehicle_brand);
System.out.println("vehicle price: "+ref4.Vehicle_price);
System.out.println("vehicle color: "+ref4.Vehicle_color);
System.out.println("Thank You For Select Truck Vehicle");
        break;
        
        case 5: System.out.println("Home Page");
        break;
        
         default: System.out.println("please enter valid number");
         break;
     }
     
     System.out.println("Would you like to visit 1)Yes/2)No");
     int n2 = sc4.nextInt();
     if(n2==1)
     {
     System.out.println("Enter 1 For Two wheeler");
          System.out.println("Enter 2 For Three wheeler");
System.out.println("Enter 3 For Four wheeler");
System.out.println("Enter 4 For Six wheeler");
System.out.println("Enter 5 For main page");
 num = sc4.nextInt();
     }
     else if(n2==2){
       System.out.println("Thanks to visit Darshan showroom");
     }
   else{
     System.out.println("invalid number");
   }
     
     }
    
    
      
   /*     {
        owner_details refrence =new owner_details();
       //owner_details();
       System.out.println("Owner details:-");
       System.out.println("owner name =" + refrence.getOwner_Name());
       System.out.println("owner number =" + refrence.getOwner_Mob_Number());
    //  Activa ref=new Activa();
    
    System.out.println("Thank You For Visiting Our Showroom");
       
        
    }
    
  */
   
    }
}
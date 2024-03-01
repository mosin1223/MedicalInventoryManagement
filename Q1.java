import java.util.*;
class medicalinvetory{
    String medicinename;
    double strength;
    int quantity;

    void getdata(String mname ,double  str,int quan){
        this.medicinename=mname;
        this.strength=str;
        this.quantity=quan;
    }

    void displaydetails(){
        System.out.println(medicinename +" "+strength +" "+quantity);

    }

}

class  Q1{
    public static void main(String args[]){
        medicalinvetory M1 = new medicalinvetory();
        Scanner write = new Scanner(System.in);
        String medname;
        System.out.print("Enter medicine name : ");
        medname = write.nextLine();

        double strength;
        System.out.print("Enter the strength (mg) : ");
        strength= write.nextDouble();

        int quantity;
        System.out.print("enter the quantity : ");
        quantity = write.nextInt();

        M1.getdata(medname,strength,quantity);
        M1.displaydetails();

        int add;
        System.out.print("enter the quantity to add : ");
        add=write.nextInt();

        update(M1,add);
        System.out.println("After adding "+add +" :");
        M1.displaydetails();


    }
   public static  void update(medicalinvetory addquantity ,int add){
        addquantity.quantity+=add;
    }
}

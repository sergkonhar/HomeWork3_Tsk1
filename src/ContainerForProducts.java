import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContainerForProducts {
    int containermaxSize =100;

FirstProduct cigs = new FirstProduct();
SecondProduct alchol = new SecondProduct();
  ArrayList<Parent> access= new ArrayList<Parent>();

    public static void main(String[] args) {
        ContainerForProducts newContainer = new ContainerForProducts();
        newContainer.cigs.setNameOfProduct("Marlboro");
        newContainer.alchol.setNameOfProduct("Redlabel");
        newContainer.cigs.setNecotine(8);
        newContainer.alchol.setAlcoholConcentartion(40);
        newContainer.cigs.setPriceOfProduct(3);
        newContainer.alchol.setPriceOfProduct(8);


        newContainer.access.add(newContainer.cigs);
        newContainer.access.add(newContainer.alchol);
        String inWord="";
        int quantity;
        Scanner input =new Scanner(System.in);
while (!inWord.contains("exit")){
    System.out.println("Choose the option"+"\n"+"add - for adding products"+"\n"+
            "print - for printing what's in the container"+"\n"+"sort - for sorting by price and print"+"\n"+
            "fill- for full filling the container"+"\n"+"index - for accessing by index"+"\n"+"exit - for exit from the program"
    +"\n"+"empty - empty the container");
    inWord = input.next().toLowerCase();
if (inWord.contains("exit")){
    System.out.println("\n"+"Exiting the program");
    break;
}
if (inWord.contains("add")){
    System.out.println("\n"+"Choose the product"+"\n"+"Cigarette - for cigarette"+"\n"+"Alcohol - for alcohol");
    inWord = input.next().toLowerCase();
if (inWord.contains("cigar")){
    System.out.println("Enter the quantity");
quantity = input.nextInt();
newContainer.addCigs(quantity);
}
   if (inWord.contains("alco")){
        System.out.println("Enter the quantity");
        quantity = input.nextInt();
        newContainer.addAlch(quantity);
    }

}
if(inWord.contains("coun")){
    newContainer.count();
}

if(inWord.contains("fil")){
    newContainer.fill();

}
    if(inWord.contains("pri")){
        newContainer.printParameters();
    }
if(inWord.contains("sor")){
    newContainer.sortProducts();
}

   if(inWord.contains("emp")){
       newContainer.empty();
   }

   if(inWord.contains("ind")){
       System.out.println("\n"+"Enter the index");
       quantity = input.nextInt();
       System.out.println(newContainer.indexacces(quantity).toString());
   }



    System.out.println("\n"+"exit or processed?");
    inWord = input.next().toLowerCase();
    if (inWord.contains("exit")){
        break;
    }


    if (inWord.contains("proce")){
        continue;
    }



}
       }

Parent indexacces(int index){
   return  access.get(index);
}

void printParameters(){
    System.out.println(cigs.toString());
    System.out.println(alchol.toString());
}








    void addCigs(int a){
        if (FirstProduct.quantity+SecondProduct.quantity+a>containermaxSize){
            System.out.println("The limit of the container was reached please select smaller amount"+"\n"+"Cigarettes ="
                    +" "+FirstProduct.quantity +"\n"+"Alcohol ="+" "+SecondProduct.quantity+"\n"+"The limit is 100 of both products");
        }
        if(FirstProduct.quantity+SecondProduct.quantity+a<=containermaxSize) {

    FirstProduct.quantity += a;
}

    }

    void addAlch(int a){
        if (FirstProduct.quantity+SecondProduct.quantity+a>containermaxSize){
            System.out.println("The limit of the container was reached please select smaller amount"+"\n"+"Cigarettes ="
                    +" "+FirstProduct.quantity +"\n"+"Alcohol ="+" "+SecondProduct.quantity+"\n"+"The limit is 100 of both products");
        }
        if(FirstProduct.quantity+SecondProduct.quantity+a<=containermaxSize) {
            SecondProduct.quantity += a;
        }

    }

void sortProducts(){
        access.stream().map(i->i.getPriceOfProduct()).sorted().forEach(System.out::println);
}
void fill() {
    for (int i = 0; i < containermaxSize; i++) {


        if (FirstProduct.quantity + SecondProduct.quantity >= 100) {
            System.out.println("The container is full" + "\n" + "Cigarette = " + "  " + FirstProduct.quantity + "\n" + "Alcohol = "
                    + " " + SecondProduct.quantity);
        break;
        }
        if (FirstProduct.quantity + SecondProduct.quantity < 100) {
            FirstProduct.quantity += 1;
        }
        if (FirstProduct.quantity + SecondProduct.quantity < 100) {
            SecondProduct.quantity += 1;
        }
    }
}

void count(){
    System.out.println("Total products in container = " +(alchol.getQuantity()+cigs.getQuantity()));


}


void empty(){
        FirstProduct.quantity =0;
        SecondProduct.quantity=0;
}
}

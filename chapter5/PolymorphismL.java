package chapter5;

public class PolymorphismL {
    
}


class Bird{
    String food;
    public String getFood(){
        return food;
    }
    public String getName(){
        return "unknown";
    }
    public void displayInformation(){
        System.out.println("the bird name is: "+getName());
    }
}
class LoveBird extends Bird{
    @Override
    public String getName(){
        return "LoveBird";
    }
    public static void main(String[] args) {
        Bird bird = new LoveBird();
        Bird bird2 = new Chicken();
        Bird bird3 = new Bird(); 
        bird.displayInformation();
        bird2.displayInformation();
        bird3.displayInformation();
    }
}
class Chicken extends Bird{
    @Override
    public String getName(){
        return "Chicken";
    }
}
// POLYMORPHIC PARAM.
class Reptile{
    String food;
    public String getName(){
        return "Reptile";
    }
    public String getFood(){
        return food;
    }
    Reptile(){
        this("insect");
    }
    Reptile(String food){
        this.food = food;
    }

}
class Crocodile extends Reptile{
    Crocodile(String food){
        super(food);
    }
    public String getName(){
        return "Crocodile";
    }
}
class Alligator extends Reptile{
    Alligator(String food){
        super(food);
    }
    public String getName(){
        return "Alligator";
    }
}
class Lizard extends Reptile{
    Lizard(String food){
        super(food);
    }
    public String getName(){
        return "Lizard";
        }
}
class Gecko extends Lizard{

    Gecko(String food) {
        super(food);
        
    }
    public String getName(){
        return "Gecko";
        }
    
}
class PetOwner{
    public static void feed(Reptile reptile){
        System.out.println("Feeding reptile  "+reptile.getName()+" with "+reptile.getFood()+ " as food");
    }
    public static void main(String[] args) {
        feed(new Alligator("Chicken"));
        feed(new Crocodile("Pork"));
        feed(new Lizard("Roach"));
        feed(new Reptile());
        feed(new Gecko("Fly"));
    }
}

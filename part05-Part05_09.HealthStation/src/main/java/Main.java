
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        
        HealthStation childrensHospital = new HealthStation();
        
        Person ethan = new Person("Ethan", 1, 110, 7);
        
        System.out.println(childrensHospital.weigh(ethan));
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        
        System.out.println(childrensHospital.weigh(ethan));
        
        childrensHospital.weigh(ethan);
        System.out.println(childrensHospital.weighings());
        
//        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
    }
}


public class HealthStation {
    private int weighings;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighings++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int weight = person.getWeight();
        person.setWeight(weight + 1);
    }
    
    public int weighings() {
        return weighings;
    }
}

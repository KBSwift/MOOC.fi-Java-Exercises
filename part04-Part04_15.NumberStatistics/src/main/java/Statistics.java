
public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int sum) {
        this.sum += sum;
        count++;
    }
    
    public int getCount() {
        return count;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0;
        }
    }
    
}

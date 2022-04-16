public class MonetaryCoin extends Coin {
    int value = 0;
    public MonetaryCoin(){
        super();
        }
    public MonetaryCoin(int newValue){
        value = newValue;
        }
    public int getValue(){
        return value;
        }
    public void setValue(int value){
        this.value = value;
        }
    public String toString(){
        return value + " " + super.toString();
        }
    }
    
    
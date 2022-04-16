import java.util.Random;
public class MainDriver {
    public static void main(String[] args){
        int bigCoin=0;
        Random rand = new Random();
        MonetaryCoin[] coins = new MonetaryCoin[20];

        for(int i=0;i<coins.length;++i){
            coins[i]= new MonetaryCoin();
            coins[i].setValue(rand.nextInt((100+1-1)+1));
            coins[i].flip();
        }
        for(int i=0; i<coins.length; ++i){
            if(coins[i].isHeads()==false){
                bigCoin = coins[i].getValue();
                break;
            }
        }
        for(int i=0; i<coins.length; ++i){
            if(coins[i].isHeads()==false && coins[i].getValue()>bigCoin){
                bigCoin = coins[i].getValue();
            }
        }
        System.out.println(bigCoin);
    }
}

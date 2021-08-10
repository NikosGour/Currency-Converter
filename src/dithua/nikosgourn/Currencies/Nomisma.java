package dithua.nikosgourn.Currencies;

import java.util.HashMap;

public abstract class Nomisma implements ICurrency{


    @Override
    public String toString() {
        var rv =  this.getClass().toString().split("Currencies.");
        return rv[1];
    }

//    public static HashMap<Nomisma, Double> exchangeRate = new HashMap<>();
//
//    public HashMap<Nomisma, Double> getExchangeRate()
//    {return exchangeRate;}
}

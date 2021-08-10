package dithua.nikosgourn.Currencies;

import java.util.HashMap;

public interface ICurrency {


    public  void setExchangeRates() ;
    public  HashMap<Nomisma, Double> getExchangeRate();
}

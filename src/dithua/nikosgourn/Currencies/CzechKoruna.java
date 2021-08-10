package dithua.nikosgourn.Currencies;

import dithua.nikosgourn.assets.Utils;

import java.util.HashMap;

public class CzechKoruna extends Nomisma implements ICurrency{
    public static HashMap<Nomisma, Double> exchangeRate = new HashMap<>();

    @Override
    public void setExchangeRates() {
        exchangeRate.put(Utils.currencies.get("UK"),0.03333 );
        exchangeRate.put(Utils.currencies.get("US") , 0.0461);
        exchangeRate.put(Utils.currencies.get("EU") , 0.0393);
        exchangeRate.put(Utils.currencies.get("BG") , 0.0770);
        exchangeRate.put(Utils.currencies.get("DN") , 0.2930);
        exchangeRate.put(Utils.currencies.get("JP") , 5.1006);
//        exchangeRate.put(Utils.currencies.get("") , );
    }

    @Override
    public HashMap<Nomisma, Double> getExchangeRate() {
        return exchangeRate;
    }
}

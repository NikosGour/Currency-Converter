package dithua.nikosgourn.assets;

import dithua.nikosgourn.Currencies.*;


import java.util.HashMap;

public class Utils {
    public static final HashMap<String, Nomisma> currencies = new HashMap<>()
    {{
        put("US" , new USDollar());
        put("EU" , new Euro());
        put("UK" , new PoundSterling());
        put("BG" , new BulgarianLev());
        put("JP" , new JapaneseYen());
        put("DN" , new DanishKrone());
        put("CZ" , new CzechKoruna());
    }};

}

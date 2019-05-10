package com.darkh0le;

/**
 * @author $darkh0le
 */
public class BeerExpert {

    public static String getBeer(String beerType) {
//        if (beerType != null) {
            switch (beerType) {
                case "oscura":
                    return "oscura1,oscura2";
                case "clara":
                    return "clara1,clara2";
                case "ligera":
                    return "ligera1,ligera2...";
            }
//        }
        return "";
    }
}

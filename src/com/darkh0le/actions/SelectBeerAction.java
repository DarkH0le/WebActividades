package com.darkh0le.actions;

import com.darkh0le.BeerExpert;
import com.opensymphony.xwork2.Action;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $darkh0le
 */
public class SelectBeerAction implements Action {

    private List<String> beerTypes;
    private String enteredBeer = "";
    private String suggestions = "";


    public SelectBeerAction() {
        System.out.println("Init Beer Action");
        beerTypes = new ArrayList<String>();
        beerTypes.add("ligera");
        beerTypes.add("oscura");
        beerTypes.add("clara");
    }

    @Override
    public String execute() throws Exception {
            setSuggestions(BeerExpert.getBeer(enteredBeer));
        return SUCCESS;
    }

    public String getEnteredBeer() {
        return enteredBeer;
    }

    public void setEnteredBeer(String enteredBeer) {
        System.out.println("setting enteredBeer");
        this.enteredBeer = enteredBeer;
    }

    public List<String> getBeerTypes() {
        return beerTypes;
    }
    public void setBeerTypes(List<String> beerTypes) {
        System.out.println("Setting Beer Types");
        this.beerTypes = beerTypes;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }
}

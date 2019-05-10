package com.darkh0le.actions;

import com.opensymphony.xwork2.Action;

/**
 * @author $darkh0le
 */
public class CalculadoraMasa implements Action {

    private Float height = 0.0f;
    private Float weight = 0.0f;
    private String result = "";

    @Override
    public String execute() throws Exception {
        this.FigureBMImet(this.height,this.weight);
        return SUCCESS;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    private void FigureBMImet(Float cm, Float kg) {
        float meters = cm/100;
        float square = meters * meters;
        this.result = (Math.round(kg * 10 / square) / 10) + "";
        System.out.println(this.result);
    }
}

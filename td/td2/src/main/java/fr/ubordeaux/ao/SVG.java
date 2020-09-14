package fr.ubordeaux.ao;

import java.util.ArrayList;
import java.util.List;

public class SVG {
    private int width;
    private int heigth;
    private List<Geometric> content;

    SVG(List<Geometric> content){
        this.content = content;
    }

    SVG(){
        this.content = new ArrayList<>();
    }

    public SVG(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }
    public void addContent(Geometric object){
        this.content.add(object);
    }
}
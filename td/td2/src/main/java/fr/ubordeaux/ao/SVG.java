package fr.ubordeaux.ao;

public class SVG {
    private int width;
    private int heigth;
    private Content[] content;

    public SVG(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }
    public void addContent(Geometric object){
        this.content.push(object);
    }
}

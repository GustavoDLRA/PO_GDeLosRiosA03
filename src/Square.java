public class Square extends Rectangle {
    //Atributos
    protected double side;
    //Metodos
    //Constructores
    public Square(){
        super();
        this.side=0.0;
    }
    public Square(double side,String color,boolean filled, double width, double length){
        super(color,filled,length,width); //El constructor marcaba error si no incluía lenght y width en super
        this.side=side;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side=side;
    }
    public void setWidth(double side){
        this.width=side;
    }
    public void setLength(double side){
        this.length=side;
    }
    @Override
    public String toString(){
        String relleno;
        if (this.filled)relleno="está relleno\n";else relleno="no está relleno \n";
        return "El cuadrado es color "+this.color+relleno;
    }
}

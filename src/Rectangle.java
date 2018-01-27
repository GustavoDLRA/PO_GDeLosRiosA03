public class Rectangle extends Shape {
    //Atributos
    protected double width;
    protected double length;
    //Metodos
    //Constructores
    public Rectangle(){
        super();
        this.length=0.0;
        this.width=0.0;
    }
    public Rectangle(String color,boolean filled, double length, double width){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return this.length;
    }
    public void setHeight(double length){
        this.length=length;
    }
    @Override
    public double getArea(){
        return this.length*this.width;
    }
    @Override
    public double getPerimeter(){
        return this.length*2+this.width*2;
    }
    @Override
    public String toString(){
        String relleno;
        if (this.filled)relleno="está relleno\n";else relleno="no está relleno \n";
        return "El rectangulo es color "+this.color+relleno;
    }

}

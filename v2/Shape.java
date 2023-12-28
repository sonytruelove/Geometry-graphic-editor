public abstract class Shape
{
    public Shape(double x,double y){
      this.x=x;
      this.y=y;
      id=counterid++;
    }
    private double x;
    private double y;
    private int id;
    private static int counterid;
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getSet();
    public double getr(){return 0.0;};
    public double geta(){return 0.0;};
    public double getb(){return 0.0;};
    public double getc(){return 0.0;};
    public boolean isCross(Shape a){return false;};
    public int getId(){
      return id;
    };
    public String getPosition(){
      return "x = "+this.x+" y = "+this.y;
    };
    public double getx(){
      return this.x;
    };
    public double gety(){
    return this.y;
  };
  public int getType(){
    String name=getClass().getSimpleName();
    if(name=="Circle")
      return 1;
    if(name=="Rectangle")
      return 2;
    if(name=="Triangle")
      return 3;
    return 0;
  }
    public String getName(){
        String name=getClass().getSimpleName();
        if(name=="Circle")
            return "Круг";
        if(name=="Rectangle")
            return "Прямоугольник";
        if(name=="Triangle")
            return "Треугольник";
        return "";
    }
    public String output(){
     return(
        "ID: "+
        getId()
        +" Имя: "+
        translate(getClass().getSimpleName())
        +" Координаты: "+
        getPosition()+getSet()
                        );
    };
  public String translate(String s){
    switch (s){
      case ("Circle"): return "Круг";
      case ("Rectangle"): return "Прямоугольник";
      case ("Triangle"): return "Треугольник";
      default: return s;
    }

  }


}
class Rectangle extends Shape
{
 public Rectangle(double x,double y,double width, double height){
    super(x,y);
    this.width=width;
    this.height=height;
  }
    private double width;
    private double height;
    @Override
    public double getPerimeter(){return width * 2 + height * 2;}
    public double getArea(){return width * height;}
    public String getSet(){return " Стороны: "+width+" "+height;}
  public double geta(){
    return width;
  }
  public double getb(){
    return height;
  }
}
class Circle extends Shape
{
    public double radius;
  public Circle(double x,double y,double radius){
    super(x,y);
    this.radius=radius;
  }
    @Override
    public double getPerimeter(){return radius*2*3.14;}
    public double getArea(){return radius*radius*3.14;}
    public String getSet(){return "  Радиус: "+radius;}
    public double getr(){
    return radius;
  }

}
class Triangle extends Shape{
  public double side1;
  public double side2;
  public double side3;
  public Triangle(double x,double y,double side1, double side2, double side3){
            super(x,y);
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
  }
  @Override
  public double getPerimeter(){return side1+side2+side3;}
  public double getArea(){
    double p=(side1+side2+side3)/2;
    return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
}
  public String getSet(){return "   Стороны: "+side1+" "+side2+" "+side3;}
  public boolean isCross(Shape b){
    if(b.getType()==2){
          if(getx()==b.getx()&&gety()==b.gety()){return true;}
      if(Math.abs(getx()-b.getx())<geta()&&gety()==b.gety()) return true;
      if((Math.abs(gety()-b.gety())<getArea()*2/geta())&&getx()==b.getx()) return true;
          if(((getx()>b.getx())&&(b.getx()+b.geta() >= getx()))){
            if(((gety()>b.gety())&&(b.gety()+b.getb())>=gety())){
                return true;
            }  
        }
       return false;

    }
    if(b.getType()==1){
     double c1x=this.side1-b.getx()+b.getr();
     double c2x=this.side2-b.getx()+b.getr();
    double c3x=this.side3-b.getx()+b.getr();
      double c1y=this.side1-b.gety()+b.getr();
       double c2y=this.side2-b.gety()+b.getr();
      double c3y=this.side3-b.gety()+b.getr();
      if (Math.sqrt(c1x*c1x + c1y*c1y) <= b.getr())
        return true;  
      if (Math.sqrt(c2x*c2x + c2y*c2y) <= b.getr())
        return true;  
      if (Math.sqrt(c3x*c3x + c3y*c3y) <= b.getr())
        return true;  
      if(getx()==b.getx()&&gety()==b.gety()) return true;
      if(Math.sqrt((getx()-b.getx())*(getx()-b.getx())+(gety()-b.gety())*(gety()-b.gety()))>b.getr()){
        return false;
      }
      return true;
    }
     if(b.getType()==3){
      if(getx()==b.getx()&&gety()==b.gety()) return true;
       if(Math.abs(getx()-b.getx())<geta()&&gety()==b.gety()) return true;
        if((Math.abs(gety()-b.gety())<getArea()*2/geta())&&getx()==b.getx()) return true;
      if(((getx()>b.getx())&&(b.getx()+b.geta()>=getx()))){
      if(((gety()>b.gety())&&(b.gety()+(2*b.getArea()/side1)>=gety()))){
          return true;
      }  }
      return false;
    }
  return false;

  }


  
  public double geta(){
    return side1;
  }
  public double getb(){
    return side2;
  }
  public double getc(){
    return side3;
  }
}
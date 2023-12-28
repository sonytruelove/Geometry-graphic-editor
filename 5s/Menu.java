import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;
import java.lang.Math;
class DataProcessing {
    public static boolean isNumber(String a){ 
      if(a==null) return false;
       return a.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")?true:false;
    }
    public static boolean isInt(String a){ 
      if(a==null) return false;
       return (Double.parseDouble(a) % 1 == 0)?true:false;
    }
    public static boolean isNonDecreasing(String a){ 
      if(a==null) return false;
       return Double.parseDouble(a)>=0;
    }
    public static boolean isCond(String arr){ 
      if(arr==null) return false;
         char[] a = arr.toCharArray();

         if((a[0]=='='&&isNumber(arr.substring(1)))){
               return true;
           }

       if(a[0]=='>'||a[0]=='>'){
           if((a[1]=='='&&isNumber(arr.substring(2)))||isNumber(arr.substring(1))){
               return true;
           }
       }
       return false;
    }
}
public class Menu {
   static Scanner in = new Scanner(System.in);
   public static String createCircle(String x,String y,String r){
        if(!DataProcessing.isNumber(x)){return("Не числовое значение, уберите лишние знаки(+,- и т.д)");}
     if(!DataProcessing.isNumber(y)){return("Не числовое значение, уберите лишние знаки(+,- и т.д)");}
     if(!DataProcessing.isNumber(r)){return("Не числовое значение, уберите лишние знаки(+,- и т.д)");}
   double dx=Double.parseDouble(x);
   double dy=Double.parseDouble(y);
   double dr=Double.parseDouble(r);
  if(dr<0) return "Отрицательные длина";
if(Math.abs((int)dx)>GUI.getMaxSize()/2||Math.abs((int)dy)>GUI.getFieldHeight()/2) return "Выход за пределы поля";
     Shape shape= new Circle(dx,dy,dr);
       Field.add(shape);
     return "Объект создан"; 
   };
  public static String createRectangle(String x,String y,String a,String b){
if(!DataProcessing.isNumber(x)){return("Не числовое значение, уберите лишние знаки(+,- и т.д)");}
         if(!DataProcessing.isNumber(y)){ return("Не числовое значение, уберите лишние знаки(+,- и т.д)");}
         if(!DataProcessing.isNumber(a)){ return("Не числовое значение, уберите лишние знаки(+,- и т.д)");}
     if(!DataProcessing.isNumber(b)){return("Не числовое значение, уберите лишние знаки(+,- и т.д)"); }
     double dx=Double.parseDouble(x);
     double dy=Double.parseDouble(y);
     double da=Double.parseDouble(a);
     double db=Double.parseDouble(b);
    if((int)da<0||(int)db<0) return "Отрицательная длина";
    if((int)dx>GUI.getMaxSize()||(int)dy>GUI.getMaxSize()) return "Выход за пределы поля";
if(Math.abs((int)dx)>GUI.getMaxSize()/2||Math.abs((int)dy)>GUI.getFieldHeight()/2) return "Выход за пределы поля";
    Field.add(new Rectangle(dx,dy,da,db));
    return("Объект создан");
  }
  public static String createTriangle(String x,String y,String a,String b,String c){
            if(!DataProcessing.isNumber(x)){ return("Не числовое значение, уберите лишние знаки(+,- и т.д)");}
         if(!DataProcessing.isNumber(y)){ return("Не числовое значение, уберите лишние знаки(+,- и т.д)"); }
         if(!DataProcessing.isNumber(a)){ return("Не числовое значение, уберите лишние знаки(+,- и т.д)");}
     if(!DataProcessing.isNumber(b)){return("Не числовое значение, уберите лишние знаки(+,- и т.д)");}
if(!DataProcessing.isNumber(c)){ return("Не числовое значение, уберите лишние знаки(+,- и т.д)");}
    double dx=Double.parseDouble(x);
    double dy=Double.parseDouble(y);
    if((int)dx>GUI.getMaxSize()/2||(int)dy>GUI.getMaxSize()/2) return "Выход за пределы поля";
    double side1=Double.parseDouble(a);
    double side2=Double.parseDouble(b);
    double side3=Double.parseDouble(c);
    if(side1<0||side2<0||side3<0) return "Отрицательные длины";
    if (!((side1 + side2 >= side3)&&(side2 + side3 >= side1)&&(side1 + side3 >= side2))) {
     return("Треугольника не существует");
    }
if(Math.abs((int)dx)>GUI.getMaxSize()/2||Math.abs((int)dy)>GUI.getMaxSize()/2) return "Выход за пределы поля";
   Field.add(new 
    Triangle(Double.parseDouble(x),Double.parseDouble(y),side1,side2,side3));
    return("Объект создан");
  }
  public static String findObject(String id){
    if(!DataProcessing.isNumber(id)){
return("Не числовое значение,уберите лишние знаки(+,- и т.д)");
      }
  if(!DataProcessing.isInt(id)){
    return("Выходит за диапазон");}
    Shape obj=Field.search(Integer.parseInt(id));
    if(!(obj==null)) return (obj.output());
      else return "Объект не найден";}
  public static Shape getObjectbyID(String id){
    if(!DataProcessing.isNumber(id)){
  return null;
      }
  if(!DataProcessing.isInt(id)){
    return null;}
    Shape obj=Field.search(Integer.parseInt(id));
    if(!(obj==null)) return (obj);
      else return null;}
  public static String deleteObject(String id){
    if(!DataProcessing.isNumber(id)){
      return("Не числовое значение,уберите лишние знаки(+,- и т.д)");
      }
    if(!DataProcessing.isInt(id)){
      return("Выходит за диапазон");}
    Shape sh=Field.search(Integer.parseInt(id));
    if(!(sh==null)) Field.remove(sh); else
    {return("Нет объекта с таким id");}
    return("Объект удален");
  }
  public static List<Shape> getObjects(){
   return Field.getObjects();
  }



}
class Field {
  private static List<Shape> objects = new ArrayList<Shape>();
  public static List<Shape> getObjects(){
    return objects;
  }
  public static void add(Shape element) {
      objects.add(element);
  };
  public static void remove(Shape element){
    objects.remove(element);
  };
  public static Shape search(int id){
    for (Shape element : objects) {
       if(element!=null)
        if (element.getId()==id) {
            return element;
        }
    }
    return null;
  };
  public static void output(){
    for(Shape element:objects) {
      if(element!=null) element.output();}
    }
}








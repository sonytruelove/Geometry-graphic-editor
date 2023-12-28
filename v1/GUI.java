import java.io.IOException;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.RectangularShape;
import java.awt.geom.Rectangle2D;
import java.awt.GradientPaint;



    public class GUI extends JFrame
    {
    
      private static final long serialVersionUID = 1L;
      private static JTextField xField=new JTextField("s");
      private static JTextField rField=new JTextField("s");
      private static JTextField yField=new JTextField("s");
      private static JTextField idFieldd=new JTextField("s");
      private static JTextField idFielda=new JTextField("s");
      private static JTextField idFieldi=new JTextField("s");
      private static JTextField idFields=new JTextField("s");
      private static JTextField idField1=new JTextField("s");
      private static JTextField xFieldr=new JTextField("s");
      private static JTextField yFieldr=new JTextField("s");
      private static JTextField aFieldr=new JTextField("s");
      private static JTextField bFieldr=new JTextField("s");
      private static JTextField xFieldt=new JTextField("s");
      private static JTextField yFieldt=new JTextField("s");
      private static JTextField aFieldt=new JTextField("s");
      private static JTextField bFieldt=new JTextField("s");
      private static JTextField cFieldt=new JTextField("s");
      private static JLabel label=new JLabel();
      static JLabel labelic=new JLabel();
      static JLabel labelir=new JLabel();
      static JLabel labelit=new JLabel();
      static JLabel labeld=new JLabel();
      static JLabel labels=new JLabel();
      static JLabel labeli=new JLabel();
      static JLabel labela=new JLabel();
      private static int counter=0;
      private static JFrame lpf=null;
      static JFrame setpfc=null;
      static JFrame setpfr=null;
      static JFrame setpft=null;
      static JFrame setpfd=null;
      static JFrame setpfs=null;
      static JFrame fa=null;
      static JFrame fi=null;
      private static int maxsize=600;
      private static ActionListener al = new ButtonActionListener();
      public GUI(String s){};
        public GUI()
        {
            // создание окна
            super("Фигуры на поле");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            JFrame frame = new JFrame("Фигуры на поле");
            frame.setSize(300,300); 
            JPanel  p = new JPanel();
            frame.add(p,BorderLayout.CENTER);
            JButton[] btns=new JButton[7] ;
            btns[0] = new JButton("Добавить объект в поле");
            btns[1] = new JButton("Удалить объект из поля");
            btns[2] = new JButton("Найти объект по ID");
            btns[3] = new JButton("Вывести все объекты поля");
            btns[4] = new JButton("Найти площадь и периметр объекта по ID");
            btns[5] = new JButton("Пересечение двух фигур");
            btns[6] = new JButton("Выход");
            p.setLayout(new GridLayout(7,1));
            ActionListener al= new ButtonActionListener();
            int j=0;
            for(JButton i:btns){
i.setName(Integer.toString(j));
            j++;
            i.addActionListener(al);
            p.add(i);
            }
            frame.setVisible(true);
        }
      public static int getMaxSize(){
        return maxsize;
      }
      public static void initFirst(){
        JFrame chooseFigure = new JFrame("Выбор фигуры");
                        chooseFigure.setSize(300,300); 
                        JPanel b = new JPanel();
                        JButton[] btnsc=new JButton[3];


                     b.setLayout(new GridLayout(4,1));
                        chooseFigure.add(b,BorderLayout.CENTER);
                        label = new JLabel("Выберите тип фигуры",null, JLabel.CENTER);


                  b.add(label);
                        btnsc[0]=new JButton("Круг");
                        btnsc[1]=new JButton("Прямоугольник");
                        btnsc[2]=new JButton("Треугольник");


            int j=0;
                         for(JButton i:btnsc){
                         i.setName(0+""+j);
                         j++;
                         i.addActionListener(al);
                         b.add(i);
        }
                      chooseFigure.setVisible(true);
      }
      public static void initCircleParameters(){
        if(setpfc!=null) return;
            setpfc = new JFrame("Задание параметров круга");
                           setpfc.setSize(300,300); 
                           JPanel setp = new JPanel();
                           setpfc.add(setp,BorderLayout.WEST);
                           setp.setLayout(new 

          GridLayout(7,1));
                              labelic = new JLabel("Введите парамеры",null, JLabel.CENTER);
                           setpfc.add(labelic);
                             JLabel labelx = new JLabel("x");


                 setp.add(labelx);
                              xField = new JTextField("", 3);
                           setp.add(xField);
                             JLabel labely = new JLabel("y");


                              yField = new JTextField("2", 3);
                           setp.add(labely);
                           setp.add(yField);
                             JLabel labelr = new JLabel("r");
                             rField = new JTextField("4", 3);
                           setp.add(labelr);
                           setp.add(rField);
                           JButton btnin=new JButton("Ввести");


          setp.add(btnin);
                           btnin.setName("createcircle");
                        
                           btnin.addActionListener(al);
                           setpfc.setVisible(true);
           setpfc.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                   setpfc=null;
                }});

        }
      public static void initRectangleParameters(){
         setpfr = new JFrame("Задание параметров прямоугольника");
                           setpfr.setSize(300,300); 
                           JPanel setp = new JPanel();
                           setpfr.add(setp,BorderLayout.WEST);
                           setp.setLayout(new
                                          GridLayout(7,1));
                              labelir = new JLabel("Введите парамеры",null,
                                                 JLabel.CENTER);
                           setpfr.add(labelir);
                                        JLabel labelx = new JLabel("x");
                                        xFieldr = new JTextField("", 3);
                                        setp.add(labelx);
                                        setp.add(xFieldr);
                                        JLabel labely = new JLabel("y");
                                        yFieldr = new JTextField("2", 3);
                                        setp.add(labely);
                                        setp.add(yFieldr);
                                        JLabel labela = new JLabel("a");
                                        aFieldr = new JTextField("4", 3);
                                        setp.add(labela);
                                        setp.add(aFieldr);
                                        JLabel labelb = new JLabel("b");
                                        bFieldr = new JTextField("4", 3);
                                        setp.add(labelb);
                                        setp.add(bFieldr);
                                        JButton btnin=new JButton("Ввести");
                                        setp.add(btnin);
                                        btnin.setName("createrectangle");
                                        btnin.addActionListener(al);
                                        setpfr.setVisible(true);

        setpfr.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
           setpfr=null;
        }});
      }
      public static void initTriangleParameters(){
         setpft = new JFrame("Задание параметров треугольника");
                           setpft.setSize(300,300); 
                           JPanel setp = new JPanel();
                           setpft.add(setp,BorderLayout.WEST);
                           setp.setLayout(new
                                          GridLayout(7,1));
                              labelit = new JLabel("Введите парамеры",null,
                                                 JLabel.CENTER);
                           setpft.add(labelit);
                                        JLabel labelx = new JLabel("x");
                                        xFieldt = new JTextField("", 3);
                                        setp.add(labelx);
                                        setp.add(xFieldt);
                                        JLabel labely = new JLabel("y");
                                        yFieldt = new JTextField("2", 3);
                                        setp.add(labely);
                                        setp.add(yFieldt);
                                        JLabel labela = new JLabel("a");
                                        aFieldt = new JTextField("4", 3);
                                        setp.add(labela);
                                        setp.add(aFieldt);
                                        JLabel labelb = new JLabel("b");
                                        bFieldt = new JTextField("4", 3);
                                        setp.add(labelb);
                                        setp.add(bFieldt);
                                        JLabel labelc = new JLabel("c");
                                        cFieldt = new JTextField("4", 3);
                                        setp.add(labelc);
                                        setp.add(cFieldt);
                                        JButton btnin=new JButton("Ввести");
                                        setp.add(btnin);
                                        btnin.setName("createtriangle");
                                        btnin.addActionListener(al);
                                        setpft.setVisible(true);
        setpft.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
           setpft=null;
        }});
        
      }
      public static void initCreateCircle(){
        {
          String x=xField.getText();
          String y=yField.getText();
          String r=rField.getText();
          String result=Menu.createCircle(x,y,r);
          labelic.setText("<html>"+result+"</html>");
        if(result=="Объект создан"){
          return;
        }
          
          }
      }
      public static void initCreateRectangle(){
        String x=xFieldr.getText();
        String y=yFieldr.getText();
        String a=aFieldr.getText();
        String b=bFieldr.getText();
        String result=Menu.createRectangle(x,y,a,b);
        labelir.setText("<html>"+result+"</html>");
        if(result=="Объект создан"){
          return;
        }
      }
      public static void initCreateTriangle(){
        String x=xFieldt.getText();
        String y=yFieldt.getText();
        String a=aFieldt.getText();
        String b=bFieldt.getText();
        String c=cFieldt.getText();
        String result=Menu.createTriangle(x,y,a,b,c);
        labelit.setText("<html>"+result+"</html>");
        if(result=="Объект создан"){
          return;
        }

      }
      public static void initSecond(){
        setpfd = new JFrame("Удаление объекта");
                           setpfd.setSize(300,300); 
                           JPanel setp = new JPanel();
                           setpfd.add(setp,BorderLayout.CENTER);
                           setp.setLayout(new
                                          GridLayout(3,1));
                              labeld = new JLabel("Введите id",null,
                                                 JLabel.CENTER);
                           setp.add(labeld);
                                        idFieldd = new JTextField("", 3); 
                          setp.add(idFieldd);
        JButton btnin=new JButton("Ввести");
        setp.add(btnin);
        btnin.setName("deleteobject");
        btnin.addActionListener(al);
        setpfd.setVisible(true);
        
        setpfd.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
           setpfd=null;
        }});

      }
      public static void initDelete(){
        String id=idFieldd.getText();
        String result=Menu.deleteObject(id);
        labeld.setText(result);
      }
      public static void initThird(){
         setpfs = new JFrame("Поиск объекта");
                           setpfs.setSize(300,300); 
                           JPanel setp = new JPanel();
                           setpfs.add(setp,BorderLayout.CENTER);
                           setp.setLayout(new
                                          GridLayout(3,1));
                                        labels = new JLabel("Введите id",null, 
                                                           JLabel.CENTER);
                           setp.add(labels);
                                        idFields = new JTextField("", 3);
                                        setp.add(idFields);
        JButton btnin=new JButton("Ввести");
        setp.add(btnin);
        btnin.setName("searchobject");
        btnin.addActionListener(al);
        setpfs.setVisible(true);
        setpfs.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
           setpfs=null;
        }});
        
      }
      public static void initSearch(){
        String id=idFields.getText();
        String result=Menu.findObject(id);
        labels.setText("<html>"+result+"</html>");
      }
      public void initFourth(){
        JLayeredPane llp = getLayeredPane();
        llp.removeAll();
        var objs=Menu.getObjects();
        for(var i:objs){
          if(i.getType()==1){Figure figure = new Figure(Color.red , i.getType(), "id:"+i.getId(),(int)i.getx(),(int)i.gety(),(int)i.getr());llp.add(figure);figure.setBounds(0, 0, getMaxSize(),getMaxSize());}
          if(i.getType()==2){Figure figure = new Figure(Color.blue , i.getType()
                                                          , "id:"+i.getId(),(int)i.getx(),(int)i.gety(),(int)i.geta(),(int)i.getb());llp.add(figure);figure.setBounds(0, 0, getMaxSize(), getMaxSize());}
          if(i.getType() == 3) {Figure figure = new Figure(Color.green , i.getType(), "id:"+i.getId(),(int)i.getx()+getMaxSize()/2,(int)i.gety()+getMaxSize()/2,(int)i.geta(),(int)i.getb(),(int)i.getc());llp.add(figure);figure.setBounds(0, 0, getMaxSize(), getMaxSize());}
         
        }
        llp.setBounds(getMaxSize()/2, getMaxSize()/2, getMaxSize(), getMaxSize());
        if(counter!=0){
          lpf.getContentPane().removeAll();    
          lpf.add(llp);
          SwingUtilities.updateComponentTreeUI(lpf);
          lpf.invalidate();
          lpf.revalidate();
          lpf.validate();
          lpf.repaint();
          return;
        }
        lpf=new JFrame("Поле с размером (-"+getMaxSize()/2+";+"+getMaxSize()/2+")");
        lpf.add(llp);
        counter++;
        lpf.setSize(getMaxSize(),getMaxSize());
        lpf.setResizable(false);
        lpf.setVisible(true);

        lpf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                counter--;
            }
        });

        
      }
      public static void initFiveth(){
         fa=new JFrame("Площадь и периметр");
          fa.setSize(300,300);
          JPanel p=new JPanel();
          fa.add(p,BorderLayout.CENTER);
          p.setLayout(new GridLayout(3,1));
          labela=new JLabel("Введите id");
          p.add(labela);
          idFielda=new JTextField("",3);
          p.add(idFielda);
          JButton btnin=new JButton("Ввести");
          p.add(btnin);
        btnin.setName("getareaperimeter");
        btnin.addActionListener(al);
        fa.setVisible(true);

        fa.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
           fa=null;
        }});
        
            }


      public static void getAreaAndPerimeterByID(){
        String id=idFielda.getText();
          if(Menu.getObjectbyID(id)!=null){
          Shape sh=Menu.getObjectbyID(id);
         labela.setText("Площадь: "+sh.getArea()+" Периметр: "+sh.getPerimeter());}
          else
            labela.setText("<html>"+Menu.findObject(id)+"</html>");
        
      }
      public static void initSixth(){
         fi=new JFrame("Пересечение объектов");
          fi.setSize(300,300);
          JPanel p=new JPanel();
          fi.add(p,BorderLayout.CENTER);
          p.setLayout(new GridLayout(4,1));
          labeli=new JLabel("Введите id");
          p.add(labeli);
          idFieldi=new JTextField("",3);
          p.add(idFieldi);
          idField1=new JTextField("",3);
          p.add(idField1);  
          JButton btnin=new JButton("Ввести");
          p.add(btnin);
        btnin.setName("isintersect");
        btnin.addActionListener(al);
        fi.setVisible(true);
        fi.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
           fi=null;
        }});

        
      }
      public static void isIntersectByID(){
        String id=idFieldi.getText();
        String id1=idField1.getText();
        if(id.equals(id1)){
          labeli.setText("Выберите разные объекты");
          return;
        }
        if(Menu.getObjectbyID(id)!=null && Menu.getObjectbyID(id1)!=null){
          Shape sh=Menu.getObjectbyID(id);
          Shape sh1=Menu.getObjectbyID(id1);
         if(Figure.cross(sh,sh1)||sh.isCross(sh1)||sh1.isCross(sh)) labeli.setText("Эти объекты пересекаются"); else
           labeli.setText("Эти объекты не пересекаются");
           }
        else
          labeli.setText("Один или оба из объектов не существует");
      }


      
      public static void main(String[] args)
        {
            JFrame.setDefaultLookAndFeelDecorated(true);
            new GUI();
        }
 


      
     public static class ButtonActionListener implements ActionListener {
      

          public void actionPerformed(ActionEvent e) 
              {
                
             JButton btn = (JButton) e.getSource();


String name=btn.getName();
             
                
               switch (name){
                case "0":
                  GUI.initFirst();
                break;
            case "00":
                closeFrame(btn);
                GUI.initCircleParameters();
                break;
            case "01":
                   closeFrame(btn);
                   GUI.initRectangleParameters();
                   break;
            case "02":
                closeFrame(btn);
                GUI.initTriangleParameters();
                break;
            case "createcircle":
                GUI.initCreateCircle();
                break;
            case "createrectangle":
                   GUI.initCreateRectangle();
                   break;
            case "createtriangle":
                    GUI.initCreateTriangle();
                    break;
            case "1":
                   GUI.initSecond();
                 break;
            case "deleteobject":
                      GUI.initDelete();
                    break;
            case "2":
                      GUI.initThird();
                    break;
            case "searchobject":
                         GUI.initSearch();
                       break;
            case "3":{
                GUI gui=new GUI("n");
              gui.initFourth(); 
                   break;}
            case "4":
                   GUI.initFiveth(); 
                        break;
            case "getareaperimeter":
              GUI.getAreaAndPerimeterByID();
                   break;
            case "5":
              GUI.initSixth(); 
              break;
            case "isintersect":
              GUI.isIntersectByID();
              break;
            case "6":
                   System.exit(0);


   }
     
     } 
     public void closeFrame(JButton btn){
           JFrame frame=(JFrame)SwingUtilities.getRoot(btn);
           frame.setVisible(false);
           frame.dispose();
     }
  


       

    }}
    class Figure extends JComponent
    {
        private static final 

long serialVersionUID = 1L;


 private Color color;
        private int type;
        private int x;
        private int y;
        private int a;
        private int b;
        private int side1;
        private int side2;
        private int side3;
        private int r;
        private String text;
        Figure(Color color, int type, String text,int x,int y,int r) {


            this.color = color;
            this.type = type;
            this.text = text;
            this.x=x+GUI.getMaxSize()/2;
            this.y=-y+GUI.getMaxSize()/2;
            this.r=r;
            setOpaque(false);
        }
        Figure(Color color, int type, String text,int x,int y,int a,int b) {


                  this.color = color;
                  this.type = type;
                  this.text = text;
                  this.x=x+GUI.getMaxSize()/2;
                  this.y=-y+GUI.getMaxSize()/2;
                  this.a=a;
                  this.b=b;
                  setOpaque(false);
              }
      Figure(Color color, int type, String text,int x,int y,int a,int b, int c) {


          this.color = color;
          this.type = type;
          this.text = text;
          this.x=x;
          this.side1=a;
          this.side2=b;
          this.side3=c;
        double p = (this.side1 + this.side2 + this.side3) / 2;
        double s =  Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p-this.side3));
        double h=2*s/this.side1;
          this.y=-y+GUI.getMaxSize()+(int)h;
          setOpaque(false);
      }
        public void paintComponent(Graphics g) {
            // прорисовка фигуры
            g.setColor(color);
       switch 

(type) {
                case 1: g.fillOval(this.x, this.y, this.r, this.r); break;
                case 2: g.fillRect(this.x, this.y, this.a, this.b); break;
                case 3:
     double p = (this.side1 + this.side2 + this.side3) / 2;
    double s =  Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p-this.side3));
    double h=2*s/this.side1;
    int a=(int)Math.sqrt((this.side2*this.side2)-(h*h));
        Path2D myPath = new Path2D.Double();
        myPath.moveTo(this.x, this.y);
        myPath.lineTo(this.x+this.side1, this.y);
        myPath.lineTo(this.x+this.side1-a, this.y-(int)h);
        myPath.closePath();
        Graphics2D g2d= (Graphics2D)g;
        g2d.fill(myPath);
        break;
            }
            g.setColor(Color.black);
            g.drawString(text, this.x+Character.getNumericValue(text.charAt(3)), this.y);
        }

      public static boolean cross(Shape sh1,Shape sh2){
          RectangularShape rect01=null;
          RectangularShape rect02=null;
          Path2D.Double triangle01=null;
          Path2D.Double triangle02=null;
          Area a1 = null;
          Area a2 = null;
        if(sh1.getType()==1){ rect01=new Ellipse2D.Double(sh1.getx(),sh1.gety(),sh1.getr(),sh1.getr());a1= new Area(rect01);}
        if(sh1.getType()==2) {rect01=new Rectangle((int)sh1.getx(),(int)sh1.gety(),(int)sh1.geta(),(int)sh1.getb());
        a1= new Area(rect01);}
        if(sh1.getType()==3){ triangle01= new Path2D.Double();
      double x=sh1.getx();
      double y=sh1.gety();
      double side1=sh1.geta();
      double side2=sh1.getb();
      double side3=sh1.getc();
        double p = (side1 + side2 + side3) / 2;
        double s =  Math.sqrt(p * (p - side1) * (p -side2) * (p-side3));
        double h=2*s/side1;
        int a=(int)Math.sqrt((side2*side2)-(h*h));
          triangle01.moveTo(sh1.getx(), sh2.gety());
          triangle01.lineTo(x+side1,y);
          triangle01.lineTo((int)x+side1-a, (int)y-h);
          triangle01.closePath();
          a1=new Area(triangle01);
                            }   
        if(sh2.getType()==1) {rect02=new Ellipse2D.Double(sh2.getx(),sh2.gety(),sh2.getr(),sh2.getr());
         a2 = new Area(rect02);}
        if(sh2.getType()==2){rect02=new Rectangle.Double((int)sh2.getx(),sh2.gety(),sh2.geta(),sh2.getb());
         a2 = new Area(rect02);}
        if(sh2.getType()==3){ triangle02= new Path2D.Double();
          double x=sh2.getx();
          double y=sh2.gety();
          double side1=sh2.geta();
          double side2=sh2.getb();
          double side3=sh2.getc();
            double p = (side1 + side2 + side3) / 2;
            double s =  Math.sqrt(p * (p - side1) * (p -side2) * (p-side3));
            double h=2*s/side1;
            int a=(int)Math.sqrt((side2*side2)-(h*h));
              triangle02.moveTo(sh1.getx(), sh2.gety());
              triangle02.lineTo(x+side1,y);
              triangle02.lineTo((int)x+side1-a, y-(int)h);
              triangle02.closePath();
              a1=new Area(triangle02);
                                } 

        try{
          Rectangle2D ar2=new Rectangle2D.Double(sh2.getx(),sh2.gety(),sh2.geta(),sh2.getb());
          if(a1.contains(ar2)) return true;
        a1.intersect(a2);}catch(Exception e){
          try{
            Rectangle2D ar1=new Rectangle2D.Double(sh1.getx(),sh1.gety(),sh1.geta(),sh1.getb());
            
             if(a2.contains(ar1)) return true;
             a2.intersect(a1);
            
        return  !a2.isEmpty();}
          catch(Exception er){
            return false;
          }
        }
       return  !a1.isEmpty();
      }

    }
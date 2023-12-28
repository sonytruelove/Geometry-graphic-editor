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

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
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
      private static int maxsize=800;
      private static ActionListener al = new ButtonActionListener();
      public GUI(String s){};
        public GUI()
        {
            // создание окна
            super("Фигуры на поле");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            GUI s=new GUI("s");
            s.initFourth();
        }
      public static int getMaxSize(){
        return maxsize;
      }
      public static void setMaxSize(int size){
        maxsize=size;
      }
      public static int getFieldHeight(){
        return maxsize-420;
      }

      
      public static JPanel initTools(){
        JPanel set = new JPanel();
        set.setLayout(new GridLayout(3,2));
        if(counter==0)
        label = new JLabel("Начните работу с создания фигуры!",null, JLabel.CENTER);
        else
        label = new JLabel("Инструменты",null, JLabel.CENTER);
        JPanel settings = new JPanel();
        settings.add(label);
        set.add(initCircleParameters());
        set.add(initRectangleParameters());
        set.add(initTriangleParameters());
        set.add(initSecond());
        set.add(initThird());
        set.add(initSixth());
        settings.add(set);
        return settings;
      }

      public static JPanel initCircleParameters(){
        
                             JPanel setp = new JPanel();
                             setp.setLayout(new FlowLayout());
                              JLabel labelx = new JLabel("x");
                            setp.add(labelx);
                                xField = new JTextField("", 3);
                             setp.add(xField);
                               JLabel labely = new JLabel("y");
                                yField = new JTextField("", 3);
                             setp.add(labely);
                             setp.add(yField);
                               JLabel labelr = new JLabel("r");
                               rField = new JTextField("", 3);
                             setp.add(labelr);
                             setp.add(rField);
                             JButton btnin=new JButton("Ввести");
            setp.add(btnin);
                             btnin.setName("createcircle");

                             btnin.addActionListener(al);
        JPanel n = new JPanel();
        n.setLayout(new GridLayout(2,1));
        JLabel labeli=new JLabel("Круг",null,JLabel.CENTER);
        n.add(labeli);
        n.add(setp);
        n.setPreferredSize(new Dimension(300, 94));
        return n;
          }
      public static JPanel initRectangleParameters(){
                           JPanel setp = new JPanel();
                           setp.setLayout(new FlowLayout());
                           JLabel labelx = new JLabel("x");
                           xFieldr = new JTextField("", 3);
                           setp.add(labelx);
                           setp.add(xFieldr);
                           JLabel labely = new JLabel("y");
                           yFieldr = new JTextField("", 3);
                           setp.add(labely);
                           setp.add(yFieldr);
                           JLabel labela = new JLabel("a");
                          aFieldr = new JTextField("", 3);
                            setp.add(labela);
                           setp.add(aFieldr);
                           JLabel labelb = new JLabel("b");
                            bFieldr = new JTextField("", 3);
                            setp.add(labelb);
                            setp.add(bFieldr);
                            JButton btnin=new JButton("Ввести");
                            setp.add(btnin);
                            btnin.setName("createrectangle");
                            btnin.addActionListener(al);
        JPanel n = new JPanel();
        n.setLayout(new GridLayout(2,1));
        JLabel labeli=new JLabel("Прямоугольник",null,JLabel.CENTER);
        n.add(labeli);
        n.add(setp);
        return n;
      }
      public static JPanel initTriangleParameters(){
        JPanel setp = new JPanel();
        setp.setLayout(new FlowLayout());
        JLabel labelx = new JLabel("x");
        xFieldt = new JTextField("", 3);
        setp.add(labelx);
        setp.add(xFieldt);
        JLabel labely = new JLabel("y");
        yFieldt = new JTextField("", 3);
        setp.add(labely);
        setp.add(yFieldt);
        JLabel labela = new JLabel("a");
        aFieldt = new JTextField("", 3);
        setp.add(labela);
        setp.add(aFieldt);
        JLabel labelb = new JLabel("b");
        bFieldt = new JTextField("", 3);
        setp.add(labelb);
        setp.add(bFieldt);
        JLabel labelc = new JLabel("c");
        cFieldt = new JTextField("", 3);
        setp.add(labelc);
        setp.add(cFieldt);
        JButton btnin=new JButton("Ввести");
        setp.add(btnin);
        btnin.setName("createtriangle");
        btnin.addActionListener(al);
        JPanel n = new JPanel();
        n.setLayout(new GridLayout(2,1));
        JLabel labeli=new JLabel("Треугольник",null,JLabel.CENTER);
        n.add(labeli);
        n.add(setp);
        return n;
      }
      public static Box initLegend(){
          List <Shape> sh = Menu.getObjects();
          DefaultTableModel tableModel = new DefaultTableModel();
          String[] identificators=new String[]{"Объект","Координаты","ID","Параметры","Площадь","Периметр"};
          tableModel.setColumnIdentifiers(identificators);
          for (Shape s: sh)
              tableModel.addRow(new String []{s.getName(),s.getPosition(),String.valueOf(s.getId()),s.getSet(),String.format("%.3f",s.getArea()),String.format("%.3f",s.getPerimeter())});
          JTable table= new JTable(tableModel);
          Box contents = new Box(BoxLayout.PAGE_AXIS);
        JScrollPane JS=new JScrollPane(table);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(150);
         JS.setPreferredSize(new Dimension(GUI.getMaxSize(), 100));
          contents.add(JS);
          JS.setBorder(BorderFactory.createEmptyBorder());
          return contents;
      }
      public static void restate(){
        GUI s=new GUI("s");
        s.initFourth();
      }
      public static void initCreateCircle(){
        {
          String x=xField.getText();
          String y=yField.getText();
          String r=rField.getText();
          String result=Menu.createCircle(x,y,r);
          label.setText("<html>"+result+"</html>");
        if(result=="Объект создан"){
          restate();
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
        label.setText("<html>"+result+"</html>");
        if(result=="Объект создан"){
          restate();
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
        label.setText("<html>"+result+"</html>");
        if(result=="Объект создан"){
          restate();
          return;
        }

      }
      public static JPanel initSecond(){
                           JPanel setp = new JPanel();
                           setp.setLayout(new FlowLayout());
        JLabel labelid = new JLabel("id",null, 
           JLabel.CENTER);
                           setp.add(labelid);
                           idFieldd = new JTextField("", 3); 
                          setp.add(idFieldd);
        JButton btnin=new JButton("Ввести");
        setp.add(btnin);
        btnin.setName("deleteobject");
        btnin.addActionListener(al);
        JPanel n=new JPanel();
        n.setLayout(new GridLayout(2,1));
        JLabel labeli=new JLabel("Удаление",null,JLabel.CENTER);
        n.add(labeli);
        n.add(setp);
        return n;
      }
      public static void initDelete(){
        String id=idFieldd.getText();
        String result=Menu.deleteObject(id);
        label.setText(result);
        if(result=="Объект удален"){
          restate();
        }
      }
      public static JPanel initThird(){
         JPanel setp = new JPanel();
         setp.setLayout(new FlowLayout());
        idFields = new JTextField("", 3);
        JLabel labelid = new JLabel("id");
        JLabel labeli=new JLabel("Поиск",null,JLabel.CENTER);
        setp.add(labelid);
        setp.add(idFields);
        JButton btnin=new JButton("Ввести");
        setp.add(btnin);
        btnin.setName("searchobject");
        btnin.addActionListener(al);
        JPanel n=new JPanel();
         n.setLayout(new GridLayout(2,1));
        n.add(labeli);
        n.add(setp);
        return n;
      }
      public static void initSearch(){
        String id=idFields.getText();
        String result=Menu.findObject(id);
        label.setText("<html>"+result+"</html>");
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
        llp.setBorder(BorderFactory.createLineBorder(Color.darkGray,2,true));
       Figure center=new Figure(Color.black);
         center.setBounds(0, 0, getMaxSize(), getMaxSize());
       llp.add(center,JLayeredPane.POPUP_LAYER);
        if(counter!=0){
          lpf.getContentPane().removeAll();    
          lpf.add(llp, BorderLayout.CENTER);
           lpf.getContentPane().add(initTools(), BorderLayout.SOUTH);
           lpf.getContentPane().add(Box.createVerticalStrut(100), BorderLayout.NORTH);
          if(objs.size()!=0)
            lpf.getContentPane().add(initLegend(), BorderLayout.NORTH);
          SwingUtilities.updateComponentTreeUI(lpf);
          lpf.invalidate();
          lpf.revalidate();
          lpf.validate();
          lpf.repaint();
          return;
        }
        lpf=new JFrame("Фигуры на поле");
        lpf.add(llp);
        lpf.getContentPane().add(Box.createVerticalStrut(100), BorderLayout.NORTH);
        lpf.setResizable(false);
        lpf.getContentPane().add(llp, BorderLayout.CENTER);
        lpf.getContentPane().add(initTools(), BorderLayout.SOUTH);
        lpf.setSize(getMaxSize(),getMaxSize());
        counter++;
        lpf.setVisible(true);
        lpf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                counter--;
            }
        });

        
      }
      public static JPanel initSixth(){
          JPanel p=new JPanel();
          p.setLayout(new FlowLayout());
          JLabel labeli=new JLabel("Пересечение",null,JLabel.CENTER);
          p.add(labeli); 
          JLabel labelid=new JLabel("id");
          idFieldi=new JTextField("",3);
          p.add(labelid); 
          p.add(idFieldi);
          JLabel labelid1=new JLabel("id1");
          idField1=new JTextField("",3);
          p.add(labelid1);  
          p.add(idField1);  
          JButton btnin=new JButton("Ввести");
          p.add(btnin);
        btnin.setName("isintersect");
        btnin.addActionListener(al);
        JPanel n=new JPanel();
         n.setLayout(new GridLayout(2,1));
        n.add(labeli);
        n.add(p);
        n.setPreferredSize(new Dimension(100, 60));
      return n;
      }
      public static void isIntersectByID(){
        String id=idFieldi.getText();
        String id1=idField1.getText();
        if(id.equals(id1)){
          label.setText("Выберите разные объекты");
          return;
        }
        if(Menu.getObjectbyID(id)!=null && Menu.getObjectbyID(id1)!=null){
          Shape sh=Menu.getObjectbyID(id);
          Shape sh1=Menu.getObjectbyID(id1);
         if(Figure.cross(sh,sh1)||sh.isCross(sh1)||sh1.isCross(sh)) label.setText("Эти объекты пересекаются"); else
           label.setText("Эти объекты не пересекаются");
           }
        else
          label.setText("Один или оба из объектов не существует");
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
            case "createcircle":
                GUI.initCreateCircle();
                break;
            case "createrectangle":
                   GUI.initCreateRectangle();
                   break;
            case "createtriangle":
                    GUI.initCreateTriangle();
                    break;
            case "deleteobject":
                      GUI.initDelete();
                    break;
            case "searchobject":
                         GUI.initSearch();
                       break;
            case "isintersect":
              GUI.isIntersectByID();
              break;
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
       Figure(Color color) {
        this.color=color;
         this.type=0;
         this.r = 10;
         this.x = GUI.getMaxSize()/2-this.r/2;
         this.y = GUI.getMaxSize()/4-this.r/2-this.r/10;
         setOpaque(false);
       }
        Figure(Color color, int type, String text,int x,int y,int r) {
            this.color = color;
            this.type = type;
            this.text = text;
            this.r=r;
            this.x=x+GUI.getMaxSize()/2-this.r;
            this.y=-y+GUI.getMaxSize()/4-this.r-this.r/15;
            setOpaque(false);
        }
        Figure(Color color, int type, String text,int x,int y,int a,int b) {


                  this.color = color;
                  this.type = type;
                  this.text = text;
                  this.a=a;
                  this.b=b;
                  this.x=x+GUI.getMaxSize()/2-this.a/2;
                  this.y=-y+GUI.getMaxSize()/4-this.b/2-this.b/30;
                  setOpaque(false);
              }
      Figure(Color color, int type, String text,int x,int y,int a,int b, int c) {


          this.color = color;
          this.type = type;
          this.text = text;
          this.side1=a;
          this.side2=b;
          this.side3=c;
          this.x=x-a/2;
        double p = (this.side1 + this.side2 + this.side3) / 2;
        double s =  Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p-this.side3));
        double h=2*s/this.side1;
          this.y=-y+GUI.getMaxSize()/2+GUI.getMaxSize()/4+(int)h/2+5;
          setOpaque(false);
      }
        public void paintComponent(Graphics g) {
            g.setColor(color);
       switch 

(type) {
     case 0: g.fillOval(this.x, this.y, this.r, this.r); break;
                case 1: g.fillOval(this.x, this.y, this.r*2, this.r*2); break;
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
           if(text!=null) g.drawString(text, this.x+Character.getNumericValue(text.charAt(3)), this.y);
        }

      public static boolean cross(Shape sh1,Shape sh2){
          RectangularShape rect01=null;
          RectangularShape rect02=null;
          Path2D.Double triangle01=null;
          Path2D.Double triangle02=null;
          Area a1 = null;
          Area a2 = null;
        if(sh1.getType()==1){ rect01=new Ellipse2D.Double(sh1.getx(),sh1.gety(),sh1.getr()*2,sh1.getr()*2);a1= new Area(rect01);}
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
        if(sh2.getType()==1) {rect02=new Ellipse2D.Double(sh2.getx(),sh2.gety(),sh2.getr()*2,sh2.getr()*2);
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
                             if(rect01!=null){
if(rect01.contains((int)x,(int)y)) return true;              if(rect01.contains((int)x+side1,(int)y)) return true;
if(rect01.contains((int)x+side1-a,(int)y-(int)h)) return true;
                             }
                               if(triangle01!=null){
                             if(triangle01.contains((int)x,(int)y)) return true;              if(triangle01.contains((int)x+a,(int)y)) return true;
                             if(triangle01.contains((int)x+side1-a,(int)y-(int)h)) return true;
                                                          }
                                }
        if(triangle01!=null){
        if(rect02!=null){
            double x=sh2.getx();
            double y=sh2.gety();
            double side1=sh2.geta();
            double side2=sh2.getb();
            double side3=sh2.getc();
              double p = (side1 + side2 + side3) / 2;
              double s =  Math.sqrt(p * (p - side1) * (p -side2) * (p-side3));
              double h=2*s/side1;
              int a=(int)Math.sqrt((side2*side2)-(h*h));
           if(rect02.contains((int)x,(int)y)) return true;              if(rect02.contains((int)x+side1,(int)y)) return true;
           if(rect02.contains((int)x+side1-a,(int)y-(int)h)) return true;
        }}


        
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
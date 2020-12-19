import javax.swing.*;
import java.awt.event.*;
class Graphic implements ActionListener
{
      JFrame f;
      JButton b;
      JTextArea ta;
      String s="";
      public Graphic()
      {
          f=new JFrame();
          f.setSize(700,800);
          b=new JButton("CLick Here");
          b.setBounds(500,600,90,100);
          ta=new JTextArea();
          ta.setBounds(10,20,400,300);
          b.addActionListener(this);
          f.add(b);
          f.add(ta);
          f.setLayout(null);
          f.setVisible(true);
      }
      void Jump()
      {
        int i,j,k;
        s="";
        ta.setText("\f");
        for(i=1;i<10;i++)
        {
          s=s+"\n";
        }
        s+="    *\n";
        s+="   ***        *        *\n"; 
        s+="  *****      *        *\n";
        s+="   *** **************************************\n";
        s+="   * *\n";
        ta.setText(s);
      }
      public void Run1()
      {
       int i,j,k;
       String s="";
       for(i=1;i<10;i++)
        {
           s=s+"\n";
       }
       for(i=1;i<=2;i++)//head
       {
           s+="    *\n"; 
       }
        for(i=1;i<=3;i++)//body
        {
          for(j=3-i;j>=0;j--)
          s+=" ";
          s+="*";
          for(j=1;j<i;j++)
          s+=" ";
          s+="*";
          for(k=1;k<i;k++)
          s+=" ";
          s+="*";
          if(i==1)
          s+="    *              *          *\n";
          if(i==2)
          s+="   *              *          *\n";
          if(i==3)
          s+="*****************************************\n";
          
       }
       for(j=1;j<=4;j++)
       s+=" ";
       s+="*\n"; 
       for(i=1;i<=3;i++)//legs
       {
          for(j=3-i;j>=0;j--)
          s+=" ";
           s+="*";
           for(j=1;j<=i;j++)
           s+=" ";
           for(j=1;j<i;j++)
           s+=" ";
           s+="*\n";
       }
       ta.setText(s);
  }
  public  void Run2()
  {
      int i,j,k;
      s="";
      for(i=1;i<10;i++)
      {
        s+="\n";
      }
      for(i=1;i<=2;i++)
      {
          for(j=1;j<=4;j++)
           s+=" ";
           s+="*\n"; 
      }
      for(i=1;i<=3;i++)
      {
          for(j=3-i;j>=0;j--)
          s+=" ";
          s+="*";
          for(j=1;j<i;j++)
          s+=" ";
          s+="*";
          for(k=1;k<i;k++)
          s+=" ";
          s+="*";
          if(i==1)
          s+="  *              *          *\n";
          if(i==2)
          s+=" *              *          *\n";
          if(i==3)
          s+="*****************************************\n";
      }
      for(j=1;j<=4;j++)
      s+=" ";
      s+="*\n"; 
      for(i=1;i<=3;i++)
      {
          for(j=3-i;j>=0;j--)
          s+=" ";
          s+="*";
          s+="*\n";
      }
      ta.setText(s);
  }
  void flash()
  {
      int x;
      double y;
      for(x=0;x<10000;x++)
      {   
          int i,j,a,b;
          Run1();
          for(y=0;y<=100000000;y++)
          {
          }
          ta.setText("\f");
          Run2();
          for(y=0;y<=100000000;y++)
          {
          }          
          ta.setText("\f");
        if(x%10==0)
          {
            Run1();
            for(y=0;y<=1000000000;y++)
            {
            }
            ta.setText("\f");
         }
      }
  }
  public void actionPerformed(ActionEvent e)
  {
          Jump();
          for(int y=0;y<=100000000;y++)
          {
              for(int i=0;i<10;i++){}
          }
  }
  public static void main()
  {
          Graphic ob=new Graphic();
          ob.flash();
  }
}   

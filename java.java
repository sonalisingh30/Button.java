
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class fbutton extends Frame  implements ActionListener {

    fbutton(){
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        Button b1,b2,b3,b4;
        b1=new Button("yellow");
        b2=new Button("blue");
      

        b1.addActionListener(this);
        b2.addActionListener(this);
        

        add(b1);
        add(b2);
        



    }
    public void actionPerformed(ActionEvent e) {
     String str=e.getActionCommand();
             if(str.equals("yellow"))this.setBackground(Color.yellow) ;
            
             if(str.equals("blue"))this.setBackground(Color.blue);
            

    }

    public static void main(String[] args) {

         fbutton f=new fbutton();

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());


    }
}

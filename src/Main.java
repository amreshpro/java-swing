import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame {

    JLabel l1;
    JLabel l2;
    JLabel l3;
     JLabel l4;
    JTextField t1,t2;
    JButton b1;
    Main(String title){
        super(title);
    }


    public  void setComponents() {

        l1 = new JLabel("Addition of two number");
        l2 = new JLabel("First Number");
        l3 = new JLabel("Second Number");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Add");
        b1.addActionListener(new Handler());
        setLayout(null);
        l1.setBounds(50,30,200,20);
        l2.setBounds(50,80,200,20);
        t1.setBounds(150,80,200,20);
        l3.setBounds(50,120,200,20);
        t2.setBounds(150,120,200,20);
        b1.setBounds(170,180,100,20);
        l4.setBounds(180,220,100,30);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(b1);
        add(t1);
        add(t2);


    }

    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int res= Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
            l4.setText("Sum : "+res);
        }
    }




    public static void main(String[] args) {
        Main jf = new Main("Addition");

        jf.setComponents();
//JFrame jf = new JFrame("Swing Container");


jf.setSize(400,350);
jf.setVisible(true);

jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
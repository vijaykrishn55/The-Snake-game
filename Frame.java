 import javax.swing.JFrame;
public class Frame extends JFrame {
        Frame (){
            this.setTitle("stick man");
            this.add(new Panel());
            this.setVisible(true);
            this.setResizable(false);
            this.pack();
        }
}

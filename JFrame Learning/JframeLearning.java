import javax.swing.*;

public class JframeLearning {
    JFrame a;
    JframeLearning(){
        a=new JFrame("JFrame");
        a.setBounds(100,100,500,500);
        a.setVisible(true);
    }

    public static void main(String[] args) {
        JframeLearning obj=new JframeLearning();
    }
}

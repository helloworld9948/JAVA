import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvents extends JFrame implements MouseListener {
    JLabel JL;

    public MouseEvents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        JL = new JLabel();
        Font f = new Font("Verdana", Font.BOLD, 20);
        JL.setFont(f);
        JL.setForeground(Color.BLUE);
        add(JL);
        addMouseListener(this);
        setVisible(true);
    }

    public void mouseExited(MouseEvent m) {
        JL.setText("Mouse Exited");
    }

    public void mouseEntered(MouseEvent m) {
        JL.setText("Mouse Entered");
    }

    public void mouseReleased(MouseEvent m) {
        JL.setText("Mouse Released");
    }

    public void mousePressed(MouseEvent m) {
        JL.setText("Mouse Pressed");
    }

    public void mouseClicked(MouseEvent m) {
        JL.setText("Mouse Clicked");
    }

    public static void main(String[] args) {
        MouseEvents me = new MouseEvents();
    }
}

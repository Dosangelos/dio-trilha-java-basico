package pong;

import javax.swing.JFrame;

public class PongGame extends JFrame {
    private static final long serialVersionUID = 1L;

    public PongGame() {
        setTitle("Pong Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new PongGame();
    }
}

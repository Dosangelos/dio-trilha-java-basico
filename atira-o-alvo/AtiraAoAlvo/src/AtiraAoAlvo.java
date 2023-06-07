import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AtiraAoAlvo extends JFrame {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final int TARGET_SIZE = 50;
    private final int BULLET_SIZE = 10;
    private int targetX = WIDTH / 2;
    private int targetY = HEIGHT / 2;
    private int bulletX = -100;
    private int bulletY = -100;
    private boolean isBulletFired = false;

    private JPanel gamePanel;

    public AtiraAoAlvo() {
        setTitle("Atira ao Alvo");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        gamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, WIDTH, HEIGHT);
                g.setColor(Color.RED);
                g.fillRect(targetX, targetY, TARGET_SIZE, TARGET_SIZE);
                if (isBulletFired) {
                    g.setColor(Color.GREEN);
                    g.fillRect(bulletX, bulletY, BULLET_SIZE, BULLET_SIZE);
                }
            }
        };

        gamePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                handleMouseClick(e);
            }
        });

        add(gamePanel);

        while (true) {
            moveBullet();
            gamePanel.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void moveBullet() {
        if (isBulletFired) {
            bulletX += 5;
            if (bulletX >= WIDTH) {
                isBulletFired = false;
                bulletX = -100;
                bulletY = -100;
            }
        }
    }

    private void handleMouseClick(MouseEvent e) {
        if (!isBulletFired) {
            int mouseX = e.getX();
            int mouseY = e.getY();
            if (mouseX >= targetX && mouseX <= targetX + TARGET_SIZE && mouseY >= targetY
                    && mouseY <= targetY + TARGET_SIZE) {
                isBulletFired = true;
                bulletX = 0;
                bulletY = mouseY - BULLET_SIZE / 2;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AtiraAoAlvo game = new AtiraAoAlvo();
        });
    }
}

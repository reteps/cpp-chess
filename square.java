import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.*;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;

public class square extends JPanel {
    square(int i, int j) {
        System.out.println("cell initilized" + i);
        this.setSize(64,64);
        BufferedImage img = null;
        try {
            img = ImageIO.read(this.getClass().getResource("assets/black-piece.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JLabel text = new JLabel(new ImageIcon(img));
        this.add(text);
        this.setVisible(true);
    }
}
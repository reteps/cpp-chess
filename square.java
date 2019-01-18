import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.*;
import java.util.Scanner;
import java.util.function.BiPredicate;

import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;

public class square extends JPanel {
    square(int i, int j) {
        System.out.println("cell initilized" + i);
        this.setSize(64,64);
        JButton button = new JButton();
        Image img = ImageIO.read(getClass().getResource("assets/black-piece.png"));
        button.setIcon(new ImageIcon(img));
        this.add(button);
        this.setVisible(true);
    }
}
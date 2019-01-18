import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.*;
import java.util.Scanner;
import java.util.function.BiPredicate;

import javax.swing.*;

import javax.imageio.ImageIO; // read image

public class board extends JPanel {
    // constructor
    board() { // add parameters if needed
        GridLayout boardLayout = new GridLayout(8, 8);
        this.setSize(64*8,64*8);
        this.setLayout(boardLayout);
        for (int i=0;i<64;i++) {
            square cell = new square(i, i);
            this.add(cell);
        }
        this.setVisible(true);
    }
}
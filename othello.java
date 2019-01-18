import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.*;
import java.util.Scanner;
import java.util.function.BiPredicate;

import javax.swing.*;


import javax.imageio.ImageIO; // read image

// https://www.javatpoint.com/java-swing
// Currenty using swing by association
public class othello {
    static final int PIECE_SIZE = 64;
    static final int TOP_MARGIN = 0;
    static final int BOTTOM_MARGIN = TOP_MARGIN;
    static final int LEFT_MARGIN = 100;
    static final int RIGHT_MARGIN = LEFT_MARGIN;
    static final int BOARD_WIDTH = PIECE_SIZE * 8;
    static final int WINDOW_WIDTH = BOARD_WIDTH + LEFT_MARGIN + RIGHT_MARGIN;
    static final int BOARD_HEIGHT = PIECE_SIZE * 8;
    static final int WINDOW_HEIGHT = BOARD_HEIGHT + TOP_MARGIN + BOTTOM_MARGIN;
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First GUI"); //Initializes a JFrame
        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits JFrame on Close
        // Piece size: 64 * 64
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Set Frame size
        board boardName = new board();
        // button.setBounds(300, 100, 200, 20); //x,y,width,height
        JLabel info = new JLabel("Welcome to Othello,"); // Create a button
        info.setBounds(500, 100, 200, 20); // x,y,width,height
        mainPanel.add(boardName, BorderLayout.CENTER);
        mainPanel.add(info, BorderLayout.PAGE_START);
        frame.setVisible(true); //Set frame visibility
    }
}
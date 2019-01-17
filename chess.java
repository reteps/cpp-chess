import java.io.*;
import java.util.Scanner;
import javax.swing.*;


import javax.imageio.ImageIO; // read image

// https://www.javatpoint.com/java-swing
// Currenty using swing by association
public class chess {
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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits JFrame on Close
        // Piece size: 64 * 64
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Set Frame size
        JButton button = new JButton("Play Chess");
        button.setBounds(300, 100, 200, 20); //x,y,width,height
        JLabel info = new JLabel("Welcome to Peter's Chess Game."); // Create a button
        info.setBounds(500, 100, 200, 20); // x,y,width,height
        frame.add(button); // Adds Button to content pane of frame
        frame.add(info);
        frame.setVisible(true); //Set frame visibility
    }
}
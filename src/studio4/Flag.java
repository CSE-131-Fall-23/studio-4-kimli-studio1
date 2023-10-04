package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		StdDraw.setPenColor(165,218,223);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.55, 0.55, 0.001, 0.03);
		StdDraw.filledRectangle(0.45, 0.55, 0.001, 0.03);
		StdDraw.arc(0.5, 0.5, 0.05, -180, 0);
		StdDraw.line(0.58, 0.6, 0.52, 0.58);
		StdDraw.line(0.42, 0.58, 0.48, 0.58);
	}
}
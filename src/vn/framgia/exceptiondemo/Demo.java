package vn.framgia.exceptiondemo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {
	private static final Logger myLogger =
			Logger.getLogger("vn.framgia.exceptiondemo");
	public static void main(String[] args) {
		int point;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your point (ranger 0->10):");
		try {
			point = Integer.parseInt(sc.nextLine());
			if (point > 10 || point < 0) {
				throw new OutRangerException("Out of ranger!!!");
			} else {
				System.out.println("Your point is: " + point);
			}
				
		} catch (OutRangerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Catch a exception:"+ e.getLocalizedMessage()+e.getMessage());
		} finally {
			sc.close();
			myLogger.log(Level.INFO	, "Close sc");
			myLogger.warning("Close sc");
			System.out.println("done!!");
		}
	}
}

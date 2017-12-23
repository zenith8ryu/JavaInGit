package wall;
import java.util.Scanner;

public class MainProg {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Width of wall: ");
        double width = in.nextDouble();

        System.out.print("Tile size: ");
        double tileSize = in.nextDouble();

        // TODO: Complete these computations
        int pairs = (int)((width - tileSize) / (2 * tileSize));
        int redTiles = pairs;
//        int whiteTiles = ...;

        System.out.println("Red tiles: " + redTiles);
//        System.out.println("Whites tiles: " + whiteTiles);
    }
}

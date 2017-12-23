package lambdaExp;

import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;

public class LambdaExp {
	public static void main(String[] args) {
		String[] atp = { "Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
				"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro" };
		List<String> players = Arrays.asList(atp);

		 players.forEach((player) -> System.out.println(player + "; "));
		// players.forEach(System.out::println);

//		for (String player : players) {
//			System.out.println(player + "; ");
//		}
		
//		Arrays.asList( "a", "b", "d" ).forEach( (String i) -> System.out.println( i ) );
//		
//	    Object button;
//		((Object) button).addActionListener((ActionEvent e) -> ShowDialog(e.tostring()));
	    
	    
	}
}

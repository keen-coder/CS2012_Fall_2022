package lecture_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingCSVFiles {

	public static void main(String[] args) {
		File gameData = new File("src/files/video_game_data.csv");
		ArrayList<VideoGame> games = new ArrayList<>();
		try {
			Scanner reader = new Scanner(gameData);
			while(reader.hasNextLine()) {
				
				String line = reader.nextLine();
				//System.out.println("line = " + line);
				String[] tokens = line.split(",");
				
//				System.out.println("tokens[0] = " + tokens[0]);
//				System.out.println("tokens[1] = " + tokens[1]);
//				System.out.println("tokens[2] = " + tokens[2]);
				
				String title = tokens[0];
				double price = Double.parseDouble(tokens[1]);
				int peakPlayers = Integer.parseInt(tokens[2]);
				
				
				VideoGame game = new VideoGame(title, price, peakPlayers);
				
				games.add(game);
				
				
			}
			
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0 ; i < games.size(); i++) {
			System.out.println(games.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

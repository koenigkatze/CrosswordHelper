package crossword.helper.main;

import crossword.helper.reader.SimpleWordListReader;
import crossword.helper.reader.WordListReader;
import crossword.helper.wordlist.WordList;
import crossword.helper.wordlistentry.WordListEntry;

public class Main {

	public static void main(String[] args) throws Exception {
		WordListReader reader = new SimpleWordListReader();
		WordList wordList = reader.readWordList("resources/german.dic");
		
		int x = 0;
		for (WordListEntry entry : wordList.getWords()) {
			if (x > 100) {
				break;
			}

			System.out.println(entry.getEntry());
			x++;
		}
	}

}

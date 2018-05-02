package crossword.helper.reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import crossword.helper.wordlist.SimpleWordList;
import crossword.helper.wordlist.WordList;
import crossword.helper.wordlistentry.SimpleWordListEntry;
import crossword.helper.wordlistentry.WordListEntry;

public class SimpleWordListReader implements WordListReader {

	@Override
	public WordList readWordList(String path) throws IOException {
		
		WordList wordList = new SimpleWordList();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path),"utf-8"))) {
			String line = null;

			while ((line = reader.readLine()) != null) {
				WordListEntry entry = new SimpleWordListEntry(line);
				wordList.addToList(entry);
			}
		}
		return wordList;
	}

}

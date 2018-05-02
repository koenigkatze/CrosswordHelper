package crossword.helper.reader;

import crossword.helper.wordlist.WordList;

public interface WordListReader {
	
	public abstract WordList readWordList(String path) throws Exception;
	
}

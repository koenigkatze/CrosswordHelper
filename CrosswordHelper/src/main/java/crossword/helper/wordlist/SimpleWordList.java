package crossword.helper.wordlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import crossword.helper.wordlistentry.WordListEntry;

public class SimpleWordList implements WordList {

	private final List<WordListEntry> words;

	public SimpleWordList() {
		this(new ArrayList<>());
	}
	
	public SimpleWordList(List<WordListEntry> words) {
		super();
		this.words = words;
	}

	@Override
	public void addToList(WordListEntry word) {
		this.words.add(word);
	}
	
	@Override
	public List<WordListEntry> getWords() {
		return Collections.unmodifiableList(words);
	}

}

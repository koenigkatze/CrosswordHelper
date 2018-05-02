package crossword.helper.wordlist;

import java.util.Collection;

import crossword.helper.wordlistentry.WordListEntry;

public interface WordList {
	public abstract void addToList(WordListEntry word);
	public abstract Collection<WordListEntry> getWords();
}

package crossword.helper.wordlistentry;

public class SimpleWordListEntry implements WordListEntry {

	private final String entry;

	public SimpleWordListEntry() {
		this("a");
	}

	public SimpleWordListEntry(String entry) {
		super();
		this.entry = entry;
	}

	@Override
	public String getEntry() {
		return entry;
	}
	
}

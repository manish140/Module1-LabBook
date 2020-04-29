package assignments2;
abstract public class Item {
	private int identificationNumber;
	private String title;
	private int numberOfCopies;
	
	public int getUniqueIdentificationNumber() {
		return identificationNumber;
	}


	public void setUniqueIdentificationNumber(int uniqueIdentificationNumber) {
		this.identificationNumber = uniqueIdentificationNumber;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getNumberOfCopies() {
		return numberOfCopies;
	}


	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}


	Item(){
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
class WrittenItem extends Item{
	private String Author;
	
}
class Book extends WrittenItem{

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
class JournalPaper extends WrittenItem{
	private int publishedYear;

	public JournalPaper() {
		super();
		// TODO Auto-generated constructor stub
	}
}
class MediaItem extends Item{
	
}
class Video extends MediaItem{
	private String director;
	private String genre;
	private int year;

	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
}
class CD extends MediaItem{
	private String artist;
	private String genre;
}

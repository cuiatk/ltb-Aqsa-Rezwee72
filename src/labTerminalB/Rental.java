package labTerminalB;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	public int getDaysRented() {
		return _daysRented;
	}
	public Movie getMovie() {
		return _movie;
	}
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return false;
	}
	public Rental nextElement() {
		// TODO Auto-generated method stub
		return null;
	}
}

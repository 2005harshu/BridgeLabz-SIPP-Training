package moviemanagement;

public class Main {
    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();

        mms.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        mms.addMovieAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
        mms.addMovieAtPosition("The Dark Knight", "Christopher Nolan", 2008, 9.0, 1);
        mms.addMovieAtEnd("The Prestige", "Christopher Nolan", 2006, 8.5);

        mms.displayForward();
        mms.displayReverse();

        mms.removeMovie("The Dark Knight");
        mms.updateRating("Inception", 9.0);
        mms.searchByDirectorOrRating("Christopher Nolan", 8.5);

        mms.displayForward();
    }
}


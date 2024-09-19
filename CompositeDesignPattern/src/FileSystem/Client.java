package FileSystem;

public class Client {


    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movies");
        File rrrMovie = new File("RRR");
        movieDirectory.add(rrrMovie);

        Directory comedyMovieDirectory = new Directory("Comedy");
        movieDirectory.add(comedyMovieDirectory);

        File committeKurrolluMovie = new File("Committe Kurrollu");
        comedyMovieDirectory.add(committeKurrolluMovie);

        movieDirectory.ls();



    }
}

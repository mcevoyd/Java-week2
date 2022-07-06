public class Movie {
    Integer MovieRank;
    String title;
    String director;
    String rottenTomatoesScore;

    public Movie(Integer movieRank, String title, String director, String rottenTomatoesScore) {
        MovieRank = movieRank;
        this.title = title;
        this.director = director;
        this.rottenTomatoesScore = rottenTomatoesScore;
    }

    public Integer getMovieRank() {
        return MovieRank;
    }

    public void setMovieRank(Integer movieRank) {
        MovieRank = movieRank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRottenTomatoesScore() {
        return rottenTomatoesScore;
    }

    public void setRottenTomatoesScore(double rottenTomatoesScore) {
        this.rottenTomatoesScore = rottenTomatoesScore;
    }

    @Override
    public String toString() {

        return "The movie you chose is : " + title + ". It ranked : " + MovieRank + ". The director is : " + director
                + ". It's rottenTomatoesScore ="
                + rottenTomatoesScore;
    }

}
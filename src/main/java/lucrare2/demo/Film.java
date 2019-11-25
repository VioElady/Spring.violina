package lucrare2.demo;

public class Film {
     private int film_id;
     private String title;
     private String description;
     private int release_year;
     private int rental_duration;
     private int rating;
     private int replacement_cost;
     private int last_update;

    public Film(int film_id, String title, String description, int release_year, 
                int rental_duration, int rating, int replacement_cost, int last_update) {
        this.film_id=film_id;
        this.title=title;
        this.description=description;
        this.release_year=release_year;
        this.rental_duration=rental_duration;
        this.rating=rating;
        this.replacement_cost=replacement_cost;
        this.last_update=last_update;
    }

    public int getFilm_id() {
        return film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLast_update() {
        return last_update;
    }

    public int getRating() {
        return rating;
    }

    public int getRelease_year() {
        return release_year;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public int getReplacement_cost() {
        return replacement_cost;
    }

    public String getDescription() {
        return description;
    }
}

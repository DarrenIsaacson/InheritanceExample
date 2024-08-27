import java.util.Date;

public class MusicCD extends Item {
    String artists;
    String releaseDate;
    String label;
    String recordCompany;
    int totalLength;
    String genres;

    

    public MusicCD(String title, double price, String artists, String releaseDate, String label, String recordCompany,
            int totalLength, String genres) {
        super(title, price);
        this.artists = artists;
        this.releaseDate = releaseDate;
        this.label = label;
        this.recordCompany = recordCompany;
        this.totalLength = totalLength;
        this.genres = genres;
    }

    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRecordCompany() {
        return recordCompany;
    }

    public void setRecordCompany(String recordCompany) {
        this.recordCompany = recordCompany;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(int totalLength) {
        this.totalLength = totalLength;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    

}

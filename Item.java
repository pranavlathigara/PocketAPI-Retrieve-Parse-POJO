import java.util.HashMap;

public class Item{
    public String item_id;
    public String resolved_id;
    public String given_url;
    public String given_id;
    public String given_title;
    public String favorite;
    public String status;
    public String time_added;
    public String time_updated;
    public String time_read;
    public String time_favorited;
    public String sort_id;
    public String resolved_title;
    public String resolved_url;
    public String excerpt;
    public String is_article;
    public String is_index;
    public String has_video;
    public String has_image;
    public String word_count;
    public HashMap<String, Author> authors;
    public Image image;
    public HashMap<String, Images> images;
    public HashMap<String, Videos> videos;
}

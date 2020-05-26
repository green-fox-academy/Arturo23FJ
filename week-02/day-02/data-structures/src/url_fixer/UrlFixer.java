package url_fixer;

public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        int position = url.indexOf('/');
        url = url.substring(0, position) + ":" + url.substring(position);
       System.out.println(url.replace("bots", "odds"));
    }
}

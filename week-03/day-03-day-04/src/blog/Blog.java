package blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogPostList;


    public Blog(){
        blogPostList = new ArrayList<>();
    }

    public void add(BlogPost blogPost){
        this.blogPostList.add(blogPost);
    }
    
    public void delete(int i){
        this.blogPostList.remove(i);
    }

    public void update(int i, BlogPost blogPost){
        this.blogPostList.set(i, blogPost);
    }
}

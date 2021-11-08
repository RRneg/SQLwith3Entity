package Controller;

import Model.Label;
import Model.Post;
import Service.PostService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PostController {
    PostService postService = new PostService();
    LabelController labelController = new LabelController();


    public Post saveNewPost(String content, List <Label> labels) {
       return postService.saveNewPost(content, labels);
    }


    public List<Post> getAllPosts() {
        return postService.getAll();
    }

    public Post update(Post post){
        return postService.update(post);
    }

    public Post getPostById(Integer id) {
        return postService.getById(id);
    }

    public void deleteById(Integer id){
        postService.deleteById(id);
    }
}

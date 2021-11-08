package Service;

import Repository.JDBCPostRepositoryImpl;
import Model.Label;
import Model.Post;

import java.util.List;

public class PostService {
    private JDBCPostRepositoryImpl jdbcPostRepository = new JDBCPostRepositoryImpl();

    public Post getById(Integer id){
        return jdbcPostRepository.getById(id);
    }

    public Post update(Post post){
        return jdbcPostRepository.update(post);
    }

    public void deleteById(Integer id){
        jdbcPostRepository.getById(id);
    }

    public List<Post> getAll(){
        return jdbcPostRepository.getAll();
    }

    public Post saveNewPost(String content, List<Label> labels){
        return jdbcPostRepository.saveNewPost(content, labels);
    }
}

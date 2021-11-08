package Repository;

import java.util.List;

public interface PostRepository<Post, ID> extends GenericRepository<Post, Integer>{

    Post getById(Integer integer);

    Post update(Post post);

    void deleteById(Integer integer);

    List<Post> getAll();
}

package Service;

import Repository.JDBCWriterRepositoryImpl;
import Model.Post;
import Model.Writer;

import java.util.List;

public class WriterService {
    JDBCWriterRepositoryImpl jdbcWriterRepository = new JDBCWriterRepositoryImpl();

    public Writer getById(Integer id){
        return jdbcWriterRepository.getById(id);
    }

    public Writer update(Writer writer){
        return jdbcWriterRepository.update(writer);
    }

    public void deleteById(Integer id){
        jdbcWriterRepository.getById(id);
    }

    public List<Writer> getAll(){
        return jdbcWriterRepository.getAll();
    }

    public Writer saveNewWriter(String firstName, String lastName,List<Post> posts){
        return jdbcWriterRepository.saveNewWriter(firstName, lastName, posts);
    }
}

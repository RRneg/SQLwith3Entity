package Repository;

import java.util.List;

public interface WriterRepository<Writer, ID> extends GenericRepository<Writer, Integer>{

    Writer getById(Integer integer);

    Writer update(Writer writer);

    void deleteById(Integer integer);

    List<Writer> getAll();
}

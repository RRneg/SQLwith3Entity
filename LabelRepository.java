package Repository;

import java.util.List;

public interface LabelRepository<Label, Integer> extends GenericRepository<Label, Integer>{


    Label update(Label label);

    Label getById(Integer id);

    void deleteById(Integer id);

    List getAll();
}

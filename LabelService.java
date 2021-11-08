package Service;

import Repository.JDBCLabelRepositoryImpl;
import Model.Label;

import java.util.List;

public class LabelService {
    JDBCLabelRepositoryImpl jdbcLabelRepository = new JDBCLabelRepositoryImpl();

    public Label update(Label label){
        return jdbcLabelRepository.update(label);
    }

    public Label getById(Integer id){
        return jdbcLabelRepository.getById(id);
    }

    public void deleteById(Integer id){
        jdbcLabelRepository.deleteById(id);
    }

    public List<Label> getAll(){
        return jdbcLabelRepository.getAll();
    }

    public Label saveNewLabel(String name){
        return jdbcLabelRepository.saveNewLabel(name);
    }
}

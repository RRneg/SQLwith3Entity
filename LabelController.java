package Controller;

import Model.Label;
import Service.LabelService;

import java.util.List;

public class LabelController {
    LabelService labelService = new LabelService();

    public Label saveNewLabel(String name) {
       return labelService.saveNewLabel(name);
    }

    public List<Label> getAll() {
        return labelService.getAll();
    }

    public Label updateLabel(Label label) {
       return labelService.update(label);
    }

    public void deleteById(Integer id) {
        labelService.deleteById(id);
    }

    public Label getById(Integer id) {
        return labelService.getById(id);
    }
}

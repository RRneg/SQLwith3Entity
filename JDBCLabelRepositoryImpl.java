package Repository;
import Model.Label;
import java.sql.*;
import java.util.List;

public class JDBCLabelRepositoryImpl implements LabelRepository<Label, Integer> {

    private Label label = new Label();


    public Label update(Label label) {
        String sql = "INSERT LABELS(NAME) VALUE(?) WHERE ID= ?";
        try (PreparedStatement pstm = UtilClass.StatmentUtil.getPrStatement(sql)){
            pstm.setString(1, label.getName());
            pstm.setInt(2, label.getId());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return label;
    }


    public Label getById(Integer id) {
        String sql = "SELECT from LABELS where ID = ?";
        try (PreparedStatement pstm = UtilClass.StatmentUtil.getPrStatement(sql)){
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            label.setId(rs.getInt(1));
            label.setName(rs.getString(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return label;
    }

    public void deleteById(Integer id) {
        String sql = "DELETE from LABELS where ID = ?";
        try( PreparedStatement pstm = UtilClass.StatmentUtil.getPrStatement(sql)){
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Label> getAll() {
        return getAllInternal();
    }

    private List<Label> getAllInternal() {
        List<Label> labels = null;
        String sql = "SELECT * from LABELS";

        try (PreparedStatement pstm = UtilClass.StatmentUtil.getPrStatement(sql)){
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                label.setId(rs.getInt(1));
                label.setName(rs.getString(2));
                labels.add(label);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return labels;
    }

    public Label saveNewLabel(String name) {
        Label label = new Label();
        String sql = "INSERT LABELS(NAME) VALUES(?)";
        label.setName(name);
        try ( PreparedStatement pstm = UtilClass.StatmentUtil.getPrStatementBackId(sql)){
            pstm.setString(1,name);
            label.setId(pstm.executeUpdate());
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return label;
    }
}

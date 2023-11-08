package component2;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.Model_GoiY;

public class ListGoiY<E extends Object> extends JList<E> {

    private final DefaultListModel model;

    public ListGoiY() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_GoiY data;
                if (o instanceof Model_GoiY) {
                    data = (Model_GoiY) o;
                } else {
                    data = new Model_GoiY("Name", "Description", new ImageIcon(getClass().getResource("/icon/artists_selected.png")));
                }
                ItemGoiY item = new ItemGoiY(data);
                return item;
            }
        };
    }

    public void addItem(Model_GoiY data) {
        model.addElement(data);
    }
}

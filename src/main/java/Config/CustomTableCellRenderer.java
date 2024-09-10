package Config;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class CustomTableCellRenderer extends DefaultTableCellRenderer {
    private final Color color1 = new Color(240, 240, 240); // Color para filas pares
    private final Color color2 = new Color(255, 255, 255); // Color para filas impares

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (!isSelected) {
            cell.setBackground(row % 2 == 0 ? color1 : color2);
        }
        setHorizontalAlignment(SwingConstants.CENTER);
        return cell;
    }
}

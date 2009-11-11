package org.openoffice.gdocs.ui.models;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class MyCellRenderer extends JComponent implements ListCellRenderer {
    private JLabel label;
    JLabel l = new JLabel("[update]");
    public MyCellRenderer() {
        setOpaque(true);
        setLayout(new BorderLayout());
        l.setPreferredSize(new Dimension(50, 18));
        l.setMaximumSize(new Dimension(50, 18));
        this.add(l,BorderLayout.WEST);
        label = new JLabel();
        this.add(label,BorderLayout.CENTER);
        label.setOpaque(true);
        l.setOpaque(true);
    }

   public void setBackground(Color bg) {
       super.setBackground(bg);
       label.setBackground(bg);
       l.setBackground(bg);
   }

   public void setForeground(Color fg) {
       super.setForeground(fg);
       label.setForeground(fg);
       l.setForeground(fg);
   }
   
   
    public Component getListCellRendererComponent(JList list,
                                                  Object value,
                                                  int index,
                                                  boolean isSelected,
                                                  boolean cellHasFocus) {

        label.setText(value.toString());
        Color background;
        Color foreground;
        if (isSelected) {
            background = Color.LIGHT_GRAY;
            foreground = Color.WHITE;
        // unselected, and not the DnD drop location
        } else {
            background = Color.WHITE;
            foreground = Color.BLACK;
        };
        setBackground(background);
        setForeground(foreground);
        if (value instanceof String) {
            l.setText("[new]");
        } else {
            l.setText("[update]");
        }
        return this;
    }
}

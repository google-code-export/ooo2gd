package org.openoffice.gdocs.ui.models;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ComboBoxEditor;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.openoffice.gdocs.util.Document;

public class MyEditorRenderer extends JComponent implements ComboBoxEditor {
    private JLabel label = new JLabel("[new]");
    private JTextField editor = new JTextField();
    private Object item;                     
    private DocumentListener docListener = new DocumentListener() {
               
               public void insertUpdate(DocumentEvent e) {
                   label.setText("[new]");
                   item = editor.getText();
               }

               public void removeUpdate(DocumentEvent e) {
                   label.setText("[new]");
                   item = editor.getText();
               }

               public void changedUpdate(DocumentEvent e) {
                   label.setText("[new]");
                   item = editor.getText();
               }
           };
    private MouseListener mouseListener = new MouseAdapter() {

       public void mouseClicked(MouseEvent e) {
           super.mouseClicked(e);                            
           editor.setEditable(true);                            
           editor.getDocument().addDocumentListener(docListener);
       }
           
       };
           
    public MyEditorRenderer() {
        //setOpaque(true);                         
        //setBackground(Color.WHITE);
        label.setBackground(Color.WHITE);
        this.setLayout(new BorderLayout());
//        label.setFont(new Font(Font.SERIF,Font.PLAIN,9));
        this.add(label,BorderLayout.WEST);
        this.add(editor);
    }

   public void addActionListener(ActionListener l) {
       editor.addActionListener(l);
   }

   public Component getEditorComponent() {
       return this;
   }

   public Object getItem() {
       return item;
   }

   public void removeActionListener(ActionListener l) {
       editor.removeActionListener(l);
   }

   public void selectAll() {
       editor.selectAll();
   }

   public void setItem(Object anObject) {
       String str = "";
       editor.removeMouseListener(mouseListener);
       editor.getDocument().removeDocumentListener(docListener);
       this.item = anObject;
       if (anObject instanceof String) {
           str = (String)anObject;
           label.setText("[new]");
       } else if (anObject instanceof Document) {
           str = ((Document)anObject).getTitle();
           label.setText("[update]");
       }
       editor.setText(str);                        
       editor.addMouseListener(mouseListener);
   }                                        
}

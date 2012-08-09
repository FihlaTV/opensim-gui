/*
 * ShowXMLRepJDialog.java
 *
 * Created on March 29, 2011, 9:17 PM
 */
package org.opensim.helputils;

import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.text.html.HTMLEditorKit;
import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.ArrayStr;
import org.opensim.modeling.OpenSimObject;

/**
 *
 * @author  Ayman
 */
public class ShowXMLRepJDialog extends javax.swing.JDialog {

    DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
    String[] excludedList = new String[] {
       "SMC_Joint",
       "PathWrap",
       "ObjectGroup",
       "ModelScaler",
       "GenericModelMaker",
       "ControlSetController",
       "ControlLinear",
       "ControlLinearNode",
       "ControlConstant",
       "CMC",
       "MetabolicMuscle"
   };
    
    /** Creates new form ShowXMLRepJDialog */
    public ShowXMLRepJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        populateCbModel();
        initComponents();
        jEditorPane1.setEditorKit(new HTMLEditorKit());
        jComboBox1ActionPerformed(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        creditsTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBox1.setModel(cbModel);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Class Name");

        jEditorPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("How objects of the selected class show in XML"));
        jEditorPane1.setEditable(false);
        jScrollPane1.setViewportView(jEditorPane1);

        creditsTextArea.setColumns(20);
        creditsTextArea.setEditable(false);
        creditsTextArea.setRows(5);
        creditsTextArea.setToolTipText("Authors. description and references.");
        creditsTextArea.setWrapStyleWord(true);
        creditsTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Author(s) and References"));
        jScrollPane2.setViewportView(creditsTextArea);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 2, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("The text box above shows all the properties that can be set in XML for (an instance of) the selected class name. Some of these properties are optional and can be ignored. Assumed default values are usually described in Doxygen comments.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextArea1.setEnabled(false);
        jScrollPane3.setViewportView(jTextArea1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .add(jScrollPane1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jComboBox1, 0, 312, Short.MAX_VALUE))
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(17, 17, 17)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
// TODO add your handling code here:
        String selectedClass = (String) jComboBox1.getSelectedItem();
        OpenSimObject obj = OpenSimObject.newInstanceOfType(selectedClass);
        String contents = "";
        contents = contents.concat("<FONT COLOR=RED>&lt;" + obj.getConcreteClassName() + "&gt</FONT><br>");
        String newdump = dumpObj(obj, "");
        contents = contents.concat(newdump);
        contents = contents.concat("<FONT COLOR=RED>&lt;/" + obj.getConcreteClassName() + "&gt</FONT><br>");
        jEditorPane1.selectAll();
        jEditorPane1.cut();
        jEditorPane1.setText(contents);
        String credits = "";
        if (!obj.getAuthors().equalsIgnoreCase("")) {
            credits = credits.concat("Authors: " + obj.getAuthors() + "\n");
        } else {
            credits = credits.concat("Provided by the OpenSim development team.\n");
        }
        if (!obj.getReferences().equalsIgnoreCase("")) {
            credits = credits.concat("Reference: " + obj.getReferences() + "\n");
        } else {
            credits = credits.concat("Reference: " + 
                    "\nDelp SL, Anderson FC, Arnold AS, Loan P, "+
                    "\nHabib A, John CT, Guendelman E, Thelen DG."+
                    "\nOpenSim: Open-source Software to Create and Analyze "+
                    "\nDynamic Simulations of Movement. IEEE Transactions on "+
                    "\nBiomedical Engineering. (2007)");
        }
        creditsTextArea.setText(credits);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ShowXMLRepJDialog(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }

    private void populateCbModel() {
        ArrayStr typeNames = new ArrayStr();
        OpenSimObject.getRegisteredTypenames(typeNames);
        for (int i = 0; i < typeNames.getSize(); i++) {
            boolean excluded = false;
            String currentType = typeNames.getitem(i);
            excluded = currentType.endsWith("Set");
            for(int j=0; j < excludedList.length && !excluded; j++)
                excluded = (excludedList[j].equalsIgnoreCase(currentType));
            if (!excluded)
                cbModel.addElement(typeNames.getitem(i));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea creditsTextArea;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private String removeEnclosingParethesisIfNeeded(String string) {
        if (string.startsWith("(")) {
            return string.substring(1, string.length() - 1);
        }
        return string;
    }

    String dumpObj(OpenSimObject obj, String indent) {
        String result="";
        for (int p = 0; p < obj.getNumProperties(); ++p) {
            AbstractProperty ap = obj.getPropertyByIndex(p);
            String cmt = ap.getComment();
            if (cmt.length() > 0) {
               result = result.concat("\t<FONT COLOR=Green>&lt;!--" + cmt + "--&gt</FONT><br>\n");
            }
            result = result.concat("\t<FONT COLOR=RED>&lt;" + ap.getName() + "&gt;</FONT>\n"
                        + removeEnclosingParethesisIfNeeded(ap.toString())
                        + "<FONT COLOR=RED>&lt;/" + ap.getName() + "&gt</FONT><br>\n");
             if (ap.isObjectProperty()) {
                for (int i = 0; i < ap.size(); ++i) {
                    /////result = result.concat(dumpObj(ap.getValueAsObject(i), ""));
                }
            }
        }
        return result;
    }
}

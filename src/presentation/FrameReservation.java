/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopUpConfirmation = new javax.swing.JOptionPane();
        dateTimePanel = new javax.swing.JPanel();
        ChoixDate = new com.github.lgooddatepicker.components.DatePicker();
        ChoixDate.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        ChoixHeure = new javax.swing.JComboBox<>();
        TexteChoixTables = new javax.swing.JLabel();
        TexteChoixHeure = new javax.swing.JLabel();
        nbPersonsPanel = new javax.swing.JPanel();
        TextNbPersonnes = new javax.swing.JLabel();
        ChoixNbPersonnes = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        PlanTables = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeChoixTables = new javax.swing.JList<>();
        TextChoixTables = new javax.swing.JLabel();
        BouttonAnnuler = new javax.swing.JButton();
        BouttonValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ChoixHeure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" }));
        ChoixHeure.setSelectedItem(ChoixHeure);
        ChoixHeure.setEnabled(false);
        ChoixHeure.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ChoixHeure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoixHeureActionPerformed(evt);
            }
        });

        TexteChoixTables.setText("1. Choisissez la date");
        TexteChoixTables.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        TexteChoixHeure.setText("2. Choisissez l'heure");
        TexteChoixHeure.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChoixDate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexteChoixTables, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TexteChoixHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChoixHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexteChoixTables, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexteChoixHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChoixHeure)
                    .addComponent(ChoixDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        ChoixDate.getAccessibleContext().setAccessibleName("");
        ChoixDate.getAccessibleContext().setAccessibleDescription("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextNbPersonnes.setText("3. Indiquez le nombre de personnes");
        TextNbPersonnes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ChoixNbPersonnes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        ChoixNbPersonnes.setEnabled(false);
        ChoixNbPersonnes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ChoixNbPersonnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoixNbPersonnesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChoixNbPersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNbPersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextNbPersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChoixNbPersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PlanTables.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PlanTables.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        PlanTables.setEnabled(false);

        ListeChoixTables.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListeChoixTables.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListeChoixTables.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ListeChoixTables.setEnabled(false);
        ListeChoixTables.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ListeChoixTables.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListeChoixTablesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListeChoixTables);
        ListeChoixTables.getAccessibleContext().setAccessibleDescription("");

        TextChoixTables.setText("4. Choisissez votre table");
        TextChoixTables.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextChoixTables)
                    .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(PlanTables)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TextChoixTables)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlanTables)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablesImage)
                .addGap(19, 19, 19))
        );

        BouttonAnnuler.setText("Annuler");
        BouttonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BouttonAnnulerActionPerformed(evt);
            }
        });

        BouttonValider.setText("Valider");
        BouttonValider.setEnabled(false);
        BouttonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BouttonValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BouttonValider)
                .addGap(18, 18, 18)
                .addComponent(BouttonAnnuler)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BouttonAnnuler)
                    .addComponent(BouttonValider))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChoixHeureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoixHeureActionPerformed
        this.dialog.handleTimeSelectedEvent((String)ChoixHeure.getSelectedItem());
    }//GEN-LAST:event_ChoixHeureActionPerformed

    private void ChoixNbPersonnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoixNbPersonnesActionPerformed
        this.dialog.handleNumOfPersonsSelectedEvent(Integer.parseInt((String)ChoixNbPersonnes.getSelectedItem()));
    }//GEN-LAST:event_ChoixNbPersonnesActionPerformed

    private void BouttonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BouttonAnnulerActionPerformed
        this.dialog.handleCancelEvent();
    }//GEN-LAST:event_BouttonAnnulerActionPerformed

    private void ListeChoixTablesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListeChoixTablesValueChanged
        if(!evt.getValueIsAdjusting()){
            this.dialog.handleTableSelectedEvent(ListeChoixTables.getSelectedValue());
        }
    }//GEN-LAST:event_ListeChoixTablesValueChanged

    private void BouttonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BouttonValiderActionPerformed
        this.dialog.handleValidationEvent();
        
    }//GEN-LAST:event_BouttonValiderActionPerformed

    
    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        this.dialog.handleDateSelectedEvent(dateEvent.getNewDate());
        
    }
    
    
    
    public void activerChoixHeure() {
        this.ChoixHeure.enable(true);
        this.ChoixHeure.setBackground(null);
    }
    
    public void activerChoixNbPersonnes() {
        this.ChoixNbPersonnes.enable(true);
        this.ChoixNbPersonnes.setBackground(null);
    }
    public void activerChoixTables(String[] string) {
        this.PlanTables.enable(true);
        this.PlanTables.setBackground(null);
        this.ListeChoixTables.enable(true);
        this.ListeChoixTables.setBackground(null);
        ListeChoixTables.setListData(string);
    }
    
    public void activerValider() {
        this.BouttonValider.setEnabled(true);
        this.BouttonValider.setBackground(null);
    }
    
    public void validerAction(LocalDate date, String time, int nbPersonnes, String numTable) {
        this.PopUpConfirmation.setVisible(true);
        String message = "Réservation validée pour le " + date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear() + "\n à " + time + " pour " + nbPersonnes + " personnes à la "+numTable;
        this.PopUpConfirmation.showMessageDialog(null, message, "Confirmation de réservation", PopUpConfirmation.PLAIN_MESSAGE);
    }
    
    public void annulerAction() {
        this.ChoixHeure.setEnabled(false);
        this.ChoixHeure.setSelectedIndex(-1);
        this.ChoixNbPersonnes.setEnabled(false);
        this.ChoixNbPersonnes.setSelectedIndex(0);
        this.PlanTables.setEnabled(false);
        this.ListeChoixTables.setEnabled(false);
        this.ListeChoixTables.clearSelection();
        this.BouttonValider.setEnabled(false);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BouttonAnnuler;
    private javax.swing.JButton BouttonValider;
    private com.github.lgooddatepicker.components.DatePicker ChoixDate;
    private javax.swing.JComboBox<String> ChoixHeure;
    private javax.swing.JComboBox<String> ChoixNbPersonnes;
    private javax.swing.JList<String> ListeChoixTables;
    private javax.swing.JLabel PlanTables;
    private javax.swing.JOptionPane PopUpConfirmation;
    private javax.swing.JLabel TextChoixTables;
    private javax.swing.JLabel TextNbPersonnes;
    private javax.swing.JLabel TexteChoixHeure;
    private javax.swing.JLabel TexteChoixTables;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel tablesImage;
    // End of variables declaration//GEN-END:variables

}

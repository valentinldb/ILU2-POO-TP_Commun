/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;
    private LocalDate date;
    private String time;
    private int nbPersonnes;
    private String numTable;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        if(date != null) {
            this.date = date;
            frameReservation.activerChoixHeure();
        }
    }

    public void handleTimeSelectedEvent(String time) {
        if(time != null) {
            this.time = time;
            this.frameReservation.activerChoixNbPersonnes();
        }
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        if(nbPersons != 0) {
            this.nbPersonnes = nbPersons;
            String[] string = inf.trouverTableDisponible(date.getDayOfMonth(), date.getMonthValue(), nbPersonnes, time);
            this.frameReservation.activerChoixTables(string);
        }
    }

    public void handleTableSelectedEvent(String numTable) {
        if(numTable != null) {
            this.frameReservation.activerValider();
            this.numTable = numTable;
        }
    }

    public void handleCancelEvent() {
        this.frameReservation.annulerAction();
    }

    public void handleValidationEvent() {
        this.frameReservation.validerAction(date, time, nbPersonnes, numTable);
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}

package interface_noyau_fonctionnel;

import java.time.LocalDate;


public class InterfaceNoyauFonctionnel {

    public String[] trouverTableDisponible(int jour, int mois, int nombrePersonnes, String time) {
        if(jour<LocalDate.now().getDayOfMonth() && mois<=LocalDate.now().getMonthValue()) {
            return new String[]{};
        }
        else if(nombrePersonnes == 4 | nombrePersonnes == 3) {
            return new String[]{"Table 2","Table 3","Table 4","Table 5"};
        }
        else if(nombrePersonnes <= 2) {
            return new String[]{"Table 1"};
        }
        else {
            return new String[]{"Table 6"};
        }
    }

}

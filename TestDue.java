
public class TestDue {

    private Studente studenti[];
    private static final int MAX_STUDENTI = 10;

    public TestDue() {
        studenti = new Studente[MAX_STUDENTI];
    }

    public void aggiungiStudente(Studente s) {
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i] == null) {
                studenti[i] = new Studente(s);
                return;
            }
        }
    }

    public double mediaVoti() {
        double somma = 0;
        int cont = 0;
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i] != null) {
                somma += studenti[i].getVoto();
                cont++;
            }
        }
        return somma / cont;
    }

    public String cercaStudente(String nome) {
        String s = " Studente trovato alla posizione: ";
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i] != null && studenti[i].getNome().equals(nome)) {
                return s + (i + 1);

            }
        }
        return "Studente non trovato";
    }

    public int studentiPromossi() {
        int cont = 0;
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i] != null && studenti[i].getVoto() >= 6 && studenti[i] != null) {
                cont++;
            }
        }
        return cont;
    }

    public int studentiBocciati() {
        int cont = 0;
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i] != null && studenti[i].getVoto() < 6) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String args[]) {
        TestDue registro = new TestDue();
        Studente s1 = new Studente("Mario", 2);
        Studente s2 = new Studente("Luigi", 10);
        Studente s3 = new Studente("Luigi", 10);
        Studente s4 = new Studente("Luigi", 10);
        Studente s5 = new Studente("Luigi", 10);
        registro.aggiungiStudente(s1);
        registro.aggiungiStudente(s2);
        registro.aggiungiStudente(s3);
        registro.aggiungiStudente(s4);
        registro.aggiungiStudente(s5);

        System.out.println(registro.cercaStudente("Luigi"));

        System.out.println("Media voti: " + registro.mediaVoti());
        System.out.println("Studenti promossi: " + registro.studentiPromossi());
        System.out.println("Studenti bocciati: " + registro.studentiBocciati());

    }
}

public class pruebaTS {
    public static void main(String[] args) {
        TSimb_CSV_Avanzado t1 = new TSimb_CSV_Avanzado();

        t1.addColumn("nombre");
        t1.addColumn("apellidos");
        t1.addColumn("edad");

        t1.newRow();
        t1.addValue("antonio");
        t1.addValue("moratilla");
        t1.addValue("25");

        t1.newRow();
        t1.addValue(0, "Juan");
        t1.addValue("apellidos", "Perez");
        t1.addValue(2, 2, "36");

        t1.addValue(10, "apellidos", "Sanchez");

        System.out.println(t1.toString());

        StringBuffer rec = new StringBuffer();

        rec.append(t1.getValue(2, 1));
        rec.append(" - ");
        rec.append(t1.getValue(10, 1));
        rec.append(" - ");

        System.out.println(rec.toString());

        // System.out.println(t1.getValue(10, 0));
    }
}
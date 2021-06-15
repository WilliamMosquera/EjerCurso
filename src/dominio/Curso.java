package dominio;

public class Curso {

    private double[] notas;
    private double promedio;
    private int estudiantesEncimaPromedio;

    public Curso() {
        notas = new double[12];

    }

    public void setNotas(double notas[]) {
        this.notas = notas;
    }

    public void mostrarNotas() {
        for (int i = 0; i < 12; i++) {
            System.out.println(this.notas[i]);
        }
    }

    public void setPromedio() {
        double suma = 0;
        double promedio = 0;
        for (int i = 0; i < 12; i++) {
            suma += notas[i];
        }
        promedio = suma / 12;
        this.promedio = promedio;
    }

    public void setEstudiantesEncimaPromedio() {
        int estudiantes = 0;
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] > estudiantes){
                    estudiantes = (int)notas[i];
                }
            }
            this.estudiantesEncimaPromedio = estudiantes;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public int getnroEstudiantesEncimaPromedio() {
        return this.estudiantesEncimaPromedio;
    }

}

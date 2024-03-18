
public class Main {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[5];
        alumnos[0] = new AlumnoPregrado("Juan", "Perez", 180, "FIIS");
        alumnos[1] = new AlumnoPregrado("Ana", "Lopez", 200, "FIC");
        alumnos[2] = new AlumnoPregrado("Luis", "Gomez", 202, "FIEE");
        alumnos[3] = new AlumnoMaestria("Rosa", "Perez", 70, "Ing Civil con mencion en Estructuras");
        alumnos[4] = new AlumnoMaestria("Sara", "Quispe", 40, "Maestria en Ciencias en Energías Renovables");

        int alumnosEgresados = 0;

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].yaEgreso()) {
                alumnosEgresados++;
            }
        }

        System.out.println("Cantidad de alumnos egresados: " + alumnosEgresados);
    }
}
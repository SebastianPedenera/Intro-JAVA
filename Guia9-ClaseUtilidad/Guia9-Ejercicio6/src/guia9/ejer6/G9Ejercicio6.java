package guia9.ejer6;

import Entidad.Curso;
import Service.CursoService;

public class G9Ejercicio6 {

    public static void main(String[] args) {

        CursoService cS = new CursoService();
        Curso curso1 = cS.crearCurso();
        cS.calcularGananciaSemanal(curso1);

    }

}

package py.edu.ucom.danilososav;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import py.edu.ucom.danilososav.entities.Alumno;

@Path("/clase1")
public class Clase1Resource {
    @GET
    
    public Double random() {
        return Math.random();
    }

   
    /**
     * @return
     */
    @GET
    @Path("obtener-alumno")
    @Consumes(MediaType.APPLICATION_JSON)
 
    public List<Alumno> obtenerAlumno() {
        List<Alumno> ListaAlumnos = new ArrayList();
          
        Alumno data = new Alumno();
        data.setApellido("sosa");
        data.setNombre("danilo");
        Alumno data2 = new Alumno();
        data2.setApellido("vazquez");
        data2.setNombre("andres");

        ListaAlumnos.add(data);
        ListaAlumnos.add(data2);

        return ListaAlumnos;
    }
}

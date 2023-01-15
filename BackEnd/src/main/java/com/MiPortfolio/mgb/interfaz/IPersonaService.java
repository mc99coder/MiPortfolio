
package com.MiPortfolio.mgb.interfaz;

import com.MiPortfolio.mgb.entidad.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer Persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona (Persona persona);
    
    //Eliminar Un Objeto y lo buscamos por ID
    public void deletePersona (Long id);
    
    //Buscar persona ID
    public Persona findPersona (Long id);
    
}

package com.alura.Challenge_Literalura.servicios;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos {
    private ObjectMapper objectMapper = new ObjectMapper(); //ObjectMapper se utiliza para convertir entre objetos Java y JSON (serialización y deserialización).

    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {    /* Método genérico que: Recibe una cadena JSON. Recibe la clase del tipo que se desea crear (por ejemplo, DatosLibros.class).
                                                                   Devuelve un objeto de tipo T (puede ser cualquier clase que tú definas). */
        try {
            return objectMapper.readValue(json, clase);  // Esta línea convierte un JSON (que está en forma de cadena de texto) en un objeto Java de la clase especificada.
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);               // Lanza una excepción en tiempo de ejecución si ocurre un error, para que el programa no continúe con datos inválidos.
        }


    }
}
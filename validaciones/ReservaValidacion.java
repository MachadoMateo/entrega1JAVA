package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;

public class ReservaValidacion {
    //metodos ordinarios
    private Util util = new Util();
    public Boolean validarFechaRes(String fechaRes)throws Exception{
        if (!util.buscarCoincidencia(fechaRes,"^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-({4})$")){
            throw new Exception(Mensaje.FORMATO_FECHA.getMensaje());
        }return true;
    }

    public Boolean numeroPer(String numeroPer)throws Exception{
        if (numeroPer.length()>4){
            throw new Exception(Mensaje.CANTIDAD_PERSONAS_RESERVA.getMensaje());
        }return true;
    }
}

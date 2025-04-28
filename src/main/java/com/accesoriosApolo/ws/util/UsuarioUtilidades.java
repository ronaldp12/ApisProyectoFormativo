package com.accesoriosApolo.ws.util;

import com.accesoriosApolo.ws.dto.UsuarioDto;

import java.util.ArrayList;
import java.util.List;

public class UsuarioUtilidades {

    static int conteo = 0;

    public static List<UsuarioDto> listaUsuarios = new ArrayList<UsuarioDto>();

    public static void iniciarLista() {
        if (conteo == 0) {
            listaUsuarios.add(new UsuarioDto(1001,
                    "Juan",
                    "Pérez",
                    "juan.perez@gmail.com",
                    "1234",
                    1));
            listaUsuarios.add(new UsuarioDto(1002,
                    "Ana",
                    "Romero",
                    "ana.romero@hotmail.com",
                    "5678",
                    2));
            conteo = 1;
        }
    }

}

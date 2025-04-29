package com.accesoriosApolo.ws.util;

import com.accesoriosApolo.ws.dto.CategoriaDto;
import java.util.ArrayList;
import java.util.List;

public class CategoriaUtilidades {

    static int conteo = 0;

    public static List<CategoriaDto> listaCategorias = new ArrayList<>();

    public static void iniciarLista() {
        if (conteo == 0) {
            listaCategorias.add(new CategoriaDto(1, "Accesorios de Protección", "Cascos, chaquetas, guantes, etc.", 10.00, "Protección Personal"));
            listaCategorias.add(new CategoriaDto(2, "Repuestos", "Partes de moto originales y genéricas.", 5.00, "Mecánica"));
            conteo = 1;
        }
    }
}

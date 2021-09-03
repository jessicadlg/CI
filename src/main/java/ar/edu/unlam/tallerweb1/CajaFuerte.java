package ar.edu.unlam.tallerweb1;

public class CajaFuerte {
    //private Boolean estadoApertura;
    private Boolean estaAbierta;
    private int codigoCorrecto;

    public CajaFuerte() {
        estaAbierta = Boolean.TRUE;
    }

    public boolean estaAbierta() {
        //if(estaAbierta.equals(ABIERTO))
        //  return true;
        //return false;
        return estaAbierta;
    }

    public void cerrar() {
        estaAbierta = Boolean.FALSE;
    }

    public void cerrar(int codigoDeApertura) {
        codigoCorrecto = codigoDeApertura;
        estaAbierta = Boolean.FALSE;
    }

    public void abrir(int codigoDeApertura) {
        if (codigoDeApertura == codigoCorrecto)
            estaAbierta = Boolean.TRUE;
    }
}

package ar.edu.unlam.tallerweb1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CajaFuerteTest {
    private CajaFuerte caja;
    public static final int CODIGO_DE_APERTURA = 2222;

    @Test
    public void alCrearUnaCajaFuerteDeberiaEstarAbierta() {
             /*preparacion
             given(dado)*/

            /*ejecucion
            when(cuando)*/
        whenCreoUnaCajaFuerte();

            /*
            validacion
            the(entonces)
            */
        thenCajaFuerteEstaAbierta(caja);
    }

    @Test
    public void alCrearUnaCajaFuerteDeberiaEstarCerrada() {
     CajaFuerte caja= givenExisteUnaCajaFuerte();

     whenCierroLaCajaFuerte(caja);

     thenCajaFuerteEstaCerrada(caja);
    }
    @Test
    public void alAbrirLaCajaFuerteConElCodigoDeCierreDeberiaEstarAbierta() {
        CajaFuerte caja= givenExisteUnaCajaFuerte();

        
        givenCierroLaCajaFuerte(caja, CODIGO_DE_APERTURA);

        whenAbroLaCajaFuerteCon(caja, CODIGO_DE_APERTURA);

        thenCajaFuerteEstaAbierta(caja);
    }
    @Test
    public void alAbrirLaCajaFuerteConElCodigoErroneoNoDeberiaAbrirse() {

        CajaFuerte caja= givenExisteUnaCajaFuerte();
        givenCierroLaCajaFuerte(caja,CODIGO_DE_APERTURA );

        whenAbroLaCajaFuerteCon(caja,CODIGO_DE_APERTURA +8);

        thenCajaFuerteEstaCerrada(caja);
    }
    private void givenCierroLaCajaFuerte(CajaFuerte caja, int codigoDeApertura) {
    caja.cerrar(codigoDeApertura);
    }

    private void whenAbroLaCajaFuerteCon(CajaFuerte caja,int codigoDeApertura) {
    caja.abrir(codigoDeApertura);
    }

    private void thenCajaFuerteEstaCerrada(CajaFuerte caja) {
        assertThat(caja.estaAbierta()).isFalse();
    }
    private void whenCierroLaCajaFuerte(CajaFuerte caja){
        caja.cerrar();
    }


    private CajaFuerte givenExisteUnaCajaFuerte(){
        return  new CajaFuerte();
    }
    private void whenCreoUnaCajaFuerte() {
        caja = new CajaFuerte();
    }
    private void thenCajaFuerteEstaAbierta(CajaFuerte caja) {
        assertThat(caja.estaAbierta()).isTrue();
    }

}

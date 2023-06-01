package combustion;

public class Operaciones {

    // Metodos para Balancear las ecuaciones quimicas de combustion del hidrocarburo

    protected int atomoCarbono, atomoHidrogeno, coeficienteCO2, coeficienteCO;
    protected double coeficienteH20, oxigenoCO2, oxigenoProductosc, oxigenoProductosi, coeficienteO2c, coeficienteO2i, oxigenoCO;

    protected void combustionCompleta() {
        coeficienteH20 = atomoHidrogeno / 2.0;
        coeficienteCO2 = atomoCarbono;
        oxigenoCO2 = coeficienteCO2 * 2;
        oxigenoProductosc = oxigenoCO2 + coeficienteH20;
        coeficienteO2c = oxigenoProductosc / 2;
    }

    protected void combustionIncompleta() {
        coeficienteH20 = atomoHidrogeno / 2.0;
        coeficienteCO = atomoCarbono;
        oxigenoCO = coeficienteCO;
        oxigenoProductosi = oxigenoCO + coeficienteH20;
        coeficienteO2i = oxigenoProductosi / 2;
    }

}

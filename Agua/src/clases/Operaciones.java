package clases;

public class Operaciones {

    protected double A = 8.10765, B = 1750.286, C = 235, A1 = 7.96681, B1 = 1668.210, C1 = 228;

    protected double Exponente, Psat, psi, kpa, atm, bar, Tsat, farengei, kelvin, rankine;

    protected static double Temperaturaconversion, Presionconversion;

    protected void calcularpresion() {
        Exponente = ((A) - ((B) / ((Temperaturaconversion) + (C))));
        Psat = Math.pow(10, Exponente);
        psi = Psat * 1 / 760 * 14.7;
        kpa = Psat * 1 / 760 * 101.325;
        atm = Psat * 1 / 760;
        bar = Psat * 1 / 750.062;
    }

    protected void calcularpresion1() {
        Exponente = ((A1) - ((B1) / ((Temperaturaconversion) + (C1))));
        Psat = Math.pow(10, Exponente);
        psi = Psat * 1 / 760 * 14.7;
        kpa = Psat * 1 / 760 * 101.325;
        atm = Psat * 1 / 760;
        bar = Psat * 1 / 750.062;
    }

    protected void calculartemperatura() {
        Tsat = (((B) / ((A) - (Math.log10(Presionconversion)))) - (C));
        farengei = (Tsat * 9 / 5) + 32;
        kelvin = Tsat + 273.15;
        rankine = (9 * Tsat / 5) + 491.67;
    }

    protected void calculartemperatura1() {
        Tsat = (((B1) / ((A1) - (Math.log10(Presionconversion)))) - (C1));
        farengei = (Tsat * 9 / 5) + 32;
        kelvin = Tsat + 273.15;
        rankine = (9 * Tsat / 5) + 491.67;
    }

}

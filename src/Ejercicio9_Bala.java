public class Ejercicio9_Bala {
    double altura;
    final double gravedad = 9.8; // Se usa final porque gravedad es una constante
    double vo; // Velocidad inicial (v0)

    public Ejercicio9_Bala() {
    }

    public Ejercicio9_Bala(double altura, double vo) {
        this.altura = altura;
        this.vo = vo;
    }
    // Usamos setters
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setVo(double vo) {
        this.vo = vo;
    }

    // Fórmula ya despejada para calcular el tiempo
    public double TiempoVuelo() {
        // Fórmula: yf = y0 + v0y * t + (1/2) * ay * t^2
        // Despejamos t^2: t^2 = (2 * altura) / gravedad
        return Math.sqrt((2 * this.altura) / gravedad);
    }
    public double TiempoBala() {
        return vo * gravedad;
    }
}



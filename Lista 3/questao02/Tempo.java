public class Tempo {
    private int hora, minuto, segundo;

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public int conversaoParaSegundo() {
        return hora * 60*60 + minuto * 60 + segundo;
    }
}

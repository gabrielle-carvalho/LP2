
public class Tempo
{
    int horaInicio, minutoInicio, segundoInicio;
    
    public Tempo(int hora, int minuto, int segundo) {
        this.horaInicio = hora;
        this.minutoInicio = minuto;
        this.segundoInicio = segundo;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getMinutoInicio() {
        return minutoInicio;
    }

    public int getSegundoInicio() {
        return segundoInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setMinutoInicio(int minutoInicio) {
        this.minutoInicio = minutoInicio;
    }

    public void setSegundoInicio(int segundoInicio) {
        this.segundoInicio = segundoInicio;
    }

    
    public int conversaoParaSegundo(int hora, int minuto, int segundo){
        return (horaInicio*60*60) + (minutoInicio*60) + segundoInicio;
    }
}

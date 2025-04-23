
public class Tempo
{
    int horaInicio, minutoInicio, segundoInicio;
    
    public Tempo()
    {
        
    }
    int conversaoParaSegundo(int hora, int minuto, int segundo){
        return this.hora()*60*60 + this.minuto()*60 + this.segundo();
    }
}

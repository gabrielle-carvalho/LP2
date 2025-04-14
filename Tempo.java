
public class Tempo
{
    int hora, minuto, segundo;
    
    public Tempo()
    {
        
    }
    int conversao(int hora, int minuto, int segundo){
        int total = hora*60+minuto;
        if(segundo>0){
            total+=1;
        }
        return total;
    }
    int calcDif(int inicio, int fim){
        int diferenca=fim-minuto;
        return diferenca;
    }
}

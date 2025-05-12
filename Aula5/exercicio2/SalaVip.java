public class SalaVip extends Sala
{
    protected String horario;
    
    public SalaVip(int numeroSala, int capacidade, String horario) {
        super(numeroSala,capacidade);
        this.horario = horario;
    }
    public String getHorario() {
          return horario;
    }

    public void setHorario(String horario) {
          this.horario = horario;
      }
  
}

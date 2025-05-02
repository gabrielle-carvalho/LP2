import java.util.ArrayList;
public class Faculdade{
  private String nome;
  private int anoCriacao;
  private ArrayList<Curso> course = new ArrayList<Curso>();

  public Faculdade(String nome, int anoCriacao){
    this.nome=nome;
    this.anoCriacao=anoCriacao;
  }

  public void addCurso(Curso curs){
  for (course c : curs) {
    if(c.getNome().equalsIgnoreCase(curs.getNome()){
      System.out.println("Curso já existe" + cus.getNome());
      return;
    }
  }
      this.course.add(curs);  
  }
  
  public void removCurso(String nome){
    boolean removido =false;
    for(int i=0;i<course.size();i++){
      if(couse.get(i).getNome().equalsIgnoreCase(nome)){
        course.remove(i);
        System.out.println("curso removido");
        removido=true;
        break;
      }
    }
    if(removido==true){
      System.out.println("curso removido");
    }
  }

  public Faculdade filtrarCursos (String nomeNewFacul, int anoNewFacul){
    Faculdade nova = new Faculdade(nomeNewFacul, anoNewFacul);
    for(Curso c: course){
      if(c.getAnoCriacao()<=this.anoCriacao+5){
        nova.addCurso(c);
      }
    }
    return nova;
  }
  
  public String getNome(){
    return this.nome;
  }
  public int getAnoCriacao(){
    return this.anoCriacao;
  }

  public void setNome(String nome){
    this.nome=nome;
  }
  public void setAnoCriacao(int anoCriacao){
    this.anoCriacao=anoCriacao;
  }

  public void setShop(String ArrayList<Curso>course){
    this.course=course;
  }
  
}

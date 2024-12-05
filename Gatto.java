public class Gatto extends Animale{
  //Atributi
  private int versogatto;
//Costruttore
  public Gatto(int versogatto){
    super(versogatto);
    this.versogatto=versogatto;
  }
  //Metodi
  @Override
  public void emettiSuono(){
    System.out.println(versogatto);
  }
  public String toString()  {
    String result = String.valueOf(versogatto);
    result += " di ";
    return result; 
  }
  //Getters
  public int Getverso(){
    return versogatto;
  }
  //Setters
  public void Setverso(int i){
    versogatto=i;
  }
}
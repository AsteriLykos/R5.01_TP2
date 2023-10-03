public class Pile {

  private List   lstCalcul ;
  
  public Pile ()
  {
    lstCalcul = new ArrayList<String>() ;    
  }

  public String depiler()
  {
    if( lstCalcul.size() == 0 )
      return null;
    
    return lstCalcul.get(0);
  }

  public void empiler( String s )
  {
    lstCalcul.add(s);
  }
  
}

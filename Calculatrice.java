public class Calculatrice {

    private String equation ;
    private Pile   pile ;
    
    
    public Calculatrice( String equa )
    {
        this.equation = equa ;
        this.pile = new Pile() ; 
    }





    public static void main ( String[] args )
    {
        Scanner sc = new Scanner( System.in);
        System.out.println("Veuillez saisir un mot :");
        String str = sc.nextLine();

        new Calculatrice(str);
        
    }




}
import java.util.*;
public class Auto extends Vetture {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Auto()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Inserire tipologia del motore: ");
        this.setMotore(in.nextLine());
        System.out.print("Inserire cilindrata del motore: ");
        this.setCilindrata(in.nextFloat());
        System.out.print("Inserire chilometraggio della vettura: ");
        this.setChilometri(in.nextInt());
        in.nextLine();
        boolean ripeti = true;
         while (ripeti){
             System.out.println("Inserire targa della vettura: ");
             ripeti = this.setTarga(in.nextLine());
            if(ripeti)
            {
                System.out.println("Inserire targa della vettura: ");
                ripeti =this.setTarga(in.nextLine());
            }
        }
        System.out.print("Inserire tipologia della vettura: ");
        this.setTipo(in.nextLine());

    }
    public void getAuto()
    {
        String str = String.valueOf(this.getCilindrata());
        String strR = str.replace(",",".");
        System.out.println("Le caratteristiche della vettura sono: - Motore "+this.getMotore()+"; - Cilindrata: "+this.getCilindrata()+"; - Chilometri: "+this.getChilometri()+"; - Targa: "+this.getTarga()+"; - Tipo Vettura: "+this.getTipo());
    }
}

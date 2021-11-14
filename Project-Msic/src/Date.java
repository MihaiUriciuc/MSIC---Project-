package src;

public class Date {
	protected float c_apa_rece; /*valoarea consumului de apa rece pe luna curenta in m3*/
	protected float c_apa_calda; /*valoarea consumului de apa calda pe luna curenta in m3*/
	protected float energ; /*valoarea consumului de curent pe bloc repartizat pe locatar*/
	protected float rep; /*fondul de reparatii per locuinta*/
	protected float sdc; /*suma de bani preluata de la fiecare apartament in parte pentru a 
	                     plati serviciile de curatenie*/
    protected float sal; /*salarii asociatie*/
    
    public void setDate(float c_apa_rece, float c_apa_calda, float energ, float rep, float sdc, float sal)
    {
    	this.c_apa_calda=c_apa_calda;
    	this.c_apa_rece=c_apa_rece;
    	this.energ=energ;
    	this.rep=rep;
    	this.sdc=sdc;
    	this.sal=sal;
    }
   
}


public class Apa_rece extends Apa_calda{

float apa_rece; //consum apa calda
	
	void setApa_Rece()
	{
		apa_rece=(float) (apa_rece*1.8); //1.8 este pretul pe m3
	}
	
	float getApa_Rece()
	{
		return apa_rece;
	}
	
	void Afiseazadate() {
		/*System.out.println("|"+apa_calda+" |"+apa_rece+"| "+energie+"  |"+gaze+
				"|"+" "+salarii+"  |"+" "+curatenie+"    |  "+reparatii+"   "+"|"+valintr+" |  "+restante+"  |");*/
		
		System.out.println(" |"+apa_rece);
		
	}
}

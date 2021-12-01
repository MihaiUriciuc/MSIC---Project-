
public class Gaze extends Energie{

float gaze;   //consum energie
	
	void setGaze()
	{
		gaze=(float)(gaze*0.5); //1.5 este pretul pe o unitate
	}
	
	float getGaze()
	{
		return gaze;
	}
	
	void Afiseazadate() {
		System.out.println("  |"+gaze);
		
		/*System.out.println("|"+apa_calda+" |"+apa_rece+"| "+energie+"  |"+gaze+
				"|"+" "+salarii+"  |"+" "+curatenie+"    |  "+reparatii+"   "+"|"+valintr+" |  "+restante+"  |");*/
		
	}
}


public class Energie extends Apa_rece{

	float energie;   //consum energie
	
	void setGaze()
	{
		energie=(float)(energie*0.7); //0.7 este pretul pe kw
	}
	
	float getEnergie()
	{
		return energie;
	}
	
	void Afiseazadate() {
		/*System.out.println("|"+apa_calda+" |"+apa_rece+"| "+energie+"  |"+gaze+
				"|"+" "+salarii+"  |"+" "+curatenie+"    |  "+reparatii+"   "+"|"+valintr+" |  "+restante+"  |");*/
		
		System.out.println("| "+energie);
		
	}
	
}

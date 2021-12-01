
public class Total extends Reparatii{

	float valintr;
	
	public float Intretinere(float apa_calda, float apa_rece, float energie,
			float gaze, float curatenie, float salarii, float reparatii)
	{
		/*float valintr; //variabila pentru valoarea intretinerii*/
		valintr= apa_calda+apa_rece+energie+gaze+curatenie+salarii+reparatii;
		
	return valintr;
	}
	
	void Afiseazadate() {
		System.out.println("   "+"|"+valintr);
		
		/*System.out.println("|"+apa_calda+" |"+apa_rece+"| "+energie+"  |"+gaze+
		"|"+" "+salarii+"  |"+" "+curatenie+"    |  "+reparatii+"   "+"|"+valintr+" |  "+restante+"  |");*/
		
	}
}

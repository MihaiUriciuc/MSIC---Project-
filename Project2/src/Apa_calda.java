
public class Apa_calda {
	float apa_calda; //consum apa calda
	
	void setApa_calda()
	{
		apa_calda=apa_calda*3; //3 este pretul pe m3 
	}
	
	float getApa_calda()
	{
		return apa_calda;
	}
	
	/*void Afiseazadate() {
		System.out.println("|"+apa_calda+" |"+apa_rece+"| "+energie+"  |"+gaze+
				"|"+" "+salarii+"  |"+" "+curatenie+"    |  "+reparatii+"   "+"|"+valintr+" |  "+restante+"  |");*/
		
		void Afiseazadate() {
			System.out.println("|"+apa_calda);/*+" |"+apa_rece+"| "+energie+"  |"+gaze+
					"|"+" "+salarii+"  |"+" "+curatenie+"    |  "+reparatii+"   "+"|"+valintr+" |  "+restante+"  |");
		
		/*System.out.format("+-----+----+-------+----+-------+---------+---------+-----+--------+%n");
*/	}

}

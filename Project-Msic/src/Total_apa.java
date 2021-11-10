import java.lang.Float;

public class Total_apa {
	Consum_apa_calda apa_c1 = new Consum_apa_calda();
	Consum_apa_rece apa_r1 = new Consum_apa_rece();
	
	public float total_consum_apa(float apa_total)
	{		
		float apa_total1 = Float.sum(apa_r1,apa_c1);
		return apa_total1;
		
	}
	/*float total_apa = apa_c+apa_r;*/
}

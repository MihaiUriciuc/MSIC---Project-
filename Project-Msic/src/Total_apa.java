
public class Total_apa {
	public float total_consum_apa()
	{
		Consum_apa_calda apa_c1 = new Consum_apa_calda();
		Consum_apa_rece apa_r1 = new Consum_apa_rece();
		apa_r1.apa_rece();
		apa_c1.apa_calda();
		float apa_total=1;
		/*float apa_total=sum(apa_r1,apa_c1);*/
		return apa_total;
		
	}
	/*float total_apa = apa_c+apa_r;*/
}

package src;

import java.net.NoRouteToHostException;

public class bloc {
	private int id; /*id-ul pentru bloc*/
	private int scara;  /*scara blocului*/
	private int nr_ap;  /*nr de apartamente din bloc*/
	private int nr_cheltuieli; /*cheltuielile lunare pe bloc*/

	public bloc(int id) {
		this.id=id;
		
	}
	public void setScara(int scara)
	{
		this.scara=scara;
	}
	public void Numar_ap(int nr_ap)
	{
		this.nr_ap=nr_ap;
	}
	public void setCheltuieli(int nr_cheltuieli)
	{
		this.nr_cheltuieli=nr_cheltuieli;
	}
	

}

package src;

import java.net.NoRouteToHostException;

public class bloc {
	private int id; /*id-ul pentru bloc*/
	private int scara;  /*scara blocului*/
	private int nr_ap;  /*nr de apartamente din bloc*/
	private int nr_cheltuieli; /*cheltuielile lunare pe bloc*/

	public bloc(int id, int scara, int nr_ap, int nr_cheltuieli) {
		this.id=id;
		this.scara=scara;
		this.nr_ap=nr_ap;
		this.nr_cheltuieli=nr_cheltuieli;

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
	

	public int getId(int id)
	{
		return id;
	}
	
	public int getscara(int scara)
	{
		return scara;
	}

	public int getnrap(int ap)
	{
		return ap;
	}
	
	public int getnr_cheltuieli(int nr_cheltuieli)
	{
		return nr_cheltuieli;
	}
	
}

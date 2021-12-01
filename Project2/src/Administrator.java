import java.util.Scanner;    
import static java.lang.System.out;


public class Administrator {

	public static void main(String[] args) {
		
		Locatar locatar1 = new Locatar();
		Locatar locatar2 = new Locatar();
		Locatar locatar3 = new Locatar();
		Locatar locatar4 = new Locatar();
		Locatar locatar5 = new Locatar();
		Locatar locatar6 = new Locatar();
		Locatar locatar7 = new Locatar();
		Locatar locatar8 = new Locatar();
		
		locatar1.nume = "Popescu";
		locatar1.prenume="Daniel";
		locatar1.ap=1;
		locatar1.nr_loc=2;
		locatar1.apa_calda=10*3;
		locatar1.apa_rece=(float) (10*1.8);
		locatar1.energie=(float) (10*0.7);
		locatar1.gaze=(float)(10*0.5);
		locatar1.salarii=10;
		locatar1.curatenie=10;
		locatar1.reparatii=10;
		locatar1.restante=10;
		locatar1.Intretinere(locatar1.apa_calda, locatar1.apa_rece, locatar1.energie, 
				locatar1.gaze, locatar1.salarii, locatar1.curatenie,
				locatar1.reparatii);
		
		locatar2.nume = "Danila";
		locatar2.prenume="George";
		locatar2.ap=2;
		locatar2.nr_loc=3;
		locatar2.apa_calda=8*3;
		locatar2.apa_rece=(float) (10*1.8);
		locatar2.energie=(float) (9*0.7);
		locatar2.gaze=(float)(8*0.5);
		locatar2.salarii=10;
		locatar2.curatenie=10;
		locatar2.reparatii=10;
		locatar2.restante=54;
		locatar2.Intretinere(locatar2.apa_calda, locatar2.apa_rece, locatar2.energie, 
				locatar2.gaze, locatar2.salarii, locatar2.curatenie,
				locatar2.reparatii);
		
		locatar3.nume = "Popa";
		locatar3.prenume="Ioana";
		locatar3.ap=3;
		locatar3.nr_loc=4;
		locatar3.apa_calda=8*3;
		locatar3.apa_rece=(float) (10*1.8);
		locatar3.energie=(float) (10*0.7);
		locatar3.gaze=(float)(9*0.5);
		locatar3.salarii=10;
		locatar3.curatenie=10;
		locatar3.reparatii=20;
		locatar3.restante=0;
		locatar3.Intretinere(locatar3.apa_calda, locatar3.apa_rece, locatar3.energie, 
				locatar3.gaze, locatar3.salarii, locatar3.curatenie,
				locatar3.reparatii);
		
		locatar4.nume = "Simina";
		locatar4.prenume="Ana";
		locatar4.ap=4;
		locatar4.nr_loc=2;
		locatar4.apa_calda=7*3;
		locatar4.apa_rece=(float) (7*1.8);
		locatar4.energie=(float) (6*0.7);
		locatar4.gaze=(float)(7*0.5);
		locatar4.salarii=10;
		locatar4.curatenie=10;
		locatar4.reparatii=10;
		locatar4.restante=0;
		locatar4.Intretinere(locatar4.apa_calda, locatar4.apa_rece, locatar4.energie, 
				locatar4.gaze, locatar4.salarii, locatar4.curatenie,
				locatar4.reparatii);
		
		locatar5.nume = "Dragan";
		locatar5.prenume="Marius";
		locatar5.ap=5;
		locatar5.nr_loc=1;
		locatar5.apa_calda=5*3;
		locatar5.apa_rece=(float) (5*1.8);
		locatar5.energie=(float) (4*0.7);
		locatar5.gaze=(float)(5*0.5);
		locatar5.salarii=10;
		locatar5.curatenie=10;
		locatar5.reparatii=10;
		locatar5.restante=53;
		locatar5.Intretinere(locatar5.apa_calda, locatar5.apa_rece, locatar5.energie, 
				locatar5.gaze, locatar5.salarii, locatar5.curatenie,
				locatar5.reparatii);
		
		locatar6.nume = "Ivan";
		locatar6.prenume="Eugen";
		locatar6.ap=6;
		locatar6.nr_loc=3;
		locatar6.apa_calda=7*3;
		locatar6.apa_rece=(float) (8*1.8);
		locatar6.energie=(float) (9*0.7);
		locatar6.gaze=(float)(5*0.5);
		locatar6.salarii=10;
		locatar6.curatenie=10;
		locatar6.reparatii=10;
		locatar6.restante=0;
		locatar6.Intretinere(locatar6.apa_calda, locatar6.apa_rece, locatar6.energie, 
				locatar6.gaze, locatar6.salarii, locatar6.curatenie,
				locatar6.reparatii);
		
		locatar7.nume = "Maria";
		locatar7.prenume="Marian";
		locatar7.ap=7;
		locatar7.nr_loc=4;
		locatar7.apa_calda=11*3;
		locatar7.apa_rece=(float) (11*1.8);
		locatar7.energie=(float) (10*0.7);
		locatar7.gaze=(float)(10*0.5);
		locatar7.salarii=10;
		locatar7.curatenie=10;
		locatar7.reparatii=10;
		locatar7.restante=38;
		locatar7.Intretinere(locatar7.apa_calda, locatar7.apa_rece, locatar7.energie, 
				locatar7.gaze, locatar7.salarii, locatar7.curatenie,
				locatar7.reparatii);
		
		locatar8.nume = "Ionescu";
		locatar8.prenume="Daniel";
		locatar8.ap=8;
		locatar8.nr_loc=2;
		locatar8.apa_calda=6*3;
		locatar8.apa_rece=(float) (7*1.8);
		locatar8.energie=(float) (8*0.7);
		locatar8.gaze=(float)(9*0.5);
		locatar8.salarii=10;
		locatar8.curatenie=10;
		locatar8.reparatii=30;
		locatar8.restante=314;
		locatar8.Intretinere(locatar8.apa_calda, locatar8.apa_rece, locatar8.energie, 
				locatar8.gaze, locatar8.salarii, locatar8.curatenie,
				locatar8.reparatii);
	
		Scanner sc = new Scanner(System.in); //pentru a putea alege comanda de la tastatura
		
		while(true)  
        {  
            System.out.println("Administratie");  
            System.out.println("Alege 1 pentru afisarea datelor");  
            System.out.println("Alege 2 pentru sortarea dupa nume");  
            System.out.println("Alege 3 pentru sortarea dupa nr locuitori");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Alege una din comenzile dorite:");  
              
            //Alegerile utilizatorului
		int choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            	System.out.format("+-----+----+-------+----+-------+---------+---------+-----+--------+%n");
    			System.out.format("|Calda|Rece|Energie|Gaze|Salarii|Curatenie|Reparatii|Total|Restante|%n");
    			System.out.format("+-----+----+-------+----+-------+---------+---------+-----+--------+%n");
    			locatar1.Afiseazadate();
    			locatar2.Afiseazadate();
    			locatar3.Afiseazadate();
    			locatar4.Afiseazadate();
    			locatar5.Afiseazadate();
    			locatar6.Afiseazadate();
    			locatar7.Afiseazadate();
    			locatar8.Afiseazadate();
    System.out.println("");  
    break;  

            case 2:  
            	
                  
    System.out.println("");  
    break;  

            case 3:  
    break;  

            case 4:  
    //exit from the menu  
    System.exit(0);  
        }  
    }
			// TODO Auto-generated method stub

	}
}

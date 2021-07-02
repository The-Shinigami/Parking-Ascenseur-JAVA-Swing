/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
 
 
public class Thread_sem {	
 
    private static class AccesVoiture implements Runnable {
 
        /** time to wait after acquiring a "rampe"
         */
        TimeUnit unit      = null;
        long     sleepTime = 0;
 
        /** Initial Available spaces
         */
	private static int NBR_PLACES = 2;
	private static int NBR_RAMPE  = 1;
	//Cars
	 private Car c;
 
        /** Semaphores
         */
	private static Semaphore semPlace = new Semaphore( NBR_PLACES , true );
	private static Semaphore semRampe = new Semaphore( NBR_RAMPE  , true );
 
        public AccesVoiture( long time , TimeUnit unit , Car c) {
            this.unit = unit;
            this.sleepTime = time;
            this.c=c;
        }
 
        /** reference time
         */
        private static final long referenceTime = System.currentTimeMillis();
 
        private String getAccesVoitureDesc() {
            return "[" + ( System.currentTimeMillis() - referenceTime ) + "] (Proc : " + Thread.currentThread().getName() + ")";
        }
 
	public void run(){
                   System.out.println( getAccesVoitureDesc() + " veut rentrer dans le parking !");
			       //this.c. entrePark();
                    this.entrer_parking(this.c);
            
					System.out.println( getAccesVoitureDesc() + " veut sortir du parking !");
					this.sortir_parking(this.c);
		 
			
	}
 
	public void entrer_parking(Car c) {
		try {
                    semPlace.acquire();
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
		System.out.println( getAccesVoitureDesc()  + " a donn� sa carte, ATTENTE");
              
		try {
                    this.unit.sleep( this.sleepTime );
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    System.out.println( getAccesVoitureDesc() + " a fini son attente");
                    
                  
                }
		try {
			semRampe.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( getAccesVoitureDesc() + " passe sur la rampe");
		semRampe.release();
		System.out.println( getAccesVoitureDesc() + " est descendu de la rampe et est garde a sa place !");
       c.entrePark();
       Connection_DB cnx = new Connection_DB();
       cnx.SetCar(Thread.currentThread().getName(),System.currentTimeMillis(),c.getEmplacement());
	}
 
	public void sortir_parking(Car c) {
		try {
			semRampe.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( getAccesVoitureDesc() + " passe sur la rampe (pour sortir)");
		semRampe.release();
		System.out.println( getAccesVoitureDesc() + " est descendu de la rampe (pour sortir)");
		semPlace.release();
		System.out.println( getAccesVoitureDesc() + " est sorti du parking...Place liberée !");
		c.sortiPark();
	}
    }
 
    public static void main(String[] args) {
    	JFrame frame = new JFrame("Parking Simulator");
        Parking panel = new Parking();
        
        
        frame.setContentPane(panel);
        panel.setLayout(null);
        
        frame.setSize(1100,340);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<Car> cars=new ArrayList<Car>();
        
     
       
      for(int i=1 ; i<=3 ; i++)
      {   
          Car c = new Car(i); 
          cars.add(c);
          panel.add(c);
       } 
      
    
      frame.setVisible(true);
       
        Thread p1 = new Thread( new AccesVoiture( 10000, TimeUnit.MILLISECONDS,cars.get(0) ),"voiture 1" );
        Thread p2 = new Thread( new AccesVoiture( 20000 , TimeUnit.MILLISECONDS,cars.get(1)),"voiture 2" );
        Thread p3 = new Thread( new AccesVoiture( 30000 , TimeUnit.MILLISECONDS ,cars.get(2) ) ,"voiture 3");
 
        p1.start();
        p2.start();
        p3.start();
        
 
    }
 
}

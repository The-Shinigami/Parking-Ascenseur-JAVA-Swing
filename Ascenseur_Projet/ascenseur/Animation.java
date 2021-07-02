package ascenseur;

import java.util.ArrayList;

import javax.swing.JPanel;

public class Animation extends Thread {
	private int x, y; // Position de l'ascenseur
	private JPanel as; // Panel de l'ascenseur
	private Personne person; 
	private ArrayList<Personne> personnesIn = new ArrayList<Personne>();
	
	
	public Animation(JPanel as, Personne person)
	{
		this.as = as;
		this.x = as.getLocation().x;
		this.y = as.getLocation().y;
		this.person = person;
		
	}
	//L'ascenseur ascend
	synchronized void ascendre()
	{
		this.as.setLocation(this.as.getLocation().x, this.as.getLocation().y - 60);
	}
	//L'ascenseur déscend
	synchronized void descendre()
	{
		this.as.setLocation(this.as.getLocation().x, this.as.getLocation().y + 60);
	}
	
	@Override
	public void run() {
		
		if(person.getAppel() == true)
		{
			System.out.println("J'entre dans la condition 1, appel vraie!");
			
			if(person.getEtage() < this.getY())
			{
				System.out.println("J'entre dans la condition 2, etage de l'ascenseur inférieur à l'etage de la personne!");
				int nf = person.goToInv(person.getEtage()) - this.allerEtage(this.getY());
				System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.allerEtage(this.getY()) + "\nYPer : " + person.getEtage() + " EtPers : " + person.goToInv(person.getEtage()) + "\n\tNbre d'iteration : " + nf);
				
				for(int i = 0; i < nf; i++)
				{
					this.ascendre();
					this.setY(this.as.getLocation().y);
					try 
					{
						sleep(500);
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
				}
				if(personnesIn.size() < 4)
				{
					System.out.println("J'entre dans la condition 3, size < 4");
					
					this.personnesIn.add(person);
					person.goIn(this.as);
					try 
					{
						Personne.sleep(500);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					if(person.getEtageTo() < this.getY())
					{
						int nt = this.allerEtage(person.getEtageTo()) - this.allerEtage(this.getY());
						System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.allerEtage(this.getY()) + "\nYPer : " + person.getEtageTo() + " EtPers : " + person.goToInv(person.getEtageTo()) + "\n\tNbre d'iteration : " + nt);
						
						for(int i = 0; i < nt; i++)
						{
							this.ascendre();
							try
							{
								sleep(500);
							}
							catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
						}
						person.goOut(this.as);
						this.personnesIn.remove(person);
					}
					else if(person.getEtageTo() > this.getY())
					{
						int nt = this.allerEtage(this.getY()) - this.allerEtage(person.getEtageTo());
						System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.allerEtage(this.getY()) + "\nYPer : " + person.getEtageTo() + " EtPers : " + person.goToInv(person.getEtageTo()) + "\n\tNbre d'iteration : " + nt);
						
						for(int i = 0; i < nt; i++)
						{
							this.descendre();
							try
							{
								sleep(500); 
							}
							catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
						}
						person.goOut(this.as);
						this.personnesIn.remove(person);
					}
				}
				else
				{
					try 
					{
						person.wait();
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					};
				}
			}
			if(person.getEtage() > this.getY())
			{
				System.out.println("J'entre dans la condition 2, etage de l'ascenseur supérieur à l'etage de la personne!");
				int nf = this.allerEtage(this.getY()) - person.goToInv(person.getEtage());
				System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.allerEtage(this.getY()) + "\nYPer : " + person.getEtage() + " EtPers : " + person.goToInv(person.getEtage()) + "\n\tNbre d'iteration : " + nf);
				
				for(int i = 0; i < nf; i++)
				{
					this.descendre();
					this.setY(this.as.getLocation().y);
					try 
					{
						sleep(500);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
				if(personnesIn.size() < 4)
				{
					this.personnesIn.add(person);
					person.goIn(this.as);
					try 
					{
						Personne.sleep(500);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					if(person.getEtageTo() < this.getY())
					{
						int nt = this.allerEtage(person.getEtageTo()) - this.allerEtage(this.getY());
						System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.allerEtage(this.getY()) + "\nYPer : " + person.getEtageTo() + " EtPers : " + person.goToInv(person.getEtageTo()) + "\n\tNbre d'iteration : " + nt);
						
						for(int i = 0; i < nt; i++)
						{
							this.ascendre();
							try
							{
								sleep(500);
							}
							catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
						}
						person.goOut(this.as);
						this.personnesIn.remove(person);
					}
					if(person.getEtageTo() > this.getY())
					{
						int nt = this.allerEtage(this.getY()) - this.allerEtage(person.getEtageTo());
						System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.allerEtage(this.getY()) + "\nYPer : " + person.getEtageTo() + " EtPers : " + person.goToInv(person.getEtageTo()) + "\n\tNbre d'iteration : " + nt);
						
						for(int i = 0; i < nt; i++)
						{
							this.descendre();
							try
							{
								sleep(500); 
							}
							catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
						}
						person.goOut(this.as);
						this.personnesIn.remove(person);
					}
				} 
				else
				{
					try 
					{
						person.wait();
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
			}
			//this.stop();
		}
		//}
		//this.stop();
	}

	public int allerEtage(int yEtage)
	{
		int etage = 0;
		switch(yEtage)
		{
			case 310 :
				etage = 0;
				break;
			case 250 :
				etage = 1;
				break;
			case 190 :
				etage = 2;
				break;
			case 130 :
				etage = 3;
				break;
			case 70 :
				etage = 4;
				break;
			case 10 :
				etage = 5;
				break;
			}
			return etage;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public synchronized int getY()
	{
		return this.y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}

}

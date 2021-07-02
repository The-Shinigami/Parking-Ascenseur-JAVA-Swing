package ascenseur;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Personne extends Thread {
	private JLabel p; // Panel de la personne 
	private JPanel parent; // Panel parent de la personne
	private int etage; // Etage de la personne
	private boolean appel = true; // si la personne a appelé l'ascenseur
	private int etageTo; // La destination de la personne

	public Personne(JLabel p)
	{
		this.p = p;
		this.etage = p.getLocation().y; 
		parent = (JPanel) this.p.getParent();
	}
	
	public int getEtage()
	{
		return this.etage;
	}
	
	public void setEtageTo(int to)
	{
		this.etageTo = goTo(to);
	}
	
	public int getEtageTo()
	{
		return this.etageTo;
	}
	
	public void setAppel(boolean appel)
	{
		this.appel = appel;
	}
	
	public boolean getAppel()
	{
		return this.appel;
	}
	
	public boolean appel(boolean appel)
	{
		return appel;
	}
	
	synchronized void goIn(JPanel as)
	{
		parent.remove(this.p);
		parent.repaint();
		as.add(this.p);
		as.repaint();
		as.revalidate();
	}
	
	synchronized void goOut(JPanel as)
	{
		as.remove(this.p);
		as.repaint();
		if(as.getLocation().x == 240)
			this.p.setBounds(142/*as.getLocation().x - 50*/, as.getLocation().y, 45, 50);
		else if(as.getLocation().x == 305)
			this.p.setBounds(430/*as.getLocation().x + 50*/, as.getLocation().y, 45, 50);
		parent.add(this.p);
		parent.repaint();
		parent.revalidate();
	}
	
	// ----- Cette fonction retourne y d'un étage en lui fournissant le numéro de cet étage -----
	public int goTo(int etage)
	{
		int yEtage = 0;
		switch(etage)
		{
			case 0 :
				yEtage = 310;
				break;
			case 1 :
				yEtage = 250;
				break;
			case 2 :
				yEtage = 190;
				break;
			case 3 :
				yEtage = 130;
				break;
			case 4 :
				yEtage = 70;
				break;
			case 5 :
				yEtage = 10;
				break;
		}
		return yEtage;
	}
	
	// ----- Cette fonction est l'inverse de la précédente, elle retourne le numéro d'un étage en lui fournissant y de cet étege -----
	public int goToInv(int yEtage)
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

}

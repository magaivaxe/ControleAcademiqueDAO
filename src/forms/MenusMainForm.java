/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;



import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import listeners.DelListener;
import listeners.OpenListener;

/**
 *
 * @author eleves
 */
public class MenusMainForm extends JMenuBar
{
    //Jmenus attributions
    private JMenu fichier,edition,outils,ordonner,aide;
    //JMenuItens attributions 
    private JMenuItem nouveau, ouvrir, enregistrer,enregistrerSous,fermer,ajouter,
    modifier,supprimer,rechercher,lister,id,nom,propos;
    //Others menu itens
    private JSeparator separator;
    //Objects assignments
    private OpenListener openListener;
    private DelListener delListener;
    
    public MenusMainForm()
    {
        init();
    }
    
    /**
     * 
     */
    private void init()
    {
        //JMenu Fichier and yours JMenuItens
        nouveau = new JMenuItem();
        nouveau.setText("Nouveau");
        
        ouvrir = new JMenuItem();
        ouvrir.setText("Ouvrir");
        openListener = new OpenListener();
        ouvrir.addActionListener(openListener);
        
        enregistrer = new JMenuItem();
        enregistrer.setText("Enregistrer");
        
        enregistrerSous = new JMenuItem();
        enregistrerSous.setText("Enregistrer sous...");
        
        separator = new JSeparator();
        
        fermer = new JMenuItem();
        fermer.setText("Fermer");
        
        fichier = new JMenu();
        fichier.setText("Fichier");
        
        this.add(fichier);
        fichier.add(nouveau);
        fichier.add(ouvrir);
        fichier.add(enregistrer);
        fichier.add(enregistrerSous);
        fichier.add(separator);
        fichier.add(fermer);
        // --------------------------------
        //JMenu Edition and yours JMenuItens
        ajouter = new JMenuItem();
        ajouter.setText("Ajouter");
        
        modifier = new JMenuItem();
        modifier.setText("Modifier");
        
        supprimer = new JMenuItem();
        supprimer.setText("Supprimer");
        delListener = new DelListener();
        supprimer.addActionListener(delListener);
        
        edition = new JMenu();
        edition.setText("Édition");
        
        this.add(edition);
        edition.add(ajouter);
        edition.add(modifier);
        edition.add(supprimer);
        
        //JMenu Outils and your JMenuItens
        rechercher = new JMenuItem();
        rechercher.setText("Rechercher");
        
        lister = new JMenuItem();
        lister.setText("Lister");
        
        ordonner = new JMenu();
        ordonner.setText("Ordonner");
        
        id = new JMenuItem();
        id.setText("ID");
        
        nom = new JMenuItem();
        nom.setText("Nom");
        
        outils = new JMenu();
        outils.setText("Outils");
        
        this.add(outils);
        outils.add(rechercher);
        outils.add(lister);
        outils.add(ordonner);
        ordonner.add(id);
        ordonner.add(nom);
        
        //JMenu Outils and your JMenuItens
        propos = new JMenuItem();
        propos.setText("À propos");
        
        aide = new JMenu();
        aide.setText("Aide");
        this.add(aide);
        aide.add(propos);
    }
}

package com.ilyas.presentation;

import com.ilyas.dao.Etudiant;
import com.ilyas.dao.EtudiantDAO;
import com.ilyas.dao.EtudiantDAODictionary;
import com.ilyas.metier.EtudiantManager;
import com.ilyas.metier.EtudiantManagerDictionary;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainDictionary {
    public static void main(String[] args) {
        EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();
        EtudiantManagerDictionary etudiantManagerDictionary = new EtudiantManagerDictionary(etudiantDAO);
        // Ajout de quelques étudiants
        Etudiant etudiant1 = new Etudiant("1", "ABDTOUIRSI", "Nouhaila", "n.abdtouirsi.com");
        Etudiant etudiant2 = new Etudiant("2", "BARKAOUI", "Fadoua", "f.barkaoui.com");
        Etudiant etudiant3 = new Etudiant("3", "RAOUI", "Asmae", "a.raoui.com");
        Etudiant etudiant4 = new Etudiant("4", "ROUDANI", "Med", "m.roudani.com");

        etudiantManagerDictionary.addEtudiant(etudiant1);
        etudiantManagerDictionary.addEtudiant(etudiant2);
        etudiantManagerDictionary.addEtudiant(etudiant3);
        etudiantManagerDictionary.addEtudiant(etudiant4);

        // Affichage de tous les étudiants
        System.out.println("Liste des étudiants : ");
        etudiantManagerDictionary.getAllEtudiants().forEach(System.out::println);

        // Mise à jour d'un étudiant
        Etudiant etudiant5 = new Etudiant("5", "BENZAKOUR", "Yassine", "y.benzakour.com");
        etudiantManagerDictionary.updateEtudiant("2", etudiant5);

        // Affichage de tous les étudiants
        System.out.println("Liste des étudiants après mise à jour : ");
        etudiantManagerDictionary.getAllEtudiants().forEach(System.out::println);
    }
}
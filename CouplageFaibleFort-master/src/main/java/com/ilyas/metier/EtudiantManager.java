package com.ilyas.metier;

import com.ilyas.dao.Etudiant;
import com.ilyas.dao.EtudiantDAO;

import java.util.List;

public class EtudiantManager {
    public EtudiantDAO etudiantDAO;
    public Etudiant addEtudiant(Etudiant etudiant) {
        for (Etudiant etudiant1 : etudiantDAO.getAllEtudiants()) {

            if (etudiant1.getEmail().equals(etudiant.getEmail()) ) {
                throw new RuntimeException("Email already exists");
            }
        }
        return etudiantDAO.addEtudiant(etudiant);
    }
    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
    public void setEtudiantDAO(EtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }
}

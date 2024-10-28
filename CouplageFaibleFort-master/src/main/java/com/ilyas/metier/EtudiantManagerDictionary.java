package com.ilyas.metier;

import com.ilyas.dao.Etudiant;
import com.ilyas.dao.EtudiantDAODictionary;
import com.ilyas.dao.IEtudiantDAO;

import java.util.List;
import java.util.Map;

public class EtudiantManagerDictionary {
    public IEtudiantDAO etudiantDAO;

    public EtudiantManagerDictionary(IEtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantDAO.addEtudiant(etudiant);
    }
    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
    public void updateEtudiant(String id, Etudiant etudiant) {
        etudiantDAO.updateEtudiant(id, etudiant);
    }}

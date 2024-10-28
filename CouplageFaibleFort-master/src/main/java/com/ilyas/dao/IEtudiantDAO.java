package com.ilyas.dao;

import java.util.List;

public interface IEtudiantDAO {
    Etudiant addEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiants();
    Etudiant updateEtudiant(String id, Etudiant etudiant);
}

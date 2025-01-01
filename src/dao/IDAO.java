package dao;

import java.util.List;

public interface IDAO<T> {

    // CRUD : Create, Read, Update, Delete
    public boolean creat(T o);  // Create : Ajouter un objet dans la base de données

    public boolean update(T o); // Update : Mettre à jour un objet dans la base de données

    public boolean delete(T o); // Delete : Supprimer un objet de la base de données

    public T findById(int id);  // Read : Lire un objet de la base de données par son id

    public List<T> findAll(); // Read : Lire tous les objets de la base de données





}

package com.mycompany.pawstyle.persistencia;

import com.mycompany.pawstyle.logica.Duenio;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

public class DuenioJpaController implements Serializable {
    
    
    public DuenioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    //Lo unico de código que generé, todo lo otro debería traerlo el persistence
    public DuenioJpaController() {
        emf = Persistence.createEntityManagerFactory("PawStylePU");
    }
    //Acá termina

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Duenio duenio) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(duenio);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<Duenio> findDuenioEntities() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Duenio.class));
            Query q = em.createQuery(cq);
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    
    public void edit(Duenio duenio) throws Exception {
    EntityManager em = null;
    try {
        em = getEntityManager();
        em.getTransaction().begin();
        duenio = em.merge(duenio);
        em.getTransaction().commit();
    } catch (Exception ex) {
        int id = duenio.getId_duenio();
        if (findDuenio(id) == null) {
            throw new Exception("El dueño con id " + id + " no existe.");
        }
        throw ex;
    } finally {
        if (em != null) em.close();
    }
}

public void destroy(int id) throws Exception {
    EntityManager em = null;
    try {
        em = getEntityManager();
        em.getTransaction().begin();
        Duenio duenio;
        try {
            duenio = em.getReference(Duenio.class, id);
            duenio.getId_duenio();
        } catch (Exception enfe) {
            throw new Exception("El dueño con id " + id + " no existe.", enfe);
        }
        em.remove(duenio);
        em.getTransaction().commit();
    } finally {
        if (em != null) em.close();
    }
}

public Duenio findDuenio(int id) {
    EntityManager em = getEntityManager();
    try {
        return em.find(Duenio.class, id);
    } finally {
        em.close();
    }
}
    
    
}

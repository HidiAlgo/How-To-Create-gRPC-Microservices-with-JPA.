package dao;

import domain.Result;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.NoSuchElementException;

public class ResultDao {
    public Result findById(String studentId){

        // We use entity managers to manage our two entities.
        // We use the factory design pattern to get the entity manager.
        // Here we should provide the name of the persistence unit that we provided in the persistence.xml file.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("student-management-system");
        EntityManager em = emf.createEntityManager();

        // We can find a record in the database for a given id using the find method.
        // for the find method we have to provide our entity class and the id.
        Result result = em.find(Result.class, studentId);

        // If there is no record found with the provided student id, then we throw a NoSuchElement exception.
        if(result == null){
            throw new NoSuchElementException("NO DATA FOUND WITH THE ID "+studentId);
        }

        // If everything worked fine, return the result.
        return result;
    }
}

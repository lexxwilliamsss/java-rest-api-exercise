package com.cbfacademy.restapiexercise.ious;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;



@Service
public class IOUService {
    public IOURepository iourepository;
    final List<IOU>ious = new ArrayList<>();
    

    public IOUService(IOURepository iouRepository){
        this.iourepository = iouRepository;
    }


    List<IOU> getAllIOUs() {
    return iourepository.findAll();
    }
    /**
     * Retrieve a list of all IOUs.
     *
     * @return A list of all IOUs.
     */



    /**
     * Retrieve an IOU by its ID.
     *
     * @param id The ID of the IOU to retrieve.
     * @return The IOU with the specified ID, or null if not found.
     */

    public IOU getIOU(UUID id) throws NoSuchElementException{
            return iourepository.findById(id).orElseThrow();
       
    }
    

    /**
     * Create a new IOU.
     *
     * @param iou The IOU object to create.
     * @return The created IOU.
     */
    public IOU createIOU(IOU iou) throws IllegalArgumentException, OptimisticLockingFailureException{
         return iourepository.save(iou);
       
    }

    /**
     * Update an existing IOU by its ID.
     *
     * @param id         The ID of the IOU to update.
     * @param updatedIOU The updated IOU object.
     * @return The updated IOU, or null if the ID is not found.
     */
    public IOU updateIOU(UUID id, IOU updatedIOU) throws NoSuchElementException {
        if(!iourepository.existsById(id)) {
            throw new NoSuchElementException("Id is not found");
        }
       return iourepository.save(updatedIOU);
    }

    /**
     * Delete an IOU by its ID.
     *
     * @param id The ID of the IOU to delete.
     */
    void deleteIOU(UUID id) throws NoSuchElementException {
        if(!iourepository.existsById(id)){
            throw new NoSuchElementException("id is not found");
        }
        iourepository.deleteById(id);
    }

}

    


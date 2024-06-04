package com.cbfacademy.restapiexercise.ious;


import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;



// @Repository

public interface IOURepository extends ListCrudRepository<IOU, UUID>{
//  public final IOURepository iouRepository;

//  private final List<IOU> ious = new ArrayList<>();
 
public List<IOU> searchByBorrower(String name);
    // List<IOU> result = new ArrayList<>();
    // for (IOU iou : ious){
    //     if (iou.getBorrower().equals(name)){ 
    //         result.add(iou);
    //     }
    // }
    // return result;  


public List<IOU> searchByLender(String name);
    // List<IOU> result = new ArrayList<>();
    // for (IOU iou : ious){
    //     if (iou.getLender().equals(name)){ 
    //         result.add(iou);
    //     }

    // }
    // return result; 


// //public List<IOU> findAll() throws UnsupportedOperationException {
//     try {
//        return new ArrayList<>(ious);
//     }catch (Exception e) {
//         throw new UnsupportedOperationException("Unimplemeted method findAll", e); }
//     }
//     //DO Auto-generated method stub

// public IOU save(IOU iou) throws UnsupportedOperationException {
//     try {
//         for(int i=0; i< ious.size(); i++){
//             if (ious.get(i) != null)getId(equals(iou.getId())); {
//                 ious.set(i, iou);
//                 return iou;

//             }
//         }

//         ious.add(iou);
//         return iou;
//     } catch(Exception e){
//         throw new UnsupportedOperationException("Unimplemented method 'save'", e);
//     }
   
// }

// private void getId(boolean equals) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'getId'");
// }

// public boolean existsbyId(UUID id) throws UnsupportedOperationException{
//     try{
//         return ious.stream().anyMatch(iou -> iou.getId().equals(id));
//     } catch (Exception e){
//         throw new Exception("Error checking existance of IOU by id", e);
//     }
// }

// public static void main(String[] args) {
//     try{
//         IOURepository repository = new IOURepository();
//         UUID id1 = UUID.randomUUID();
//         IOU iou1 = new IOU(id1, "Alice", "Bob");
//         repository.save(iou1);
//         System.out.println("IOU saved:" + iou1.getBorrower() + "owes" + iou1.getLender());

//         System.out.println("IOU exsits" + repository.existsbyId(id1));

//         List<IOU> allIous = repository.findAll();
//         System.out.println("All IOUs:" + allIous.size());

//     }catch (Exception e){
//         e.printStackTrace();
//     }
        
//     }

// @Override
// public void store(T r) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'store'");
// }

// @Override
// public T retrieve(int id) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'retrieve'");
// }

// @Override
// public T search(String name) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'search'");
// }

// @Override
// public T delete(int id) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'delete'");
// }
// }




/**
 * The IOURepository interface defines the operations for managing IOUs in the system.
 * It provides methods for retrieving, saving, updating, and deleting IOU records.
 */


    /**
     * Searches for IOUs where the borrower's name matches the provided string.
     *
     * @param name the name of the borrower
     * @return a list of IOUs that match the borrower's name
     */
   

    /**
     * Searches for IOUs where the lender's name matches the provided string.
     *
     * @param name the name of the lender
     * @return a list of IOUs that match the lender's name
     */
    

}

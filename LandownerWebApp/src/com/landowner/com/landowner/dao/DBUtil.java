// LandownerDAO.java
package com.landowner.dao;

import java.util.List;
import com.landowner.models.Landowner;

public interface LandownerDAO {
    boolean addLandowner(Landowner landowner);
    boolean updateLandowner(Landowner landowner);
    boolean deleteLandowner(int id);
    Landowner getLandownerById(int id);
    List<Landowner> getAllLandowners();
}
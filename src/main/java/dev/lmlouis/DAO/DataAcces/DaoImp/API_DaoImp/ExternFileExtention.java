package dev.lmlouis.DAO.DataAcces.DaoImp.API_DaoImp;

import dev.lmlouis.DAO.SharedProject.Idao.IExtentionManager;

public class ExternFileExtention implements IExtentionManager {
    @Override
    public boolean isValid(String filename) {
        if(filename.contains(".TLS")){
        return true;
        }
        return false;
    }
}
package dev.lmlouis.DAO.DataAcces.DaoImp.TestDaoImp;

import dev.lmlouis.DAO.SharedProject.Idao.IExtentionManager;

public class FakeExternFileExtention implements IExtentionManager {
    @Override
    public boolean isValid(String filename) {
        return true;
    }
}

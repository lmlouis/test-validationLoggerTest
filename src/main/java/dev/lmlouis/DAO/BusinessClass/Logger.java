package dev.lmlouis.DAO.BusinessClass;

import dev.lmlouis.DAO.SharedProject.Idao.IExtentionManager;

public class Logger {
    final IExtentionManager _Ief;

    // injection de dépendance
    public Logger(IExtentionManager ief) {
        _Ief = ief;
    }

    public boolean isValidlogfile(String filename){
        return _Ief.isValid(filename);
    }
}

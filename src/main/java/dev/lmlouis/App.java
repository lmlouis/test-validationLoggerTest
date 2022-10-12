package dev.lmlouis;

import dev.lmlouis.DAO.BusinessClass.Logger;
import dev.lmlouis.DAO.DataAcces.DaoImp.API_DaoImp.ExternFileExtention;

/**
 * Hello world!
 *
 */
public class App 
{
    // Injection de dépendance
    static final ExternFileExtention _Efe =new ExternFileExtention();
    static final Logger _logger=new Logger(_Efe);

    public static void main( String[] args )
    {
        System.out.println(_logger.isValidlogfile("file.TLS"));
    }
}

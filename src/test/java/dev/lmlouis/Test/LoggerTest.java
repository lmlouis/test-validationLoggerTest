package dev.lmlouis.Test;


import dev.lmlouis.DAO.BusinessClass.Logger;
import dev.lmlouis.DAO.DataAcces.DaoImp.TestDaoImp.FakeExternFileExtention;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerTest  {

    @Test
    public void Isvalidlogfile_goodextention_returnTrue(){
        //arrange (input)
        String data = "file.log";
        // injection de dépendance
        Logger _logger=new Logger(new FakeExternFileExtention());

        // action (output)
        boolean result = _logger.isValidlogfile(data);
        // asssert (attente)
        assertTrue(result);

    }
}

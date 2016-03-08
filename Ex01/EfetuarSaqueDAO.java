
package Ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javaapplication1.ConnectionFactory;

public class EfetuarSaqueDAO {
    
    public void sacar(EfetuarSaqueTO to){
        String sqlUpdate = "UPDATE efetuar saque SET agencia=?, conta=?, saldo=?, saque=? WHERE id=?";
        
        try (Connection conn = ConnectionFactory.obtemConexao();
                PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
            stm.setString(1, to.getAgencia());
            stm.setString(2, to.getConta());
            stm.setDouble(3, to.getSaldo());
            stm.setDouble(4, to.getSaque());
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}

package Ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javaapplication1.ConnectionFactory;

public class ConsultarExtratoDAO {

    public ConsultarExtratoTO consultar(String agencia, String conta, double saldo, double extrato) {
        ConsultarExtratoTO to = new ConsultarExtratoTO(agencia, conta, saldo, saldo);
        String sqlSelect = "SELECT agencia, conta, saldo, extrato FROM consultarExtrato WHERE consultar.agencia = ?, consulta.conta = ?";
        try (Connection conn = ConnectionFactory.obtemConexao();
                PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
            stm.setString(1, agencia);
            try (ResultSet rs = stm.executeQuery();) {
                if (rs.next()) {
                    to.setAgencia(rs.getString("agencia"));
                    to.setConta(rs.getString("conta"));
                    to.setSaldo(rs.getDouble("Saldo"));
                    to.setExtrato(rs.getDouble("Extrato"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e1) {
            System.out.print(e1.getStackTrace());
        }
        return to;
    }

}

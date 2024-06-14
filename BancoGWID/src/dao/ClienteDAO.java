package dao;

import View.FromCadastroView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

public class ClienteDAO {
    private final Connection connection;

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }
    public void insert(Cliente cliente) throws SQLException{       
            String sql = "insert into tb_clientesbc(nome, conta, senha, celular, cpf) values('"+cliente.getNome()+"', '"+cliente.getConta()+"', '"+cliente.getSenha()+"', '"+cliente.getCelular()+"', '"+cliente.getCpf()+"'); ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();
            
            
       
    }
}

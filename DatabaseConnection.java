package org.example.tool;

import java.sql.*;
import java.util.logging.Logger;


public class DatabaseConnection {

    private static Connection connection;
    private Logger logger = Logger.getLogger(this.getClass().getName());

    public Connection getConnection() {

        try {
            if(connection == null || connection.isClosed()){
                connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/andrea/IdeaProjects/tool/tool.sqlite");
                logger.info("Database connection established");
            }

        } catch (SQLException e) {
            logger.info(e.toString());


            }


        return connection;
    }

        public void insert(String nome , String azienda){
        getConnection();
        String query = "insert into personale (nome,azienda) values (?,?)";
        try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, nome);
            statement.setString(2,azienda);
            statement.executeUpdate();
            logger.info("Insert into personale successfully");


        }catch(SQLException e){
            logger.info(e.toString());
        }

        }

        public void delete (String nome , String azienda){
        getConnection();
        String query = "delete from personale where nome =? and azienda=?";
        try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, nome);
            statement.setString(2,azienda);
            statement.executeUpdate();
            logger.info("Delete into personale successfully");

        }catch(SQLException e){
            logger.info(e.toString());
        }

        }

        public void update(String nome , String azienda){
        getConnection();
        String query = "update personale set azienda =? where nome =? ";
        try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, azienda);
            statement.setString(2,nome);
            statement.executeUpdate();
            logger.info("Update into personale successfully");

        }catch(SQLException e){
            logger.info(e.toString());
        }




        }

    public String selectById(int id) {
        getConnection();
        String query = "SELECT nome, azienda FROM personale WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);

            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String azienda = rs.getString("azienda");

                    logger.info("Select by id successfully");
                    return nome + " - " + azienda;
                }
            }

        } catch (SQLException e) {
            logger.info(e.toString());
        }

        return null;
    }

    public void updateById(int id, String azienda ){
        getConnection();
        String query = "UPDATE personale SET azienda = ?  WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, azienda);

            statement.setInt(2, id);


            statement.executeUpdate();
            logger.info("Update by id into personale successfully");
        } catch (SQLException e) {
            logger.info(e.toString());
        }
    }


    }








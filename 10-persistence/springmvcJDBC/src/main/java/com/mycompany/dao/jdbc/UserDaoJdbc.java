package com.mycompany.dao.jdbc;

import com.mycompany.dao.UserDao;
import com.mycompany.domain.User;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoJdbc implements UserDao {
    private JdbcOperations jdbcOperations;

    public UserDaoJdbc(JdbcOperations jdbcOperations){
        this.jdbcOperations = jdbcOperations;
    }

    public User getUser(long userId){
        return jdbcOperations.queryForObject("SELECT * FROM users WHERE id=?;", new UserRowMapper(), userId);
    }

    public void addUser(User user) {
        jdbcOperations.update(
                "INSERT INTO users (username, password, email) VALUES (?,?,?);",
                user.getUsername(),
                user.getPassword(),
                user.getEmail()
        );
    }

    public void updateUser(User user) {

    }

    public void deleteUser(long userId) {

    }

    public static final class UserRowMapper implements RowMapper<User> {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException{
            User userFromDB = new User(
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("email")
            );

            userFromDB.setId(rs.getLong("id"));
            return userFromDB;
        }
    }

}

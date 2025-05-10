package org.example.springherojava24.core.beans;

public class JdbcUserRepositoryImpl implements UserRepository
{
    private SimpleDataSource dataSource;
    @Override
    public void saveUser(String username) {
dataSource.connect();
        System.out.println("JdbcUserRepository: Saving user '" + username + "' using DataSource: " + dataSource.getConnectionUrl());


    }

    public JdbcUserRepositoryImpl(SimpleDataSource dataSource) {
        this.dataSource = dataSource;
        System.out.println("JdbcUserRepository: Constructor called. DataSource injected: " + (dataSource != null));
    }
}

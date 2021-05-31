package com.talhatoprak.springbootmicroserviceproduct.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassandraConfiguration extends AbstractCassandraConfiguration {
    @Value("$(microservice.cassandra.keyspace-name)")
    private String keyspaceName;

    @Value("$(microservice.cassandra.contact-point)")
    private String contactPoint;

    @Value("$(microservice.cassandra.port)")
    private int port;

    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
    }
    protected String getContactPoint() {
        return contactPoint;
    }
    @Override
    protected int getPort() {
        return port;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }
}

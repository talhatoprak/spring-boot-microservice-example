CREATE KEYSPACE product
    WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 3};
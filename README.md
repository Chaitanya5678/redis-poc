# redis-poc

This is a sample spring boot application with integrations such as redis cache, spring data jpa and postgresql database

Make sure you configure the postgresql database with all the necessary permissions to the dbuser

The following commands must be executed in psql console to support auto generated values for id column in the sample student model used in this code

CREATE SEQUENCE hibernate_sequence START 1;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO blackops;

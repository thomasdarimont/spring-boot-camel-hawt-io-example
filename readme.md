# PoC for Spring Boot HawtIO + Camel integration

## Run
Start with specific JAAS login.config for HAWTIO
```
-Djava.security.auth.login.config=target/classes/jaas/login.config
```

## Access hawtio
http://localhost:57777/hawtio/

Username: admin
Password: admin

If local connection is missing then you need to create a new Connection.
*) Connect
*) Create Connection
**) Settings
```
name: localhost
scheme: http
host: localhost
port: 57777
path: /jolokia
```
**) Save
**) Connect to remote server

### Example URL for local JVM connection
http://localhost:57777/hawtio/index.html#/jvm/connect

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
1) Connect
2) Create Connection
2.1) Settings
name: localhost
scheme: http
host: localhost
port: 57777
path: /jolokia^

2.2) Save
2.3) Connect to remote server

 

package jm.stockx.http.service.configuration;

public interface HttpClientConfigConstants {

    // Connection pool
    int MAX_TOTAL_CONNECTIONS     = 40;
    int MAX_LOCALHOST_CONNECTIONS = 80;

    // Keep alive
    int DEFAULT_KEEP_ALIVE_TIME = 20 * 1000; // 20 sec

    // Timeouts
    int CONNECTION_TIMEOUT = 30 * 1000; // 30 sec, the time for waiting until a connection is established
    int REQUEST_TIMEOUT    = 30 * 1000; // 30 sec, the time for waiting for a connection from connection pool
    int SOCKET_TIMEOUT     = 60 * 1000; // 60 sec, the time for waiting for data
}
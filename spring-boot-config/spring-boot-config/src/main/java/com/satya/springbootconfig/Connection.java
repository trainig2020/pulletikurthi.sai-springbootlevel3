package com.satya.springbootconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties("db")
public class Connection {

	private String connection;
	private String host;
	private int port;
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public Connection(String connection, String host, int port) {
		super();
		this.connection = connection;
		this.host = host;
		this.port = port;
	}
	public Connection() {
		super();
	}
	
}

#stage 1
FROM tomcat:11.0.0-jdk17

#Mount point
VOLUME /usr

# Copy the WAR file to the webapps directory
COPY target/myWAR.war /usr/local/tomcat/webapps/

# Start Tomcat
CMD ["catalina.sh", "run"]

# Add a non-root user
#RUN useradd -m tomcat

# Change ownership of the webapps directory to the tomcat user
#RUN chown -R tomcat:tomcat /usr/local/tomcat/webapps

# Run Tomcat as the tomcat user
#USER tomcat
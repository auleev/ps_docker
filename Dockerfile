#Use the openjdk
FROM openjdk:11
#create a new app directory for my application files
RUN mkdir /app
#Copy the app files form host machine to image filesystem
COPY out/production/HelloWorldDocker/ /app
#Set the directory for executing future commands
WORKDIR /app
#Run the main class
CMD java com.auleev.pluralsight.Main
# motherbird

## server start
#### for forground
```bash
motherbird$ ./gradlew tomcatRun --no-daemon 
```
You can stop server to use CTRL + C

#### for background
```bash
motherbird$ ./gradlew tomcatRun --daemon 
```
In these case you have to stop all running gradle daemons to stop the server, Like this
```bash
motherbird$ ./gradlew --stop
```
or use 'ps -ef | grep gradle' and kill the process by PID

## ~~server end.~~
```bash
motherbird$ ./gradlew tomcatStop
# This command doesn't works now! Gradle daemon bind ports for ajp and http protocol but It never release the ports when it terminate.
```

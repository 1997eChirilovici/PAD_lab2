# springboot-rabbitmq-example
How to use RabbitMQ with Publisher and Consumer Example

Install RabbitMQ in windows :
-----------------------------
1. Download and install ERlang http://erlang.org/download/otp_win64_22.3.exe
2. Downlaod and install RabbitMQ https://github.com/rabbitmq/rabbitmq-server/releases/download/v3.8.8/rabbitmq-server-3.8.8.exe
3. Go to RabbitMQ Server install Directory C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.3\sbin
4. Run command rabbitmq-plugins enable rabbitmq_management
5. Open browser and enter http://localhost:15672/ to redirect to RabbitMQ Dashboard
6. Also we can Open it with IP Address http://127.0.0.1:15672
7. Login page default username and password is guest 
8. After successfully login you should see RabbitMQ Home page

**Note**: In case of  "_Authentication failed (rejected by the remote node), check the Erlang cookie_"
1. In file explorer navigate to your user directory by pasting %userprofile% in your address bar.
2. In case if already .erlang.cookie file available in that location, just delete it otherwise go to the next step.
3. In a second File Explorer, navigate to C:\Windows\System32\config\systemprofile.
4. Find the file .erlang.cookie and copy it to your user directory.
5. Now your rabbitmqctl should be able to authenticate.

Or

Open C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.8\sbin and run the following commands to create the user **quest** with password **quest**

1. rabbitmqctl add_user 'quest' 'quest'
2. rabbitmqctl set_user_tags quest administrator
3. rabbitmqctl set_permissions -p / quest ".*" ".*" ".*"

Or

1. copy the .erlang.cookie file from C:\Windows\System32\config\systemprofile paste it into 
C:\Users\["your user nameusername"] folder
2. run rabbitmq-service.bat stop and rabbitmq-service.bat start


Useful links
* https://www.rabbitmq.com/access-control.html
* https://stackoverflow.com/questions/22850546/cant-access-rabbitmq-web-management-interface-after-fresh-install
* https://stackoverflow.com/questions/47874958/rabbitmq-failed-to-start-tcp-connection-succeeded-but-erlang-distribution-faile
* https://stackoverflow.com/questions/47893899/authentication-failed-rejected-by-the-remote-node-please-check-the-erlang-coo

1) Create a spring boot app.
2) Create a project jar file.
	-Do maven clean and install , then you will get automatica jar file in target folder.
3) Create docker file.
	-Right click on root of project and create fle with name Dockerfile.
	-Write instructions int it.
4) Open cmd and pass command 'wsl' to open docker.And give password.
5)Then to build docker iamge , first traverse o your project location by `cd C:\Users\shruti\Documents\JAVA_LEARNING\SimpleREST`.
6) Pass command, `docker build . -t rest-app` , here rest-app is my docker iamge name.
7) Now we can see our docker image by passing command `docker images`.
8) Now to run this docker image. We can pass `docker run -p 8081:8081 rest-app`.
	```
	NOTE: - Docker iamge build will be done from project's path but we can find or run our docker image from any path ,
		     Not needed to be in project's path to run our docker image.
		     ```
:) Now our rest-api docker image is running, we can pass REST endpoint (i.e. 8081/rest) to check it on postman/browser.


TO RUN DOCKER IMAGE:
1.write `wsl` on cmd
2.enter password
3.cmd `docker images`	=>wil retrun all images present 
4.cmd `docker run -p <defaultPortNumber:defaultPortNumber> <image name>`.

TO PUSH IMAGE INTO DOCKER HUB:
1. First enter docker hub.
2. Now create a repository here.
3. Now login to docker through cmd..
4. Give tag to your image:
					cmd->	`docker tag <image-name> <dockerHub'sReposistoryName>:<tag-name>`
5. Then push tag to docker hub:
					cmd->	`docker push <repositoryName>:<tag-name>`
:) Now any one can pull our docker image from docker hub and can run it on thier system. To pull image from docker hub command:
					cmd->	`docker pull<repositoryName>:<tag-name>`






NOTE
---------
* `docker rmi <repositoryName>:<tag>` -> delete image
* `docker ps` -> list of all running containers(with your image inside)
* `docker stop <containerName>`-> Stop running container
* `docker rm -f $(docker ps -aq)` -> remove all running containers.
* `docker volume ls` -> list all volumes
* `docker volume rm <volume_name>` -> delete volume(as remove all tables details from mysql)

CASES:
Case1:
::::::::::	Here suppose we have removed our image from our system. And we are trying to run the same image.
		Then it will docker will first check for image in local and as the image is not there so it will , check that image(with perticular)
		tag in Docker hub(Registry) for same image and pull it automatically(if present in hub) and run it.

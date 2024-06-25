[JAVA_BADGE]:https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white[MONGO_BADGE]:https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white
[AWS_BADGE]:https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white


<h1 align="center" style="font-weight: bold;">api-eventos-angola💻</h1>


![AWS][AWS_BADGE]
![spring][SPRING_BADGE]
![java][JAVA_BADGE]

`Content:`
<ul>
  <li><a href="#about">About</a></li>
  <li><a href="#mainFeatures">Main Features</a></li>
  <li><a href="#gettingStarted">Getting Started</a></li>
    <ul>
      <li><a href="#preRequisites">Prerequisites</a></li>
      <li><a href="#cloning">Cloning and Running</a></li>
    </ul>
  <li><a href="#routes">API Endpoints</a></li>
  <li><a href="#colab">Collaborators</a></li>
  <li><a href="#contribute">Contribute</a></li>
  <li><a href="#license">License</a></li>
</ul>



<p align="center">
    <img src="./assets/images/rh-assistant1.PNG" alt="Image Example" width="400px">
</p>

<h2 id="about">📌 About</h2>
Welcome to the Eventos Angola API repository, a robust and scalable system for advertising and purchasing event tickets. 
This project is developed using Spring Boot in Java and offers comprehensive functionalities for managing events, addresses, coupons, participants, organizations, and more. The API supports full CRUD operations on all entities and includes advanced pagination and search features.


<h2 id="mainFeatures">Main Features</h2>

- <strong>Event Management:</strong> Create, read, update, and delete events.
- <strong>Addresses:</strong> Maintain addresses associated with events.
- <strong>Coupons: </strong>Manage discount coupons.
- <strong>Participants:</strong> Register and manage event participants.
- <strong>Organizations:</strong> Manage organizations that promote events.
- <strong>Pagination and Search:</strong> Efficient pagination and search system to facilitate navigation and information retrieval.


<h2 id="started">🚀 Getting started</h2>
This section describes how to run the project locally.

<h3 id="preRequisites">Prerequisites</h3>

Ensure you have the following prerequisites installed:

- Java 17 or higher
- Maven
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok

<h3 id="cloning">Cloning and Running</h3>

To clone this project you follow these steps:

1. Clone the project from repository:
```bash
git clone https://github.com/EriveltoSilva/api-eventos-angola.git
```

2. Navigate to the project directory and install the required dependencies.
```bash
cd api-eventos-angola
```
3. Compile and run the application:
```bash
mvn spring-boot:run
```

4. Access the API documentation:
   - Go to http://localhost:8080/swagger-ui.html to view and interact with the API.

   
<h3> Environment Variables</h2>


<h2 id="routes">📍 API Endpoints</h2>

Here you can list the main routes of your API, and what are their expected request bodies.
​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /authenticate</kbd>     | retrieves user info see [response details](#get-auth-detail)
| <kbd>POST /authenticate</kbd>     | authenticate user into the api see [request details](#post-auth-detail)

<h3 id="get-auth-detail">GET /authenticate</h3>

**RESPONSE**
```json
{
  "name": "Fernanda Kipper",
  "age": 20,
  "email": "her-email@gmail.com"
}
```

<h3 id="post-auth-detail">POST /authenticate</h3>

**REQUEST**
```json
{
  "username": "fernandakipper",
  "password": "4444444"
}
```

**RESPONSE**
```json
{
  "token": "OwoMRHsaQwyAgVoc3OXmL1JhMVUYXGGBbCTK0GBgiYitwQwjf0gVoBmkbuyy0pSi"
}
```

<h2 id="colab">🤝 Collaborators</h2>

Special thank you for all people that contributed for this project.

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/125351173?v=4" width="100px;" alt="Erivelto Silva Profile Picture"/><br>
        <sub>
          <b>Erivelto Silva</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

<h2 id="contribute">📫 Contribute</h2>

Contributions are welcome! To contribute to this project:
1. Fork the repository `git clone https://github.com/EriveltoSilva/api-eventos-angola.git`
2. Create a new branch (git checkout -b feature/new-feature)
3. Commit your changes (git commit -am 'Add new feature') following commit patterns
4. Push to the branch (git push origin feature/new-feature)
5. Open a Pull Request explaining the problem solved or feature made, if exists, append screenshot of visual modifications and wait for the review!

<h2 id="license">📫 License</h2>

This project is licensed under the MIT License. See the <a href="./LICENSE">LICENSE file</a> for more information.
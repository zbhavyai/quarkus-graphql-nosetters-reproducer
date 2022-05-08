## REST

1. POST

   ```
   $ curl -X POST -H "Content-Type: application/json" -d '{"title": "Test title", "episode": "9", "director": "Test director", "releaseDate": "2022-05-07"}' http://localhost:8080/rest/
   ```

2. GET

   ```
   $ curl -X GET http://localhost:8080/rest/allFilms
   ```

3. DELETE

   ```
   $ curl -X DELETE http://localhost:8080/rest/1
   ```

## GraphQL

1. POST

   ```
   $ curl -g -X POST -H "Content-Type: application/graphql" -d 'mutation createMyFilm {
       addFilm(f: {
           title: "Test title",
           episode: "9",
           director: "Test director",
           releaseDate: "2022-05-07"
       }
   )
   }' http://localhost:8080/graphql
   ```

2. GET

   ```
   $ curl -g -X POST -H "Content-Type: application/graphql" -d "query getMeAllFilms {
       allFilms {
           director
           episode
           releaseDate
           title
       }
   }" http://localhost:8080/graphql
   ```

3. DELETE

   ```
   $ curl -g -X POST -H "Content-Type: application/graphql" -d "mutation deleteMyFilm {
       deleteFilm(id: 1)
   }" http://localhost:8080/graphql
   ```

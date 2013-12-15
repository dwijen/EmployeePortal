theaterApp.controller("MoviesCtrl", function ($scope, $http){
    $http.get("/EmployeePortal/rest/EmployeeService/data")
        .then(function(results){
            //Success;
			console.log("results" + results);
           			        
            $scope.movies = results.data.movie;
        }, function(results){
            //error
            console.log("Error: " + results.data + "; " + results.status);
        });

    $scope.addNewMovie = function(movieName){
        var movie = {name: movieName};
        $scope.movies.splice(0, 0, movie);
    };
});
angular.module("searchModule", ["ngRoute"])
    .config(function ($routeProvider) {
        $routeProvider
            .when("/profile", {
                templateUrl: "profile.htm",

            })

    })


    .controller('SearchController', function ($scope, $http) {



        $scope.search = function (value) {
            $http.get('api/find/' + value).then(function (response) {
                $scope.results = response.data;

            });
        };

        $scope.ProfileView = function (value) {

            $http.get('api/id/' + value).then(function (response) {
                $scope.ProfileData = response.data;
                $scope.profileId = value;
            });

        };



        $scope.searchAll = function (Country,City,Price,gender) {
            if(!Country || Country == '') Country = 'undefined';
            if(!City || City == '') City = 'undefined';
            if(!Price || Price == '') Price = 'undefined';
            if(!gender || gender == '') Country = 'undefined';


            $http.get('api/search?country=' + Country + '&city=' +City + '&price=' + Price + '&gender=' + gender).then(function (response) {
                $scope.results = response.data;

            });

        };


    });







/**
 * Created by grupo-becm on 1/25/16.
 */

angular.module('CapitalBusApp').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise("/");

    $stateProvider
        .state('brazalete.generar', {
            url: "/generar-brazaletes",
            templateUrl: "angularjs-app/views/bracelet/generate.gsp",
            data: {pageTitle: 'Brazaletes', pageSubTitle: 'Generación de Brazaletes'},
            controller: "BraceleteGenerateController"
        })
}]);
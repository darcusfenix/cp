/**
 * Created by grupo-becm on 1/25/16.
 */
angular.module('CapitalBusApp').controller('SalesmanSearchController', function ($rootScope, $scope, $http, $timeout, Vendedor) {
    $scope.$on('$viewContentLoaded', function () {
        App.initAjax();
    });
    $scope.vendedorList = null;
    $scope.q;

    $scope.getVendedores = function () {
        $scope.vendedores = Vendedor.getByEmail({
            'q': $scope.q
        }, function (data) {
            $scope.vendedorList = data;
        }, function (err) {
            console.log(err)
        });
    };

});
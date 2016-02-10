/**
 * Created by becm on 2/10/16.
 */

function BraceleteGenerateController($rootScope,
                                     $scope,
                                     $http,
                                     $timeout,
                                     $stateParams,
                                     Salesman){

    $scope.$on('$viewContentLoaded', function () {
        App.initAjax();
        $scope.getThisSalesman();
    });

    $scope.getThisSalesman = function () {

        App.blockUI(
            {
                target: "#generar-pulseras",
                boxed: !0,
                message: "Cargando..."
            },{
                target: "#datos-personales",
                boxed: !0,
                message: "Cargando..."
            });
        $scope.vendedor = Salesman.get({id: $stateParams.id}, function (data) {
            $scope.vendedor = data;
            App.unblockUI("#datos-personales");
            $scope.getCostosPulsera();
        }, function (err) {
            $scope.error.flag = true;
            $scope.error.message = err.data.message;
        });

    };


}
'use strict';

/**
 * @ngdoc function
 * @name pgradoApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the pgradoApp
 */
angular.module('pgradoApp')
  .controller('AboutCtrl', function ($scope) {
    $scope.models = {
        selected: null,
        templates: [
            {type: "item",   id: 1, name:"item",      landmark:false, default:false},
            {type: "column", id: 2, name:"container", landmark:false, default:false, children: [[]]},
            {type: "column", id: 3, name:"container", landmark:false, default:false, children: [[], []]},
            {type: "column", id: 4, name:"container", landmark:false, default:false, children: [[], [], []]},
            {type: "column", id: 5, name:"container", landmark:false, default:false, children: [[], [], [], []]}
        ],
        result: [
        ]
    };

    $scope.$watch('models.result', function(model) {
        $scope.modelAsJson = angular.toJson(model, true);
    }, true);

  });

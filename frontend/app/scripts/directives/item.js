'use strict';

/**
 * @ngdoc directive
 * @name frontendApp.directive:item
 * @description
 * # item
 */
angular.module('pgradoApp')
  .directive('item', function () {
    return {
      restrict: 'E',
      scope: {
      	item: "=item"
      },
      link: function postLink(scope, element, attrs) {
        element.text(scope.item);
      }
    };
  });

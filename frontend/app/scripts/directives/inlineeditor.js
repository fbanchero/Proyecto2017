'use strict';

/**
 * @ngdoc directive
 * @name frontendApp.directive:inlineEditor
 * @description
 * # inlineEditor
 */
angular.module('pgradoApp')
  .directive('inlineEditor', function () {
    return {
	    restrict: 'E',
	    scope: {
	      valueText: '=ngModel'
	    },
	    controller: function ($scope) {
	      $scope.editing = false;
	      
	      $scope.switchToEditMode = function () {
	        $scope.newValue = $scope.valueText;
	        $scope.editing = true;
	      };
	      
	      $scope.switchToNormalMode = function () {
	        $scope.newValue = '';
	        $scope.editing = false;
	      };
	      
	      $scope.sendNewValue = function () {
	        $scope.editing = false;
	        $scope.valueText = $scope.newValue;
	      }
	    },
	    template: '<div>' +
	                '<div ng-hide="editing">' +
	                  '<div ng-dblclick="switchToEditMode()">{{ valueText }}</div>' +
	                '</div>' +
	                '<div ng-show="editing">' +
	                  '<input type="text" on-enter="sendNewValue()" ng-blur="switchToNormalMode()" ng-model="newValue" autofocus>' +
	                '</div>' +
	              '</div>'
	  }
  });

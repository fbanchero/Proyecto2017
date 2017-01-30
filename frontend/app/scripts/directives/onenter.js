'use strict';

/**
 * @ngdoc directive
 * @name frontendApp.directive:onEnter
 * @description
 * # onEnter
 */
angular.module('pgradoApp')
  .directive('onEnter', function () {
  	
    var ENTER_KEY = 13;
	return {
		scope: {
		  expressionFn: '&onEnter'
		},
		link: function (scope, element) {
		  element.on('keypress', function (e) {
		    if (e.which === ENTER_KEY) {
		      scope.$apply(function () {
		        scope.expressionFn({ $event: e });
		      });
		    }
		  });
		}
	};
  });



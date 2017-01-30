'use strict';

/**
 * @ngdoc directive
 * @name frontendApp.directive:filesaver
 * @description
 * # filesaver
 */
angular.module('pgradoApp')
	.directive('onReadFile', function ($parse) {
        return {
            restrict: 'A',
            scope: false,
            link: function(scope, element, attrs) {
                element.bind('change', function(e) {

                    var onFileReadFn = $parse(attrs.onReadFile);
                    var reader = new FileReader();

                    reader.onload = function() {

                        var fileContents = reader.result;
                        scope.$apply(function() {
                            onFileReadFn(scope, {
                                'contents' : fileContents
                            });
                        });

                        var mockup = JSON.parse(fileContents);
                        scope.models.result = mockup;
                        scope.models.pageSelected = mockup.pages[0].id;

                        // manual refresh
                        $("#main").trigger("click");

                    };

                    reader.readAsText(element[0].files[0]);
                });
            }
        };
    })
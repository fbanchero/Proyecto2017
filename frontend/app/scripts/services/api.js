'use strict';

/**
 * @ngdoc service
 * @name pgradoApp.api
 * @description
 * # api
 * Service in the pgradoApp.
 */
angular.module('pgradoApp')
  .service('api', function ($http) {

	var HOST_URL = 'http://localhost:4567';

	$http.defaults.headers.post['Content-Type'] = 'application/json';

    return {

    	getIfml: function(modelAsJson) {

    		return $http.post(HOST_URL + '/getIfml', modelAsJson);

    	}

    }

  });

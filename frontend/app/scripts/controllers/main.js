'use strict';

/**
 * @ngdoc function
 * @name pgradoApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the pgradoApp
 */



  var app = angular.module('pgradoApp');

  app.controller('MainCtrl', ['$scope', '$sce','api', 'FileSaver',  function ($scope, $sce, api, FileSaver) {

        var chance = new Chance(),
            firstPageId = chance.bb_pin(),
            domainModelId = chance.bb_pin(),
            currentPageNumber = 1,
            currentModalNumber = 0,
            innerPageName = chance.bb_pin();

        $scope.tabs = {}

        $scope.models = {
            selected: null,
            pageSelected: firstPageId,
            events: [
                { type: 'onClick', link: '' },
                { type: 'onDoubleClick', link: '' },
                { type: 'onRightClick', link: '' },
                { type: 'onHover', link: '' }
        ],
        eventSelected: { type: 'onClick', link: '' },
        templates: {
            simple: [
                { type: 'text', id: chance.bb_pin(), name:'text', properties: { value:'text', fontSize:'15' }, events: [] },
                { type: 'button', id: chance.bb_pin(), name:'button', properties: { align: 'center', value: 'Button' }, events: [] },
                { type: 'image', id: chance.bb_pin(), name:'image', properties: { align: 'left', url: '', width: '100' }, events: [] },
                { type: 'video', id: chance.bb_pin(), name:'video', properties: { align: 'left', url: '', width: '640', height: '360' }, events: [] },
                { type: 'table', id: chance.bb_pin(), name:'table', properties: { entity: '0', attributes: []}, events: [ { type: 'onSelect', link: '' } ] },
                { type: 'details', id: chance.bb_pin(), name:'details', properties: { entity: '0', attributes: []}, events: [] },
                { type: 'tabs', id: chance.bb_pin(), name:'tabs', properties: { xor: true }, contSelected:innerPageName, events: [], children: [[
                        { type: 'column', name:'Tab 1','id': innerPageName, 'properties': { 'default': true, 'landmark': false }, 'children': [[]] },
                        { type: 'column', name:'Tab 2','id': chance.bb_pin(), 'properties': { 'default': false, 'landmark': false }, 'children': [[]] },
                        { type: 'column', name:'Tab 3','id': chance.bb_pin(), 'properties': { 'default': false, 'landmark': false }, 'children': [[]] }
                    ]]
                },
                { type: 'sidebar', id: chance.bb_pin(), name: 'sidebar', properties: {}, children: [
                       [{ type: 'column', id: chance.bb_pin(), name: 'side', properties: { 'default': false, 'landmark': false }, children: [[
                       { type: 'link', id: chance.bb_pin(), name: 'link', properties: {value:'Link 1', fontSize:'15'},  events: [ { type: 'onClick', link: '' }]},
                       { type: 'link', id: chance.bb_pin(), name: 'link', properties: {value:'Link 2', fontSize:'15'},  events: [ { type: 'onClick', link: '' }]},
                       { type: 'link', id: chance.bb_pin(), name: 'link', properties: {value:'Link 3', fontSize:'15'},  events: [ { type: 'onClick', link: '' }]},
                       { type: 'link', id: chance.bb_pin(), name: 'link', properties: {value:'Link 4', fontSize:'15'},  events: [ { type: 'onClick', link: '' }]}
                       ]] },
                       ],
                       [
                        { type: 'column', id: chance.bb_pin(), name: 'content', properties: { 'default': false, 'landmark': false }, children: [[]] }
                       ]
                   ]
                },
                { type: 'link', id: chance.bb_pin(), name: 'link', properties: {value:'text', fontSize:'15'},  events: [ { type: 'onClick', link: '' }]},
            ],
            composite:[
                { type: 'column', id: chance.bb_pin(), name: 'box', properties: { 'default': false, 'landmark': false }, children: [[]] },
                { type: 'column', id: chance.bb_pin(), name: 'box', properties: { 'default': false, 'landmark': false }, children: [[], []] },
                { type: 'column', id: chance.bb_pin(), name: 'box', properties: { 'default': false, 'landmark': false }, children: [[], [], []] },
                { type: 'column', id: chance.bb_pin(), name: 'box', properties: { 'default': false, 'landmark': false }, children: [[], [], [], []] },
            ],

            form: [
                    { type: 'form', id: chance.bb_pin(), name: 'form', properties: {entity: '0', attributes: []}, events: [{ type: 'onSubmit', link: '' }], children: [[
                        { type: 'legend', id: chance.bb_pin(), name: 'legend', properties: { 'value': 'Solicitud de seguimiento' }},
                        { type: 'input', id: chance.bb_pin(), name: 'input', properties: { 'placeholder': 'test@test.com', 'label': 'Email'} },
                        { type: 'input', id: chance.bb_pin(), name: 'input', properties: { 'placeholder': 'John', 'label': 'Nombre' } },
                        { type: 'input', id: chance.bb_pin(), name: 'input', properties: { 'placeholder': 'Doe', 'label': 'Apellido' } },
                        { type: 'submit_button', id: chance.bb_pin(), name: 'submit button', properties: { 'value': 'Enviar' }, events: [{ type: 'onSubmit', link: '' }] }
                      ]]
                    },
                    { type: 'searchBar', id: chance.bb_pin(), name: 'searchBar', properties: {'placeholder': 'search'}, events: [], children: [[
                        { type: 'input', id: chance.bb_pin(), name: 'search', properties: {} }
                    ]]},
                    { type: 'legend', id: chance.bb_pin(), name: 'legend', properties: { 'value': 'Legend' } },
                    { type: 'input', id: chance.bb_pin(), name: 'input', properties: { 'placeholder': 'Placeholder', 'label': 'Label'} },
                    { type: 'submit_button', id: chance.bb_pin(), name: 'submit button', properties: { 'value': 'Submit'} , events: [{ type: 'onSubmit', link: '' }] }
                ],
            domain: [
                    { type: 'domain_class', id: chance.bb_pin(), name: 'domain_class', properties: {}, children: [
                        { type: 'domain_attribute', id: chance.bb_pin(), name: 'domain_attribute', properties: { 'nombre': 'id', 'tipo': 'int', 'checked': 'false' }},
                        { type: 'domain_attribute', id: chance.bb_pin(), name: 'domain_attribute', properties: { 'nombre': 'nombre', 'tipo': 'string', 'checked': 'false' }},
                        { type: 'association', id: chance.bb_pin(), name: 'association', properties: { 'nombre': 'categorias', 'clase': 'c', 'cardinalidad': '1', 'checked': 'true' }}
                    ]},
                    { type: 'domain_attribute', id: chance.bb_pin(), name: 'domain_attribute', properties: { 'nombre': 'nombre', 'tipo': 'tipo', 'checked': 'true'}},
                    { type: 'association', id: chance.bb_pin(), name: 'association', properties: {'nombre': 'categorias', 'clase': '', 'cardinalidad': '1', 'checked': 'false'}},
                    { type: 'method', id: chance.bb_pin(), name: 'method', properties: { 'firma': 'method()', 'tipo': 'void'}},
                ]
        	},
            domain_types: { 'tipos': ['string', 'int', 'double'] },
            result: {
                'name': 'Mockup',
                'pages': [
                    {
                        'id': firstPageId,
                        'type': 'page',
                        'name': 'Page1',
                        'properties': { 'default': false, 'landmark': false },
                        'children': []
                    }],
                'domain': [
                  {
                    'id': domainModelId,
                    'type': 'domain',
                    'name': 'Domain Model',
                    'children': [
                      { type: 'domain_class', id: chance.bb_pin(), name: 'producto', properties: {}, children: [
                          { type: 'domain_attribute', id: chance.bb_pin(), name: 'domain_attribute', properties: { 'nombre': 'id', 'tipo': 'int', 'checked': 'false' }},
                          { type: 'domain_attribute', id: chance.bb_pin(), name: 'domain_attribute', properties: { 'nombre': 'nombre', 'tipo': 'string', 'checked': 'false' }},
                          { type: 'association', id: chance.bb_pin(), name: 'association', properties: { 'nombre': 'categoria', 'clase': 'categoria', 'cardinalidad': '1', 'checked': 'true' }}
                      ]},
                      { type: 'domain_class', id: chance.bb_pin(), name: 'categoria', properties: {}, children: [
                          { type: 'domain_attribute', id: chance.bb_pin(), name: 'domain_attribute', properties: { 'nombre': 'id', 'tipo': 'int', 'checked': 'false' }},
                          { type: 'domain_attribute', id: chance.bb_pin(), name: 'domain_attribute', properties: { 'nombre': 'descripcion', 'tipo': 'string', 'checked': 'false' }},
                          { type: 'association', id: chance.bb_pin(), name: 'association', properties: { 'nombre': 'productos', 'clase': 'producto', 'cardinalidad': 'N', 'checked': 'true' }}
                      ]}
                    ]
                  }]
            }

        },

        $scope.changeid = function(item) {

            item.id = chance.bb_pin();

        };

        $scope.trustSrc = function(src) {
            return $sce.trustAsResourceUrl(src);
        }

        $scope.$watch('models.result', function(model) {

            $scope.modelAsJson = angular.toJson(model, true);

        }, true);

        $scope.dragoverCallback = function(index, external, type, callback) {
              console.log("the end dragoverCallback");
          };

          $scope.dropCallback = function(index, external, type, callback) {
                console.log("the end dropCallback");
            };

        $scope.addPage = function () {

            currentPageNumber++;

            var page = {
                'id': chance.bb_pin(),
                'type': 'page',
                'name': 'Page' + currentPageNumber,
                'properties': { 'default': false, 'landmark': false },
                'children': []
            };

            $scope.models.result.pages.push(page);
            $scope.models.pageSelected = page.id;

        };

        $scope.addTab = function (item) {

            var page = {
                'id': chance.bb_pin(),
                'type': 'column',
                'name': 'Tab',
                'properties': { 'default': false, 'landmark': false },
                'children': [[]]
            };

            item.children[0].push(page);
            item.contSelected = page.id;

        };

        $scope.removeTab = function(item, page) {

            if (item.children[0].length > 1) {

                var arr = item.children[0];
                var toDelete = _.findWhere(arr, { id: page.id });
                var index = item.children[0].indexOf(toDelete);
                item.children[0] = _.without(arr, toDelete);
                index = Math.max(index - 1, 0);
                item.contSelected = item.children[0][index].id;

            }

        };

        $scope.removePage = function(id) {

           if ($scope.models.result.pages.length > 1) {

               var arr = $scope.models.result.pages;
               var toDelete = _.findWhere(arr, { id: id });
               var index = $scope.models.result.pages.indexOf(toDelete);
               $scope.models.result.pages = _.without(arr, toDelete);
               index = Math.max(index - 1, 0);
               $scope.models.pageSelected = $scope.models.result.pages[index].id;

           }

        };

        $scope.addModal = function () {

            currentModalNumber++;

            var modal = {
                id: chance.bb_pin(),
                type: 'modal',
                name: 'Modal' + currentModalNumber,
                properties: { 'default': false, 'landmark': false },
                children: [
                    { type: 'text', id: chance.bb_pin(), name:'text', properties: { value: 'Seleccione un elemento', fontSize: '25' }, events: [] },
                    { type: 'table', id: chance.bb_pin(), name:'table', properties: {}, events: [{ type: 'onSelect', link: '' }] },
                    { type: 'button', id: chance.bb_pin(), name:'button', properties: { align: 'center', value: 'Confirmar' }, events: [] }
                ]
            };

            $scope.models.result.pages.push(modal);
            $scope.models.pageSelected = modal.id;

        };

        $scope.addEvent = function () {

            var event = _.clone($scope.models.eventSelected);
            $scope.models.selected.events.push(event);

        };

        $scope.removeEvent = function (type) {

            var arr = $scope.models.selected.events;
            var toDelete = _.findWhere(arr, { type: type });
            $scope.models.selected.events = _.without(arr, toDelete);

        };

        $scope.filterEventsAlreadyAdded = function(evt) {

            return !_.findWhere($scope.models.selected.events, { type: evt.type });

        };

        $scope.filterAttrs = function(item) {
            var attrs = $scope.models.result.domain[0].children[item.properties.entity].children;
            var filtered = attrs.filter(function (attr){
                return attr.properties.checked === true;
            });
            return filtered;
        };

        $scope.filterChildren = function(item) {
            var children = $scope.models.result.domain[0].children[item.properties.entity].children;
            var attrs = children.filter(function (attr){
              return attr.type === 'domain_attribute' || attr.type === 'association';
            });
            var selected_attrs = item.properties.attributes;
            for (var i = 0; i < attrs.length; i++) {
              if (selected_attrs.findIndex(x => x.id === attrs[i].id) > -1){
                attrs[i].properties.checked = true;
              }
              else {
                attrs[i].properties.checked = false;
              }
            }
            return attrs;
        };

        $scope.filterMethod = function(item) {
            var children = $scope.models.result.domain[0].children[item.properties.entity].children;
            var attrs = children.filter(function (attr){
              return attr.type === 'method';
            });
            return attrs;
        };

        $scope.limpiarAtributos = function(component){
          component.properties.attributes = [];
        }

        $scope.seleccionarAtributo = function(component, attr){
          var attrs = component.properties.attributes;
          var index = attrs.findIndex(x => x.id === attr.id)
          if(attr.properties.checked && (index === -1)){
            component.properties.attributes.push(attr);
          }
          else {
            if (index !== -1) {
                component.properties.attributes.splice(index, 1);
            }
          }
        };

        $scope.filterLegend = function(children) {
            var filtered = children[0].filter(function (item){
                if(item.type === 'legend')
                  return item;
            });
            return filtered;
        };

        $scope.filterSubmit = function(children) {
            var filtered = children[0].filter(function (item){
                if(item.type === 'submit_button')
                  return item;
            });
            return filtered;
        };


        $scope.getIfml = function() {

            api
            .getIfml($scope.modelAsJson)
            .then(
                function(response) {

                    $scope.modelAsIfml = response.data;

                },
                function(response) {

                    $scope.modelAsIfml = response;

                }
            );

        };

        $scope.loadJsonFile = function() {

            $('#loadjson').click();

        };

        $scope.saveJsonFile = function() {
            var json = JSON.stringify($scope.models.result);
            var blob = new Blob([json], { type: 'application/json' });
            FileSaver.saveAs(blob, $scope.models.result.name + '.json');

        };

    }]);

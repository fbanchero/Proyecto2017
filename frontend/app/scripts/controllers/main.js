'use strict';

/**
 * @ngdoc function
 * @name pgradoApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the pgradoApp
 */
angular.module('pgradoApp')
    .controller('MainCtrl', ['$scope', 'api', 'FileSaver', function ($scope, api, FileSaver) {

        var chance = new Chance(),
            firstPageId = chance.bb_pin(),
            domainModelId = chance.bb_pin(),
            currentPageNumber = 1,
            currentModalNumber = 0,
            innerPageName = chance.bb_pin();

        $scope.tabs = {}

        $scope.lists = [
        {
            label: "Men",
            allowedTypes: ['man'],
            max: 4,
            people: [
                {name: "Bob", type: "man"},
                {name: "Charlie", type: "man"},
                {name: "Dave", type: "man"}
            ]
        },
        {
            label: "Women",
            allowedTypes: ['woman'],
            max: 4,
            people: [
                {name: "Alice", type: "woman"},
                {name: "Eve", type: "woman"},
                {name: "Peggy", type: "woman"}
            ]
        },
        {
            label: "People",
            allowedTypes: ['man', 'woman'],
            max: 6,
            people: [
                {name: "Frank", type: "man"},
                {name: "Mallory", type: "woman"},
                {name: "Alex", type: "unknown"},
                {name: "Oscar", type: "man"},
                {name: "Wendy", type: "woman"}
            ]
        }
    ];

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
                { type: 'text', id: chance.bb_pin(), name:'text', properties: { value:'text', fontSize:'25' }, events: [] },
                { type: 'button', id: chance.bb_pin(), name:'button', properties: { align: 'center', value: 'Button' }, events: [] },
                { type: 'image', id: chance.bb_pin(), name:'image', properties: { align: 'left', url: '' }, events: [] },
                { type: 'table', id: chance.bb_pin(), name:'table', properties: {domain_class: {nombre: "producto", attr: {id: '1', nombre: 'edad'}}}, events: [ { type: 'onSelect', link: '' } ] },
                { type: 'tabs', id: chance.bb_pin(), name:'tabs', properties: { xor: true }, contSelected:innerPageName, events: [], children: [[
                        { type: 'column', name:'Tab 1','id': innerPageName, 'properties': { 'default': true, 'landmark': false }, 'children': [[]] },
                        { type: 'column', name:'Tab 2','id': chance.bb_pin(), 'properties': { 'default': false, 'landmark': false }, 'children': [[]] },
                        { type: 'column', name:'Tab 3','id': chance.bb_pin(), 'properties': { 'default': false, 'landmark': false }, 'children': [[]] }
                    ]]
                },
                { type: 'sidebar', id: chance.bb_pin(), name: 'sidebar', properties: {}, children: [
                        [{ type: 'text', id: chance.bb_pin(), name:'text', properties: {value: 'Link 1'}, events: [] },
                         { type: 'text', id: chance.bb_pin(), name:'text', properties: {value: 'Link 2'}, events: [] },
                         { type: 'text', id: chance.bb_pin(), name:'text', properties: {value: 'Link 3'}, events: [] },
                         { type: 'text', id: chance.bb_pin(), name:'text', properties: {value: 'Link 4'}, events: [] }],
                        []
                    ]
                },
            ],
            composite:[
                { type: 'column', id: chance.bb_pin(), name: 'container', properties: { 'default': false, 'landmark': false }, children: [[]] },
                { type: 'column', id: chance.bb_pin(), name: 'container', properties: { 'default': false, 'landmark': false }, children: [[], []] },
                { type: 'column', id: chance.bb_pin(), name: 'container', properties: { 'default': false, 'landmark': false }, children: [[], [], []] },
                { type: 'column', id: chance.bb_pin(), name: 'container', properties: { 'default': false, 'landmark': false }, children: [[], [], [], []] },
            ],

            form: [
                    { type: 'form', id: chance.bb_pin(), name: 'form', properties: {}, events: [], children: [[
                        { type: 'legend', id: chance.bb_pin(), name: 'legend', properties: { 'value': 'Solicitud de seguimiento' }},
                        { type: 'input', id: chance.bb_pin(), name: 'input', properties: { 'placeholder': 'test@test.com', 'label': 'Email'} },
                        { type: 'input', id: chance.bb_pin(), name: 'input', properties: { 'placeholder': 'John', 'label': 'Nombre' } },
                        { type: 'input', id: chance.bb_pin(), name: 'input', properties: { 'placeholder': 'Doe', 'label': 'Apellido' } },
                        { type: 'submit_button', id: chance.bb_pin(), name: 'submit button', properties: { 'value': 'Enviar' }, events: [{ type: 'onSubmit', link: '' }] }
                    ]]},
                    { type: 'legend', id: chance.bb_pin(), name: 'legend', properties: { 'value': 'Legend' } },
                    { type: 'input', id: chance.bb_pin(), name: 'input', properties: { 'placeholder': 'Placeholder', 'label': 'Label'} },
                    { type: 'submit_button', id: chance.bb_pin(), name: 'submit button', properties: { 'value': 'Submit'} , events: [{ type: 'onSubmit', link: '' }] }
                ],
            domain: [
                    { type: 'domain_class', id: chance.bb_pin(), name: 'domain_class', properties: {}, children: [
                        { type: 'domain_attribute', id: chance.bb_pin(), name: 'domain_attribute', properties: { 'nombre': 'id', 'tipo': 'int' }},
                        { type: 'domain_attribute', id: chance.bb_pin(), name: 'domain_attribute', properties: { 'nombre': 'nombre', 'tipo': 'string' }}
                    ]},
                    { type: 'domain_attribute', id: chance.bb_pin(), name: 'domain_attribute', properties: { 'nombre': 'nombre', 'tipo': 'tipo'}},
                    { type: 'association', id: chance.bb_pin(), name: 'association'},
                    { type: 'method', id: chance.bb_pin(), name: 'method', properties: { 'firma': 'method()', 'tipo': 'void'}},
                ]
            },
            allowed_types: ['domain_attribute'],
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
                    'children': []
                  }]
            }
        };

        $scope.changeid = function(item) {

            item.id = chance.bb_pin();

        };

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


        $scope.changeid = function(item) {
            item.id = chance.bb_pin()
            if (item.pages) {
                item.pageSelected = item.pages[0].id
            }
        }

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

angular.module('webseg', [
    'ui.router'
]);

angular.module('webseg').config(AppConfig);

AppConfig.$inject = ['$stateProvider']
function AppConfig($stateProvider) {
    $stateProvider
        .state({
            name: 'home',
            url: '/',
            templateUrl: '/views/home.html'
        })
        .state({
            name: 'clientes',
            url: '/clientes',
            templateUrl: '/views/clientes/list.html',
            controller: 'ClienteListController',
            controllerAs: 'vm'
        })
        .state({
            name: 'clientesNovo',
            url: '/clientes/novo',
            templateUrl: '/views/clientes/form.html',
            controller: 'ClienteFormController',
            controllerAs: 'vm'
        })
        .state({
            name: 'clientesEditar',
            url: '/clientes/:id',
            templateUrl: '/views/clientes/form.html',
            controller: 'ClienteFormController',
            controllerAs: 'vm'
        })
        .state({
            name: 'seguradoras',
            url: '/seguradoras',
            templateUrl: '/views/seguradoras/list.html',
            controller: 'SeguradoraListController',
            controllerAs: 'vm'
        })
        .state({
            name: 'seguradorasNovo',
            url: '/seguradoras/novo',
            templateUrl: '/views/seguradoras/form.html',
            controller: 'SeguradoraFormController',
            controllerAs: 'vm'
        })
        .state({
            name: 'seguradorasEditar',
            url: '/seguradoras/:id',
            templateUrl: '/views/seguradoras/form.html',
            controller: 'SeguradoraFormController',
            controllerAs: 'vm'
        })
        .state({
            name: 'apolices',
            url: '/apolices',
            templateUrl: '/views/apolices/list.html',
            controller: 'ApoliceListController',
            controllerAs: 'vm'
        })
        .state({
            name: 'apolicesNovo',
            url: '/apolices/novo',
            templateUrl: '/views/apolices/form.html',
            controller: 'ApoliceFormController',
            controllerAs: 'vm'
        })
        .state({
            name: 'apolicesEditar',
            url: '/apolices/:id',
            templateUrl: '/views/apolices/form.html',
            controller: 'ApoliceFormController',
            controllerAs: 'vm'
        });
}
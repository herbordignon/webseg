(function () {

    angular.module('webseg')
        .controller('ApoliceFormController', ApoliceFormController);

    ApoliceFormController.$inject = ['ApoliceService', '$state', '$stateParams'];

    function ApoliceFormController(ApoliceService, $state, $stateParams) {
        var vm = this;
        vm.titulo = 'Nova Apólice/Seguro';
        vm.apolice = {};

        if ($stateParams.id) {
            ApoliceService.findOne($stateParams.id)
                .then(function (data) {
                    vm.titulo = 'Editando Apólice/Seguro';
                    vm.apolice = data;
                });
        }

        vm.save = function () {
            if (vm.apolice.id) {
                ApoliceService.update(vm.apolice)
                    .then(function (data) {
                        alert('Apólice/Seguro atualizado com sucesso!');
                        $state.go('apolices');
                    })
                    .catch(function (error) {
                        vm.errors = error.data;
                        alert('Erro ao atualizar a apólice/seguro.');
                    });
            } else {
                ApoliceService.insert(vm.apolice)
                    .then(function (data) {
                        alert('Apólice/Seguro inserido com sucesso!');
                        $state.go('apolices');
                    })
                    .catch(function (error) {
                        vm.errors = error.data;
                        alert('Erro ao atualizar apólice/seguro.');
                    });
            }
        };

    }

})();

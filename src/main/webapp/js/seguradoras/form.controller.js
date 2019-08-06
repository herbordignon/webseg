(function(){

    angular.module('webseg')
        .controller('SeguradoraFormController', SeguradoraFormController);

    SeguradoraFormController.$inject = ['SeguradoraService', '$state', '$stateParams'];

    function SeguradoraFormController (SeguradoraService, $state, $stateParams) {
        var vm = this;
        vm.titulo = 'Nova Seguradora';
        vm.seguradora = {};

        if ($stateParams.id) {
            SeguradoraService.findOne($stateParams.id)
                .then(function(data) {
                    vm.titulo = 'Editando Seguradora';
                    vm.seguradora = data;
                });
        }

        vm.save = function () {
            if (vm.seguradora.id) {
                SeguradoraService.update(vm.seguradora)
                    .then(function (data) {
                        alert('Seguradora atualizada com sucesso!');
                        $state.go('seguradoras');
                    })
                    .catch(function (error) {
                        vm.errors = error.data;
                        alert('Erro ao atualizar seguradora.');
                    });
            } else {
                SeguradoraService.insert(vm.seguradora)
                    .then(function (data) {
                        alert('Seguradora inserida com sucesso!');
                        $state.go('seguradoras');
                    })
                    .catch(function (error) {
                        vm.errors = error.data;
                        alert('Erro ao atualizar seguradora.');
                    });
            }
        };

    }

})();

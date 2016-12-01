(function () {
    'use strict';

    angular
        .module('webapp')
        .controller('MainController', MainController);

    /** @ngInject */
    function MainController(MainService) {
        var vm = this;

        vm.kategorije = [];
        MainService.getKategorije().then(function (kategorije) {
            angular.forEach(kategorije, function (kategorija) {
                vm.kategorije.push(kategorija);
            })
        });

        // MainService.dohvatiSveKategorije().$promise.then(function (kategorije) {
        //   angular.forEach(kategorije, function (kategorija) {
        //     vm.kategorije.push(kategorija);
        //   });
        // });
    }
})();

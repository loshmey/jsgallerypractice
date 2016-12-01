(function () {
    'use strict';

    /** @ngInject */
    function MainService($q, $resource, API_PATH) {
        // return $resource(API_PATH, {}, {
        //     dohvatiSveBukmarkere: {
        //         method: 'GET',
        //         isArray: true
        //     },
        //     dohvatiSveKategorije: {
        //         method: 'GET',
        //         isArray: true
        //     }
        // });
        return {
            getKategorije: function () {
                var defer = $q.defer();
                var kategorije = [
                    {
                        id: 1,
                        naziv: 'Opis',
                        opis: 'OVo je istorijskiADAXXXXSD.',
                        roditeljska_kategorija_id: null
                    },
                    {
                        id: 2,
                        naziv: 'Opis bolji',
                        opis: 'OVo je istorijski 2.',
                        roditeljska_kategorija_id: null
                    }
                ];

                defer.resolve(kategorije);

                return defer.promise;
            }
        };
    }

    angular.module('webapp')
        .service('MainService', MainService);
})();
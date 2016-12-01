/* global malarkey:false, moment:false */
(function () {
    'use strict';

    angular
        .module('webapp')
        .constant('malarkey', malarkey)
        .constant('moment', moment)
        .constant('API_PATH', 'http://localhost:8080/gallery/');

})();

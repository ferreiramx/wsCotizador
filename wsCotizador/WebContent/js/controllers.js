/**
 * INSPINIA - Responsive Admin Theme
 *
 */

/**
 * MainCtrl - controller
 */
function MainCtrl() {

    this.userName = 'Sesion no iniciada';
    this.helloText = 'Bienvenido';
    this.descriptionText = 'Página en construcción';

};


angular
    .module('inspinia')
    .controller('MainCtrl', MainCtrl)
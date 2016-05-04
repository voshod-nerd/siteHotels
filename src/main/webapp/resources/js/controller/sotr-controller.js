'use strict';

App.controller('Controller', ['$scope', 'Servics',
    function ($scope, Servics) {
        var self = this;

        self.unit = {
            id: null,
            dr: '',
            fio: '',
            grag:'',
            num:'',
            ser:'',
            iddolgnost:null,
            iduser:null
            
        };




        self.units = [];
        self.showBlock = function () {
            self.vis = 'inline-block';
        };


        self.fetchAllU = function () {
            Servics.fetchAllU()
                    .then(
                            function (d) {
                                self.units = d;
                                alert(JSON.stringify(d));
                            },
                            function (errResponse) {
                                console.error('Error while fetching U(controller)');
                            }
                    );
        };

        self.fetchAllU();

        self.createU = function (unit) {
            Servics.createU(unit)
                    .then(
                            self.fetchAllU,
                            function (errResponse) {
                                console.error('Error while creating U(controller)');
                            }
                    );
        };

        self.updateU = function (unit) {
            Servics.updateU(unit)
                    .then(
                            self.fetchAllU,
                            function (errResponse) {
                                console.error('Error while updating U(controller)');
                            }
                    );
        };

        self.deleteU = function (unit) {
            Servics.deleteU(unit)
                    .then(
                            self.fetchAllU,
                            function (errResponse) {
                                console.error('Error while deleting U(controller)');
                            }
                    );
        };


        

        self.edit = function (unit) {
            console.log('Employee name to be edited', unit);
            var dolg = (unit.iddolgnost !== null) ?
             JSON.stringify(unit.iddolgnost) : null;
             /*var post = (employee.post !== null) ?
             JSON.stringify(employee.post) : null;
            */
             self.unit=unit;
             self.unit.iddolgnost = dolg;
            //self.unit.location = unit.location;
            //;
            //self.unit.name = unit.name;
            $scope.myForm.$setDirty();
        };


        self.reset = function () {
             self.unit = {
            id: null,
            dr: '',
            fio: '',
            grag:'',
            num:'',
            ser:'',
            iddolgnost:null,
            iduser:null
            
        };
            $scope.myForm.$setPristine(); //reset Form
        };

        self.submit = function () {
            // console.log('department - ' + self.employee.department);
            /* var department = self.employee.department !== null ?
             JSON.parse(self.employee.department) : null;
             var post = self.employee.post !== null ?
             JSON.parse(self.employee.post) : null;
             */
            //self.unit.location = department;
            //self.unit.name = post;
            
            var iddolg = self.unit.iddolgnost !== null ?
            JSON.parse(self.unit.iddolgnost) : null;
            self.unit.iddolgnost=iddolg;
            
            if (self.unit.id === null) {
                console.log('Saving New Unit', self.unit);
                self.createU(self.unit);
            } else {
                self.updateU(self.U);
                console.log('Unit updated to  ', self.unit);
            }
            self.reset();
        };


    }]);
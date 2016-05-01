'use strict';

App.controller('Controller', ['$scope', 'Servics',
    function ($scope, Servics) {
        var self = this;
        
        
        self.vis='none';
        self.nameh='';
        self.loc='';
        
        self.unit = {
            id: null,
            location: '',
            name: '',
           
        };
        
       
        
        
        self.units = [];
        self.showBlock = function() {
           self.vis='inline-block'; 
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
        
        
        self.addU =function () 
        {
            self.unit.name=self.nameh;
            self.unit.location=self.loc;
            self.createU(self.unit);
         
            
            
        };
       

    }]);
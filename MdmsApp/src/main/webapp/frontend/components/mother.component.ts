import { Component, OnInit } from 'angular2/core';
import { MotherService } from '../services/mother.service';
//import { SearchMotherPipe } from '../pipes/search-mother.pipe.ts';
import 'rxjs/Rx';

    @Component({
        selector: 'mother-form',
        templateUrl: './frontend/templates/mother-form.html'//,
        //pipes: [SearchMotherPipe]
        })

export class MotherInfoComponent implements OnInit {
    public mothers;
    public mother;
    //private _pipe: SarchMotherPipe;
    constructor (private _service: MotherService) {}
    
    /*getBy(v){
        this._pipe = new SearchMotherPipe();
        this.mother = this._pipe.transform(this.mothers, [v]);
        if(v == '' || typeof v == 'undefined' || v == null){ this.mother = null;}
        console.log(this.mother);
    }*/
    
    getAll = function () {
        this._service.getAll().subscribe(mothers => this.mothers = mothers, error => console.log(error), () => console.log('Data receive')); 
    }
    
    getById = function (id) {
        this._service.getById(id).subscribe(mother => this.mother = mother, error => console.log(error), () => console.log('Data receive'));
    }
    
    ngOnInit () {
        //this.getAll();
        this.getById(1);
    }
}
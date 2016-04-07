import { Component } from 'angular2/core';
import { HTTP_PROVIDERS } from 'angular2/http';
import { MotherInfoComponent } from './mother.component';
import { MotherService } from '../services/mother.service';

    @Component({
        selector: 'app',
        templateUrl: './frontend/templates/app.html',
        providers: [HTTP_PROVIDERS, MotherService],
        directives: [MotherInfoComponent]
        })

export class AppComponent { }
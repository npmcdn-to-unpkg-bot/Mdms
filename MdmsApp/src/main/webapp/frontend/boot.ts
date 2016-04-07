import { bootstrap } from 'angular2/platform/browser';
import { AppComponent } from './components/app.component';

    bootstrap(AppComponent)
        .then(success => console.log('init success'))
        .catch(error => console.log('init error'));
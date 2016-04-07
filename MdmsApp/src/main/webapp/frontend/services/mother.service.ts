import { Injectable } from 'angular2/core';
import { Http } from 'angular2/http';
import 'rxjs/Rx';

@Injectable()
export class MotherService{
    constructor (private _http: Http){}
    
    getAll() {
        //$('.progress').show();
        return this._http.get('http://localhost:8080/api/mother')
                  .map(res => res.json())
                  .catch(this.handleError));
                  //.finally(() => $('.progress').hide(););
    }
    
    getById(id) {
        //$('.progress').show();
        return this._http.get('http://localhost:8080/api/mother/'+id)
                  .map(res => res.json())
                  .catch(this.handleError));
                  //.finally(() => $('.progress').hide(););
    }
    
    private handleError (error: Response){
        console.log(error);
    }
}
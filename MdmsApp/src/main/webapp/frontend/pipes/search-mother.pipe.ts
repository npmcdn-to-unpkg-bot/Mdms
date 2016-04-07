import {Pipe, PipeTransform} from 'angular2/core';

@Pipe({
    name: 'search'
})

export class SearchMotherPipe implements PipeTransform{
    transform(value: any, args: string[]): any{
        if(typeof value !== 'undefined'){
            if(typeof args[0] !== 'undefined'){
                let filter = args[0].toLocaleLowerCase();
                return filter ? value.filter(item => item.last_name.toLocaleLowerCase().indexOf(filter) != -1) : value;
            }else{
                return value;
            }
        }
    }
}
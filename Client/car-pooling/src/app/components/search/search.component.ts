import { Component } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {
  source:string='';
  destination:string='';
  time:string='';
  date:string='';

  onSearch(){
    console.log(`Source : ${this.source} Destination: ${this.destination} Time: ${this.time} Date: ${this.date}`)
  }
}

import { Component } from '@angular/core';
import { Request } from 'src/app/model/request';

@Component({
  selector: 'app-pasenger-requests',
  templateUrl: './pasenger-requests.component.html',
  styleUrls: ['./pasenger-requests.component.css']
})
export class PasengerRequestsComponent {
  
 requests:Request[]=[];
}
